package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationInstanceRequest extends StObject {
  
  /**
    * The ID of an application instance to replace with the new instance.
    */
  var ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId] = js.undefined
  
  /**
    * A device's ID.
    */
  var DefaultRuntimeContextDevice: typings.awsSdk.clientsPanoramaMod.DefaultRuntimeContextDevice
  
  /**
    * A description for the application instance.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Description] = js.undefined
  
  /**
    * Setting overrides for the application manifest.
    */
  var ManifestOverridesPayload: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ManifestOverridesPayload] = js.undefined
  
  /**
    * The application's manifest document.
    */
  var ManifestPayload: typings.awsSdk.clientsPanoramaMod.ManifestPayload
  
  /**
    * A name for the application instance.
    */
  var Name: js.UndefOr[ApplicationInstanceName] = js.undefined
  
  /**
    * The ARN of a runtime role for the application instance.
    */
  var RuntimeRoleArn: js.UndefOr[typings.awsSdk.clientsPanoramaMod.RuntimeRoleArn] = js.undefined
  
  /**
    * Tags for the application instance.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateApplicationInstanceRequest {
  
  inline def apply(DefaultRuntimeContextDevice: DefaultRuntimeContextDevice, ManifestPayload: ManifestPayload): CreateApplicationInstanceRequest = {
    val __obj = js.Dynamic.literal(DefaultRuntimeContextDevice = DefaultRuntimeContextDevice.asInstanceOf[js.Any], ManifestPayload = ManifestPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationInstanceRequest]
  }
  
  extension [Self <: CreateApplicationInstanceRequest](x: Self) {
    
    inline def setApplicationInstanceIdToReplace(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceIdToReplace", value.asInstanceOf[js.Any])
    
    inline def setApplicationInstanceIdToReplaceUndefined: Self = StObject.set(x, "ApplicationInstanceIdToReplace", js.undefined)
    
    inline def setDefaultRuntimeContextDevice(value: DefaultRuntimeContextDevice): Self = StObject.set(x, "DefaultRuntimeContextDevice", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setManifestOverridesPayload(value: ManifestOverridesPayload): Self = StObject.set(x, "ManifestOverridesPayload", value.asInstanceOf[js.Any])
    
    inline def setManifestOverridesPayloadUndefined: Self = StObject.set(x, "ManifestOverridesPayload", js.undefined)
    
    inline def setManifestPayload(value: ManifestPayload): Self = StObject.set(x, "ManifestPayload", value.asInstanceOf[js.Any])
    
    inline def setName(value: ApplicationInstanceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRuntimeRoleArn(value: RuntimeRoleArn): Self = StObject.set(x, "RuntimeRoleArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRoleArnUndefined: Self = StObject.set(x, "RuntimeRoleArn", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
