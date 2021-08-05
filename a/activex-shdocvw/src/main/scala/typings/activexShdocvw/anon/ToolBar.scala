package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBar extends StObject {
  
  val ToolBar: Boolean
}
object ToolBar {
  
  inline def apply(ToolBar: Boolean): ToolBar = {
    val __obj = js.Dynamic.literal(ToolBar = ToolBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBar]
  }
  
  extension [Self <: ToolBar](x: Self) {
    
    inline def setToolBar(value: Boolean): Self = StObject.set(x, "ToolBar", value.asInstanceOf[js.Any])
  }
}
