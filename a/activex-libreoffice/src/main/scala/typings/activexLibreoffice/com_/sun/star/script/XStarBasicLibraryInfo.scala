package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a library and provides access to its modules
  * @deprecated Deprecated
  */
trait XStarBasicLibraryInfo extends XInterface {
  /**
    * returns the dialog container giving access to the dialogs stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  val DialogContainer: XNameContainer
  /**
    * returns an URL describing the location where the library is stored if the library is stored separately (for example not in the main XML file but in a
    * special library format file), an empty string otherwise. This information can be useful to optimize the access to the library, e.g., for loading on
    * demand.
    */
  val ExternalSourceURL: String
  /**
    * returns an URL describing the location of the library linked to.
    *
    * HINT: This method can be removed when there is a generic interface for linking. Then the implementation will simply support this "XLinked" interface
    * and it can be checked by {@link queryInterface()} .
    */
  val LinkTargetURL: String
  /**
    * returns the module container giving access to the modules stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  val ModuleContainer: XNameContainer
  /** returns the library's name */
  val Name: String
  /** returns the password, if the library is protected with one, an empty string otherwise. */
  val Password: String
  /**
    * returns the dialog container giving access to the dialogs stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  def getDialogContainer(): XNameContainer
  /**
    * returns an URL describing the location where the library is stored if the library is stored separately (for example not in the main XML file but in a
    * special library format file), an empty string otherwise. This information can be useful to optimize the access to the library, e.g., for loading on
    * demand.
    */
  def getExternalSourceURL(): String
  /**
    * returns an URL describing the location of the library linked to.
    *
    * HINT: This method can be removed when there is a generic interface for linking. Then the implementation will simply support this "XLinked" interface
    * and it can be checked by {@link queryInterface()} .
    */
  def getLinkTargetURL(): String
  /**
    * returns the module container giving access to the modules stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  def getModuleContainer(): XNameContainer
  /** returns the library's name */
  def getName(): String
  /** returns the password, if the library is protected with one, an empty string otherwise. */
  def getPassword(): String
}

object XStarBasicLibraryInfo {
  @scala.inline
  def apply(
    DialogContainer: XNameContainer,
    ExternalSourceURL: String,
    LinkTargetURL: String,
    ModuleContainer: XNameContainer,
    Name: String,
    Password: String,
    acquire: () => Unit,
    getDialogContainer: () => XNameContainer,
    getExternalSourceURL: () => String,
    getLinkTargetURL: () => String,
    getModuleContainer: () => XNameContainer,
    getName: () => String,
    getPassword: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStarBasicLibraryInfo = {
    val __obj = js.Dynamic.literal(DialogContainer = DialogContainer.asInstanceOf[js.Any], ExternalSourceURL = ExternalSourceURL.asInstanceOf[js.Any], LinkTargetURL = LinkTargetURL.asInstanceOf[js.Any], ModuleContainer = ModuleContainer.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDialogContainer = js.Any.fromFunction0(getDialogContainer), getExternalSourceURL = js.Any.fromFunction0(getExternalSourceURL), getLinkTargetURL = js.Any.fromFunction0(getLinkTargetURL), getModuleContainer = js.Any.fromFunction0(getModuleContainer), getName = js.Any.fromFunction0(getName), getPassword = js.Any.fromFunction0(getPassword), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStarBasicLibraryInfo]
  }
}

