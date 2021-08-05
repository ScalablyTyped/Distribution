package typings.antd.anon

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemRef extends StObject {
  
  /** No! Do not use this in your code! */
  def itemRef(name: InternalNamePath): js.Function1[/* node */ ReactElement, Unit]
  
  /** No! Do not use this in your code! */
  var name: js.UndefOr[String] = js.undefined
}
object ItemRef {
  
  inline def apply(itemRef: InternalNamePath => js.Function1[/* node */ ReactElement, Unit]): ItemRef = {
    val __obj = js.Dynamic.literal(itemRef = js.Any.fromFunction1(itemRef))
    __obj.asInstanceOf[ItemRef]
  }
  
  extension [Self <: ItemRef](x: Self) {
    
    inline def setItemRef(value: InternalNamePath => js.Function1[/* node */ ReactElement, Unit]): Self = StObject.set(x, "itemRef", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
