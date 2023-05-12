package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContinuousDeploymentPoliciesRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of continuous deployment policies. The response includes policies in the list that occur after the marker. To get the next page of the list, set this field's value to the value of NextMarker from the current page's response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of continuous deployment policies that you want returned in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListContinuousDeploymentPoliciesRequest {
  
  inline def apply(): ListContinuousDeploymentPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContinuousDeploymentPoliciesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContinuousDeploymentPoliciesRequest] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
