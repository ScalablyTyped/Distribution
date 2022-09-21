package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object someMod {
  
  @JSImport("@antv/util/lib/lodash/some", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ js.UndefOr[Double], Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
