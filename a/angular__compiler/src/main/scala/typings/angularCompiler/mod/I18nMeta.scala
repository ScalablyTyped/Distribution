package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nMeta extends StObject {
  
  var customId: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var legacyIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var meaning: js.UndefOr[String] = js.undefined
}
object I18nMeta {
  
  inline def apply(): I18nMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nMeta]
  }
  
  extension [Self <: I18nMeta](x: Self) {
    
    inline def setCustomId(value: String): Self = StObject.set(x, "customId", value.asInstanceOf[js.Any])
    
    inline def setCustomIdUndefined: Self = StObject.set(x, "customId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLegacyIds(value: js.Array[String]): Self = StObject.set(x, "legacyIds", value.asInstanceOf[js.Any])
    
    inline def setLegacyIdsUndefined: Self = StObject.set(x, "legacyIds", js.undefined)
    
    inline def setLegacyIdsVarargs(value: String*): Self = StObject.set(x, "legacyIds", js.Array(value*))
    
    inline def setMeaning(value: String): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
    
    inline def setMeaningUndefined: Self = StObject.set(x, "meaning", js.undefined)
  }
}
