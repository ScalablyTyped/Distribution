package typings.antd.anon

import typings.antd.libTreeTreeMod.AntTreeNodeProps
import typings.antd.libTreeTreeMod.TreeLeafIcon
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowLeafIcon extends StObject {
  
  var showLeafIcon: Boolean | TreeLeafIcon
}
object ShowLeafIcon {
  
  inline def apply(): ShowLeafIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowLeafIcon]
  }
  
  extension [Self <: ShowLeafIcon](x: Self) {
    
    inline def setShowLeafIcon(value: Boolean | TreeLeafIcon): Self = StObject.set(x, "showLeafIcon", value.asInstanceOf[js.Any])
    
    inline def setShowLeafIconFunction1(value: /* props */ AntTreeNodeProps => ReactNode): Self = StObject.set(x, "showLeafIcon", js.Any.fromFunction1(value))
    
    inline def setShowLeafIconUndefined: Self = StObject.set(x, "showLeafIcon", js.undefined)
  }
}
