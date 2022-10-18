package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ClientToken] = js.undefined
  
  /**
    * The description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.Description] = js.undefined
  
  /**
    * The name of the environment.
    */
  var Name: EnvironmentName
  
  /**
    * The network fabric type of the environment.
    */
  var NetworkFabricType: typings.awsSdk.clientsMigrationhubrefactorspacesMod.NetworkFabricType
  
  /**
    * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key-value pair.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateEnvironmentRequest {
  
  inline def apply(Name: EnvironmentName, NetworkFabricType: NetworkFabricType): CreateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NetworkFabricType = NetworkFabricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentRequest]
  }
  
  extension [Self <: CreateEnvironmentRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkFabricType(value: NetworkFabricType): Self = StObject.set(x, "NetworkFabricType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
