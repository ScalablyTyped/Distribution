package typings.activexInfopath.global.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.WebServiceAdapterObject")
@js.native
class WebServiceAdapterObject protected ()
  extends typings.activexInfopath.InfoPath.WebServiceAdapterObject {
  /* CompleteClass */
  override val ErrorsLocation: IXMLDOMNode = js.native
  /* CompleteClass */
  @JSName("InfoPath.WebServiceAdapterObject_typekey")
  override var InfoPathDotWebServiceAdapterObject_typekey: typings.activexInfopath.InfoPath.WebServiceAdapterObject = js.native
  /* CompleteClass */
  override var Input: String = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override var Operation: String = js.native
  /* CompleteClass */
  override val OutputLocation: IXMLDOMNode = js.native
  /* CompleteClass */
  override val QueryAllowed: Boolean = js.native
  /* CompleteClass */
  override val SubmitAllowed: Boolean = js.native
  /* CompleteClass */
  override var Timeout: Double = js.native
  /* CompleteClass */
  override val WSDLURL: String = js.native
  /* CompleteClass */
  override def GenerateDataSetDiffGram(pNode: IXMLDOMNode): IXMLDOMNode = js.native
  /* CompleteClass */
  override def Query(): Unit = js.native
  /* CompleteClass */
  override def Submit(): Unit = js.native
}

