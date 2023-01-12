package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyNameSuggestion extends StObject {
  
  /**
    * A suggested property name based on what you entered in the search textbox in the Amazon SageMaker console.
    */
  var PropertyName: js.UndefOr[ResourcePropertyName] = js.undefined
}
object PropertyNameSuggestion {
  
  inline def apply(): PropertyNameSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyNameSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyNameSuggestion] (val x: Self) extends AnyVal {
    
    inline def setPropertyName(value: ResourcePropertyName): Self = StObject.set(x, "PropertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "PropertyName", js.undefined)
  }
}
