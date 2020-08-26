package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The FilterInfo object is a container that describes a Filter object without requiring a Filter to be Added to the process chain. See the FilterInfos
  * property on the ImageProcess object for details on accessing FilterInfo objects.
  */
@js.native
trait FilterInfo extends js.Object {
  /** Returns a technical Description of what the filter does and how to use it in a filter chain */
  val Description: String = js.native
  /** Returns the FilterID for this filter */
  val FilterID: String = js.native
  /** Returns the FilterInfo Name */
  val Name: String = js.native
  @JSName("WIA.FilterInfo_typekey")
  var WIADotFilterInfo_typekey: FilterInfo = js.native
}

object FilterInfo {
  @scala.inline
  def apply(Description: String, FilterID: String, Name: String, WIADotFilterInfo_typekey: FilterInfo): FilterInfo = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], FilterID = FilterID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.FilterInfo_typekey")(WIADotFilterInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterInfo]
  }
  @scala.inline
  implicit class FilterInfoOps[Self <: FilterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterID(value: String): Self = this.set("FilterID", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWIADotFilterInfo_typekey(value: FilterInfo): Self = this.set("WIA.FilterInfo_typekey", value.asInstanceOf[js.Any])
  }
  
}

