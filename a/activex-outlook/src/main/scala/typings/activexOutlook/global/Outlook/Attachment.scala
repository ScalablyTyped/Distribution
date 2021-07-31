package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAttachmentBlockLevel
import typings.activexOutlook.Outlook.OlAttachmentType
import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Attachment")
@js.native
class Attachment protected ()
  extends StObject
     with typings.activexOutlook.Outlook.Attachment {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val BlockLevel: OlAttachmentBlockLevel = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var DisplayName: String = js.native
  
  /* CompleteClass */
  override val FileName: String = js.native
  
  /* CompleteClass */
  override def GetTemporaryFilePath(): String = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override val MAPIOBJECT: js.Any = js.native
  
  /* CompleteClass */
  @JSName("Outlook.Attachment_typekey")
  var OutlookDotAttachment_typekey: typings.activexOutlook.Outlook.Attachment = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PathName: String = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  /* CompleteClass */
  override def SaveAsFile(Path: String): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val Size: Double = js.native
  
  /* CompleteClass */
  override val Type: OlAttachmentType = js.native
}
