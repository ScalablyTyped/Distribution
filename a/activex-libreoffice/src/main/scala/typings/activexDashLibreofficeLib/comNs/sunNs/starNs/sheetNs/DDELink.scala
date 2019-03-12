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
    Results: stdLib.SafeArray[stdLib.SafeArray[_]],
    Topic: java.lang.String,
    acquire: () => scala.Unit,
    addRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    getApplication: () => java.lang.String,
    getItem: () => java.lang.String,
    getName: () => java.lang.String,
    getResults: () => stdLib.SafeArray[stdLib.SafeArray[_]],
    getTopic: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refresh: () => scala.Unit,
    release: () => scala.Unit,
    removeRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setResults: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]] => scala.Unit
  ): DDELink = {
    val __obj = js.Dynamic.literal(Application = Application, Item = Item, Name = Name, Results = Results, Topic = Topic, acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), getApplication = js.Any.fromFunction0(getApplication), getItem = js.Any.fromFunction0(getItem), getName = js.Any.fromFunction0(getName), getResults = js.Any.fromFunction0(getResults), getTopic = js.Any.fromFunction0(getTopic), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), setName = js.Any.fromFunction1(setName), setResults = js.Any.fromFunction1(setResults))
  
    __obj.asInstanceOf[DDELink]
  }
}

