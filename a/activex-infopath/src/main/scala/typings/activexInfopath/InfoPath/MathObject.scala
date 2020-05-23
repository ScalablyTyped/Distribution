package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathObject extends js.Object {
  @JSName("InfoPath.MathObject_typekey")
  var InfoPathDotMathObject_typekey: MathObject
  def Avg(pxmllistInput: IXMLDOMNodeList): js.Any
  def Eval(pxmllistContext: IXMLDOMNodeList, bstrExpression: String): js.Any
  def Max(pxmllistInput: IXMLDOMNodeList): js.Any
  def Min(pxmllistInput: IXMLDOMNodeList): js.Any
  def Nz(pxmllistInput: IXMLDOMNodeList): js.Any
}

object MathObject {
  @scala.inline
  def apply(
    Avg: IXMLDOMNodeList => js.Any,
    Eval: (IXMLDOMNodeList, String) => js.Any,
    InfoPathDotMathObject_typekey: MathObject,
    Max: IXMLDOMNodeList => js.Any,
    Min: IXMLDOMNodeList => js.Any,
    Nz: IXMLDOMNodeList => js.Any
  ): MathObject = {
    val __obj = js.Dynamic.literal(Avg = js.Any.fromFunction1(Avg), Eval = js.Any.fromFunction2(Eval), Max = js.Any.fromFunction1(Max), Min = js.Any.fromFunction1(Min), Nz = js.Any.fromFunction1(Nz))
    __obj.updateDynamic("InfoPath.MathObject_typekey")(InfoPathDotMathObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathObject]
  }
}

