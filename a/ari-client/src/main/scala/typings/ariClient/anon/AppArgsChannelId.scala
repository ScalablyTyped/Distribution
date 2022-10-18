package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppArgsChannelId extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
  
  var channelId: String
}
object AppArgsChannelId {
  
  inline def apply(app: String, channelId: String): AppArgsChannelId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppArgsChannelId]
  }
  
  extension [Self <: AppArgsChannelId](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    inline def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
  }
}
