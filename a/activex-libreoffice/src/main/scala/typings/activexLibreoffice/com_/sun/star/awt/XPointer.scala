package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the type of mouse pointer. */
trait XPointer
  extends StObject
     with XInterface {
  
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  var Type: Double
  
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  def getType(): Double
  
  /** selects a {@link SystemPointer} for this mouse pointer. */
  def setType(nType: Double): Unit
}
object XPointer {
  
  inline def apply(
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    setType: Double => Unit
  ): XPointer = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XPointer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPointer] (val x: Self) extends AnyVal {
    
    inline def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setSetType(value: Double => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
