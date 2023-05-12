package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeValueConfiguration extends StObject {
  
  /**
    * Determines the display mode of the negative value configuration.
    */
  var DisplayMode: NegativeValueDisplayMode
}
object NegativeValueConfiguration {
  
  inline def apply(DisplayMode: NegativeValueDisplayMode): NegativeValueConfiguration = {
    val __obj = js.Dynamic.literal(DisplayMode = DisplayMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NegativeValueConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NegativeValueConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDisplayMode(value: NegativeValueDisplayMode): Self = StObject.set(x, "DisplayMode", value.asInstanceOf[js.Any])
  }
}
