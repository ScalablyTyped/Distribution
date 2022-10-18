package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersRequest extends StObject {
  
  /**
    * The unique ID of the detector the member is associated with.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 50. The maximum value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.MaxResults] = js.undefined
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the list action. For subsequent calls to the action, fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to only return associated members or to return all members (including members who haven't been invited yet or have been disassociated). Member accounts must have been previously associated with the GuardDuty administrator account using  Create Members . 
    */
  var OnlyAssociated: js.UndefOr[String] = js.undefined
}
object ListMembersRequest {
  
  inline def apply(DetectorId: DetectorId): ListMembersRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersRequest]
  }
  
  extension [Self <: ListMembersRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOnlyAssociated(value: String): Self = StObject.set(x, "OnlyAssociated", value.asInstanceOf[js.Any])
    
    inline def setOnlyAssociatedUndefined: Self = StObject.set(x, "OnlyAssociated", js.undefined)
  }
}
