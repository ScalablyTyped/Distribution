package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/sort-by", JSImport.Namespace)
@js.native
object sortByMod extends js.Object {
  
  def default[T](arr: js.Array[ObjectType[T]], key: String): js.Array[ObjectType[T]] = js.native
  def default[T](arr: js.Array[ObjectType[T]], key: js.Array[String]): js.Array[ObjectType[T]] = js.native
  def default[T](arr: js.Array[ObjectType[T]], key: js.Function): js.Array[ObjectType[T]] = js.native
  
  type ObjectType[T] = StringDictionary[T]
}
