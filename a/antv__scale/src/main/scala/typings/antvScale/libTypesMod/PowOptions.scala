package typings.antvScale.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowOptions
  extends StObject
     with LinearOptions {
  
  /** 指数 */
  var exponent: js.UndefOr[Double] = js.undefined
}
object PowOptions {
  
  inline def apply(): PowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PowOptions] (val x: Self) extends AnyVal {
    
    inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
  }
}
