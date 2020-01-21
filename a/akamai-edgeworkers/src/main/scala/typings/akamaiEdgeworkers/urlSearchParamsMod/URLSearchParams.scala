package typings.akamaiEdgeworkers.urlSearchParamsMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLSearchParams extends js.Object {
  /**
    * Add a new name/value to the receiver.
    */
  def append(name: String, value: String): Unit
  /**
    * Remove the given name/value from the receiver.
    */
  def delete(name: String): Unit
  /**
    * Iterate through the name/value pairs.
    */
  def entries(): IterableIterator[js.Tuple2[String, String]]
  /**
    * Return the first value with the specified name.
    */
  def get(name: String): String | Null
  /**
    * Return *all* values association with the specified name.
    */
  def getAll(name: String): js.Array[String]
  /**
    * Check if the given name exists.
    */
  def has(name: String): Boolean
  /**
    * Iterate through the names.
    */
  def keys(): IterableIterator[String]
  /**
    * Replace all instances of `name` with a single name/value pair.
    */
  def set(name: String, value: String): Unit
  /**
    * Iterate through the values.
    */
  def values(): IterableIterator[String]
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
}

