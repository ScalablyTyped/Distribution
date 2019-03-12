package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Mission Taker.
  *
  * This interface is used to control a mission.
  */
trait XMissionTaker
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Forces a mission to make an end.
    * @returns `TRUE` if the mission is completed successfully, `FALSE` otherwise.
    */
  def endMission(): scala.Boolean
}

object XMissionTaker {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    endMission: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMissionTaker = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endMission = js.Any.fromFunction0(endMission), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMissionTaker]
  }
}

