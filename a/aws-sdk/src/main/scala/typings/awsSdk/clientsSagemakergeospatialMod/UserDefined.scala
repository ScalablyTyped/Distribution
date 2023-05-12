package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefined extends StObject {
  
  /**
    * The units for output resolution of the result.
    */
  var Unit: typings.awsSdk.clientsSagemakergeospatialMod.Unit
  
  /**
    * The value for output resolution of the result.
    */
  var Value: Float
}
object UserDefined {
  
  inline def apply(Unit: Unit, Value: Float): UserDefined = {
    val __obj = js.Dynamic.literal(Unit = Unit.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserDefined] (val x: Self) extends AnyVal {
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Float): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
