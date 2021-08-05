package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a specialized interface to a volatile bitmap (which can become invalid at any point in time). */
trait XVolatileBitmap
  extends StObject
     with XBitmap {
  
  /**
    * Query whether this volatile bitmap still has valid content.
    *
    * As the video RAM allocated to this bitmap can be reclaimed at any time, a return value of true here does not imply that the next draw operation with
    * this bitmap will succeed. Instead, the exception VolatileContentDestroyed might then be thrown, if lost bitmap data is accessed.
    */
  def isValid(): Boolean
}
object XVolatileBitmap {
  
  inline def apply(
    Size: IntegerSize2D,
    acquire: () => Unit,
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: () => IntegerSize2D,
    hasAlpha: () => Boolean,
    isValid: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XVolatileBitmap = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), isValid = js.Any.fromFunction0(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XVolatileBitmap]
  }
  
  extension [Self <: XVolatileBitmap](x: Self) {
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
  }
}
