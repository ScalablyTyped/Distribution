package typings.astTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyArray extends StObject {
  
  def emptyArray(): js.Array[scala.Nothing]
  
  def `false`(): Boolean
  
  def `null`(): Null
  
  def `true`(): Boolean
  
  def undefined(): Unit
  
  def `use strict`(): String
}
object EmptyArray {
  
  inline def apply(
    emptyArray: () => js.Array[scala.Nothing],
    `false`: () => Boolean,
    `null`: () => Null,
    `true`: () => Boolean,
    undefined: () => Unit,
    `use strict`: () => String
  ): EmptyArray = {
    val __obj = js.Dynamic.literal(emptyArray = js.Any.fromFunction0(emptyArray), undefined = js.Any.fromFunction0(undefined))
    __obj.updateDynamic("false")(js.Any.fromFunction0(`false`))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.updateDynamic("true")(js.Any.fromFunction0(`true`))
    __obj.updateDynamic("use strict")(js.Any.fromFunction0(`use strict`))
    __obj.asInstanceOf[EmptyArray]
  }
  
  extension [Self <: EmptyArray](x: Self) {
    
    inline def setEmptyArray(value: () => js.Array[scala.Nothing]): Self = StObject.set(x, "emptyArray", js.Any.fromFunction0(value))
    
    inline def setFalse(value: () => Boolean): Self = StObject.set(x, "false", js.Any.fromFunction0(value))
    
    inline def setNull(value: () => Null): Self = StObject.set(x, "null", js.Any.fromFunction0(value))
    
    inline def setTrue(value: () => Boolean): Self = StObject.set(x, "true", js.Any.fromFunction0(value))
    
    inline def setUndefined(value: () => Unit): Self = StObject.set(x, "undefined", js.Any.fromFunction0(value))
    
    inline def `setUse strict`(value: () => String): Self = StObject.set(x, "use strict", js.Any.fromFunction0(value))
  }
}
