package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestableConfig extends StObject {
  
  /**
    * The name of the document field/attribute.
    */
  var AttributeName: js.UndefOr[DocumentAttributeKey] = js.undefined
  
  /**
    *  TRUE means the document field/attribute is suggestible, so the contents within the field can be used for query suggestions.
    */
  var Suggestable: js.UndefOr[ObjectBoolean] = js.undefined
}
object SuggestableConfig {
  
  inline def apply(): SuggestableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestableConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestableConfig] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: DocumentAttributeKey): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setSuggestable(value: ObjectBoolean): Self = StObject.set(x, "Suggestable", value.asInstanceOf[js.Any])
    
    inline def setSuggestableUndefined: Self = StObject.set(x, "Suggestable", js.undefined)
  }
}
