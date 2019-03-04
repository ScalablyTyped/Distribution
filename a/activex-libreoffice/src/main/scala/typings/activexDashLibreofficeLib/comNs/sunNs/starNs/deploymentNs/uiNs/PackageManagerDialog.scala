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

object PackageManagerDialog {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    create: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      java.lang.String, 
      scala.Unit
    ],
    createAndInstall: js.Function1[java.lang.String, scala.Unit],
    createDefault: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDialogTitle: js.Function1[java.lang.String, scala.Unit],
    startExecuteModal: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XDialogClosedListener, 
      scala.Unit
    ]
  ): PackageManagerDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, create = create, createAndInstall = createAndInstall, createDefault = createDefault, queryInterface = queryInterface, release = release, setDialogTitle = setDialogTitle, startExecuteModal = startExecuteModal)
  
    __obj.asInstanceOf[PackageManagerDialog]
  }
}

