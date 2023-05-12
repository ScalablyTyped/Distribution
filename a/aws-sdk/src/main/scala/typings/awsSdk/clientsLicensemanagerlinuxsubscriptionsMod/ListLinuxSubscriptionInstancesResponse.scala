package typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLinuxSubscriptionInstancesResponse extends StObject {
  
  /**
    * An array that contains instance objects.
    */
  var Instances: js.UndefOr[InstanceList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLinuxSubscriptionInstancesResponse {
  
  inline def apply(): ListLinuxSubscriptionInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLinuxSubscriptionInstancesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLinuxSubscriptionInstancesResponse] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: InstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
