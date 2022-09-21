package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathObject extends StObject {
  
  def Avg(pxmllistInput: IXMLDOMNodeList): Any
  
  def Eval(pxmllistContext: IXMLDOMNodeList, bstrExpression: String): Any
  
  /* private */ @JSName("InfoPath.MathObject_typekey")
  var InfoPathDotMathObject_typekey: MathObject
  
  def Max(pxmllistInput: IXMLDOMNodeList): Any
  
  def Min(pxmllistInput: IXMLDOMNodeList): Any
  
  def Nz(pxmllistInput: IXMLDOMNodeList): Any
}
object MathObject {
  
  inline def apply(
    Avg: IXMLDOMNodeList => Any,
    Eval: (IXMLDOMNodeList, String) => Any,
    InfoPathDotMathObject_typekey: MathObject,
    Max: IXMLDOMNodeList => Any,
    Min: IXMLDOMNodeList => Any,
    Nz: IXMLDOMNodeList => Any
  ): MathObject = {
    val __obj = js.Dynamic.literal(Avg = js.Any.fromFunction1(Avg), Eval = js.Any.fromFunction2(Eval), Max = js.Any.fromFunction1(Max), Min = js.Any.fromFunction1(Min), Nz = js.Any.fromFunction1(Nz))
    __obj.updateDynamic("InfoPath.MathObject_typekey")(InfoPathDotMathObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathObject]
  }
  
  extension [Self <: MathObject](x: Self) {
    
    inline def setAvg(value: IXMLDOMNodeList => Any): Self = StObject.set(x, "Avg", js.Any.fromFunction1(value))
    
    inline def setEval(value: (IXMLDOMNodeList, String) => Any): Self = StObject.set(x, "Eval", js.Any.fromFunction2(value))
    
    inline def setInfoPathDotMathObject_typekey(value: MathObject): Self = StObject.set(x, "InfoPath.MathObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setMax(value: IXMLDOMNodeList => Any): Self = StObject.set(x, "Max", js.Any.fromFunction1(value))
    
    inline def setMin(value: IXMLDOMNodeList => Any): Self = StObject.set(x, "Min", js.Any.fromFunction1(value))
    
    inline def setNz(value: IXMLDOMNodeList => Any): Self = StObject.set(x, "Nz", js.Any.fromFunction1(value))
  }
}
