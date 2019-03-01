package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a DDE link.
  *
  * A DDE link controls the results of a DDE spreadsheet formula.
  */
trait DDELink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with XDDELink
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with XDDELinkResults

object DDELink {
  @scala.inline
  def apply(
    Application: java.lang.String,
    Item: java.lang.String,
    Name: java.lang.String,
    Results: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]],
    Topic: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    getApplication: js.Function0[java.lang.String],
    getItem: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getResults: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]],
    getTopic: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removeRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setResults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ]
  ): DDELink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Application")(Application)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Results")(Results)
    __obj.updateDynamic("Topic")(Topic)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addRefreshListener")(addRefreshListener)
    __obj.updateDynamic("getApplication")(getApplication)
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getResults")(getResults)
    __obj.updateDynamic("getTopic")(getTopic)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeRefreshListener")(removeRefreshListener)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setResults")(setResults)
    __obj.asInstanceOf[DDELink]
  }
}

