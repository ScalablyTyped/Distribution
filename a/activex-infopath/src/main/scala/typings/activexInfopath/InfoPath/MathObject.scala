package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathObject extends StObject {
  
  def Avg(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  
  def Eval(pxmllistContext: IXMLDOMNodeList, bstrExpression: String): js.Any = js.native
  
  @JSName("InfoPath.MathObject_typekey")
  var InfoPathDotMathObject_typekey: MathObject = js.native
  
  def Max(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  
  def Min(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
  
  def Nz(pxmllistInput: IXMLDOMNodeList): js.Any = js.native
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
  
  @scala.inline
  implicit class MathObjectMutableBuilder[Self <: MathObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvg(value: IXMLDOMNodeList => js.Any): Self = StObject.set(x, "Avg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEval(value: (IXMLDOMNodeList, String) => js.Any): Self = StObject.set(x, "Eval", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInfoPathDotMathObject_typekey(value: MathObject): Self = StObject.set(x, "InfoPath.MathObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: IXMLDOMNodeList => js.Any): Self = StObject.set(x, "Max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMin(value: IXMLDOMNodeList => js.Any): Self = StObject.set(x, "Min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNz(value: IXMLDOMNodeList => js.Any): Self = StObject.set(x, "Nz", js.Any.fromFunction1(value))
  }
}
