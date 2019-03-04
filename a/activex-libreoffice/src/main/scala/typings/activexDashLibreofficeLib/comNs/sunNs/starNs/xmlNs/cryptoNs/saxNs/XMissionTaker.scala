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
    acquire: js.Function0[scala.Unit],
    endMission: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMissionTaker = {
    val __obj = js.Dynamic.literal(acquire = acquire, endMission = endMission, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMissionTaker]
  }
}

