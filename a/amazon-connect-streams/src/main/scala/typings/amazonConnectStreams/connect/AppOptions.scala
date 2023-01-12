package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppOptions extends StObject {
  
  /** Optional CCP configuration that overrides and gets merged with defaults. */
  var ccpParams: js.UndefOr[OptionalInitCCPOptions] = js.undefined
  
  /** Optional inline styling for the app iframe. */
  var style: js.UndefOr[String] = js.undefined
}
object AppOptions {
  
  inline def apply(): AppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppOptions] (val x: Self) extends AnyVal {
    
    inline def setCcpParams(value: OptionalInitCCPOptions): Self = StObject.set(x, "ccpParams", value.asInstanceOf[js.Any])
    
    inline def setCcpParamsUndefined: Self = StObject.set(x, "ccpParams", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
