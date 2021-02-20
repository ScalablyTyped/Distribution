package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the basic operations for a tab controller, but does not require {@link XControl} as type of tabs. */
@js.native
trait XSimpleTabController extends XInterface {
  
  /**
    * return the unique ID of the current active tab.
    * @returns [long] the ID of the active tab.
    */
  val ActiveTabID: Double = js.native
  
  /**
    * activate the specified tab.
    *
    * The new tab will be activated and all listener will get an event describing this. Of course there will be an event too, which notifies listener about
    * the deactivation of the last active tab.
    * @param ID the ID of the new active tab.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def activateTab(ID: Double): Unit = js.native
  
  /**
    * register listener for inserting/removing tabs and changing their properties.
    * @param Listener the listener to register.
    */
  def addTabListener(Listener: XTabListener): Unit = js.native
  
  /**
    * return the unique ID of the current active tab.
    * @returns [long] the ID of the active tab.
    */
  def getActiveTabID(): Double = js.native
  
  /**
    * retrieve the set of properties for the specified tab.
    * @param ID the ID of the tab.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def getTabProps(ID: Double): SafeArray[NamedValue] = js.native
  
  /**
    * create a new tab and return an unique ID, which can be used further to address this tab by using other methods of this interface.
    * @returns [long an unique ID for this new tab.
    */
  def insertTab(): Double = js.native
  
  /**
    * remove a tab with the given ID.
    * @param ID the ID of the tab, which should be removed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def removeTab(ID: Double): Unit = js.native
  
  /**
    * unregister listener for inserting/removing tabs and changing their properties.
    * @param Listener the listener to unregister.
    */
  def removeTabListener(Listener: XTabListener): Unit = js.native
  
  /**
    * change some properties of the specified tab.
    * @param Properties Such properties can be: {{table here, see documentation}}
    * @param ID the ID of the tab, which should be changed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def setTabProps(ID: Double, Properties: SeqEquiv[NamedValue]): Unit = js.native
}
object XSimpleTabController {
  
  @scala.inline
  def apply(
    ActiveTabID: Double,
    acquire: () => Unit,
    activateTab: Double => Unit,
    addTabListener: XTabListener => Unit,
    getActiveTabID: () => Double,
    getTabProps: Double => SafeArray[NamedValue],
    insertTab: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTab: Double => Unit,
    removeTabListener: XTabListener => Unit,
    setTabProps: (Double, SeqEquiv[NamedValue]) => Unit
  ): XSimpleTabController = {
    val __obj = js.Dynamic.literal(ActiveTabID = ActiveTabID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activateTab = js.Any.fromFunction1(activateTab), addTabListener = js.Any.fromFunction1(addTabListener), getActiveTabID = js.Any.fromFunction0(getActiveTabID), getTabProps = js.Any.fromFunction1(getTabProps), insertTab = js.Any.fromFunction0(insertTab), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTab = js.Any.fromFunction1(removeTab), removeTabListener = js.Any.fromFunction1(removeTabListener), setTabProps = js.Any.fromFunction2(setTabProps))
    __obj.asInstanceOf[XSimpleTabController]
  }
  
  @scala.inline
  implicit class XSimpleTabControllerMutableBuilder[Self <: XSimpleTabController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivateTab(value: Double => Unit): Self = StObject.set(x, "activateTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActiveTabID(value: Double): Self = StObject.set(x, "ActiveTabID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTabListener(value: XTabListener => Unit): Self = StObject.set(x, "addTabListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetActiveTabID(value: () => Double): Self = StObject.set(x, "getActiveTabID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTabProps(value: Double => SafeArray[NamedValue]): Self = StObject.set(x, "getTabProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertTab(value: () => Double): Self = StObject.set(x, "insertTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveTab(value: Double => Unit): Self = StObject.set(x, "removeTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTabListener(value: XTabListener => Unit): Self = StObject.set(x, "removeTabListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTabProps(value: (Double, SeqEquiv[NamedValue]) => Unit): Self = StObject.set(x, "setTabProps", js.Any.fromFunction2(value))
  }
}
