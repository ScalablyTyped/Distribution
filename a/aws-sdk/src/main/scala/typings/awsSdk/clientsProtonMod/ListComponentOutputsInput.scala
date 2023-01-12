package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentOutputsInput extends StObject {
  
  /**
    * The name of the component whose outputs you want.
    */
  var componentName: ResourceName
  
  /**
    * A token that indicates the location of the next output in the array of outputs, after the list of outputs that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
}
object ListComponentOutputsInput {
  
  inline def apply(componentName: ResourceName): ListComponentOutputsInput = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentOutputsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListComponentOutputsInput] (val x: Self) extends AnyVal {
    
    inline def setComponentName(value: ResourceName): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
