package typings.activexInfopath.global.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.DAVAdapterObject")
@js.native
class DAVAdapterObject protected ()
  extends typings.activexInfopath.InfoPath.DAVAdapterObject {
  /* CompleteClass */
  override var FileName: String = js.native
  /* CompleteClass */
  override var FolderURL: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.DAVAdapterObject_typekey")
  override var InfoPathDotDAVAdapterObject_typekey: typings.activexInfopath.InfoPath.DAVAdapterObject = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val QueryAllowed: Boolean = js.native
  /* CompleteClass */
  override val SubmitAllowed: Boolean = js.native
  /* CompleteClass */
  override def Query(): Unit = js.native
  /* CompleteClass */
  override def Submit(): Unit = js.native
  /* CompleteClass */
  override def SubmitData(pData: IXMLDOMNode): Unit = js.native
}

