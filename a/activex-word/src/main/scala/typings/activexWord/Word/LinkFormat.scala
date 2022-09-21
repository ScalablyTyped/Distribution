package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkFormat extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var AutoUpdate: Boolean
  
  def BreakLink(): Unit
  
  val Creator: Double
  
  var Locked: Boolean
  
  val Parent: Any
  
  var SavePictureWithDocument: Boolean
  
  var SourceFullName: String
  
  val SourceName: String
  
  val SourcePath: String
  
  val Type: WdLinkType
  
  def Update(): Unit
  
  /* private */ @JSName("Word.LinkFormat_typekey")
  var WordDotLinkFormat_typekey: LinkFormat
}
object LinkFormat {
  
  inline def apply(
    Application: Application,
    AutoUpdate: Boolean,
    BreakLink: () => Unit,
    Creator: Double,
    Locked: Boolean,
    Parent: Any,
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
  
  extension [Self <: LinkFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setBreakLink(value: () => Unit): Self = StObject.set(x, "BreakLink", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSavePictureWithDocument(value: Boolean): Self = StObject.set(x, "SavePictureWithDocument", value.asInstanceOf[js.Any])
    
    inline def setSourceFullName(value: String): Self = StObject.set(x, "SourceFullName", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourcePath(value: String): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdLinkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
    
    inline def setWordDotLinkFormat_typekey(value: LinkFormat): Self = StObject.set(x, "Word.LinkFormat_typekey", value.asInstanceOf[js.Any])
  }
}
