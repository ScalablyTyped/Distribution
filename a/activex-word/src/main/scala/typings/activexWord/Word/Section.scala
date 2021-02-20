package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Section extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  val Creator: Double = js.native
  
  val Footers: HeadersFooters = js.native
  
  val Headers: HeadersFooters = js.native
  
  val Index: Double = js.native
  
  var PageSetup: typings.activexWord.Word.PageSetup = js.native
  
  val Parent: js.Any = js.native
  
  var ProtectedForForms: Boolean = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  @JSName("Word.Section_typekey")
  var WordDotSection_typekey: Section = js.native
}
object Section {
  
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Creator: Double,
    Footers: HeadersFooters,
    Headers: HeadersFooters,
    Index: Double,
    PageSetup: PageSetup,
    Parent: js.Any,
    ProtectedForForms: Boolean,
    Range: Range,
    WordDotSection_typekey: Section
  ): Section = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Footers = Footers.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], PageSetup = PageSetup.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProtectedForForms = ProtectedForForms.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Section_typekey")(WordDotSection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit class SectionMutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooters(value: HeadersFooters): Self = StObject.set(x, "Footers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: HeadersFooters): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSetup(value: PageSetup): Self = StObject.set(x, "PageSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedForForms(value: Boolean): Self = StObject.set(x, "ProtectedForForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSection_typekey(value: Section): Self = StObject.set(x, "Word.Section_typekey", value.asInstanceOf[js.Any])
  }
}
