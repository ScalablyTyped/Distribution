package typings.acceptLanguageParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("accept-language-parser", "parse")
  @js.native
  def parse(acceptLanguage: String): js.Array[Language] = js.native
  
  @JSImport("accept-language-parser", "pick")
  @js.native
  def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String): T | Null = js.native
  @JSImport("accept-language-parser", "pick")
  @js.native
  def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String, options: PickOptions): T | Null = js.native
  @JSImport("accept-language-parser", "pick")
  @js.native
  def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language]): T | Null = js.native
  @JSImport("accept-language-parser", "pick")
  @js.native
  def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language], options: PickOptions): T | Null = js.native
  
  @js.native
  trait Language extends StObject {
    
    var code: String = js.native
    
    var quality: Double = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var script: js.UndefOr[String | Null] = js.native
  }
  object Language {
    
    @scala.inline
    def apply(code: String, quality: Double): Language = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptNull: Self = StObject.set(x, "script", null)
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  @js.native
  trait PickOptions extends StObject {
    
    var loose: js.UndefOr[Boolean] = js.native
  }
  object PickOptions {
    
    @scala.inline
    def apply(): PickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptions]
    }
    
    @scala.inline
    implicit class PickOptionsMutableBuilder[Self <: PickOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
}
