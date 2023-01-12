package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullScreen extends StObject {
  
  val FullScreen: Boolean
}
object FullScreen {
  
  inline def apply(FullScreen: Boolean): FullScreen = {
    val __obj = js.Dynamic.literal(FullScreen = FullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullScreen] (val x: Self) extends AnyVal {
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "FullScreen", value.asInstanceOf[js.Any])
  }
}
