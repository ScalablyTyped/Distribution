package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultiOptions extends StObject {
  
  /** quite mode or verbose mode, default is false */
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object DeleteMultiOptions {
  
  inline def apply(): DeleteMultiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMultiOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMultiOptions] (val x: Self) extends AnyVal {
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
