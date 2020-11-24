package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Mission Taker.
  *
  * This interface is used to control a mission.
  */
@js.native
trait XMissionTaker extends XInterface {
  
  /**
    * Forces a mission to make an end.
    * @returns `TRUE` if the mission is completed successfully, `FALSE` otherwise.
    */
  def endMission(): Boolean = js.native
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
  
  @scala.inline
  implicit class XMissionTakerOps[Self <: XMissionTaker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndMission(value: () => Boolean): Self = this.set("endMission", js.Any.fromFunction0(value))
  }
}
