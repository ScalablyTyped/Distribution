package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullAtMod {
  
  @JSImport("@antv/util/lib/pull-at", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](arr: js.Array[T], indexes: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], indexes.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
