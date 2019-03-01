package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link UpdateRequiredDialog} is used to show a list of extensions not compatible with this office version.
  * @since OOo 3.2
  */
trait UpdateRequiredDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
  /** Create a GUI using the specific parent window and focus on the given context. */
  def create(): scala.Unit
}

object UpdateRequiredDialog {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    create: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): UpdateRequiredDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[UpdateRequiredDialog]
  }
}

