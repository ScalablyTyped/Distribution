package typings.ajvKeywords

import typings.ajv.distTypesMod.KeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsTypesMod {
  
  trait DefinitionOptions extends StObject {
    
    var defaultMeta: js.UndefOr[String | Boolean] = js.undefined
  }
  object DefinitionOptions {
    
    inline def apply(): DefinitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefinitionOptions]
    }
    
    extension [Self <: DefinitionOptions](x: Self) {
      
      inline def setDefaultMeta(value: String | Boolean): Self = StObject.set(x, "defaultMeta", value.asInstanceOf[js.Any])
      
      inline def setDefaultMetaUndefined: Self = StObject.set(x, "defaultMeta", js.undefined)
    }
  }
  
  type GetDefinition[T /* <: KeywordDefinition */] = js.Function1[/* opts */ js.UndefOr[DefinitionOptions], T]
}
