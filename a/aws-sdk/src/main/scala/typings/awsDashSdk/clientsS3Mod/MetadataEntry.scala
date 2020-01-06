package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataEntry extends js.Object {
  /**
    * Name of the Object.
    */
  var Name: js.UndefOr[MetadataKey] = js.native
  /**
    * Value of the Object.
    */
  var Value: js.UndefOr[MetadataValue] = js.native
}

object MetadataEntry {
  @scala.inline
  def apply(Name: MetadataKey = null, Value: MetadataValue = null): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataEntry]
  }
}

