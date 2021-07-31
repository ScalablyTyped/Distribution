package typings.ariClient.anon

import typings.ariClient.mod.Containers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppArgs extends StObject {
  
  var app: js.UndefOr[String] = js.undefined
  
  var appArgs: js.UndefOr[String] = js.undefined
  
  var callerId: js.UndefOr[String] = js.undefined
  
  var channelId: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[String] = js.undefined
  
  var endpoint: String
  
  var `extension`: js.UndefOr[String] = js.undefined
  
  var formats: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var originator: js.UndefOr[String] = js.undefined
  
  var otherChannelId: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var variables: js.UndefOr[Containers] = js.undefined
}
object AppArgs {
  
  @scala.inline
  def apply(endpoint: String): AppArgs = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppArgs]
  }
  
  @scala.inline
  implicit class AppArgsMutableBuilder[Self <: AppArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
    
    @scala.inline
    def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    @scala.inline
    def setCallerId(value: String): Self = StObject.set(x, "callerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerIdUndefined: Self = StObject.set(x, "callerId", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setFormats(value: String): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginatorUndefined: Self = StObject.set(x, "originator", js.undefined)
    
    @scala.inline
    def setOtherChannelId(value: String): Self = StObject.set(x, "otherChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherChannelIdUndefined: Self = StObject.set(x, "otherChannelId", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setVariables(value: Containers): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
