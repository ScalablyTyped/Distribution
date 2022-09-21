package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containsMod {
  
  @JSImport("@antv/util/lib/lodash/contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arr: js.Array[Any], value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
