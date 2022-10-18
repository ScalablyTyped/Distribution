package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1Context extends StObject {
  
  var lifespan: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[DialogflowV1Parameters] = js.undefined
}
object DialogflowV1Context {
  
  inline def apply(): DialogflowV1Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Context]
  }
  
  extension [Self <: DialogflowV1Context](x: Self) {
    
    inline def setLifespan(value: Double): Self = StObject.set(x, "lifespan", value.asInstanceOf[js.Any])
    
    inline def setLifespanUndefined: Self = StObject.set(x, "lifespan", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: DialogflowV1Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
