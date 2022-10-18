package typings.adobeCssTools

import typings.adobeCssTools.anon.Compress
import typings.adobeCssTools.distCjsTypeMod.CssAllNodesAST
import typings.adobeCssTools.distCjsTypeMod.CssCharsetAST
import typings.adobeCssTools.distCjsTypeMod.CssCommentAST
import typings.adobeCssTools.distCjsTypeMod.CssCustomMediaAST
import typings.adobeCssTools.distCjsTypeMod.CssDeclarationAST
import typings.adobeCssTools.distCjsTypeMod.CssDocumentAST
import typings.adobeCssTools.distCjsTypeMod.CssFontFaceAST
import typings.adobeCssTools.distCjsTypeMod.CssHostAST
import typings.adobeCssTools.distCjsTypeMod.CssImportAST
import typings.adobeCssTools.distCjsTypeMod.CssKeyframeAST
import typings.adobeCssTools.distCjsTypeMod.CssKeyframesAST
import typings.adobeCssTools.distCjsTypeMod.CssMediaAST
import typings.adobeCssTools.distCjsTypeMod.CssNamespaceAST
import typings.adobeCssTools.distCjsTypeMod.CssPageAST
import typings.adobeCssTools.distCjsTypeMod.CssRuleAST
import typings.adobeCssTools.distCjsTypeMod.CssStylesheetAST
import typings.adobeCssTools.distCjsTypeMod.CssSupportsAST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsStringifyCompilerMod {
  
  @JSImport("@adobe/css-tools/dist/cjs/stringify/compiler", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Compiler {
    def this(options: Compress) = this()
  }
  
  @js.native
  trait Compiler extends StObject {
    
    /**
      * Visit charset node.
      */
    def charset(node: CssCharsetAST): String = js.native
    
    /**
      * Visit comment node.
      */
    def comment(node: CssCommentAST): String = js.native
    
    def compile(node: CssStylesheetAST): String = js.native
    
    var compress: Boolean = js.native
    
    /**
      * Visit custom-media node.
      */
    def customMedia(node: CssCustomMediaAST): String = js.native
    
    /**
      * Visit declaration node.
      */
    def declaration(node: CssDeclarationAST): String = js.native
    
    /**
      * Visit document node.
      */
    def document(node: CssDocumentAST): String = js.native
    
    def emit(str: String): String = js.native
    def emit(str: String, _position: js.UndefOr[typings.adobeCssTools.distCjsCssPositionMod.default]): String = js.native
    
    /**
      * Visit font-face node.
      */
    def fontFace(node: CssFontFaceAST): String = js.native
    
    /**
      * Visit host node.
      */
    def host(node: CssHostAST): String = js.native
    
    /**
      * Visit import node.
      */
    def `import`(node: CssImportAST): String = js.native
    
    /**
      * Increase, decrease or return current indentation.
      */
    def indent(): String = js.native
    def indent(level: Double): String = js.native
    
    var indentation: String = js.native
    
    /**
      * Visit keyframe node.
      */
    def keyframe(node: CssKeyframeAST): String = js.native
    
    /**
      * Visit keyframes node.
      */
    def keyframes(node: CssKeyframesAST): String = js.native
    
    var level: Double = js.native
    
    def mapVisit(nodes: js.Array[CssAllNodesAST]): String = js.native
    def mapVisit(nodes: js.Array[CssAllNodesAST], delim: String): String = js.native
    
    /**
      * Visit media node.
      */
    def media(node: CssMediaAST): String = js.native
    
    /**
      * Visit namespace node.
      */
    def namespace(node: CssNamespaceAST): String = js.native
    
    /**
      * Visit page node.
      */
    def page(node: CssPageAST): String = js.native
    
    /**
      * Visit rule node.
      */
    def rule(node: CssRuleAST): String = js.native
    
    /**
      * Visit stylesheet node.
      */
    def stylesheet(node: CssStylesheetAST): String = js.native
    
    /**
      * Visit supports node.
      */
    def supports(node: CssSupportsAST): String = js.native
    
    def visit(node: CssAllNodesAST): String = js.native
  }
}
