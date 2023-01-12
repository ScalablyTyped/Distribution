package typings.antdMobile.anon

import typings.antdMobile.esComponentsTreeSelectTreeSelectMod.TreeSelectOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: js.Array[TreeSelectOption]
}
object Options {
  
  inline def apply(options: js.Array[TreeSelectOption]): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: js.Array[TreeSelectOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: TreeSelectOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
