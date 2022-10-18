package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentParameter extends StObject {
  
  /**
    * Description of the map field containing the patterns that need to be replaced in a managed template job document schema.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * An example illustrating a pattern that need to be replaced in a managed template job document schema.
    */
  var example: js.UndefOr[Example] = js.undefined
  
  /**
    * Key of the map field containing the patterns that need to be replaced in a managed template job document schema.
    */
  var key: js.UndefOr[ParameterKey] = js.undefined
  
  /**
    * Specifies whether a pattern that needs to be replaced in a managed template job document schema is optional or required.
    */
  var optional: js.UndefOr[Optional] = js.undefined
  
  /**
    * A regular expression of the patterns that need to be replaced in a managed template job document schema.
    */
  var regex: js.UndefOr[Regex] = js.undefined
}
object DocumentParameter {
  
  inline def apply(): DocumentParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentParameter]
  }
  
  extension [Self <: DocumentParameter](x: Self) {
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExample(value: Example): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setKey(value: ParameterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOptional(value: Optional): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setRegex(value: Regex): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
