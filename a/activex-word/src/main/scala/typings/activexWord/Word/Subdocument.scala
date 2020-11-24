package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subdocument extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val HasFile: Boolean = js.native
  
  val Level: Double = js.native
  
  var Locked: Boolean = js.native
  
  val Name: String = js.native
  
  def Open(): Document = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def Split(Range: typings.activexWord.Word.Range): Unit = js.native
  
  @JSName("Word.Subdocument_typekey")
  var WordDotSubdocument_typekey: Subdocument = js.native
}
object Subdocument {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    HasFile: Boolean,
    Level: Double,
    Locked: Boolean,
    Name: String,
    Open: () => Document,
    Parent: js.Any,
    Path: String,
    Range: Range,
    Split: Range => Unit,
    WordDotSubdocument_typekey: Subdocument
  ): Subdocument = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HasFile = HasFile.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = js.Any.fromFunction0(Open), Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Split = js.Any.fromFunction1(Split))
    __obj.updateDynamic("Word.Subdocument_typekey")(WordDotSubdocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subdocument]
  }
  
  @scala.inline
  implicit class SubdocumentOps[Self <: Subdocument] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasFile(value: Boolean): Self = this.set("HasFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Document): Self = this.set("Open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplit(value: Range => Unit): Self = this.set("Split", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWordDotSubdocument_typekey(value: Subdocument): Self = this.set("Word.Subdocument_typekey", value.asInstanceOf[js.Any])
  }
}
