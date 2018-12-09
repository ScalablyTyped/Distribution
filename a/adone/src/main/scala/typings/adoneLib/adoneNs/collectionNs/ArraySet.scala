package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Respresetns a data structure which is a combination of an array and a set.
     * Adding a new member is O(1), testing for membership is O(1),
     * and finding the index of an element is O(1).
     */
@JSGlobal("adone.collection.ArraySet")
@js.native
class ArraySet[T] () extends js.Object {
  /**
           * The number of unique items in this ArraySet.
           * If duplicates have been added, than those do not count towards the size.
           */
  val length: scala.Double = js.native
  /**
           * Adds the given value to this set.
           *
           * @param allowDuplicates Whether to allow duplicates in the set, false by default
           */
  def add(value: T): this.type = js.native
  /**
           * Adds the given value to this set.
           *
           * @param allowDuplicates Whether to allow duplicates in the set, false by default
           */
  def add(value: T, allowDuplicates: scala.Boolean): this.type = js.native
  /**
           * Checks whether the given value is a member of the set
           */
  def has(value: T): scala.Boolean = js.native
  /**
           * Returns the index of the given element.
           * If the value is not present it will return -1
           */
  def indexOf(value: T): scala.Double = js.native
  /**
           * Converts the set to an array
           */
  def toArray(): js.Array[T] = js.native
}

/**
     * Respresetns a data structure which is a combination of an array and a set.
     * Adding a new member is O(1), testing for membership is O(1),
     * and finding the index of an element is O(1).
     */
@JSGlobal("adone.collection.ArraySet")
@js.native
object ArraySet extends js.Object {
  /**
           * Creates an ArraySet from the given iterable object
           *
           * @param allowDuplicates Whether to allow duplicates in the set, false by default
           */
  def from[T](iterable: nodeLib.Iterable[T]): adoneLib.adoneNs.collectionNs.ArraySet[T] = js.native
  /**
           * Creates an ArraySet from the given iterable object
           *
           * @param allowDuplicates Whether to allow duplicates in the set, false by default
           */
  def from[T](iterable: nodeLib.Iterable[T], allowDuplicates: scala.Boolean): adoneLib.adoneNs.collectionNs.ArraySet[T] = js.native
}

