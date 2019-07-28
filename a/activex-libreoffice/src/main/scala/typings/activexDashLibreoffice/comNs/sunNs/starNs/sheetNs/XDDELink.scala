package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to change the settings of a DDE link.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.DDELink
  */
trait XDDELink extends XInterface {
  /** returns the application from which data are requested (the DDE server application). */
  val Application: String
  /** returns the DDE item from which data are requested. */
  val Item: String
  /** returns the DDE topic from which data are requested. */
  val Topic: String
  /** returns the application from which data are requested (the DDE server application). */
  def getApplication(): String
  /** returns the DDE item from which data are requested. */
  def getItem(): String
  /** returns the DDE topic from which data are requested. */
  def getTopic(): String
}

object XDDELink {
  @scala.inline
  def apply(
    Application: String,
    Item: String,
    Topic: String,
    acquire: () => Unit,
    getApplication: () => String,
    getItem: () => String,
    getTopic: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDDELink = {
    val __obj = js.Dynamic.literal(Application = Application, Item = Item, Topic = Topic, acquire = js.Any.fromFunction0(acquire), getApplication = js.Any.fromFunction0(getApplication), getItem = js.Any.fromFunction0(getItem), getTopic = js.Any.fromFunction0(getTopic), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDDELink]
  }
}

