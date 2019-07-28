package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchFilter extends js.Object {
  /**
    * The key for the filter. Run the DescribePatchProperties command to view lists of valid keys for each operating system type.
    */
  var Key: PatchFilterKey
  /**
    * The value for the filter key. Run the DescribePatchProperties command to view lists of valid values for each key based on operating system type.
    */
  var Values: PatchFilterValueList
}

object PatchFilter {
  @scala.inline
  def apply(Key: PatchFilterKey, Values: PatchFilterValueList): PatchFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values)
  
    __obj.asInstanceOf[PatchFilter]
  }
}

