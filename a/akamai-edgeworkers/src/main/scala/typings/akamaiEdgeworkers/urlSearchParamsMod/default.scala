package typings.akamaiEdgeworkers.urlSearchParamsMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url-search-params", JSImport.Default)
@js.native
/**
  * Create a new URLSearchParams object.
  */
class default () extends URLSearchParams {
  def this(init: String) = this()
  def this(init: URLSearchParams) = this()
  /**
    * Add a new name/value to the receiver.
    */
  /* CompleteClass */
  override def append(name: String, value: String): Unit = js.native
  /**
    * Remove the given name/value from the receiver.
    */
  /* CompleteClass */
  override def delete(name: String): Unit = js.native
  /**
    * Iterate through the name/value pairs.
    */
  /* CompleteClass */
  override def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
  /**
    * Return the first value with the specified name.
    */
  /* CompleteClass */
  override def get(name: String): String | Null = js.native
  /**
    * Return *all* values association with the specified name.
    */
  /* CompleteClass */
  override def getAll(name: String): js.Array[String] = js.native
  /**
    * Check if the given name exists.
    */
  /* CompleteClass */
  override def has(name: String): Boolean = js.native
  /**
    * Iterate through the names.
    */
  /* CompleteClass */
  override def keys(): IterableIterator[String] = js.native
  /**
    * Replace all instances of `name` with a single name/value pair.
    */
  /* CompleteClass */
  override def set(name: String, value: String): Unit = js.native
  /**
    * Iterate through the values.
    */
  /* CompleteClass */
  override def values(): IterableIterator[String] = js.native
}

