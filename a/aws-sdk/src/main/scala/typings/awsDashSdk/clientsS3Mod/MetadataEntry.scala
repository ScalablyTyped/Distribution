package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataEntry extends js.Object {
  /**
    * 
    */
  var Name: js.UndefOr[MetadataKey] = js.undefined
  /**
    * 
    */
  var Value: js.UndefOr[MetadataValue] = js.undefined
}

object MetadataEntry {
  @scala.inline
  def apply(Name: MetadataKey = null, Value: MetadataValue = null): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[MetadataEntry]
  }
}

