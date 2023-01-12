package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStudioResponse extends StObject {
  
  /**
    * Information about a studio.
    */
  var studio: js.UndefOr[Studio] = js.undefined
}
object CreateStudioResponse {
  
  inline def apply(): CreateStudioResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStudioResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStudioResponse] (val x: Self) extends AnyVal {
    
    inline def setStudio(value: Studio): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
    
    inline def setStudioUndefined: Self = StObject.set(x, "studio", js.undefined)
  }
}
