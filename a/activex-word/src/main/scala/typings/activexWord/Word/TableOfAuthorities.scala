package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOfAuthorities extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Bookmark: String = js.native
  
  var Category: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var EntrySeparator: String = js.native
  
  var IncludeCategoryHeader: Boolean = js.native
  
  var IncludeSequenceName: String = js.native
  
  var KeepEntryFormatting: Boolean = js.native
  
  var PageNumberSeparator: String = js.native
  
  var PageRangeSeparator: String = js.native
  
  val Parent: js.Any = js.native
  
  var Passim: Boolean = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  var Separator: String = js.native
  
  var TabLeader: WdTabLeader = js.native
  
  def Update(): Unit = js.native
  
  @JSName("Word.TableOfAuthorities_typekey")
  var WordDotTableOfAuthorities_typekey: TableOfAuthorities = js.native
}
object TableOfAuthorities {
  
  @scala.inline
  def apply(
    Application: Application,
    Bookmark: String,
    Category: Double,
    Creator: Double,
    Delete: () => Unit,
    EntrySeparator: String,
    IncludeCategoryHeader: Boolean,
    IncludeSequenceName: String,
    KeepEntryFormatting: Boolean,
    PageNumberSeparator: String,
    PageRangeSeparator: String,
    Parent: js.Any,
    Passim: Boolean,
    Range: Range,
    Separator: String,
    TabLeader: WdTabLeader,
    Update: () => Unit,
    WordDotTableOfAuthorities_typekey: TableOfAuthorities
  ): TableOfAuthorities = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bookmark = Bookmark.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EntrySeparator = EntrySeparator.asInstanceOf[js.Any], IncludeCategoryHeader = IncludeCategoryHeader.asInstanceOf[js.Any], IncludeSequenceName = IncludeSequenceName.asInstanceOf[js.Any], KeepEntryFormatting = KeepEntryFormatting.asInstanceOf[js.Any], PageNumberSeparator = PageNumberSeparator.asInstanceOf[js.Any], PageRangeSeparator = PageRangeSeparator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Passim = Passim.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.TableOfAuthorities_typekey")(WordDotTableOfAuthorities_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfAuthorities]
  }
  
  @scala.inline
  implicit class TableOfAuthoritiesOps[Self <: TableOfAuthorities] (val x: Self) extends AnyVal {
    
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
    def setBookmark(value: String): Self = this.set("Bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: Double): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntrySeparator(value: String): Self = this.set("EntrySeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCategoryHeader(value: Boolean): Self = this.set("IncludeCategoryHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSequenceName(value: String): Self = this.set("IncludeSequenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepEntryFormatting(value: Boolean): Self = this.set("KeepEntryFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberSeparator(value: String): Self = this.set("PageNumberSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRangeSeparator(value: String): Self = this.set("PageRangeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassim(value: Boolean): Self = this.set("Passim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("Separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLeader(value: WdTabLeader): Self = this.set("TabLeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("Update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotTableOfAuthorities_typekey(value: TableOfAuthorities): Self = this.set("Word.TableOfAuthorities_typekey", value.asInstanceOf[js.Any])
  }
}
