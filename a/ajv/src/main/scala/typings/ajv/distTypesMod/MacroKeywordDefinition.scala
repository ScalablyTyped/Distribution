package typings.ajv.distTypesMod

import typings.ajv.compileMod.SchemaCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ajv.distTypesMod.KeywordDefinition because Already inherited */ trait MacroKeywordDefinition
  extends StObject
     with FuncKeywordDefinition {
  
  def `macro`(schema: Any, parentSchema: AnySchemaObject, it: SchemaCxt): AnySchema
  @JSName("macro")
  var macro_Original: MacroKeywordFunc
}
object MacroKeywordDefinition {
  
  inline def apply(
    keyword: String | js.Array[String],
    `macro`: (/* schema */ Any, /* parentSchema */ AnySchemaObject, /* it */ SchemaCxt) => AnySchema
  ): MacroKeywordDefinition = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.updateDynamic("macro")(js.Any.fromFunction3(`macro`))
    __obj.asInstanceOf[MacroKeywordDefinition]
  }
  
  extension [Self <: MacroKeywordDefinition](x: Self) {
    
    inline def setMacro(value: (/* schema */ Any, /* parentSchema */ AnySchemaObject, /* it */ SchemaCxt) => AnySchema): Self = StObject.set(x, "macro", js.Any.fromFunction3(value))
  }
}
