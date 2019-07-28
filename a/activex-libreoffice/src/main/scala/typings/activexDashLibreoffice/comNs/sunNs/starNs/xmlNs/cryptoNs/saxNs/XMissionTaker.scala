package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Mission Taker.
  *
  * This interface is used to control a mission.
  */
trait XMissionTaker extends XInterface {
  /**
    * Forces a mission to make an end.
    * @returns `TRUE` if the mission is completed successfully, `FALSE` otherwise.
    */
  def endMission(): Boolean
}

object XMissionTaker {
  @scala.inline
  def apply(
    acquire: () => Unit,
    endMission: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMissionTaker = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endMission = js.Any.fromFunction0(endMission), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMissionTaker]
  }
}

