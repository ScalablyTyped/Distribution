package typings.acceptLanguageParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("accept-language-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): js.Array[Language] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[js.Array[Language]]
  inline def parse(acceptLanguage: String): js.Array[Language] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(acceptLanguage.asInstanceOf[js.Any]).asInstanceOf[js.Array[Language]]
  
  inline def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(supportedLanguages.asInstanceOf[js.Any], acceptLanguage.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: String, options: PickOptions): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(supportedLanguages.asInstanceOf[js.Any], acceptLanguage.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(supportedLanguages.asInstanceOf[js.Any], acceptLanguage.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def pick[T /* <: String */](supportedLanguages: js.Array[T], acceptLanguage: js.Array[Language], options: PickOptions): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(supportedLanguages.asInstanceOf[js.Any], acceptLanguage.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  trait Language extends StObject {
    
    var code: String
    
    var quality: Double
    
    var region: js.UndefOr[String] = js.undefined
    
    var script: js.UndefOr[String | Null] = js.undefined
  }
  object Language {
    
    inline def apply(code: String, quality: Double): Language = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptNull: Self = StObject.set(x, "script", null)
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  trait PickOptions extends StObject {
    
    var loose: js.UndefOr[Boolean] = js.undefined
  }
  object PickOptions {
    
    inline def apply(): PickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickOptions] (val x: Self) extends AnyVal {
      
      inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
}
