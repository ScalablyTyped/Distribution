package typings.authHeader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auth-header", "format")
  @js.native
  def format(scheme: String): String = js.native
  @JSImport("auth-header", "format")
  @js.native
  def format(scheme: String, token: js.UndefOr[scala.Nothing], params: Params): String = js.native
  @JSImport("auth-header", "format")
  @js.native
  def format(scheme: String, token: String): String = js.native
  @JSImport("auth-header", "format")
  @js.native
  def format(scheme: String, token: String, params: Params): String = js.native
  @JSImport("auth-header", "format")
  @js.native
  def format(token: TokenOptions): String = js.native
  
  @JSImport("auth-header", "parse")
  @js.native
  def parse(header: String): Token = js.native
  
  type Params = (js.Array[js.Tuple2[String, String | js.Array[String]]]) | (StringDictionary[String | js.Array[String]])
  
  @js.native
  trait Token extends StObject {
    
    var params: StringDictionary[String | js.Array[String]] = js.native
    
    var scheme: String = js.native
    
    var token: Null | String | js.Array[String] = js.native
  }
  object Token {
    
    @scala.inline
    def apply(params: StringDictionary[String | js.Array[String]], scheme: String): Token = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String | js.Array[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenNull: Self = StObject.set(x, "token", null)
      
      @scala.inline
      def setTokenVarargs(value: String*): Self = StObject.set(x, "token", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TokenOptions extends StObject {
    
    var params: js.UndefOr[Params] = js.native
    
    var scheme: String = js.native
    
    var token: js.UndefOr[String] = js.native
  }
  object TokenOptions {
    
    @scala.inline
    def apply(scheme: String): TokenOptions = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenOptions]
    }
    
    @scala.inline
    implicit class TokenOptionsMutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: (js.Tuple2[String, String | js.Array[String]])*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
