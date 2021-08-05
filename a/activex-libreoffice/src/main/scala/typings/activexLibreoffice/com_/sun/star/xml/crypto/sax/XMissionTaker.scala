package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Mission Taker.
  *
  * This interface is used to control a mission.
  */
trait XMissionTaker
  extends StObject
     with XInterface {
  
  /**
    * Forces a mission to make an end.
    * @returns `TRUE` if the mission is completed successfully, `FALSE` otherwise.
    */
  def endMission(): Boolean
}
object XMissionTaker {
  
  inline def apply(
    acquire: () => Unit,
    endMission: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMissionTaker = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endMission = js.Any.fromFunction0(endMission), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMissionTaker]
  }
  
  extension [Self <: XMissionTaker](x: Self) {
    
    inline def setEndMission(value: () => Boolean): Self = StObject.set(x, "endMission", js.Any.fromFunction0(value))
  }
}
