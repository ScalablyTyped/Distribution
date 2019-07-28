package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Extension of {@link XLibraryContainer} to provide functionality to store a library to a location represented by a URL. */
trait XLibraryContainerExport extends XInterface {
  /**
    * Exports a library specified by Name to the location specified by the passed URL string.
    *
    * An interaction handler can be passed to be used for internal ucb operations. Exceptions not processed by this handler will be passed as {@link
    * com.sun.star.uno.Exception} . If this parameter is null this applies to all exceptions thrown by ucb.
    * @see com.sun.star.task.InteractionHandler If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    */
  def exportLibrary(Name: String, URL: String, Handler: XInteractionHandler): Unit
}

object XLibraryContainerExport {
  @scala.inline
  def apply(
    acquire: () => Unit,
    exportLibrary: (String, String, XInteractionHandler) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLibraryContainerExport = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), exportLibrary = js.Any.fromFunction3(exportLibrary), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLibraryContainerExport]
  }
}

