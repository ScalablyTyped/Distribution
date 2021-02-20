package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkFormat extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutoUpdate: Boolean = js.native
  
  def BreakLink(): Unit = js.native
  
  val Creator: Double = js.native
  
  var Locked: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var SavePictureWithDocument: Boolean = js.native
  
  var SourceFullName: String = js.native
  
  val SourceName: String = js.native
  
  val SourcePath: String = js.native
  
  val Type: WdLinkType = js.native
  
  def Update(): Unit = js.native
  
  @JSName("Word.LinkFormat_typekey")
  var WordDotLinkFormat_typekey: LinkFormat = js.native
}
object LinkFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: Boolean,
    BreakLink: () => Unit,
    Creator: Double,
    Locked: Boolean,
    Parent: js.Any,
    SavePictureWithDocument: Boolean,
    SourceFullName: String,
    SourceName: String,
    SourcePath: String,
    Type: WdLinkType,
    Update: () => Unit,
    WordDotLinkFormat_typekey: LinkFormat
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = js.Any.fromFunction0(BreakLink), Creator = Creator.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SavePictureWithDocument = SavePictureWithDocument.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourcePath = SourcePath.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.LinkFormat_typekey")(WordDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  
  @scala.inline
  implicit class LinkFormatMutableBuilder[Self <: LinkFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdate(value: Boolean): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakLink(value: () => Unit): Self = StObject.set(x, "BreakLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavePictureWithDocument(value: Boolean): Self = StObject.set(x, "SavePictureWithDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFullName(value: String): Self = StObject.set(x, "SourceFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePath(value: String): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdLinkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotLinkFormat_typekey(value: LinkFormat): Self = StObject.set(x, "Word.LinkFormat_typekey", value.asInstanceOf[js.Any])
  }
}
