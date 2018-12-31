package typings
package activexDashWiaLib.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Filter object represents a unit of modification on an ImageFile. To use a Filter, add it to the Filters collection, then set the filter's
  * properties and finally use the Apply method of the ImageProcess object to filter an ImageFile.
  */
@JSGlobal("WIA.Filter")
@js.native
class Filter protected () extends js.Object {
  /** Returns a Description of what the filter does */
  val Description: java.lang.String = js.native
  /** Returns the FilterID for this Filter */
  val FilterID: java.lang.String = js.native
  /** Returns the Filter Name */
  val Name: java.lang.String = js.native
  /** A collection of all properties for this filter */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var `WIA.Filter_typekey`: Filter = js.native
  def Properties(Index: java.lang.String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this filter */
  def Properties(Index: scala.Double): Property = js.native
}

