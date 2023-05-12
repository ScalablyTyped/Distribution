package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDataSetRefreshPropertiesRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the dataset.
    */
  var DataSetId: ResourceId
  
  /**
    * The dataset refresh properties.
    */
  var DataSetRefreshProperties: typings.awsSdk.clientsQuicksightMod.DataSetRefreshProperties
}
object PutDataSetRefreshPropertiesRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    DataSetId: ResourceId,
    DataSetRefreshProperties: DataSetRefreshProperties
  ): PutDataSetRefreshPropertiesRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], DataSetRefreshProperties = DataSetRefreshProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDataSetRefreshPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDataSetRefreshPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetRefreshProperties(value: DataSetRefreshProperties): Self = StObject.set(x, "DataSetRefreshProperties", value.asInstanceOf[js.Any])
  }
}
