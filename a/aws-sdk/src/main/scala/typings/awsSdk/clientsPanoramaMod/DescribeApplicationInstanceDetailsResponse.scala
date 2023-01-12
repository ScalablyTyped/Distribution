package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationInstanceDetailsResponse extends StObject {
  
  /**
    * The application instance's ID.
    */
  var ApplicationInstanceId: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ApplicationInstanceId] = js.undefined
  
  /**
    * The ID of the application instance that this instance replaced.
    */
  var ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId] = js.undefined
  
  /**
    * When the application instance was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The application instance's default runtime context device.
    */
  var DefaultRuntimeContextDevice: js.UndefOr[typings.awsSdk.clientsPanoramaMod.DefaultRuntimeContextDevice] = js.undefined
  
  /**
    * The application instance's description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Description] = js.undefined
  
  /**
    * Parameter overrides for the configuration manifest.
    */
  var ManifestOverridesPayload: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ManifestOverridesPayload] = js.undefined
  
  /**
    * The application instance's configuration manifest.
    */
  var ManifestPayload: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ManifestPayload] = js.undefined
  
  /**
    * The application instance's name.
    */
  var Name: js.UndefOr[ApplicationInstanceName] = js.undefined
}
object DescribeApplicationInstanceDetailsResponse {
  
  inline def apply(): DescribeApplicationInstanceDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationInstanceDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeApplicationInstanceDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
    
    inline def setApplicationInstanceIdToReplace(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceIdToReplace", value.asInstanceOf[js.Any])
    
    inline def setApplicationInstanceIdToReplaceUndefined: Self = StObject.set(x, "ApplicationInstanceIdToReplace", js.undefined)
    
    inline def setApplicationInstanceIdUndefined: Self = StObject.set(x, "ApplicationInstanceId", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDefaultRuntimeContextDevice(value: DefaultRuntimeContextDevice): Self = StObject.set(x, "DefaultRuntimeContextDevice", value.asInstanceOf[js.Any])
    
    inline def setDefaultRuntimeContextDeviceUndefined: Self = StObject.set(x, "DefaultRuntimeContextDevice", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setManifestOverridesPayload(value: ManifestOverridesPayload): Self = StObject.set(x, "ManifestOverridesPayload", value.asInstanceOf[js.Any])
    
    inline def setManifestOverridesPayloadUndefined: Self = StObject.set(x, "ManifestOverridesPayload", js.undefined)
    
    inline def setManifestPayload(value: ManifestPayload): Self = StObject.set(x, "ManifestPayload", value.asInstanceOf[js.Any])
    
    inline def setManifestPayloadUndefined: Self = StObject.set(x, "ManifestPayload", js.undefined)
    
    inline def setName(value: ApplicationInstanceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
