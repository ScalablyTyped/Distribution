package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtyomFlags extends StObject {
  
  var restartRecognition: js.UndefOr[Boolean] = js.undefined
}
object ArtyomFlags {
  
  inline def apply(): ArtyomFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtyomFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtyomFlags] (val x: Self) extends AnyVal {
    
    inline def setRestartRecognition(value: Boolean): Self = StObject.set(x, "restartRecognition", value.asInstanceOf[js.Any])
    
    inline def setRestartRecognitionUndefined: Self = StObject.set(x, "restartRecognition", js.undefined)
  }
}
