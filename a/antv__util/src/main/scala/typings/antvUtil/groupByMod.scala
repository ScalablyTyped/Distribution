package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/group-by", JSImport.Namespace)
@js.native
object groupByMod extends js.Object {
  
  def default[T](data: js.Array[T], condition: String): ObjectType[T] = js.native
  def default[T](data: js.Array[T], condition: js.Function1[/* item */ T, String]): ObjectType[T] = js.native
  
  type ObjectType[T] = StringDictionary[js.Array[T]]
}
