package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object everyMod {
  
  @JSImport("@antv/util/lib/every", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ js.UndefOr[Double], js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
