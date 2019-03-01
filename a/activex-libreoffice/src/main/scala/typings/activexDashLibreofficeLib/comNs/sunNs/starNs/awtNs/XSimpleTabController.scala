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
  def getTabProps(ID: scala.Double): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
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
    acquire: js.Function0[scala.Unit],
    activateTab: js.Function1[scala.Double, scala.Unit],
    addTabListener: js.Function1[XTabListener, scala.Unit],
    getActiveTabID: js.Function0[scala.Double],
    getTabProps: js.Function1[
      scala.Double, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
    ],
    insertTab: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTab: js.Function1[scala.Double, scala.Unit],
    removeTabListener: js.Function1[XTabListener, scala.Unit],
    setTabProps: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      scala.Unit
    ]
  ): XSimpleTabController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveTabID")(ActiveTabID)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("activateTab")(activateTab)
    __obj.updateDynamic("addTabListener")(addTabListener)
    __obj.updateDynamic("getActiveTabID")(getActiveTabID)
    __obj.updateDynamic("getTabProps")(getTabProps)
    __obj.updateDynamic("insertTab")(insertTab)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTab")(removeTab)
    __obj.updateDynamic("removeTabListener")(removeTabListener)
    __obj.updateDynamic("setTabProps")(setTabProps)
    __obj.asInstanceOf[XSimpleTabController]
  }
}

