package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSecurityConfigurationsInput extends js.Object {
  /**
    * The pagination token that indicates the set of results to retrieve.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
}

object ListSecurityConfigurationsInput {
  @scala.inline
  def apply(Marker: Marker = null): ListSecurityConfigurationsInput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListSecurityConfigurationsInput]
  }
}

