package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullMod {
  
  @JSImport("@antv/util/lib/pull", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](arr: js.Array[T], values: js.Any*): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
