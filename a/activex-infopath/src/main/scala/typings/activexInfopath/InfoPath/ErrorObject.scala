package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorObject extends StObject {
  
  val ConditionName: Any
  
  var DetailedErrorMessage: String
  
  var ErrorCode: Double
  
  /* private */ @JSName("InfoPath.ErrorObject_typekey")
  var InfoPathDotErrorObject_typekey: ErrorObject
  
  val Node: IXMLDOMNode
  
  var ShortErrorMessage: String
  
  val Type: String
}
object ErrorObject {
  
  inline def apply(
    ConditionName: Any,
    DetailedErrorMessage: String,
    ErrorCode: Double,
    InfoPathDotErrorObject_typekey: ErrorObject,
    Node: IXMLDOMNode,
    ShortErrorMessage: String,
    Type: String
  ): ErrorObject = {
    val __obj = js.Dynamic.literal(ConditionName = ConditionName.asInstanceOf[js.Any], DetailedErrorMessage = DetailedErrorMessage.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], ShortErrorMessage = ShortErrorMessage.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ErrorObject_typekey")(InfoPathDotErrorObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorObject]
  }
  
  extension [Self <: ErrorObject](x: Self) {
    
    inline def setConditionName(value: Any): Self = StObject.set(x, "ConditionName", value.asInstanceOf[js.Any])
    
    inline def setDetailedErrorMessage(value: String): Self = StObject.set(x, "DetailedErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotErrorObject_typekey(value: ErrorObject): Self = StObject.set(x, "InfoPath.ErrorObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setNode(value: IXMLDOMNode): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    inline def setShortErrorMessage(value: String): Self = StObject.set(x, "ShortErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
