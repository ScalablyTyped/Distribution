package typings.activexInfopath.global.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.MathObject")
@js.native
class MathObject protected ()
  extends typings.activexInfopath.InfoPath.MathObject {
  /* CompleteClass */
  @JSName("InfoPath.MathObject_typekey")
  override var InfoPathDotMathObject_typekey: typings.activexInfopath.InfoPath.MathObject = js.native
  /* CompleteClass */
  override def Avg(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  /* CompleteClass */
  override def Eval(pxmllistContext: IXMLDOMNodeList, bstrExpression: String): js.Any = js.native
  /* CompleteClass */
  override def Max(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  /* CompleteClass */
  override def Min(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  /* CompleteClass */
  override def Nz(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
}

