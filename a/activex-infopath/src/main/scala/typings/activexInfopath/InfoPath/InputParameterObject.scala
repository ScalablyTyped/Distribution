package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputParameterObject extends StObject {
  
  /* private */ @JSName("InfoPath.InputParameterObject_typekey")
  var InfoPathDotInputParameterObject_typekey: InputParameterObject
  
  val Name: String
  
  val Value: String
}
object InputParameterObject {
  
  inline def apply(InfoPathDotInputParameterObject_typekey: InputParameterObject, Name: String, Value: String): InputParameterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.InputParameterObject_typekey")(InfoPathDotInputParameterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParameterObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputParameterObject] (val x: Self) extends AnyVal {
    
    inline def setInfoPathDotInputParameterObject_typekey(value: InputParameterObject): Self = StObject.set(x, "InfoPath.InputParameterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
