package typings.arrayDiffer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[ValueType](array: js.Array[ValueType], values: js.Array[ValueType]*): js.Array[ValueType] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[ValueType]]
  
  @JSImport("array-differ", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
