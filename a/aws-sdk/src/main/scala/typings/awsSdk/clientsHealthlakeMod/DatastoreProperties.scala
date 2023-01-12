package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreProperties extends StObject {
  
  /**
    * The time that a Data Store was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name used in the creation of the Data Store.
    */
  var DatastoreArn: typings.awsSdk.clientsHealthlakeMod.DatastoreArn
  
  /**
    * The AWS endpoint for the Data Store. Each Data Store will have it's own endpoint with Data Store ID in the endpoint URL.
    */
  var DatastoreEndpoint: String
  
  /**
    * The AWS-generated ID number for the Data Store.
    */
  var DatastoreId: typings.awsSdk.clientsHealthlakeMod.DatastoreId
  
  /**
    * The user-generated name for the Data Store.
    */
  var DatastoreName: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.DatastoreName] = js.undefined
  
  /**
    * The status of the Data Store. Possible statuses are 'CREATING', 'ACTIVE', 'DELETING', or 'DELETED'.
    */
  var DatastoreStatus: typings.awsSdk.clientsHealthlakeMod.DatastoreStatus
  
  /**
    * The FHIR version. Only R4 version data is supported.
    */
  var DatastoreTypeVersion: FHIRVersion
  
  /**
    * The preloaded data configuration for the Data Store. Only data preloaded from Synthea is supported.
    */
  var PreloadDataConfig: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.PreloadDataConfig] = js.undefined
  
  /**
    *  The server-side encryption key configuration for a customer provided encryption key (CMK). 
    */
  var SseConfiguration: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.SseConfiguration] = js.undefined
}
object DatastoreProperties {
  
  inline def apply(
    DatastoreArn: DatastoreArn,
    DatastoreEndpoint: String,
    DatastoreId: DatastoreId,
    DatastoreStatus: DatastoreStatus,
    DatastoreTypeVersion: FHIRVersion
  ): DatastoreProperties = {
    val __obj = js.Dynamic.literal(DatastoreArn = DatastoreArn.asInstanceOf[js.Any], DatastoreEndpoint = DatastoreEndpoint.asInstanceOf[js.Any], DatastoreId = DatastoreId.asInstanceOf[js.Any], DatastoreStatus = DatastoreStatus.asInstanceOf[js.Any], DatastoreTypeVersion = DatastoreTypeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatastoreProperties] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDatastoreArn(value: DatastoreArn): Self = StObject.set(x, "DatastoreArn", value.asInstanceOf[js.Any])
    
    inline def setDatastoreEndpoint(value: String): Self = StObject.set(x, "DatastoreEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "DatastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastoreNameUndefined: Self = StObject.set(x, "DatastoreName", js.undefined)
    
    inline def setDatastoreStatus(value: DatastoreStatus): Self = StObject.set(x, "DatastoreStatus", value.asInstanceOf[js.Any])
    
    inline def setDatastoreTypeVersion(value: FHIRVersion): Self = StObject.set(x, "DatastoreTypeVersion", value.asInstanceOf[js.Any])
    
    inline def setPreloadDataConfig(value: PreloadDataConfig): Self = StObject.set(x, "PreloadDataConfig", value.asInstanceOf[js.Any])
    
    inline def setPreloadDataConfigUndefined: Self = StObject.set(x, "PreloadDataConfig", js.undefined)
    
    inline def setSseConfiguration(value: SseConfiguration): Self = StObject.set(x, "SseConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSseConfigurationUndefined: Self = StObject.set(x, "SseConfiguration", js.undefined)
  }
}
