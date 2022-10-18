package typings.awsLambda.anon

import typings.awsLambda.triggerConnectContactFlowMod.CustomerAudio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  var Audio: CustomerAudio
}
object Audio {
  
  inline def apply(): Audio = {
    val __obj = js.Dynamic.literal(Audio = null)
    __obj.asInstanceOf[Audio]
  }
  
  extension [Self <: Audio](x: Self) {
    
    inline def setAudio(value: CustomerAudio): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    inline def setAudioNull: Self = StObject.set(x, "Audio", null)
  }
}
