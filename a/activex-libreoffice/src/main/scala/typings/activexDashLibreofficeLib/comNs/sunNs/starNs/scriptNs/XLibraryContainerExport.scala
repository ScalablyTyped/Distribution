package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extension of {@link XLibraryContainer} to provide functionality to store a library to a location represented by a URL. */
trait XLibraryContainerExport
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Exports a library specified by Name to the location specified by the passed URL string.
    *
    * An interaction handler can be passed to be used for internal ucb operations. Exceptions not processed by this handler will be passed as {@link
    * com.sun.star.uno.Exception} . If this parameter is null this applies to all exceptions thrown by ucb.
    * @see com.sun.star.task.InteractionHandler If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    */
  def exportLibrary(
    Name: java.lang.String,
    URL: java.lang.String,
    Handler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  ): scala.Unit
}

object XLibraryContainerExport {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    exportLibrary: (java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XLibraryContainerExport = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), exportLibrary = js.Any.fromFunction3(exportLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLibraryContainerExport]
  }
}

