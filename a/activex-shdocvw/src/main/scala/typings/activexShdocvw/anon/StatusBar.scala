package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBar extends StObject {
  
  val StatusBar: Boolean
}
object StatusBar {
  
  inline def apply(StatusBar: Boolean): StatusBar = {
    val __obj = js.Dynamic.literal(StatusBar = StatusBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBar]
  }
  
  extension [Self <: StatusBar](x: Self) {
    
    inline def setStatusBar(value: Boolean): Self = StObject.set(x, "StatusBar", value.asInstanceOf[js.Any])
  }
}
