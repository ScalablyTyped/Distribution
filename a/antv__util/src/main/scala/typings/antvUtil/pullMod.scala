package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullMod {
  
  @JSImport("@antv/util/lib/lodash/pull", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](arr: js.Array[T], values: Any*): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(arr.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[T]]
}
