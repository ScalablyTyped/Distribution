package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousDeploymentPolicyList extends StObject {
  
  /**
    * A list of continuous deployment policy items.
    */
  var Items: js.UndefOr[ContinuousDeploymentPolicySummaryList] = js.undefined
  
  /**
    * The maximum number of continuous deployment policies that were specified in your request.
    */
  var MaxItems: integer
  
  /**
    * Indicates the next page of continuous deployment policies. To get the next page of the list, use this value in the Marker field of your request.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of continuous deployment policies in your Amazon Web Services account, regardless of the MaxItems value.
    */
  var Quantity: integer
}
object ContinuousDeploymentPolicyList {
  
  inline def apply(MaxItems: integer, Quantity: integer): ContinuousDeploymentPolicyList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentPolicyList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousDeploymentPolicyList] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ContinuousDeploymentPolicySummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ContinuousDeploymentPolicySummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
