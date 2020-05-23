package typings.apolloEnv.objectMod.global

import typings.apolloEnv.arrayMod.global.Array
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  def fromEntries[K /* <: String */, V](map: Array[js.Tuple2[K, V]]): Record[K, V]
}

object ObjectConstructor {
  @scala.inline
  def apply(fromEntries: Array[js.Tuple2[js.Any, js.Any]] => Record[js.Any, js.Any]): ObjectConstructor = {
    val __obj = js.Dynamic.literal(fromEntries = js.Any.fromFunction1(fromEntries))
    __obj.asInstanceOf[ObjectConstructor]
  }
}

