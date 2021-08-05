package typings.antd.anon

import typings.antd.useFormMod.FormInstance
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[Values] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var ref: js.UndefOr[
    (js.Function1[/* instance */ FormInstance[Values] | Null, Unit]) | RefObject[FormInstance[Values]] | Null
  ] = js.undefined
}
object Children {
  
  inline def apply[Values](): Children[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[Values]]
  }
  
  extension [Self <: Children[?], Values](x: Self & Children[Values]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setRef(
      value: (js.Function1[/* instance */ FormInstance[Values] | Null, Unit]) | RefObject[FormInstance[Values]]
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ FormInstance[Values] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
