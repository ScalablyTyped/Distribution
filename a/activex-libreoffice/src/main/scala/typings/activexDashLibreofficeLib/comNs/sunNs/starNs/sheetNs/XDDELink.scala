package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to change the settings of a DDE link.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.DDELink
  */
trait XDDELink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the application from which data are requested (the DDE server application). */
  val Application: java.lang.String
  /** returns the DDE item from which data are requested. */
  val Item: java.lang.String
  /** returns the DDE topic from which data are requested. */
  val Topic: java.lang.String
  /** returns the application from which data are requested (the DDE server application). */
  def getApplication(): java.lang.String
  /** returns the DDE item from which data are requested. */
  def getItem(): java.lang.String
  /** returns the DDE topic from which data are requested. */
  def getTopic(): java.lang.String
}

object XDDELink {
  @scala.inline
  def apply(
    Application: java.lang.String,
    Item: java.lang.String,
    Topic: java.lang.String,
    acquire: () => scala.Unit,
    getApplication: () => java.lang.String,
    getItem: () => java.lang.String,
    getTopic: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDDELink = {
    val __obj = js.Dynamic.literal(Application = Application, Item = Item, Topic = Topic, acquire = js.Any.fromFunction0(acquire), getApplication = js.Any.fromFunction0(getApplication), getItem = js.Any.fromFunction0(getItem), getTopic = js.Any.fromFunction0(getTopic), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDDELink]
  }
}

