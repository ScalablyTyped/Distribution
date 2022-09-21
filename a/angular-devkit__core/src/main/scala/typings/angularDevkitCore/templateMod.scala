package typings.angularDevkitCore

import typings.angularDevkitCore.angularDevkitCoreStrings.comment
import typings.angularDevkitCore.angularDevkitCoreStrings.content
import typings.angularDevkitCore.angularDevkitCoreStrings.escape
import typings.angularDevkitCore.angularDevkitCoreStrings.evaluate
import typings.angularDevkitCore.angularDevkitCoreStrings.interpolate
import typings.angularDevkitCore.anon.Exports
import typings.sourceMap.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("@angular-devkit/core/src/utils/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def template[T](content: String): js.Function1[/* input */ T, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(content.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ T, String]]
  inline def template[T](content: String, options: TemplateOptions): js.Function1[/* input */ T, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* input */ T, String]]
  
  inline def templateParser(sourceText: String, fileName: String): TemplateAst = (^.asInstanceOf[js.Dynamic].applyDynamic("templateParser")(sourceText.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[TemplateAst]
  
  trait TemplateAst extends StObject {
    
    var children: js.Array[TemplateAstNode]
    
    var content: String
    
    var fileName: String
  }
  object TemplateAst {
    
    inline def apply(children: js.Array[TemplateAstNode], content: String, fileName: String): TemplateAst = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateAst]
    }
    
    extension [Self <: TemplateAst](x: Self) {
      
      inline def setChildren(value: js.Array[TemplateAstNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: TemplateAstNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateAstBase extends StObject {
    
    var end: Position
    
    var start: Position
  }
  object TemplateAstBase {
    
    inline def apply(end: Position, start: Position): TemplateAstBase = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateAstBase]
    }
    
    extension [Self <: TemplateAstBase](x: Self) {
      
      inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateAstComment
    extends StObject
       with TemplateAstBase
       with TemplateAstNode {
    
    var kind: comment
    
    var text: String
  }
  object TemplateAstComment {
    
    inline def apply(end: Position, start: Position, text: String): TemplateAstComment = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "comment", start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateAstComment]
    }
    
    extension [Self <: TemplateAstComment](x: Self) {
      
      inline def setKind(value: comment): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateAstContent
    extends StObject
       with TemplateAstBase
       with TemplateAstNode {
    
    var content: String
    
    var kind: content
  }
  object TemplateAstContent {
    
    inline def apply(content: String, end: Position, start: Position): TemplateAstContent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = "content", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateAstContent]
    }
    
    extension [Self <: TemplateAstContent](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: content): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateAstEscape
    extends StObject
       with TemplateAstBase
       with TemplateAstNode {
    
    var expression: String
    
    var kind: escape
  }
  object TemplateAstEscape {
    
    inline def apply(end: Position, expression: String, start: Position): TemplateAstEscape = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], kind = "escape", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateAstEscape]
    }
    
    extension [Self <: TemplateAstEscape](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setKind(value: escape): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateAstEvaluate
    extends StObject
       with TemplateAstBase
       with TemplateAstNode {
    
    var expression: String
    
    var kind: evaluate
  }
  object TemplateAstEvaluate {
    
    inline def apply(end: Position, expression: String, start: Position): TemplateAstEvaluate = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], kind = "evaluate", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateAstEvaluate]
    }
    
    extension [Self <: TemplateAstEvaluate](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setKind(value: evaluate): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateAstInterpolate
    extends StObject
       with TemplateAstBase
       with TemplateAstNode {
    
    var expression: String
    
    var kind: interpolate
  }
  object TemplateAstInterpolate {
    
    inline def apply(end: Position, expression: String, start: Position): TemplateAstInterpolate = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], kind = "interpolate", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateAstInterpolate]
    }
    
    extension [Self <: TemplateAstInterpolate](x: Self) {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setKind(value: interpolate): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularDevkitCore.templateMod.TemplateAstContent
    - typings.angularDevkitCore.templateMod.TemplateAstEvaluate
    - typings.angularDevkitCore.templateMod.TemplateAstComment
    - typings.angularDevkitCore.templateMod.TemplateAstEscape
    - typings.angularDevkitCore.templateMod.TemplateAstInterpolate
  */
  trait TemplateAstNode extends StObject
  object TemplateAstNode {
    
    inline def TemplateAstComment(end: Position, start: Position, text: String): typings.angularDevkitCore.templateMod.TemplateAstComment = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = "comment", start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.templateMod.TemplateAstComment]
    }
    
    inline def TemplateAstContent(content: String, end: Position, start: Position): typings.angularDevkitCore.templateMod.TemplateAstContent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = "content", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.templateMod.TemplateAstContent]
    }
    
    inline def TemplateAstEscape(end: Position, expression: String, start: Position): typings.angularDevkitCore.templateMod.TemplateAstEscape = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], kind = "escape", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.templateMod.TemplateAstEscape]
    }
    
    inline def TemplateAstEvaluate(end: Position, expression: String, start: Position): typings.angularDevkitCore.templateMod.TemplateAstEvaluate = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], kind = "evaluate", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.templateMod.TemplateAstEvaluate]
    }
    
    inline def TemplateAstInterpolate(end: Position, expression: String, start: Position): typings.angularDevkitCore.templateMod.TemplateAstInterpolate = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], kind = "interpolate", start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.templateMod.TemplateAstInterpolate]
    }
  }
  
  trait TemplateOptions extends StObject {
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var module: js.UndefOr[Boolean | Exports] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sourceURL: js.UndefOr[String] = js.undefined
  }
  object TemplateOptions {
    
    inline def apply(): TemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateOptions]
    }
    
    extension [Self <: TemplateOptions](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setModule(value: Boolean | Exports): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
      
      inline def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
    }
  }
}
