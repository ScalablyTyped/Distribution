package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderFooter extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var Exists: Boolean = js.native
  
  val Index: WdHeaderFooterIndex = js.native
  
  val IsHeader: Boolean = js.native
  
  var LinkToPrevious: Boolean = js.native
  
  val PageNumbers: typings.activexWord.Word.PageNumbers = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  val Shapes: typings.activexWord.Word.Shapes = js.native
  
  @JSName("Word.HeaderFooter_typekey")
  var WordDotHeaderFooter_typekey: HeaderFooter = js.native
}
object HeaderFooter {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Exists: Boolean,
    Index: WdHeaderFooterIndex,
    IsHeader: Boolean,
    LinkToPrevious: Boolean,
    PageNumbers: PageNumbers,
    Parent: js.Any,
    Range: Range,
    Shapes: Shapes,
    WordDotHeaderFooter_typekey: HeaderFooter
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = Exists.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsHeader = IsHeader.asInstanceOf[js.Any], LinkToPrevious = LinkToPrevious.asInstanceOf[js.Any], PageNumbers = PageNumbers.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeaderFooter_typekey")(WordDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  @scala.inline
  implicit class HeaderFooterOps[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExists(value: Boolean): Self = this.set("Exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: WdHeaderFooterIndex): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeader(value: Boolean): Self = this.set("IsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkToPrevious(value: Boolean): Self = this.set("LinkToPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumbers(value: PageNumbers): Self = this.set("PageNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapes(value: Shapes): Self = this.set("Shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotHeaderFooter_typekey(value: HeaderFooter): Self = this.set("Word.HeaderFooter_typekey", value.asInstanceOf[js.Any])
  }
}
