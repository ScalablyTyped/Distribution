package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFHIRDatastoreRequest extends StObject {
  
  /**
    * Optional user provided token used for ensuring idempotency.
    */
  var ClientToken: js.UndefOr[ClientTokenString] = js.undefined
  
  /**
    * The user generated name for the Data Store.
    */
  var DatastoreName: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.DatastoreName] = js.undefined
  
  /**
    * The FHIR version of the Data Store. The only supported version is R4.
    */
  var DatastoreTypeVersion: FHIRVersion
  
  /**
    * Optional parameter to preload data upon creation of the Data Store. Currently, the only supported preloaded data is synthetic data generated from Synthea.
    */
  var PreloadDataConfig: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.PreloadDataConfig] = js.undefined
  
  /**
    *  The server-side encryption key configuration for a customer provided encryption key specified for creating a Data Store. 
    */
  var SseConfiguration: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.SseConfiguration] = js.undefined
  
  /**
    *  Resource tags that are applied to a Data Store when it is created. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFHIRDatastoreRequest {
  
  inline def apply(DatastoreTypeVersion: FHIRVersion): CreateFHIRDatastoreRequest = {
    val __obj = js.Dynamic.literal(DatastoreTypeVersion = DatastoreTypeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFHIRDatastoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFHIRDatastoreRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "DatastoreName", value.asInstanceOf[js.Any])
    
    inline def setDatastoreNameUndefined: Self = StObject.set(x, "DatastoreName", js.undefined)
    
    inline def setDatastoreTypeVersion(value: FHIRVersion): Self = StObject.set(x, "DatastoreTypeVersion", value.asInstanceOf[js.Any])
    
    inline def setPreloadDataConfig(value: PreloadDataConfig): Self = StObject.set(x, "PreloadDataConfig", value.asInstanceOf[js.Any])
    
    inline def setPreloadDataConfigUndefined: Self = StObject.set(x, "PreloadDataConfig", js.undefined)
    
    inline def setSseConfiguration(value: SseConfiguration): Self = StObject.set(x, "SseConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSseConfigurationUndefined: Self = StObject.set(x, "SseConfiguration", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
