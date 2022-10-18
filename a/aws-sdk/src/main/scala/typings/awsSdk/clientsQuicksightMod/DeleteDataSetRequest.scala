package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataSetRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the dataset that you want to create. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var DataSetId: ResourceId
}
object DeleteDataSetRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DataSetId: ResourceId): DeleteDataSetRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSetRequest]
  }
  
  extension [Self <: DeleteDataSetRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
  }
}
