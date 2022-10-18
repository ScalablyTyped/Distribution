package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountPreferencesResponse extends StObject {
  
  /**
    * Present if there are more records than returned in the response. You can use the NextToken in the subsequent request to fetch the additional descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Describes the resource ID preference setting for the Amazon Web Services account associated with the user making the request, in the current Amazon Web Services Region.
    */
  var ResourceIdPreference: js.UndefOr[typings.awsSdk.clientsEfsMod.ResourceIdPreference] = js.undefined
}
object DescribeAccountPreferencesResponse {
  
  inline def apply(): DescribeAccountPreferencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountPreferencesResponse]
  }
  
  extension [Self <: DescribeAccountPreferencesResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceIdPreference(value: ResourceIdPreference): Self = StObject.set(x, "ResourceIdPreference", value.asInstanceOf[js.Any])
    
    inline def setResourceIdPreferenceUndefined: Self = StObject.set(x, "ResourceIdPreference", js.undefined)
  }
}
