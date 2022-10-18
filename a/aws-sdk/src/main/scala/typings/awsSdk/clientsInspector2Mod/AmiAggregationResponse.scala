package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmiAggregationResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID that the AMI belongs.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The IDs of Amazon EC2 instances using this AMI.
    */
  var affectedInstances: js.UndefOr[Long] = js.undefined
  
  /**
    * The ID of the AMI that findings were aggregated for.
    */
  var ami: AmiId
  
  /**
    * An object that contains the count of matched findings per severity.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object AmiAggregationResponse {
  
  inline def apply(ami: AmiId): AmiAggregationResponse = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiAggregationResponse]
  }
  
  extension [Self <: AmiAggregationResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAffectedInstances(value: Long): Self = StObject.set(x, "affectedInstances", value.asInstanceOf[js.Any])
    
    inline def setAffectedInstancesUndefined: Self = StObject.set(x, "affectedInstances", js.undefined)
    
    inline def setAmi(value: AmiId): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
