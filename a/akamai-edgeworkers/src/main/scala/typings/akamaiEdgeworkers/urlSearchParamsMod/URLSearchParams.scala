package typings.akamaiEdgeworkers.urlSearchParamsMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLSearchParams extends js.Object {
  /**
    * Add a new name/value to the receiver.
    */
  def append(name: String, value: String): Unit = js.native
  /**
    * Remove the given name/value from the receiver.
    */
  def delete(name: String): Unit = js.native
  /**
    * Iterate through the name/value pairs.
    */
  def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
  /**
    * Return the first value with the specified name.
    */
  def get(name: String): String | Null = js.native
  /**
    * Return *all* values association with the specified name.
    */
  def getAll(name: String): js.Array[String] = js.native
  /**
    * Check if the given name exists.
    */
  def has(name: String): Boolean = js.native
  /**
    * Iterate through the names.
    */
  def keys(): IterableIterator[String] = js.native
  /**
    * Replace all instances of `name` with a single name/value pair.
    */
  def set(name: String, value: String): Unit = js.native
  /**
    * Iterate through the values.
    */
  def values(): IterableIterator[String] = js.native
}

object URLSearchParams {
  @scala.inline
  def apply(
    append: (String, String) => Unit,
    delete: String => Unit,
    entries: () => IterableIterator[js.Tuple2[String, String]],
    get: String => String | Null,
    getAll: String => js.Array[String],
    has: String => Boolean,
    keys: () => IterableIterator[String],
    set: (String, String) => Unit,
    values: () => IterableIterator[String]
  ): URLSearchParams = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[URLSearchParams]
  }
  @scala.inline
  implicit class URLSearchParamsOps[Self <: URLSearchParams] (val x: Self) extends AnyVal {
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
    def setAppend(value: (String, String) => Unit): Self = this.set("append", js.Any.fromFunction2(value))
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setEntries(value: () => IterableIterator[js.Tuple2[String, String]]): Self = this.set("entries", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: String => String | Null): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAll(value: String => js.Array[String]): Self = this.set("getAll", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(value: () => IterableIterator[String]): Self = this.set("keys", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (String, String) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setValues(value: () => IterableIterator[String]): Self = this.set("values", js.Any.fromFunction0(value))
  }
  
}

