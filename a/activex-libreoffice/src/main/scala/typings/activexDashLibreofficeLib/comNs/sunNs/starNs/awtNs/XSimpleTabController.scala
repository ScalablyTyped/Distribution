package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the basic operations for a tab controller, but does not require {@link XControl} as type of tabs. */
trait XSimpleTabController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * return the unique ID of the current active tab.
    * @returns [long] the ID of the active tab.
    */
  val ActiveTabID: scala.Double
  /**
    * activate the specified tab.
    *
    * The new tab will be activated and all listener will get an event describing this. Of course there will be an event too, which notifies listener about
    * the deactivation of the last active tab.
    * @param ID the ID of the new active tab.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def activateTab(ID: scala.Double): scala.Unit
  /**
    * register listener for inserting/removing tabs and changing their properties.
    * @param Listener the listener to register.
    */
  def addTabListener(Listener: XTabListener): scala.Unit
  /**
    * return the unique ID of the current active tab.
    * @returns [long] the ID of the active tab.
    */
  def getActiveTabID(): scala.Double
  /**
    * retrieve the set of properties for the specified tab.
    * @param ID the ID of the tab.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def getTabProps(ID: scala.Double): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  /**
    * create a new tab and return an unique ID, which can be used further to address this tab by using other methods of this interface.
    * @returns [long an unique ID for this new tab.
    */
  def insertTab(): scala.Double
  /**
    * remove a tab with the given ID.
    * @param ID the ID of the tab, which should be removed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def removeTab(ID: scala.Double): scala.Unit
  /**
    * unregister listener for inserting/removing tabs and changing their properties.
    * @param Listener the listener to unregister.
    */
  def removeTabListener(Listener: XTabListener): scala.Unit
  /**
    * change some properties of the specified tab.
    * @param Properties Such properties can be: {{table here, see documentation}}
    * @param ID the ID of the tab, which should be changed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified ID isn't used inside this tab controller.
    */
  def setTabProps(
    ID: scala.Double,
    Properties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): scala.Unit
}

object XSimpleTabController {
  @scala.inline
  def apply(
    ActiveTabID: scala.Double,
    acquire: () => scala.Unit,
    activateTab: scala.Double => scala.Unit,
    addTabListener: XTabListener => scala.Unit,
    getActiveTabID: () => scala.Double,
    getTabProps: scala.Double => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    insertTab: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTab: scala.Double => scala.Unit,
    removeTabListener: XTabListener => scala.Unit,
    setTabProps: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]) => scala.Unit
  ): XSimpleTabController = {
    val __obj = js.Dynamic.literal(ActiveTabID = ActiveTabID, acquire = js.Any.fromFunction0(acquire), activateTab = js.Any.fromFunction1(activateTab), addTabListener = js.Any.fromFunction1(addTabListener), getActiveTabID = js.Any.fromFunction0(getActiveTabID), getTabProps = js.Any.fromFunction1(getTabProps), insertTab = js.Any.fromFunction0(insertTab), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTab = js.Any.fromFunction1(removeTab), removeTabListener = js.Any.fromFunction1(removeTabListener), setTabProps = js.Any.fromFunction2(setTabProps))
  
    __obj.asInstanceOf[XSimpleTabController]
  }
}

