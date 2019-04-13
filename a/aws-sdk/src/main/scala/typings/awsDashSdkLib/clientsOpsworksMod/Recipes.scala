package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recipes extends js.Object {
  /**
    * An array of custom recipe names to be run following a configure event.
    */
  var Configure: js.UndefOr[Strings] = js.undefined
  /**
    * An array of custom recipe names to be run following a deploy event.
    */
  var Deploy: js.UndefOr[Strings] = js.undefined
  /**
    * An array of custom recipe names to be run following a setup event.
    */
  var Setup: js.UndefOr[Strings] = js.undefined
  /**
    * An array of custom recipe names to be run following a shutdown event.
    */
  var Shutdown: js.UndefOr[Strings] = js.undefined
  /**
    * An array of custom recipe names to be run following a undeploy event.
    */
  var Undeploy: js.UndefOr[Strings] = js.undefined
}

object Recipes {
  @scala.inline
  def apply(
    Configure: Strings = null,
    Deploy: Strings = null,
    Setup: Strings = null,
    Shutdown: Strings = null,
    Undeploy: Strings = null
  ): Recipes = {
    val __obj = js.Dynamic.literal()
    if (Configure != null) __obj.updateDynamic("Configure")(Configure)
    if (Deploy != null) __obj.updateDynamic("Deploy")(Deploy)
    if (Setup != null) __obj.updateDynamic("Setup")(Setup)
    if (Shutdown != null) __obj.updateDynamic("Shutdown")(Shutdown)
    if (Undeploy != null) __obj.updateDynamic("Undeploy")(Undeploy)
    __obj.asInstanceOf[Recipes]
  }
}

