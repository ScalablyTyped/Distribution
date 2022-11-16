package typings.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsonUtilsMod {
  
  @JSImport("@angular-devkit/core/src/json/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isJsonArray(value: JsonValue): /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray */ Boolean]
  
  inline def isJsonObject(value: JsonValue): /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject */ Boolean]
  
  type JsonArray = js.Array[JsonValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonObject = {[prop: string] : @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonValue}
  }}}
  to avoid circular code involving: 
  - @angular-devkit/core.@angular-devkit/core/src/json/schema/interface.SchemaValidator
  - @angular-devkit/core.@angular-devkit/core/src/json/schema/schema.JsonSchema
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonValue
  */
  trait JsonObject
    extends StObject
       with /* prop */ StringDictionary[JsonValue]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonValue = boolean | string | number | @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray | @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject | null
  }}}
  to avoid circular code involving: 
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonValue
  */
  type JsonValue = Boolean | String | Double | Any | JsonObject | Null
}
