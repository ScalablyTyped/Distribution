package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdAttachmentType
import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.EmailAdapterObject")
@js.native
class EmailAdapterObject protected ()
  extends typings.activexInfopath.InfoPath.EmailAdapterObject {
  /* CompleteClass */
  override var AttachmentFileName: String = js.native
  /* CompleteClass */
  override var AttachmentType: XdAttachmentType = js.native
  /* CompleteClass */
  override var BCC: String = js.native
  /* CompleteClass */
  override var CC: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.EmailAdapterObject_typekey")
  override var InfoPathDotEmailAdapterObject_typekey: typings.activexInfopath.InfoPath.EmailAdapterObject = js.native
  /* CompleteClass */
  override var Intro: String = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val QueryAllowed: Boolean = js.native
  /* CompleteClass */
  override var Subject: String = js.native
  /* CompleteClass */
  override val SubmitAllowed: Boolean = js.native
  /* CompleteClass */
  override var To: String = js.native
  /* CompleteClass */
  override def Query(): Unit = js.native
  /* CompleteClass */
  override def Submit(): Unit = js.native
  /* CompleteClass */
  override def SubmitData(pData: IXMLDOMNode): Unit = js.native
}

