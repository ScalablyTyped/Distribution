package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  @JSImport("@antv/util/lib/lodash/group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](data: js.Array[T], condition: String): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  inline def default[T](data: js.Array[T], condition: js.Array[String]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  inline def default[T](data: js.Array[T], condition: js.Function1[/* v */ T, String]): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
}
