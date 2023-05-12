package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCapacityAssignmentConfigurationOutput extends StObject {
  
  /**
    * The requested capacity assignment configuration for the specified capacity reservation.
    */
  var CapacityAssignmentConfiguration: typings.awsSdk.clientsAthenaMod.CapacityAssignmentConfiguration
}
object GetCapacityAssignmentConfigurationOutput {
  
  inline def apply(CapacityAssignmentConfiguration: CapacityAssignmentConfiguration): GetCapacityAssignmentConfigurationOutput = {
    val __obj = js.Dynamic.literal(CapacityAssignmentConfiguration = CapacityAssignmentConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCapacityAssignmentConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCapacityAssignmentConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setCapacityAssignmentConfiguration(value: CapacityAssignmentConfiguration): Self = StObject.set(x, "CapacityAssignmentConfiguration", value.asInstanceOf[js.Any])
  }
}
