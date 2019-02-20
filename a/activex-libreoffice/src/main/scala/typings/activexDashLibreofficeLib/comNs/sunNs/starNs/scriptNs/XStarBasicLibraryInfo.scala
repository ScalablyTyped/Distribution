package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a library and provides access to its modules
  * @deprecated Deprecated
  */
trait XStarBasicLibraryInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the dialog container giving access to the dialogs stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  val DialogContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * returns an URL describing the location where the library is stored if the library is stored separately (for example not in the main XML file but in a
    * special library format file), an empty string otherwise. This information can be useful to optimize the access to the library, e.g., for loading on
    * demand.
    */
  val ExternalSourceURL: java.lang.String
  /**
    * returns an URL describing the location of the library linked to.
    *
    * HINT: This method can be removed when there is a generic interface for linking. Then the implementation will simply support this "XLinked" interface
    * and it can be checked by {@link queryInterface()} .
    */
  val LinkTargetURL: java.lang.String
  /**
    * returns the module container giving access to the modules stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  val ModuleContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** returns the library's name */
  val Name: java.lang.String
  /** returns the password, if the library is protected with one, an empty string otherwise. */
  val Password: java.lang.String
  /**
    * returns the dialog container giving access to the dialogs stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  def getDialogContainer(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * returns an URL describing the location where the library is stored if the library is stored separately (for example not in the main XML file but in a
    * special library format file), an empty string otherwise. This information can be useful to optimize the access to the library, e.g., for loading on
    * demand.
    */
  def getExternalSourceURL(): java.lang.String
  /**
    * returns an URL describing the location of the library linked to.
    *
    * HINT: This method can be removed when there is a generic interface for linking. Then the implementation will simply support this "XLinked" interface
    * and it can be checked by {@link queryInterface()} .
    */
  def getLinkTargetURL(): java.lang.String
  /**
    * returns the module container giving access to the modules stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  def getModuleContainer(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** returns the library's name */
  def getName(): java.lang.String
  /** returns the password, if the library is protected with one, an empty string otherwise. */
  def getPassword(): java.lang.String
}

