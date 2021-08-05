package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  var Audio: StartFragmentNumber
}
object Audio {
  
  inline def apply(Audio: StartFragmentNumber): Audio = {
    val __obj = js.Dynamic.literal(Audio = Audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  
  extension [Self <: Audio](x: Self) {
    
    inline def setAudio(value: StartFragmentNumber): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
  }
}
