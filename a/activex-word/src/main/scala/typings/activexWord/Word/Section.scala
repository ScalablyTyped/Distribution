package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Borders: typings.activexWord.Word.Borders
  
  val Creator: Double
  
  val Footers: HeadersFooters
  
  val Headers: HeadersFooters
  
  val Index: Double
  
  var PageSetup: typings.activexWord.Word.PageSetup
  
  val Parent: Any
  
  var ProtectedForForms: Boolean
  
  val Range: typings.activexWord.Word.Range
  
  /* private */ @JSName("Word.Section_typekey")
  var WordDotSection_typekey: Section
}
object Section {
  
  inline def apply(
    Application: Application,
    Borders: Borders,
    Creator: Double,
    Footers: HeadersFooters,
    Headers: HeadersFooters,
    Index: Double,
    PageSetup: PageSetup,
    Parent: Any,
    ProtectedForForms: Boolean,
    Range: Range,
    WordDotSection_typekey: Section
  ): Section = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Footers = Footers.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], PageSetup = PageSetup.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProtectedForForms = ProtectedForForms.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Section_typekey")(WordDotSection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFooters(value: HeadersFooters): Self = StObject.set(x, "Footers", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: HeadersFooters): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setPageSetup(value: PageSetup): Self = StObject.set(x, "PageSetup", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setProtectedForForms(value: Boolean): Self = StObject.set(x, "ProtectedForForms", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setWordDotSection_typekey(value: Section): Self = StObject.set(x, "Word.Section_typekey", value.asInstanceOf[js.Any])
  }
}
