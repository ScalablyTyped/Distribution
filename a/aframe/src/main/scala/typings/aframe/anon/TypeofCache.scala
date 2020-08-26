package typings.aframe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCache extends js.Object {
  var enabled: Boolean = js.native
  var files: js.Any = js.native
  def add(key: String, file: js.Any): Unit = js.native
  def clear(): Unit = js.native
  def get(key: String): js.Any = js.native
  def remove(key: String): Unit = js.native
}

object TypeofCache {
  @scala.inline
  def apply(
    add: (String, js.Any) => Unit,
    clear: () => Unit,
    enabled: Boolean,
    files: js.Any,
    get: String => js.Any,
    remove: String => Unit
  ): TypeofCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[TypeofCache]
  }
  @scala.inline
  implicit class TypeofCacheOps[Self <: TypeofCache] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, js.Any) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiles(value: js.Any): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

