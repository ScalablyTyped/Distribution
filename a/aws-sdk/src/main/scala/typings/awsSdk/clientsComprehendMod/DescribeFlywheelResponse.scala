package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlywheelResponse extends StObject {
  
  /**
    * The flywheel properties.
    */
  var FlywheelProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.FlywheelProperties] = js.undefined
}
object DescribeFlywheelResponse {
  
  inline def apply(): DescribeFlywheelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlywheelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFlywheelResponse] (val x: Self) extends AnyVal {
    
    inline def setFlywheelProperties(value: FlywheelProperties): Self = StObject.set(x, "FlywheelProperties", value.asInstanceOf[js.Any])
    
    inline def setFlywheelPropertiesUndefined: Self = StObject.set(x, "FlywheelProperties", js.undefined)
  }
}
