package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recipes extends js.Object {
  /**
    * An array of custom recipe names to be run following a configure event.
    */
  var Configure: js.UndefOr[Strings] = js.native
  /**
    * An array of custom recipe names to be run following a deploy event.
    */
  var Deploy: js.UndefOr[Strings] = js.native
  /**
    * An array of custom recipe names to be run following a setup event.
    */
  var Setup: js.UndefOr[Strings] = js.native
  /**
    * An array of custom recipe names to be run following a shutdown event.
    */
  var Shutdown: js.UndefOr[Strings] = js.native
  /**
    * An array of custom recipe names to be run following a undeploy event.
    */
  var Undeploy: js.UndefOr[Strings] = js.native
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
    if (Configure != null) __obj.updateDynamic("Configure")(Configure.asInstanceOf[js.Any])
    if (Deploy != null) __obj.updateDynamic("Deploy")(Deploy.asInstanceOf[js.Any])
    if (Setup != null) __obj.updateDynamic("Setup")(Setup.asInstanceOf[js.Any])
    if (Shutdown != null) __obj.updateDynamic("Shutdown")(Shutdown.asInstanceOf[js.Any])
    if (Undeploy != null) __obj.updateDynamic("Undeploy")(Undeploy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipes]
  }
}

