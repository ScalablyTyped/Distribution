package typings.activexScripting.Scripting

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Scripting.Dictionary */
@js.native
trait Dictionary[TKey, TItem] extends js.Object {
  /** Set or get the string comparison method. */
  var CompareMode: CompareMethod = js.native
  /** Get the number of items in the dictionary. */
  val Count: Double = js.native
  /** Set or get the item for a given key */
  def apply(Key: TKey): TItem = js.native
  /** Add a new key and item to the dictionary. */
  def Add(Key: TKey, Item: TItem): Unit = js.native
  /** Determine if a given key is in the dictionary. */
  def Exists(Key: TKey): Boolean = js.native
  def HashVal(Key: TKey): js.Any = js.native
  /** Set or get the item for a given key */
  def Item(Key: TKey): TItem = js.native
  /** Get an array containing all items in the dictionary. */
  def Items(): SafeArray[TItem] = js.native
  /** Change a key to a different key. */
  def Key(Key: TKey): TKey = js.native
  /** Get an array containing all keys in the dictionary. */
  def Keys(): SafeArray[TKey] = js.native
  /** Remove a given key from the dictionary. */
  def Remove(Key: TKey): Unit = js.native
  /** Remove all information from the dictionary. */
  def RemoveAll(): Unit = js.native
}

