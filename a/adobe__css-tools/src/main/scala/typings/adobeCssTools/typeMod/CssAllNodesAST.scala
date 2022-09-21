package typings.adobeCssTools.typeMod

import typings.adobeCssTools.anon.ParsingErrors
import typings.adobeCssTools.typeMod.CssTypes.`import`
import typings.adobeCssTools.typeMod.CssTypes.charset
import typings.adobeCssTools.typeMod.CssTypes.comment
import typings.adobeCssTools.typeMod.CssTypes.customMedia
import typings.adobeCssTools.typeMod.CssTypes.declaration
import typings.adobeCssTools.typeMod.CssTypes.document
import typings.adobeCssTools.typeMod.CssTypes.fontFace
import typings.adobeCssTools.typeMod.CssTypes.host
import typings.adobeCssTools.typeMod.CssTypes.keyframe
import typings.adobeCssTools.typeMod.CssTypes.keyframes
import typings.adobeCssTools.typeMod.CssTypes.media
import typings.adobeCssTools.typeMod.CssTypes.namespace
import typings.adobeCssTools.typeMod.CssTypes.page
import typings.adobeCssTools.typeMod.CssTypes.rule
import typings.adobeCssTools.typeMod.CssTypes.stylesheet
import typings.adobeCssTools.typeMod.CssTypes.supports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.adobeCssTools.typeMod.CssAtRuleAST
  - typings.adobeCssTools.typeMod.CssStylesheetAST
  - typings.adobeCssTools.typeMod.CssDeclarationAST
  - typings.adobeCssTools.typeMod.CssKeyframeAST
*/
trait CssAllNodesAST extends StObject
object CssAllNodesAST {
  
  inline def CssCharsetAST(charset: String, `type`: charset): typings.adobeCssTools.typeMod.CssCharsetAST = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssCharsetAST]
  }
  
  inline def CssCommentAST(comment: String, `type`: comment): typings.adobeCssTools.typeMod.CssCommentAST = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssCommentAST]
  }
  
  inline def CssCustomMediaAST(media: String, name: String, `type`: customMedia): typings.adobeCssTools.typeMod.CssCustomMediaAST = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssCustomMediaAST]
  }
  
  inline def CssDeclarationAST(property: String, `type`: declaration, value: String): typings.adobeCssTools.typeMod.CssDeclarationAST = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssDeclarationAST]
  }
  
  inline def CssDocumentAST(document: String, rules: js.Array[CssAtRuleAST], `type`: document): typings.adobeCssTools.typeMod.CssDocumentAST = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssDocumentAST]
  }
  
  inline def CssFontFaceAST(declarations: js.Array[CssDeclarationAST | CssCommentAST], `type`: fontFace): typings.adobeCssTools.typeMod.CssFontFaceAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssFontFaceAST]
  }
  
  inline def CssHostAST(rules: js.Array[CssAtRuleAST], `type`: host): typings.adobeCssTools.typeMod.CssHostAST = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssHostAST]
  }
  
  inline def CssImportAST(`import`: String, `type`: `import`): typings.adobeCssTools.typeMod.CssImportAST = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssImportAST]
  }
  
  inline def CssKeyframeAST(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    `type`: keyframe,
    values: js.Array[String]
  ): typings.adobeCssTools.typeMod.CssKeyframeAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssKeyframeAST]
  }
  
  inline def CssKeyframesAST(keyframes: js.Array[CssKeyframeAST | CssCommentAST], name: String, `type`: keyframes): typings.adobeCssTools.typeMod.CssKeyframesAST = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssKeyframesAST]
  }
  
  inline def CssMediaAST(media: String, rules: js.Array[CssAtRuleAST], `type`: media): typings.adobeCssTools.typeMod.CssMediaAST = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssMediaAST]
  }
  
  inline def CssNamespaceAST(namespace: String, `type`: namespace): typings.adobeCssTools.typeMod.CssNamespaceAST = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssNamespaceAST]
  }
  
  inline def CssPageAST(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    selectors: js.Array[String],
    `type`: page
  ): typings.adobeCssTools.typeMod.CssPageAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssPageAST]
  }
  
  inline def CssRuleAST(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    selectors: js.Array[String],
    `type`: rule
  ): typings.adobeCssTools.typeMod.CssRuleAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssRuleAST]
  }
  
  inline def CssStylesheetAST(stylesheet: ParsingErrors, `type`: stylesheet): typings.adobeCssTools.typeMod.CssStylesheetAST = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssStylesheetAST]
  }
  
  inline def CssSupportsAST(rules: js.Array[CssAtRuleAST], supports: String, `type`: supports): typings.adobeCssTools.typeMod.CssSupportsAST = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.typeMod.CssSupportsAST]
  }
}
