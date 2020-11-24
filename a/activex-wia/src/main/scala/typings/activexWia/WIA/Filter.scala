package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Filter object represents a unit of modification on an ImageFile. To use a Filter, add it to the Filters collection, then set the filter's
  * properties and finally use the Apply method of the ImageProcess object to filter an ImageFile.
  */
@js.native
trait Filter extends js.Object {
  
  /** Returns a Description of what the filter does */
  val Description: String = js.native
  
  /** Returns the FilterID for this Filter */
  val FilterID: String = js.native
  
  /** Returns the Filter Name */
  val Name: String = js.native
  
  def Properties(Index: String): Property = js.native
  /** Returns the specified item in the collection either by position or name. */
  /** A collection of all properties for this filter */
  def Properties(Index: Double): Property = js.native
  /** A collection of all properties for this filter */
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  @JSName("WIA.Filter_typekey")
  var WIADotFilter_typekey: Filter = js.native
}
