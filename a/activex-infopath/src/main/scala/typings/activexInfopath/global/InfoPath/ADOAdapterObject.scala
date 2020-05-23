package typings.activexInfopath.global.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.ADOAdapterObject")
@js.native
class ADOAdapterObject protected ()
  extends typings.activexInfopath.InfoPath.ADOAdapterObject {
  /* CompleteClass */
  override var Command: String = js.native
  /* CompleteClass */
  override var Connection: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.ADOAdapterObject_typekey")
  override var InfoPathDotADOAdapterObject_typekey: typings.activexInfopath.InfoPath.ADOAdapterObject = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val QueryAllowed: Boolean = js.native
  /* CompleteClass */
  override val SubmitAllowed: Boolean = js.native
  /* CompleteClass */
  override var Timeout: Double = js.native
  /* CompleteClass */
  override def BuildSQLFromXMLNodes(pXmlNode: IXMLDOMNode): String = js.native
  /* CompleteClass */
  override def Query(): Unit = js.native
  /* CompleteClass */
  override def Submit(): Unit = js.native
}

