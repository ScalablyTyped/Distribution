package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlertManagerDefinitionResponse extends StObject {
  
  /**
    * The properties of the selected workspace's alert manager definition.
    */
  var alertManagerDefinition: AlertManagerDefinitionDescription
}
object DescribeAlertManagerDefinitionResponse {
  
  inline def apply(alertManagerDefinition: AlertManagerDefinitionDescription): DescribeAlertManagerDefinitionResponse = {
    val __obj = js.Dynamic.literal(alertManagerDefinition = alertManagerDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlertManagerDefinitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAlertManagerDefinitionResponse] (val x: Self) extends AnyVal {
    
    inline def setAlertManagerDefinition(value: AlertManagerDefinitionDescription): Self = StObject.set(x, "alertManagerDefinition", value.asInstanceOf[js.Any])
  }
}
