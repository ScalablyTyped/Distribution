package typings.adobeCssTools

import typings.adobeCssTools.anon.Silent
import typings.adobeCssTools.distCjsTypeMod.CssStylesheetAST
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
    def apply(value: String): js.UndefOr[typings.adobeCssTools.distCjsTypeMod.CssTypes & String] = js.native
    
    /* "charset" */ val charset: typings.adobeCssTools.distCjsTypeMod.CssTypes.charset & String = js.native
    
    /* "comment" */ val comment: typings.adobeCssTools.distCjsTypeMod.CssTypes.comment & String = js.native
    
    /* "custom-media" */ val customMedia: typings.adobeCssTools.distCjsTypeMod.CssTypes.customMedia & String = js.native
    
    /* "declaration" */ val declaration: typings.adobeCssTools.distCjsTypeMod.CssTypes.declaration & String = js.native
    
    /* "document" */ val document: typings.adobeCssTools.distCjsTypeMod.CssTypes.document & String = js.native
    
    /* "font-face" */ val fontFace: typings.adobeCssTools.distCjsTypeMod.CssTypes.fontFace & String = js.native
    
    /* "host" */ val host: typings.adobeCssTools.distCjsTypeMod.CssTypes.host & String = js.native
    
    /* "import" */ val `import`: typings.adobeCssTools.distCjsTypeMod.CssTypes.`import` & String = js.native
    
    /* "keyframe" */ val keyframe: typings.adobeCssTools.distCjsTypeMod.CssTypes.keyframe & String = js.native
    
    /* "keyframes" */ val keyframes: typings.adobeCssTools.distCjsTypeMod.CssTypes.keyframes & String = js.native
    
    /* "media" */ val media: typings.adobeCssTools.distCjsTypeMod.CssTypes.media & String = js.native
    
    /* "namespace" */ val namespace: typings.adobeCssTools.distCjsTypeMod.CssTypes.namespace & String = js.native
    
    /* "page" */ val page: typings.adobeCssTools.distCjsTypeMod.CssTypes.page & String = js.native
    
    /* "rule" */ val rule: typings.adobeCssTools.distCjsTypeMod.CssTypes.rule & String = js.native
    
    /* "stylesheet" */ val stylesheet: typings.adobeCssTools.distCjsTypeMod.CssTypes.stylesheet & String = js.native
    
    /* "supports" */ val supports: typings.adobeCssTools.distCjsTypeMod.CssTypes.supports & String = js.native
  }
  
  inline def parse(css: String): CssStylesheetAST = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any]).asInstanceOf[CssStylesheetAST]
  inline def parse(css: String, options: Silent): CssStylesheetAST = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CssStylesheetAST]
  
  inline def stringify(node: CssStylesheetAST): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringify_0(
    node: CssStylesheetAST,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (options : @adobe/css-tools.anon.Compress | undefined): @adobe/css-tools.@adobe/css-tools/dist/cjs/stringify/compiler.default>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
