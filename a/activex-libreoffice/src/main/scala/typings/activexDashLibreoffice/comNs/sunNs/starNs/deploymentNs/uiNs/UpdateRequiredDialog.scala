package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs.uiNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link UpdateRequiredDialog} is used to show a list of extensions not compatible with this office version.
  * @since OOo 3.2
  */
trait UpdateRequiredDialog extends XExecutableDialog {
  /** Create a GUI using the specific parent window and focus on the given context. */
  def create(): Unit
}

object UpdateRequiredDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    create: () => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): UpdateRequiredDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction0(create), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[UpdateRequiredDialog]
  }
}

