package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spy extends StObject {
  
  var app: String = js.native
  
  var appArgs: js.UndefOr[String] = js.native
  
  var channelId: String = js.native
  
  var snoopId: String = js.native
  
  var spy: js.UndefOr[String] = js.native
  
  var whisper: js.UndefOr[String] = js.native
}
object Spy {
  
  @scala.inline
  def apply(app: String, channelId: String, snoopId: String): Spy = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any], snoopId = snoopId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spy]
  }
  
  @scala.inline
  implicit class SpyMutableBuilder[Self <: Spy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnoopId(value: String): Self = StObject.set(x, "snoopId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpy(value: String): Self = StObject.set(x, "spy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpyUndefined: Self = StObject.set(x, "spy", js.undefined)
    
    @scala.inline
    def setWhisper(value: String): Self = StObject.set(x, "whisper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhisperUndefined: Self = StObject.set(x, "whisper", js.undefined)
  }
}
