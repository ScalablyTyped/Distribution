package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdAttachmentType
import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.EmailAdapterObject")
@js.native
/* private */ class EmailAdapterObject ()
  extends StObject
     with typings.activexInfopath.InfoPath.EmailAdapterObject {
  
  /* CompleteClass */
  var AttachmentFileName: String = js.native
  
  /* CompleteClass */
  var AttachmentType: XdAttachmentType = js.native
  
  /* CompleteClass */
  var BCC: String = js.native
  
  /* CompleteClass */
  var CC: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.EmailAdapterObject_typekey")
  var InfoPathDotEmailAdapterObject_typekey: typings.activexInfopath.InfoPath.EmailAdapterObject = js.native
  
  /* CompleteClass */
  var Intro: String = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override def Query(): Unit = js.native
  
  /* CompleteClass */
  override val QueryAllowed: Boolean = js.native
  
  /* CompleteClass */
  var Subject: String = js.native
  
  /* CompleteClass */
  override def Submit(): Unit = js.native
  
  /* CompleteClass */
  override val SubmitAllowed: Boolean = js.native
  
  /* CompleteClass */
  override def SubmitData(pData: IXMLDOMNode): Unit = js.native
  
  /* CompleteClass */
  var To: String = js.native
}
