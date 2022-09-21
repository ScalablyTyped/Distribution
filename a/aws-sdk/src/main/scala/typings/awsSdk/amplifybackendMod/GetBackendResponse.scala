package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackendResponse extends StObject {
  
  /**
    * A stringified version of the cli.json file for your Amplify project.
    */
  var AmplifyFeatureFlags: js.UndefOr[string] = js.undefined
  
  /**
    * A stringified version of the current configs for your Amplify project.
    */
  var AmplifyMetaConfig: js.UndefOr[string] = js.undefined
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the app.
    */
  var AppName: js.UndefOr[string] = js.undefined
  
  /**
    * A list of backend environments in an array.
    */
  var BackendEnvironmentList: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: js.UndefOr[string] = js.undefined
  
  /**
    * If the request failed, this is the returned error.
    */
  var Error: js.UndefOr[string] = js.undefined
}
object GetBackendResponse {
  
  inline def apply(): GetBackendResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackendResponse]
  }
  
  extension [Self <: GetBackendResponse](x: Self) {
    
    inline def setAmplifyFeatureFlags(value: string): Self = StObject.set(x, "AmplifyFeatureFlags", value.asInstanceOf[js.Any])
    
    inline def setAmplifyFeatureFlagsUndefined: Self = StObject.set(x, "AmplifyFeatureFlags", js.undefined)
    
    inline def setAmplifyMetaConfig(value: string): Self = StObject.set(x, "AmplifyMetaConfig", value.asInstanceOf[js.Any])
    
    inline def setAmplifyMetaConfigUndefined: Self = StObject.set(x, "AmplifyMetaConfig", js.undefined)
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    inline def setAppName(value: string): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "AppName", js.undefined)
    
    inline def setBackendEnvironmentList(value: ListOfString): Self = StObject.set(x, "BackendEnvironmentList", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentListUndefined: Self = StObject.set(x, "BackendEnvironmentList", js.undefined)
    
    inline def setBackendEnvironmentListVarargs(value: string*): Self = StObject.set(x, "BackendEnvironmentList", js.Array(value*))
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentNameUndefined: Self = StObject.set(x, "BackendEnvironmentName", js.undefined)
    
    inline def setError(value: string): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
