package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The FilterInfo object is a container that describes a Filter object without requiring a Filter to be Added to the process chain. See the FilterInfos
  * property on the ImageProcess object for details on accessing FilterInfo objects.
  */
trait FilterInfo extends js.Object {
  /** Returns a technical Description of what the filter does and how to use it in a filter chain */
  val Description: String
  /** Returns the FilterID for this filter */
  val FilterID: String
  /** Returns the FilterInfo Name */
  val Name: String
  @JSName("WIA.FilterInfo_typekey")
  var WIADotFilterInfo_typekey: FilterInfo
}

object FilterInfo {
  @scala.inline
  def apply(Description: String, FilterID: String, Name: String, WIADotFilterInfo_typekey: FilterInfo): FilterInfo = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], FilterID = FilterID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.FilterInfo_typekey")(WIADotFilterInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterInfo]
  }
}

