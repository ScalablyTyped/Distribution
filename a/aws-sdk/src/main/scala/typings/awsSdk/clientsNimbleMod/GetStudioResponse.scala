package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStudioResponse extends StObject {
  
  /**
    * Information about a studio.
    */
  var studio: Studio
}
object GetStudioResponse {
  
  inline def apply(studio: Studio): GetStudioResponse = {
    val __obj = js.Dynamic.literal(studio = studio.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStudioResponse]
  }
  
  extension [Self <: GetStudioResponse](x: Self) {
    
    inline def setStudio(value: Studio): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
  }
}
