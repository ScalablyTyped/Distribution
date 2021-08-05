package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowLeafIcon extends StObject {
  
  var showLeafIcon: Boolean
}
object ShowLeafIcon {
  
  inline def apply(showLeafIcon: Boolean): ShowLeafIcon = {
    val __obj = js.Dynamic.literal(showLeafIcon = showLeafIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowLeafIcon]
  }
  
  extension [Self <: ShowLeafIcon](x: Self) {
    
    inline def setShowLeafIcon(value: Boolean): Self = StObject.set(x, "showLeafIcon", value.asInstanceOf[js.Any])
  }
}
