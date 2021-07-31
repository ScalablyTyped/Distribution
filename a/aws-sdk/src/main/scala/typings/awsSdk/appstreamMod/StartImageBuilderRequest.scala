package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImageBuilderRequest extends StObject {
  
  /**
    * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsSdk.appstreamMod.AppstreamAgentVersion] = js.undefined
  
  /**
    * The name of the image builder.
    */
  var Name: String
}
object StartImageBuilderRequest {
  
  @scala.inline
  def apply(Name: String): StartImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImageBuilderRequest]
  }
  
  @scala.inline
  implicit class StartImageBuilderRequestMutableBuilder[Self <: StartImageBuilderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppstreamAgentVersion(value: AppstreamAgentVersion): Self = StObject.set(x, "AppstreamAgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppstreamAgentVersionUndefined: Self = StObject.set(x, "AppstreamAgentVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
