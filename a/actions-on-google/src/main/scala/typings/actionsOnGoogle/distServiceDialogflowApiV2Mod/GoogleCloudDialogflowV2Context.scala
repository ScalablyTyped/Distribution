package typings.actionsOnGoogle.distServiceDialogflowApiV2Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2Context extends StObject {
  
  var lifespanCount: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
}
object GoogleCloudDialogflowV2Context {
  
  inline def apply(): GoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Context]
  }
  
  extension [Self <: GoogleCloudDialogflowV2Context](x: Self) {
    
    inline def setLifespanCount(value: Double): Self = StObject.set(x, "lifespanCount", value.asInstanceOf[js.Any])
    
    inline def setLifespanCountUndefined: Self = StObject.set(x, "lifespanCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
