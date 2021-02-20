package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1Context extends StObject {
  
  var lifespan: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parameters: js.UndefOr[DialogflowV1Parameters] = js.native
}
object DialogflowV1Context {
  
  @scala.inline
  def apply(): DialogflowV1Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Context]
  }
  
  @scala.inline
  implicit class DialogflowV1ContextMutableBuilder[Self <: DialogflowV1Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifespan(value: Double): Self = StObject.set(x, "lifespan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifespanUndefined: Self = StObject.set(x, "lifespan", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: DialogflowV1Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
