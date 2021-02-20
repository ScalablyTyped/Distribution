package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullScreen extends StObject {
  
  val FullScreen: Boolean = js.native
}
object FullScreen {
  
  @scala.inline
  def apply(FullScreen: Boolean): FullScreen = {
    val __obj = js.Dynamic.literal(FullScreen = FullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreen]
  }
  
  @scala.inline
  implicit class FullScreenMutableBuilder[Self <: FullScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = StObject.set(x, "FullScreen", value.asInstanceOf[js.Any])
  }
}
