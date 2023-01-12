package typings.antvScale.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOptions
  extends StObject
     with LinearOptions {
  
  /** 底数 */
  var base: js.UndefOr[Double] = js.undefined
}
object LogOptions {
  
  inline def apply(): LogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogOptions] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
  }
}
