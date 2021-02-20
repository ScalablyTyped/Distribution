package typings.activexWord.Word

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Revision extends StObject {
  
  def Accept(): Unit = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Author: String = js.native
  
  val Cells: typings.activexWord.Word.Cells = js.native
  
  val Creator: Double = js.native
  
  val Date: VarDate = js.native
  
  val FormatDescription: String = js.native
  
  val Index: Double = js.native
  
  val MovedRange: typings.activexWord.Word.Range = js.native
  
  val Parent: js.Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def Reject(): Unit = js.native
  
  val Style: typings.activexWord.Word.Style = js.native
  
  val Type: WdRevisionType = js.native
  
  @JSName("Word.Revision_typekey")
  var WordDotRevision_typekey: Revision = js.native
}
object Revision {
  
  @scala.inline
  def apply(
    Accept: () => Unit,
    Application: Application,
    Author: String,
    Cells: Cells,
    Creator: Double,
    Date: VarDate,
    FormatDescription: String,
    Index: Double,
    MovedRange: Range,
    Parent: js.Any,
    Range: Range,
    Reject: () => Unit,
    Style: Style,
    Type: WdRevisionType,
    WordDotRevision_typekey: Revision
  ): Revision = {
    val __obj = js.Dynamic.literal(Accept = js.Any.fromFunction0(Accept), Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], FormatDescription = FormatDescription.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MovedRange = MovedRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = js.Any.fromFunction0(Reject), Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Revision_typekey")(WordDotRevision_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  
  @scala.inline
  implicit class RevisionMutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: () => Unit): Self = StObject.set(x, "Accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCells(value: Cells): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: VarDate): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatDescription(value: String): Self = StObject.set(x, "FormatDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovedRange(value: Range): Self = StObject.set(x, "MovedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReject(value: () => Unit): Self = StObject.set(x, "Reject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: Style): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdRevisionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotRevision_typekey(value: Revision): Self = StObject.set(x, "Word.Revision_typekey", value.asInstanceOf[js.Any])
  }
}
