package typings.ajvErrors

import org.scalablytyped.runtime.Shortcut
import typings.ajv.coreMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ajv-errors", JSImport.Default)
  @js.native
  val default: Plugin[ErrorMessageOptions] = js.native
  
  trait ErrorMessageOptions extends StObject {
    
    var keepErrors: js.UndefOr[Boolean] = js.undefined
    
    var singleError: js.UndefOr[Boolean | String] = js.undefined
  }
  object ErrorMessageOptions {
    
    inline def apply(): ErrorMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorMessageOptions]
    }
    
    extension [Self <: ErrorMessageOptions](x: Self) {
      
      inline def setKeepErrors(value: Boolean): Self = StObject.set(x, "keepErrors", value.asInstanceOf[js.Any])
      
      inline def setKeepErrorsUndefined: Self = StObject.set(x, "keepErrors", js.undefined)
      
      inline def setSingleError(value: Boolean | String): Self = StObject.set(x, "singleError", value.asInstanceOf[js.Any])
      
      inline def setSingleErrorUndefined: Self = StObject.set(x, "singleError", js.undefined)
    }
  }
  
  type _To = Plugin[ErrorMessageOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[ErrorMessageOptions] = default
}
