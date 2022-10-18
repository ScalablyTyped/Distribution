package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCloudFormationStackRecordsResult extends StObject {
  
  /**
    * A list of objects describing the CloudFormation stack records.
    */
  var cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetCloudFormationStackRecords request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetCloudFormationStackRecordsResult {
  
  inline def apply(): GetCloudFormationStackRecordsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFormationStackRecordsResult]
  }
  
  extension [Self <: GetCloudFormationStackRecordsResult](x: Self) {
    
    inline def setCloudFormationStackRecords(value: CloudFormationStackRecordList): Self = StObject.set(x, "cloudFormationStackRecords", value.asInstanceOf[js.Any])
    
    inline def setCloudFormationStackRecordsUndefined: Self = StObject.set(x, "cloudFormationStackRecords", js.undefined)
    
    inline def setCloudFormationStackRecordsVarargs(value: CloudFormationStackRecord*): Self = StObject.set(x, "cloudFormationStackRecords", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
