package typings.antd.anon

import typings.antd.treeSelectMod.RefTreeSelectProps
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var ref: js.UndefOr[
    (js.Function1[/* instance */ RefTreeSelectProps | Null, Unit]) | RefObject[RefTreeSelectProps] | Null
  ] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setRef(
      value: (js.Function1[/* instance */ RefTreeSelectProps | Null, Unit]) | RefObject[RefTreeSelectProps]
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ RefTreeSelectProps | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
