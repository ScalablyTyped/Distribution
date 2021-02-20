package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the type of mouse pointer. */
@js.native
trait XPointer extends XInterface {
  
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  var Type: Double = js.native
  
  /** returns the currently set {@link SystemPointer} of this mouse pointer. */
  def getType(): Double = js.native
  
  /** selects a {@link SystemPointer} for this mouse pointer. */
  def setType(nType: Double): Unit = js.native
}
object XPointer {
  
  @scala.inline
  def apply(
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setType: Double => Unit
  ): XPointer = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XPointer]
  }
  
  @scala.inline
  implicit class XPointerMutableBuilder[Self <: XPointer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetType(value: Double => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
