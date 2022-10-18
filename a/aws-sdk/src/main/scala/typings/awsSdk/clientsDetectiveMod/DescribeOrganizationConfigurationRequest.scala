package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigurationRequest extends StObject {
  
  /**
    * The ARN of the organization behavior graph.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object DescribeOrganizationConfigurationRequest {
  
  inline def apply(GraphArn: GraphArn): DescribeOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
  }
  
  extension [Self <: DescribeOrganizationConfigurationRequest](x: Self) {
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
