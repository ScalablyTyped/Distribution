package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /**
    * Information about the configuration of an input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.undefined
  
  /**
    * The definition of the input.
    */
  var inputDefinition: js.UndefOr[InputDefinition] = js.undefined
}
object Input {
  
  inline def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setInputConfiguration(value: InputConfiguration): Self = StObject.set(x, "inputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputConfigurationUndefined: Self = StObject.set(x, "inputConfiguration", js.undefined)
    
    inline def setInputDefinition(value: InputDefinition): Self = StObject.set(x, "inputDefinition", value.asInstanceOf[js.Any])
    
    inline def setInputDefinitionUndefined: Self = StObject.set(x, "inputDefinition", js.undefined)
  }
}
