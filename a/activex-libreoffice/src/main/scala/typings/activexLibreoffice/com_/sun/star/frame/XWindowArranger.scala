package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XWindowArranger
  extends StObject
     with XInterface {
  
  /** @deprecated Deprecated */
  def arrange(nCommand: Double): Unit
  
  /** @deprecated Deprecated */
  def hasArrangeCommand(nCommand: Double): Boolean
}
object XWindowArranger {
  
  inline def apply(
    acquire: () => Unit,
    arrange: Double => Unit,
    hasArrangeCommand: Double => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XWindowArranger = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), arrange = js.Any.fromFunction1(arrange), hasArrangeCommand = js.Any.fromFunction1(hasArrangeCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XWindowArranger]
  }
  
  extension [Self <: XWindowArranger](x: Self) {
    
    inline def setArrange(value: Double => Unit): Self = StObject.set(x, "arrange", js.Any.fromFunction1(value))
    
    inline def setHasArrangeCommand(value: Double => Boolean): Self = StObject.set(x, "hasArrangeCommand", js.Any.fromFunction1(value))
  }
}
