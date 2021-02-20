package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a user interface configuration manager interface which controls the structure of all customizable user interface elements.
  * @since OOo 2.0
  */
@js.native
trait XUIConfigurationManager extends XInterface {
  
  /**
    * retrieves the events manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one events manager instance which controls the mapping of events to script URLs of a module or
    * document.
    * @returns the events manager of the user interface configuration manager, if one exists.
    */
  val EventsManager: XInterface = js.native
  
  /**
    * retrieves the image manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one image manager instance which controls all images of a module or document.
    * @returns the image manager of the user interface configuration manager.
    */
  val ImageManager: XInterface = js.native
  
  /**
    * retrieves the keyboard short cut manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one keyboard short cut manager instance which controls all short cuts of a module or document.
    * @returns the short cut manager of the user interface configuration manager.
    */
  val ShortCutManager: XAcceleratorConfiguration = js.native
  
  /**
    * creates an empty settings data container.
    * @returns an empty user interface element settings data container, which implements {@link UIElementSettings} .
    */
  def createSettings(): XIndexContainer = js.native
  
  /**
    * retrieves the events manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one events manager instance which controls the mapping of events to script URLs of a module or
    * document.
    * @returns the events manager of the user interface configuration manager, if one exists.
    */
  def getEventsManager(): XInterface = js.native
  
  /**
    * retrieves the image manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one image manager instance which controls all images of a module or document.
    * @returns the image manager of the user interface configuration manager.
    */
  def getImageManager(): XInterface = js.native
  
  /**
    * retrieves the settings of a user interface element.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @param bWriteable must be `TRUE` if the retrieved settings should be a writable. Otherwise `FALSE` should be provided to get a shareable reference to th
    * @returns settings data of an existing user interface element, which implements {@link UIElementSettings} . If the settings data cannot be found a {@link c
    */
  def getSettings(ResourceURL: String, bWriteable: Boolean): XIndexAccess = js.native
  
  /**
    * retrieves the keyboard short cut manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one keyboard short cut manager instance which controls all short cuts of a module or document.
    * @returns the short cut manager of the user interface configuration manager.
    */
  def getShortCutManager(): XAcceleratorConfiguration = js.native
  
  /**
    * retrieves information about all user interface elements within the user interface configuration manager.
    * @param ElementType makes it possible to narrow the result set to only one type of user interface elements. If all user interface element types should be
    * @returns returns all user interface elements within the user interface configuration manager that meet the given ElementType specification. The following
    * @see UIElementType
    */
  def getUIElementsInfo(ElementType: Double): SafeArray[SafeArray[PropertyValue]] = js.native
  
  /**
    * determines if the settings of a user interface element is part the user interface configuration manager.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if settings have been found, otherwise `FALSE` .
    */
  def hasSettings(ResourceURL: String): Boolean = js.native
  
  /**
    * inserts the settings of a new user interface element.
    * @param NewResourceURL a resource URL which identifies the new user interface element.
    * @param aNewData the settings data of the new user interface element, which implements {@link UIElementSettings} .  If the settings data is already prese
    */
  def insertSettings(NewResourceURL: String, aNewData: XIndexAccess): Unit = js.native
  
  /**
    * removes the settings of an existing user interface element.
    * @param ResourceURL a resource URL which identifies the user interface element settings to be removed.  If the settings data cannot be found a {@link com
    */
  def removeSettings(ResourceURL: String): Unit = js.native
  
  /**
    * replaces the settings of a user interface element with new settings.
    * @param ResourceURL a resource URL which identifies the user interface element to be replaced. If no element with the given resource URL exists a {@link
    * @param aNewData the new settings data of an existing user interface element, which implements {@link UIElementSettings} .  If the settings data cannot b
    */
  def replaceSettings(ResourceURL: String, aNewData: XIndexAccess): Unit = js.native
  
  /**
    * resets the configuration manager to the default user interface configuration data.
    *
    * This means that all user interface configuration data of the instance will be removed. A module based user interface configuration manager removes
    * user defined elements, but set all other elements back to default. It is not possible to remove default elements from a module user interface
    * configuration manager.
    */
  def reset(): Unit = js.native
}
object XUIConfigurationManager {
  
  @scala.inline
  def apply(
    EventsManager: XInterface,
    ImageManager: XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: () => Unit,
    createSettings: () => XIndexContainer,
    getEventsManager: () => XInterface,
    getImageManager: () => XInterface,
    getSettings: (String, Boolean) => XIndexAccess,
    getShortCutManager: () => XAcceleratorConfiguration,
    getUIElementsInfo: Double => SafeArray[SafeArray[PropertyValue]],
    hasSettings: String => Boolean,
    insertSettings: (String, XIndexAccess) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSettings: String => Unit,
    replaceSettings: (String, XIndexAccess) => Unit,
    reset: () => Unit
  ): XUIConfigurationManager = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager.asInstanceOf[js.Any], ImageManager = ImageManager.asInstanceOf[js.Any], ShortCutManager = ShortCutManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createSettings = js.Any.fromFunction0(createSettings), getEventsManager = js.Any.fromFunction0(getEventsManager), getImageManager = js.Any.fromFunction0(getImageManager), getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = js.Any.fromFunction0(getShortCutManager), getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), insertSettings = js.Any.fromFunction2(insertSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSettings = js.Any.fromFunction1(removeSettings), replaceSettings = js.Any.fromFunction2(replaceSettings), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[XUIConfigurationManager]
  }
  
  @scala.inline
  implicit class XUIConfigurationManagerMutableBuilder[Self <: XUIConfigurationManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateSettings(value: () => XIndexContainer): Self = StObject.set(x, "createSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEventsManager(value: XInterface): Self = StObject.set(x, "EventsManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEventsManager(value: () => XInterface): Self = StObject.set(x, "getEventsManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImageManager(value: () => XInterface): Self = StObject.set(x, "getImageManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSettings(value: (String, Boolean) => XIndexAccess): Self = StObject.set(x, "getSettings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetShortCutManager(value: () => XAcceleratorConfiguration): Self = StObject.set(x, "getShortCutManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUIElementsInfo(value: Double => SafeArray[SafeArray[PropertyValue]]): Self = StObject.set(x, "getUIElementsInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasSettings(value: String => Boolean): Self = StObject.set(x, "hasSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImageManager(value: XInterface): Self = StObject.set(x, "ImageManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSettings(value: (String, XIndexAccess) => Unit): Self = StObject.set(x, "insertSettings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveSettings(value: String => Unit): Self = StObject.set(x, "removeSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceSettings(value: (String, XIndexAccess) => Unit): Self = StObject.set(x, "replaceSettings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShortCutManager(value: XAcceleratorConfiguration): Self = StObject.set(x, "ShortCutManager", value.asInstanceOf[js.Any])
  }
}
