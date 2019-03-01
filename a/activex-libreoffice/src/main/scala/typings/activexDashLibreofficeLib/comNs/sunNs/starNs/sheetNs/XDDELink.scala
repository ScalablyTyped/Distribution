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
    acquire: js.Function0[scala.Unit],
    getApplication: js.Function0[java.lang.String],
    getItem: js.Function0[java.lang.String],
    getTopic: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDDELink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Application")(Application)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Topic")(Topic)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getApplication")(getApplication)
    __obj.updateDynamic("getItem")(getItem)
    __obj.updateDynamic("getTopic")(getTopic)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDDELink]
  }
}

