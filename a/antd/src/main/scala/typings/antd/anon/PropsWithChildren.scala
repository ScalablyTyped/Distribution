package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{}> */
trait PropsWithChildren extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
}
object PropsWithChildren {
  
  inline def apply(): PropsWithChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsWithChildren]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsWithChildren] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
