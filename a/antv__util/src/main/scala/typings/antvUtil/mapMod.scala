package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("@antv/util/lib/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, G](arr: js.Array[T], func: js.Function2[/* v */ T, /* idx */ Double, G]): js.Array[G] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[G]]
}
