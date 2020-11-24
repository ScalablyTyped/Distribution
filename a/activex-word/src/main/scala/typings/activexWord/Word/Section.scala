package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Section extends js.Object {
  
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
  implicit class SectionOps[Self <: Section] (val x: Self) extends AnyVal {
    
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
    def setBorders(value: Borders): Self = this.set("Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooters(value: HeadersFooters): Self = this.set("Footers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: HeadersFooters): Self = this.set("Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSetup(value: PageSetup): Self = this.set("PageSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedForForms(value: Boolean): Self = this.set("ProtectedForForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSection_typekey(value: Section): Self = this.set("Word.Section_typekey", value.asInstanceOf[js.Any])
  }
}
