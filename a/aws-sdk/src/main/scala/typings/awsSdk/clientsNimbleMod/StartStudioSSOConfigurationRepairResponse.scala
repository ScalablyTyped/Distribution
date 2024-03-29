package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStudioSSOConfigurationRepairResponse extends StObject {
  
  /**
    * Information about a studio.
    */
  var studio: Studio
}
object StartStudioSSOConfigurationRepairResponse {
  
  inline def apply(studio: Studio): StartStudioSSOConfigurationRepairResponse = {
    val __obj = js.Dynamic.literal(studio = studio.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartStudioSSOConfigurationRepairResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartStudioSSOConfigurationRepairResponse] (val x: Self) extends AnyVal {
    
    inline def setStudio(value: Studio): Self = StObject.set(x, "studio", value.asInstanceOf[js.Any])
  }
}
