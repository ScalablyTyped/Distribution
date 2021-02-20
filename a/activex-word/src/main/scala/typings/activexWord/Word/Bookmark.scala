package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookmark extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Column: Boolean = js.native
  
  def Copy(Name: String): Bookmark = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Empty: Boolean = js.native
  
  var End: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def Select(): Unit = js.native
  
  var Start: Double = js.native
  
  val StoryType: WdStoryType = js.native
  
  @JSName("Word.Bookmark_typekey")
  var WordDotBookmark_typekey: Bookmark = js.native
}
object Bookmark {
  
  @scala.inline
  def apply(
    Application: Application,
    Column: Boolean,
    Copy: String => Bookmark,
    Creator: Double,
    Delete: () => Unit,
    Empty: Boolean,
    End: Double,
    Name: String,
    Parent: js.Any,
    Range: Range,
    Select: () => Unit,
    Start: Double,
    StoryType: WdStoryType,
    WordDotBookmark_typekey: Bookmark
  ): Bookmark = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], Copy = js.Any.fromFunction1(Copy), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Empty = Empty.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Start = Start.asInstanceOf[js.Any], StoryType = StoryType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Bookmark_typekey")(WordDotBookmark_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmark]
  }
  
  @scala.inline
  implicit class BookmarkMutableBuilder[Self <: Bookmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Boolean): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: String => Bookmark): Self = StObject.set(x, "Copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryType(value: WdStoryType): Self = StObject.set(x, "StoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotBookmark_typekey(value: Bookmark): Self = StObject.set(x, "Word.Bookmark_typekey", value.asInstanceOf[js.Any])
  }
}
