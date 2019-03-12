package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a library and provides access to its modules
  * @deprecated Deprecated
  */
trait XStarBasicAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the library container giving access to the libraries stored in a document or basic library file. */
  val LibraryContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * Adds an old style basic dialog (SI controls) to an existing (e.g., created by createLibrary) library. By using this method together with createLibrary
    * the caller does not have to implement {@link XStarBasicLibraryInfo} and {@link XStarBasicDialogInfo}
    * @throws NoSuchElementException if the library doesn't exist.
    */
  def addDialog(
    LibraryName: java.lang.String,
    DialogName: java.lang.String,
    Data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): scala.Unit
  /**
    * Adds a module to an existing (e.g., created by createLibrary) library. By using this method together with createLibrary the caller does not have to
    * implement {@link XStarBasicLibraryInfo} and XModuleInfo.
    * @throws NoSuchElementException if the library doesn't exist.
    */
  def addModule(
    LibraryName: java.lang.String,
    ModuleName: java.lang.String,
    Language: java.lang.String,
    Source: java.lang.String
  ): scala.Unit
  /**
    * Creates an empty library. This method can be called alternatively to accessing directly the NameContainer returned by getLibraryContainer. By using
    * this method together with addModule and addStarBasicDialog the caller does not have to implement {@link XStarBasicLibraryInfo} , XModuleInfo, and
    * {@link XStarBasicDialogInfo}
    */
  def createLibrary(
    LibName: java.lang.String,
    Password: java.lang.String,
    ExternalSourceURL: java.lang.String,
    LinkTargetURL: java.lang.String
  ): scala.Unit
  /** returns the library container giving access to the libraries stored in a document or basic library file. */
  def getLibraryContainer(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

object XStarBasicAccess {
  @scala.inline
  def apply(
    LibraryContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: () => scala.Unit,
    addDialog: (java.lang.String, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    addModule: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    createLibrary: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    getLibraryContainer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XStarBasicAccess = {
    val __obj = js.Dynamic.literal(LibraryContainer = LibraryContainer, acquire = js.Any.fromFunction0(acquire), addDialog = js.Any.fromFunction3(addDialog), addModule = js.Any.fromFunction4(addModule), createLibrary = js.Any.fromFunction4(createLibrary), getLibraryContainer = js.Any.fromFunction0(getLibraryContainer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStarBasicAccess]
  }
}

