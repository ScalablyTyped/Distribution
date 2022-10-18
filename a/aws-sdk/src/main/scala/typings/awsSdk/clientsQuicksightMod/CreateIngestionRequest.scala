package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIngestionRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the dataset used in the ingestion.
    */
  var DataSetId: String
  
  /**
    * An ID for the ingestion.
    */
  var IngestionId: typings.awsSdk.clientsQuicksightMod.IngestionId
  
  /**
    * The type of ingestion that you want to create.
    */
  var IngestionType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.IngestionType] = js.undefined
}
object CreateIngestionRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DataSetId: String, IngestionId: IngestionId): CreateIngestionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], IngestionId = IngestionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIngestionRequest]
  }
  
  extension [Self <: CreateIngestionRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: String): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setIngestionId(value: IngestionId): Self = StObject.set(x, "IngestionId", value.asInstanceOf[js.Any])
    
    inline def setIngestionType(value: IngestionType): Self = StObject.set(x, "IngestionType", value.asInstanceOf[js.Any])
    
    inline def setIngestionTypeUndefined: Self = StObject.set(x, "IngestionType", js.undefined)
  }
}
