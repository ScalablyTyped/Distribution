package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to retrieve and change user interface element structure data and to update its visible representation.
  * @since OOo 2.0
  */
trait XUIElementSettings
  extends StObject
     with XInterface {
  
  /**
    * provides a {@link UIElementSettings} instance that provides access to the structure of user interface element if the user interface element type
    * supports it.
    * @param bWriteable must be `TRUE` if the retrieved settings should be a writable. Otherwise `FALSE` should be provided to get a shareable reference to th
    * @returns the current settings of the user interface element.
    */
  def getSettings(bWriteable: Boolean): XIndexAccess
  
  /**
    * set changes to the structure of the user interface element.
    * @param UISettings new data settings for the configurable user interface element.  User interface elements cannot be changed directly. The changed struct
    * @see com.sun.star.ui.UIElementSettings
    */
  def setSettings(UISettings: XIndexAccess): Unit
  
  /**
    * forces the user interface element to retrieve new settings from its configuration source.
    *
    * This is not done automatically as configurable user interface elements are controlled by layout managers. It is more efficient to let the responsible
    * layout manager to control the update process in a single task.
    */
  def updateSettings(): Unit
}
object XUIElementSettings {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getSettings: Boolean => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSettings: XIndexAccess => Unit,
    updateSettings: () => Unit
  ): XUIElementSettings = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getSettings = js.Any.fromFunction1(getSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSettings = js.Any.fromFunction1(setSettings), updateSettings = js.Any.fromFunction0(updateSettings))
    __obj.asInstanceOf[XUIElementSettings]
  }
  
  @scala.inline
  implicit class XUIElementSettingsMutableBuilder[Self <: XUIElementSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSettings(value: Boolean => XIndexAccess): Self = StObject.set(x, "getSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSettings(value: XIndexAccess => Unit): Self = StObject.set(x, "setSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateSettings(value: () => Unit): Self = StObject.set(x, "updateSettings", js.Any.fromFunction0(value))
  }
}
