package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startsWithMod {
  
  @JSImport("@antv/util/lib/lodash/starts-with", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arr: String, e: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default[T](arr: js.Array[T], e: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
