package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStudioResponse extends StObject {
  
  /**
    * Information about a studio.
    */
  var studio: Studio
}
object UpdateStudioResponse {
  
  inline def apply(studio: Studio): UpdateStudioResponse = {
    val __obj = js.Dynamic.literal(studio = studio.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStudioResponse]
  }
  
  extension [Self <: UpdateStudioResponse](x: Self) {
    
    inline def setStudio(value: Studio): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
  }
}
