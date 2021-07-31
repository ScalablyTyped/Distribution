package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2Context extends StObject {
  
  var lifespanCount: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
}
object GoogleCloudDialogflowV2Context {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Context]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ContextMutableBuilder[Self <: GoogleCloudDialogflowV2Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifespanCount(value: Double): Self = StObject.set(x, "lifespanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifespanCountUndefined: Self = StObject.set(x, "lifespanCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
