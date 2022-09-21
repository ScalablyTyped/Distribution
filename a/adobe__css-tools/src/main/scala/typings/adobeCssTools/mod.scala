package typings.adobeCssTools

import typings.adobeCssTools.anon.Silent
import typings.adobeCssTools.typeMod.CssStylesheetAST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adobe/css-tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@adobe/css-tools", "CssTypes")
  @js.native
  object CssTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.adobeCssTools.typeMod.CssTypes & String] = js.native
    
    /* "charset" */ val charset: typings.adobeCssTools.typeMod.CssTypes.charset & String = js.native
    
    /* "comment" */ val comment: typings.adobeCssTools.typeMod.CssTypes.comment & String = js.native
    
    /* "custom-media" */ val customMedia: typings.adobeCssTools.typeMod.CssTypes.customMedia & String = js.native
    
    /* "declaration" */ val declaration: typings.adobeCssTools.typeMod.CssTypes.declaration & String = js.native
    
    /* "document" */ val document: typings.adobeCssTools.typeMod.CssTypes.document & String = js.native
    
    /* "font-face" */ val fontFace: typings.adobeCssTools.typeMod.CssTypes.fontFace & String = js.native
    
    /* "host" */ val host: typings.adobeCssTools.typeMod.CssTypes.host & String = js.native
    
    /* "import" */ val `import`: typings.adobeCssTools.typeMod.CssTypes.`import` & String = js.native
    
    /* "keyframe" */ val keyframe: typings.adobeCssTools.typeMod.CssTypes.keyframe & String = js.native
    
    /* "keyframes" */ val keyframes: typings.adobeCssTools.typeMod.CssTypes.keyframes & String = js.native
    
    /* "media" */ val media: typings.adobeCssTools.typeMod.CssTypes.media & String = js.native
    
    /* "namespace" */ val namespace: typings.adobeCssTools.typeMod.CssTypes.namespace & String = js.native
    
    /* "page" */ val page: typings.adobeCssTools.typeMod.CssTypes.page & String = js.native
    
    /* "rule" */ val rule: typings.adobeCssTools.typeMod.CssTypes.rule & String = js.native
    
    /* "stylesheet" */ val stylesheet: typings.adobeCssTools.typeMod.CssTypes.stylesheet & String = js.native
    
    /* "supports" */ val supports: typings.adobeCssTools.typeMod.CssTypes.supports & String = js.native
  }
  
  inline def parse(css: String): CssStylesheetAST = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any]).asInstanceOf[CssStylesheetAST]
  inline def parse(css: String, options: Silent): CssStylesheetAST = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CssStylesheetAST]
  
  inline def stringify(node: CssStylesheetAST): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringify_0(
    node: CssStylesheetAST,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (options : @adobe/css-tools.anon.Compress | undefined): @adobe/css-tools.@adobe/css-tools/dist/cjs/stringify/compiler.default>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
