package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CdiInputSpecification extends StObject {
  
  /**
    * Maximum CDI input resolution
    */
  var Resolution: js.UndefOr[CdiInputResolution] = js.undefined
}
object CdiInputSpecification {
  
  inline def apply(): CdiInputSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CdiInputSpecification]
  }
  
  extension [Self <: CdiInputSpecification](x: Self) {
    
    inline def setResolution(value: CdiInputResolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
  }
}
