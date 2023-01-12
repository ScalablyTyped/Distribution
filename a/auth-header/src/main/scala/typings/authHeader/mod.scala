package typings.authHeader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auth-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(scheme: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scheme.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(scheme: String, token: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(scheme.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(scheme: String, token: String, params: Params): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(scheme.asInstanceOf[js.Any], token.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(scheme: String, token: Unit, params: Params): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(scheme.asInstanceOf[js.Any], token.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(token: TokenOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(header: String): Token = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(header.asInstanceOf[js.Any]).asInstanceOf[Token]
  
  type Params = (js.Array[js.Tuple2[String, String | js.Array[String]]]) | (StringDictionary[String | js.Array[String]])
  
  trait Token extends StObject {
    
    var params: StringDictionary[String | js.Array[String]]
    
    var scheme: String
    
    var token: Null | String | js.Array[String]
  }
  object Token {
    
    inline def apply(params: StringDictionary[String | js.Array[String]], scheme: String): Token = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], token = null)
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setParams(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String | js.Array[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenNull: Self = StObject.set(x, "token", null)
      
      inline def setTokenVarargs(value: String*): Self = StObject.set(x, "token", js.Array(value*))
    }
  }
  
  trait TokenOptions extends StObject {
    
    var params: js.UndefOr[Params] = js.undefined
    
    var scheme: String
    
    var token: js.UndefOr[String] = js.undefined
  }
  object TokenOptions {
    
    inline def apply(scheme: String): TokenOptions = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: (js.Tuple2[String, String | js.Array[String]])*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
