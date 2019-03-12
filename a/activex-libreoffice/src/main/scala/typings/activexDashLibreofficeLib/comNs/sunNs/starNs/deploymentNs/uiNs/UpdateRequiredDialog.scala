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
    acquire: () => scala.Unit,
    create: () => scala.Unit,
    execute: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): UpdateRequiredDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction0(create), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[UpdateRequiredDialog]
  }
}

