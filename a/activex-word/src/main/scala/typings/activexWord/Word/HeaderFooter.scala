package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderFooter extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var Exists: Boolean
  
  val Index: WdHeaderFooterIndex
  
  val IsHeader: Boolean
  
  var LinkToPrevious: Boolean
  
  val PageNumbers: typings.activexWord.Word.PageNumbers
  
  val Parent: Any
  
  val Range: typings.activexWord.Word.Range
  
  val Shapes: typings.activexWord.Word.Shapes
  
  /* private */ @JSName("Word.HeaderFooter_typekey")
  var WordDotHeaderFooter_typekey: HeaderFooter
}
object HeaderFooter {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Exists: Boolean,
    Index: WdHeaderFooterIndex,
    IsHeader: Boolean,
    LinkToPrevious: Boolean,
    PageNumbers: PageNumbers,
    Parent: Any,
    Range: Range,
    Shapes: Shapes,
    WordDotHeaderFooter_typekey: HeaderFooter
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = Exists.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsHeader = IsHeader.asInstanceOf[js.Any], LinkToPrevious = LinkToPrevious.asInstanceOf[js.Any], PageNumbers = PageNumbers.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeaderFooter_typekey")(WordDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "Exists", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: WdHeaderFooterIndex): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIsHeader(value: Boolean): Self = StObject.set(x, "IsHeader", value.asInstanceOf[js.Any])
    
    inline def setLinkToPrevious(value: Boolean): Self = StObject.set(x, "LinkToPrevious", value.asInstanceOf[js.Any])
    
    inline def setPageNumbers(value: PageNumbers): Self = StObject.set(x, "PageNumbers", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: Shapes): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
    
    inline def setWordDotHeaderFooter_typekey(value: HeaderFooter): Self = StObject.set(x, "Word.HeaderFooter_typekey", value.asInstanceOf[js.Any])
  }
}
