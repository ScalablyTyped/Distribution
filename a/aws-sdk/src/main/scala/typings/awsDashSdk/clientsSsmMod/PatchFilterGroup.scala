package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchFilterGroup extends js.Object {
  /**
    * The set of patch filters that make up the group.
    */
  var PatchFilters: PatchFilterList
}

object PatchFilterGroup {
  @scala.inline
  def apply(PatchFilters: PatchFilterList): PatchFilterGroup = {
    val __obj = js.Dynamic.literal(PatchFilters = PatchFilters)
  
    __obj.asInstanceOf[PatchFilterGroup]
  }
}

