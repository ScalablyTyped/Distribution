package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Filters object is a collection of the Filters that will be applied to an ImageFile when you call the Apply method on the ImageProcess object. */
@js.native
trait Filters extends js.Object {
  /** Returns the number of members in the collection */
  val Count: scala.Double = js.native
  /** Returns the specified item in the collection by position or FilterID */
  def apply(Index: scala.Double): Filter = js.native
  /**
           * Appends/Inserts a new Filter of the specified FilterID into a Filter collection
           * @param number [Index=0]
           */
  def Add(FilterID: java.lang.String): scala.Unit = js.native
  /**
           * Appends/Inserts a new Filter of the specified FilterID into a Filter collection
           * @param number [Index=0]
           */
  def Add(FilterID: java.lang.String, Index: scala.Double): scala.Unit = js.native
  /** Returns the specified item in the collection by position or FilterID */
  def Item(Index: scala.Double): Filter = js.native
  /** Removes the designated filter */
  def Remove(Index: scala.Double): scala.Unit = js.native
}

