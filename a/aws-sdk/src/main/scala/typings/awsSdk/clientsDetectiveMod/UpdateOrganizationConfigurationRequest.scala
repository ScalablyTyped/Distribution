package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationConfigurationRequest extends StObject {
  
  /**
    * Indicates whether to automatically enable new organization accounts as member accounts in the organization behavior graph.
    */
  var AutoEnable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the organization behavior graph.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object UpdateOrganizationConfigurationRequest {
  
  inline def apply(GraphArn: GraphArn): UpdateOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOrganizationConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
