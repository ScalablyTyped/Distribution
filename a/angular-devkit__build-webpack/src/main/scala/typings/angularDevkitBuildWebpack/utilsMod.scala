package typings.angularDevkitBuildWebpack

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/json/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isJsonArray(value: JsonValue): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonArray */ Boolean]
  
  inline def isJsonObject(value: JsonValue): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonObject */ Boolean]
  
  type JsonArray = js.Array[JsonValue]
  
  trait JsonObject
    extends StObject
       with /* prop */ StringDictionary[JsonValue]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  type JsonValue = Boolean | String | Double | Any | JsonObject | Null
}
