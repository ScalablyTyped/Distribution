package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spy extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
  
  var channelId: String
  
  var snoopId: String
  
  var spy: js.UndefOr[String] = js.undefined
  
  var whisper: js.UndefOr[String] = js.undefined
}
object Spy {
  
  inline def apply(app: String, channelId: String, snoopId: String): Spy = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any], snoopId = snoopId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spy] (val x: Self) extends AnyVal {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    inline def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setSnoopId(value: String): Self = StObject.set(x, "snoopId", value.asInstanceOf[js.Any])
    
    inline def setSpy(value: String): Self = StObject.set(x, "spy", value.asInstanceOf[js.Any])
    
    inline def setSpyUndefined: Self = StObject.set(x, "spy", js.undefined)
    
    inline def setWhisper(value: String): Self = StObject.set(x, "whisper", value.asInstanceOf[js.Any])
    
    inline def setWhisperUndefined: Self = StObject.set(x, "whisper", js.undefined)
  }
}
