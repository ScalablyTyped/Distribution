package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFHIRDatastoreResponse extends StObject {
  
  /**
    * The datastore ARN is generated during the creation of the Data Store and can be found in the output from the initial Data Store creation call.
    */
  var DatastoreArn: typings.awsSdk.clientsHealthlakeMod.DatastoreArn
  
  /**
    * The AWS endpoint for the created Data Store. For preview, only US-east-1 endpoints are supported.
    */
  var DatastoreEndpoint: BoundedLengthString
  
  /**
    * The AWS-generated Data Store id. This id is in the output from the initial Data Store creation call.
    */
  var DatastoreId: typings.awsSdk.clientsHealthlakeMod.DatastoreId
  
  /**
    * The status of the FHIR Data Store. Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
    */
  var DatastoreStatus: typings.awsSdk.clientsHealthlakeMod.DatastoreStatus
}
object CreateFHIRDatastoreResponse {
  
  inline def apply(
    DatastoreArn: DatastoreArn,
    DatastoreEndpoint: BoundedLengthString,
    DatastoreId: DatastoreId,
    DatastoreStatus: DatastoreStatus
  ): CreateFHIRDatastoreResponse = {
    val __obj = js.Dynamic.literal(DatastoreArn = DatastoreArn.asInstanceOf[js.Any], DatastoreEndpoint = DatastoreEndpoint.asInstanceOf[js.Any], DatastoreId = DatastoreId.asInstanceOf[js.Any], DatastoreStatus = DatastoreStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFHIRDatastoreResponse]
  }
  
  extension [Self <: CreateFHIRDatastoreResponse](x: Self) {
    
    inline def setDatastoreArn(value: DatastoreArn): Self = StObject.set(x, "DatastoreArn", value.asInstanceOf[js.Any])
    
    inline def setDatastoreEndpoint(value: BoundedLengthString): Self = StObject.set(x, "DatastoreEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setDatastoreStatus(value: DatastoreStatus): Self = StObject.set(x, "DatastoreStatus", value.asInstanceOf[js.Any])
  }
}
