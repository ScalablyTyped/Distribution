package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link PackageManagerDialog} is used to visually manage installed packages of the user and shared installation as well as currently open
  * documents.
  * @since OOo 2.0
  */
trait PackageManagerDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XAsynchronousExecutableDialog {
  /**
    * Create a GUI using the specific parent window and focus on the given context.
    * @param xParent parent window
    * @param focussedContext context to be focused
    */
  def create(
    xParent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    focussedContext: java.lang.String
  ): scala.Unit
  /**
    * Create a GUI and pass the URL of the extension which shall be installed right away. This constructor is intended for the case when unopkg is run as
    * result of clicking an extension in a file browser, etc. The extensions will always be installed for the current user.
    * @param extensionURL URL of extension
    */
  def createAndInstall(extensionURL: java.lang.String): scala.Unit
  /** Create a default GUI. */
  def createDefault(): scala.Unit
}

