package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMetadataFlagRequest extends StObject {
  
  /**
    * The unique ID for the Amplify app.
    */
  var appId: String
  
  /**
    * The metadata information to store.
    */
  var body: PutMetadataFlagBody
  
  /**
    * The name of the backend environment that is part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The name of the feature associated with the metadata.
    */
  var featureName: String
}
object PutMetadataFlagRequest {
  
  inline def apply(appId: String, body: PutMetadataFlagBody, environmentName: String, featureName: String): PutMetadataFlagRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetadataFlagRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutMetadataFlagRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setBody(value: PutMetadataFlagBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
  }
}
