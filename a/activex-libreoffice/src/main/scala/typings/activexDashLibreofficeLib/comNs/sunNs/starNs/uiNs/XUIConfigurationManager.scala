package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a user interface configuration manager interface which controls the structure of all customizable user interface elements.
  * @since OOo 2.0
  */
trait XUIConfigurationManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the events manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one events manager instance which controls the mapping of events to script URLs of a module or
    * document.
    * @returns the events manager of the user interface configuration manager, if one exists.
    */
  val EventsManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * retrieves the image manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one image manager instance which controls all images of a module or document.
    * @returns the image manager of the user interface configuration manager.
    */
  val ImageManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * retrieves the keyboard short cut manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one keyboard short cut manager instance which controls all short cuts of a module or document.
    * @returns the short cut manager of the user interface configuration manager.
    */
  val ShortCutManager: XAcceleratorConfiguration
  /**
    * creates an empty settings data container.
    * @returns an empty user interface element settings data container, which implements {@link UIElementSettings} .
    */
  def createSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /**
    * retrieves the events manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one events manager instance which controls the mapping of events to script URLs of a module or
    * document.
    * @returns the events manager of the user interface configuration manager, if one exists.
    */
  def getEventsManager(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * retrieves the image manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one image manager instance which controls all images of a module or document.
    * @returns the image manager of the user interface configuration manager.
    */
  def getImageManager(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * retrieves the settings of a user interface element.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @param bWriteable must be `TRUE` if the retrieved settings should be a writable. Otherwise `FALSE` should be provided to get a shareable reference to th
    * @returns settings data of an existing user interface element, which implements {@link UIElementSettings} . If the settings data cannot be found a {@link c
    */
  def getSettings(ResourceURL: java.lang.String, bWriteable: scala.Boolean): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * retrieves the keyboard short cut manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one keyboard short cut manager instance which controls all short cuts of a module or document.
    * @returns the short cut manager of the user interface configuration manager.
    */
  def getShortCutManager(): XAcceleratorConfiguration
  /**
    * retrieves information about all user interface elements within the user interface configuration manager.
    * @param ElementType makes it possible to narrow the result set to only one type of user interface elements. If all user interface element types should be
    * @returns returns all user interface elements within the user interface configuration manager that meet the given ElementType specification. The following
    * @see UIElementType
    */
  def getUIElementsInfo(ElementType: scala.Double): activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * determines if the settings of a user interface element is part the user interface configuration manager.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if settings have been found, otherwise `FALSE` .
    */
  def hasSettings(ResourceURL: java.lang.String): scala.Boolean
  /**
    * inserts the settings of a new user interface element.
    * @param NewResourceURL a resource URL which identifies the new user interface element.
    * @param aNewData the settings data of the new user interface element, which implements {@link UIElementSettings} .  If the settings data is already prese
    */
  def insertSettings(
    NewResourceURL: java.lang.String,
    aNewData: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  ): scala.Unit
  /**
    * removes the settings of an existing user interface element.
    * @param ResourceURL a resource URL which identifies the user interface element settings to be removed.  If the settings data cannot be found a {@link com
    */
  def removeSettings(ResourceURL: java.lang.String): scala.Unit
  /**
    * replaces the settings of a user interface element with new settings.
    * @param ResourceURL a resource URL which identifies the user interface element to be replaced. If no element with the given resource URL exists a {@link
    * @param aNewData the new settings data of an existing user interface element, which implements {@link UIElementSettings} .  If the settings data cannot b
    */
  def replaceSettings(
    ResourceURL: java.lang.String,
    aNewData: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  ): scala.Unit
  /**
    * resets the configuration manager to the default user interface configuration data.
    *
    * This means that all user interface configuration data of the instance will be removed. A module based user interface configuration manager removes
    * user defined elements, but set all other elements back to default. It is not possible to remove default elements from a module user interface
    * configuration manager.
    */
  def reset(): scala.Unit
}

object XUIConfigurationManager {
  @scala.inline
  def apply(
    EventsManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ImageManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: js.Function0[scala.Unit],
    createSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer],
    getEventsManager: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getImageManager: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getSettings: js.Function2[
      java.lang.String, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
    ],
    getShortCutManager: js.Function0[XAcceleratorConfiguration],
    getUIElementsInfo: js.Function1[
      scala.Double, 
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    hasSettings: js.Function1[java.lang.String, scala.Boolean],
    insertSettings: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSettings: js.Function1[java.lang.String, scala.Unit],
    replaceSettings: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      scala.Unit
    ],
    reset: js.Function0[scala.Unit]
  ): XUIConfigurationManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EventsManager")(EventsManager)
    __obj.updateDynamic("ImageManager")(ImageManager)
    __obj.updateDynamic("ShortCutManager")(ShortCutManager)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createSettings")(createSettings)
    __obj.updateDynamic("getEventsManager")(getEventsManager)
    __obj.updateDynamic("getImageManager")(getImageManager)
    __obj.updateDynamic("getSettings")(getSettings)
    __obj.updateDynamic("getShortCutManager")(getShortCutManager)
    __obj.updateDynamic("getUIElementsInfo")(getUIElementsInfo)
    __obj.updateDynamic("hasSettings")(hasSettings)
    __obj.updateDynamic("insertSettings")(insertSettings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSettings")(removeSettings)
    __obj.updateDynamic("replaceSettings")(replaceSettings)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[XUIConfigurationManager]
  }
}

