package typings.antvUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/group", JSImport.Namespace)
@js.native
object groupMod extends js.Object {
  
  def default[T](data: js.Array[T], condition: String): js.Array[js.Array[T]] = js.native
  def default[T](data: js.Array[T], condition: js.Array[String]): js.Array[js.Array[T]] = js.native
  def default[T](data: js.Array[T], condition: js.Function1[/* v */ T, String]): js.Array[js.Array[T]] = js.native
}
