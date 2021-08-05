package typings.antd.anon

import typings.antd.selectMod.RefSelectProps
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ref: js.UndefOr[
    (js.Function1[/* instance */ RefSelectProps | Null, Unit]) | RefObject[RefSelectProps] | Null
  ] = js.undefined
}
object Ref {
  
  inline def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def setRef(value: (js.Function1[/* instance */ RefSelectProps | Null, Unit]) | RefObject[RefSelectProps]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ RefSelectProps | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
