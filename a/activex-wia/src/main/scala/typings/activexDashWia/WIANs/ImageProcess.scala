package typings.activexDashWia.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ImageProcess object manages the filter chain. An ImageProcess object can be created using "WIA.ImageProcess" in a call to CreateObject. */
@JSGlobal("WIA.ImageProcess")
@js.native
class ImageProcess protected () extends js.Object {
  /** A collection of all available filters */
  @JSName("FilterInfos")
  val FilterInfos_Original: FilterInfos = js.native
  /** A collection of the filters to be applied in this process */
  @JSName("Filters")
  val Filters_Original: Filters = js.native
  var `WIA.ImageProcess_typekey`: ImageProcess = js.native
  /** Takes the specified ImageFile and returns the new ImageFile with all the filters applied on success */
  def Apply(Source: ImageFile): ImageFile = js.native
  def FilterInfos(Index: String): FilterInfo = js.native
  /** Returns the specified item in the collection either by position or name */
  /** A collection of all available filters */
  def FilterInfos(Index: Double): FilterInfo = js.native
  /** Returns the specified item in the collection by position or FilterID */
  /** A collection of the filters to be applied in this process */
  def Filters(Index: Double): Filter = js.native
}

