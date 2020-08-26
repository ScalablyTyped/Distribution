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
@js.native
trait XStarBasicLibraryInfo extends XInterface {
  /**
    * returns the dialog container giving access to the dialogs stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  val DialogContainer: XNameContainer = js.native
  /**
    * returns an URL describing the location where the library is stored if the library is stored separately (for example not in the main XML file but in a
    * special library format file), an empty string otherwise. This information can be useful to optimize the access to the library, e.g., for loading on
    * demand.
    */
  val ExternalSourceURL: String = js.native
  /**
    * returns an URL describing the location of the library linked to.
    *
    * HINT: This method can be removed when there is a generic interface for linking. Then the implementation will simply support this "XLinked" interface
    * and it can be checked by {@link queryInterface()} .
    */
  val LinkTargetURL: String = js.native
  /**
    * returns the module container giving access to the modules stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  val ModuleContainer: XNameContainer = js.native
  /** returns the library's name */
  val Name: String = js.native
  /** returns the password, if the library is protected with one, an empty string otherwise. */
  val Password: String = js.native
  /**
    * returns the dialog container giving access to the dialogs stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  def getDialogContainer(): XNameContainer = js.native
  /**
    * returns an URL describing the location where the library is stored if the library is stored separately (for example not in the main XML file but in a
    * special library format file), an empty string otherwise. This information can be useful to optimize the access to the library, e.g., for loading on
    * demand.
    */
  def getExternalSourceURL(): String = js.native
  /**
    * returns an URL describing the location of the library linked to.
    *
    * HINT: This method can be removed when there is a generic interface for linking. Then the implementation will simply support this "XLinked" interface
    * and it can be checked by {@link queryInterface()} .
    */
  def getLinkTargetURL(): String = js.native
  /**
    * returns the module container giving access to the modules stored in the library. The container has to be returned in any case, no matter if the
    * library is stored embedded, external, or linked.
    * @see getExternalSourceURL
    * @see getLinkTargetURL
    */
  def getModuleContainer(): XNameContainer = js.native
  /** returns the library's name */
  def getName(): String = js.native
  /** returns the password, if the library is protected with one, an empty string otherwise. */
  def getPassword(): String = js.native
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
  @scala.inline
  implicit class XStarBasicLibraryInfoOps[Self <: XStarBasicLibraryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDialogContainer(value: XNameContainer): Self = this.set("DialogContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalSourceURL(value: String): Self = this.set("ExternalSourceURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkTargetURL(value: String): Self = this.set("LinkTargetURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleContainer(value: XNameContainer): Self = this.set("ModuleContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDialogContainer(value: () => XNameContainer): Self = this.set("getDialogContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExternalSourceURL(value: () => String): Self = this.set("getExternalSourceURL", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLinkTargetURL(value: () => String): Self = this.set("getLinkTargetURL", js.Any.fromFunction0(value))
    @scala.inline
    def setGetModuleContainer(value: () => XNameContainer): Self = this.set("getModuleContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPassword(value: () => String): Self = this.set("getPassword", js.Any.fromFunction0(value))
  }
  
}

