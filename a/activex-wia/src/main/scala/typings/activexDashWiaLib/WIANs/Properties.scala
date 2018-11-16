package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Properties object is a collection of all the Property objects associated with a given Device, DeviceInfo, Filter, ImageFile or Item object. See
     * the Properties property on any of these objects for detail on accessing the Properties object.
     */
@js.native
trait Properties extends js.Object {
  /** Returns the number of members in the collection */
  val Count: scala.Double = js.native
  /** Returns the specified item in the collection either by position or name. */
  def apply(Index: java.lang.String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  def apply(Index: scala.Double): Property = js.native
  /** Indicates whether the specified Property exists in the collection */
  def Exists(Index: java.lang.String): scala.Boolean = js.native
  /** Indicates whether the specified Property exists in the collection */
  def Exists(Index: scala.Double): scala.Boolean = js.native
  /** Returns the specified item in the collection either by position or name. */
  def Item(Index: java.lang.String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  def Item(Index: scala.Double): Property = js.native
}

