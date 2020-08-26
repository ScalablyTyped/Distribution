package typings.apolloEnv.objectMod.global

import typings.apolloEnv.arrayMod.global.Array
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectConstructor extends js.Object {
  def fromEntries[K /* <: String */, V](map: Array[js.Tuple2[K, V]]): Record[K, V] = js.native
}

object ObjectConstructor {
  @scala.inline
  def apply(fromEntries: Array[js.Tuple2[js.Any, js.Any]] => Record[js.Any, js.Any]): ObjectConstructor = {
    val __obj = js.Dynamic.literal(fromEntries = js.Any.fromFunction1(fromEntries))
    __obj.asInstanceOf[ObjectConstructor]
  }
  @scala.inline
  implicit class ObjectConstructorOps[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFromEntries(value: Array[js.Tuple2[js.Any, js.Any]] => Record[js.Any, js.Any]): Self = this.set("fromEntries", js.Any.fromFunction1(value))
  }
  
}

