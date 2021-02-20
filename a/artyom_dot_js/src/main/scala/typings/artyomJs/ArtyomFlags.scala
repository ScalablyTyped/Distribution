package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtyomFlags extends StObject {
  
  var restartRecognition: js.UndefOr[Boolean] = js.native
}
object ArtyomFlags {
  
  @scala.inline
  def apply(): ArtyomFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtyomFlags]
  }
  
  @scala.inline
  implicit class ArtyomFlagsMutableBuilder[Self <: ArtyomFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestartRecognition(value: Boolean): Self = StObject.set(x, "restartRecognition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartRecognitionUndefined: Self = StObject.set(x, "restartRecognition", js.undefined)
  }
}
