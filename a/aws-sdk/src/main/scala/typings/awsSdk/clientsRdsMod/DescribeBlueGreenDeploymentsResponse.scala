package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBlueGreenDeploymentsResponse extends StObject {
  
  /**
    * Contains a list of blue/green deployments for the user.
    */
  var BlueGreenDeployments: js.UndefOr[BlueGreenDeploymentList] = js.undefined
  
  /**
    * A pagination token that can be used in a later DescribeBlueGreenDeployments request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeBlueGreenDeploymentsResponse {
  
  inline def apply(): DescribeBlueGreenDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBlueGreenDeploymentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBlueGreenDeploymentsResponse] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenDeployments(value: BlueGreenDeploymentList): Self = StObject.set(x, "BlueGreenDeployments", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentsUndefined: Self = StObject.set(x, "BlueGreenDeployments", js.undefined)
    
    inline def setBlueGreenDeploymentsVarargs(value: BlueGreenDeployment*): Self = StObject.set(x, "BlueGreenDeployments", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
