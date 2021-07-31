package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOfAuthorities extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Bookmark: String
  
  var Category: Double
  
  val Creator: Double
  
  def Delete(): Unit
  
  var EntrySeparator: String
  
  var IncludeCategoryHeader: Boolean
  
  var IncludeSequenceName: String
  
  var KeepEntryFormatting: Boolean
  
  var PageNumberSeparator: String
  
  var PageRangeSeparator: String
  
  val Parent: js.Any
  
  var Passim: Boolean
  
  val Range: typings.activexWord.Word.Range
  
  var Separator: String
  
  var TabLeader: WdTabLeader
  
  def Update(): Unit
  
  @JSName("Word.TableOfAuthorities_typekey")
  var WordDotTableOfAuthorities_typekey: TableOfAuthorities
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
  implicit class TableOfAuthoritiesMutableBuilder[Self <: TableOfAuthorities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmark(value: String): Self = StObject.set(x, "Bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: Double): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntrySeparator(value: String): Self = StObject.set(x, "EntrySeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCategoryHeader(value: Boolean): Self = StObject.set(x, "IncludeCategoryHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSequenceName(value: String): Self = StObject.set(x, "IncludeSequenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepEntryFormatting(value: Boolean): Self = StObject.set(x, "KeepEntryFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberSeparator(value: String): Self = StObject.set(x, "PageNumberSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRangeSeparator(value: String): Self = StObject.set(x, "PageRangeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassim(value: Boolean): Self = StObject.set(x, "Passim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLeader(value: WdTabLeader): Self = StObject.set(x, "TabLeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotTableOfAuthorities_typekey(value: TableOfAuthorities): Self = StObject.set(x, "Word.TableOfAuthorities_typekey", value.asInstanceOf[js.Any])
  }
}
