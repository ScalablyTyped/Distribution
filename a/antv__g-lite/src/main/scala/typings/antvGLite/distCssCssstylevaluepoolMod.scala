package typings.antvGLite

import typings.antvGLite.distCssCssomMod.CSSKeywordValue
import typings.antvGLite.distCssCssomMod.CSSRGB
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssstylevaluepoolMod {
  
  @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOrCreateKeyword(name: String): CSSKeywordValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateKeyword")(name.asInstanceOf[js.Any]).asInstanceOf[CSSKeywordValue]
  
  object getOrCreateRGBA {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "getOrCreateRGBA")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "getOrCreateRGBA.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  object getOrCreateUnitValue {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "getOrCreateUnitValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "getOrCreateUnitValue.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "inheritKeywordValue")
  @js.native
  val inheritKeywordValue: CSSKeywordValue = js.native
  
  @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "initialKeywordValue")
  @js.native
  val initialKeywordValue: CSSKeywordValue = js.native
  
  @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "noneColor")
  @js.native
  val noneColor: CSSRGB = js.native
  
  @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "transparentColor")
  @js.native
  val transparentColor: CSSRGB = js.native
  
  @JSImport("@antv/g-lite/dist/css/CSSStyleValuePool", "unsetKeywordValue")
  @js.native
  val unsetKeywordValue: CSSKeywordValue = js.native
}
