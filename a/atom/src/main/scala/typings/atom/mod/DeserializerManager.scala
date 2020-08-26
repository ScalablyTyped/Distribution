package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeserializerManager extends js.Object {
  /** Register the given class(es) as deserializers. */
  def add(deserializers: Deserializer*): Disposable = js.native
  /** Deserialize the state and params. */
  def deserialize(state: js.Object): js.UndefOr[js.Object] = js.native
}

object DeserializerManager {
  @scala.inline
  def apply(add: /* repeated */ Deserializer => Disposable, deserialize: js.Object => js.UndefOr[js.Object]): DeserializerManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), deserialize = js.Any.fromFunction1(deserialize))
    __obj.asInstanceOf[DeserializerManager]
  }
  @scala.inline
  implicit class DeserializerManagerOps[Self <: DeserializerManager] (val x: Self) extends AnyVal {
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
    def setAdd(value: /* repeated */ Deserializer => Disposable): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setDeserialize(value: js.Object => js.UndefOr[js.Object]): Self = this.set("deserialize", js.Any.fromFunction1(value))
  }
  
}

