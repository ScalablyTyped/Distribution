package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Whisper extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
  
  var snoopId: js.UndefOr[String] = js.undefined
  
  var spy: js.UndefOr[String] = js.undefined
  
  var whisper: js.UndefOr[String] = js.undefined
}
object Whisper {
  
  @scala.inline
  def apply(app: String): Whisper = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[Whisper]
  }
  
  @scala.inline
  implicit class WhisperMutableBuilder[Self <: Whisper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
    
    @scala.inline
    def setSnoopId(value: String): Self = StObject.set(x, "snoopId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnoopIdUndefined: Self = StObject.set(x, "snoopId", js.undefined)
    
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
