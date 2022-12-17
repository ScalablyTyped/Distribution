package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
  
  var channelId: js.UndefOr[String] = js.undefined
  
  var endpoint: String
  
  var formats: js.UndefOr[String] = js.undefined
  
  var originator: js.UndefOr[String] = js.undefined
  
  var otherChannelId: js.UndefOr[String] = js.undefined
}
object Endpoint {
  
  inline def apply(app: String, endpoint: String): Endpoint = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    inline def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setFormats(value: String): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setOriginatorUndefined: Self = StObject.set(x, "originator", js.undefined)
    
    inline def setOtherChannelId(value: String): Self = StObject.set(x, "otherChannelId", value.asInstanceOf[js.Any])
    
    inline def setOtherChannelIdUndefined: Self = StObject.set(x, "otherChannelId", js.undefined)
  }
}
