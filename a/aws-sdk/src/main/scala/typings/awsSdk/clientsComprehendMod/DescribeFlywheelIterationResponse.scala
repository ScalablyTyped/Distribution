package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlywheelIterationResponse extends StObject {
  
  /**
    * The configuration properties of a flywheel iteration.
    */
  var FlywheelIterationProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.FlywheelIterationProperties] = js.undefined
}
object DescribeFlywheelIterationResponse {
  
  inline def apply(): DescribeFlywheelIterationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlywheelIterationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFlywheelIterationResponse] (val x: Self) extends AnyVal {
    
    inline def setFlywheelIterationProperties(value: FlywheelIterationProperties): Self = StObject.set(x, "FlywheelIterationProperties", value.asInstanceOf[js.Any])
    
    inline def setFlywheelIterationPropertiesUndefined: Self = StObject.set(x, "FlywheelIterationProperties", js.undefined)
  }
}
