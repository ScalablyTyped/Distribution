package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImageBuilderRequest extends StObject {
  
  /**
    * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsSdk.clientsAppstreamMod.AppstreamAgentVersion] = js.undefined
  
  /**
    * The name of the image builder.
    */
  var Name: String
}
object StartImageBuilderRequest {
  
  inline def apply(Name: String): StartImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImageBuilderRequest]
  }
  
  extension [Self <: StartImageBuilderRequest](x: Self) {
    
    inline def setAppstreamAgentVersion(value: AppstreamAgentVersion): Self = StObject.set(x, "AppstreamAgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAppstreamAgentVersionUndefined: Self = StObject.set(x, "AppstreamAgentVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
