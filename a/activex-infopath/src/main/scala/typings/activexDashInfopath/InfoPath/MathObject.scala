package typings.activexDashInfopath.InfoPath

import typings.activexDashMsxml2.MSXML2.IXMLDOMNodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.MathObject")
@js.native
class MathObject protected () extends js.Object {
  @JSName("InfoPath.MathObject_typekey")
  var InfoPathDotMathObject_typekey: MathObject = js.native
  def Avg(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  def Eval(pxmllistContext: IXMLDOMNodeList, bstrExpression: String): js.Any = js.native
  def Max(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  def Min(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  def Nz(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
}

