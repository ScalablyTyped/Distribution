package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The FilterInfos object is a collection of all the available FilterInfo objects. See the FilterInfos property on the ImageProcess object for detail on
  * accessing the FilterInfos object.
  */
@js.native
trait FilterInfos extends js.Object {
  /** Returns the number of members in the collection */
  val Count: scala.Double = js.native
  def apply(Index: java.lang.String): FilterInfo = js.native
  /** Returns the specified item in the collection either by position or name */
  def apply(Index: scala.Double): FilterInfo = js.native
  def Item(Index: java.lang.String): FilterInfo = js.native
  /** Returns the specified item in the collection either by position or name */
  def Item(Index: scala.Double): FilterInfo = js.native
}

