package typings.arrayDiffer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("array-differ", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](array: js.Array[ValueType], values: js.Array[ValueType]*): js.Array[ValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(array.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[ValueType]]
}
