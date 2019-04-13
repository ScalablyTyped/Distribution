package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationRevision extends js.Object {
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * The description of the configuration revision.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * Required. The revision number of the configuration.
    */
  var Revision: js.UndefOr[__integer] = js.undefined
}

object ConfigurationRevision {
  @scala.inline
  def apply(
    Created: __timestampIso8601 = null,
    Description: __string = null,
    Revision: js.UndefOr[__integer] = js.undefined
  ): ConfigurationRevision = {
    val __obj = js.Dynamic.literal()
    if (Created != null) __obj.updateDynamic("Created")(Created)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Revision)) __obj.updateDynamic("Revision")(Revision)
    __obj.asInstanceOf[ConfigurationRevision]
  }
}

