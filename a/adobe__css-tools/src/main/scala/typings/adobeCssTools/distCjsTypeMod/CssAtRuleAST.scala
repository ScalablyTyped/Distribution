package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsTypeMod.CssTypes.`import`
import typings.adobeCssTools.distCjsTypeMod.CssTypes.charset
import typings.adobeCssTools.distCjsTypeMod.CssTypes.comment
import typings.adobeCssTools.distCjsTypeMod.CssTypes.customMedia
import typings.adobeCssTools.distCjsTypeMod.CssTypes.document
import typings.adobeCssTools.distCjsTypeMod.CssTypes.fontFace
import typings.adobeCssTools.distCjsTypeMod.CssTypes.host
import typings.adobeCssTools.distCjsTypeMod.CssTypes.keyframes
import typings.adobeCssTools.distCjsTypeMod.CssTypes.media
import typings.adobeCssTools.distCjsTypeMod.CssTypes.namespace
import typings.adobeCssTools.distCjsTypeMod.CssTypes.page
import typings.adobeCssTools.distCjsTypeMod.CssTypes.rule
import typings.adobeCssTools.distCjsTypeMod.CssTypes.supports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.adobeCssTools.distCjsTypeMod.CssRuleAST
  - typings.adobeCssTools.distCjsTypeMod.CssCommentAST
  - typings.adobeCssTools.distCjsTypeMod.CssCharsetAST
  - typings.adobeCssTools.distCjsTypeMod.CssCustomMediaAST
  - typings.adobeCssTools.distCjsTypeMod.CssDocumentAST
  - typings.adobeCssTools.distCjsTypeMod.CssFontFaceAST
  - typings.adobeCssTools.distCjsTypeMod.CssHostAST
  - typings.adobeCssTools.distCjsTypeMod.CssImportAST
  - typings.adobeCssTools.distCjsTypeMod.CssKeyframesAST
  - typings.adobeCssTools.distCjsTypeMod.CssMediaAST
  - typings.adobeCssTools.distCjsTypeMod.CssNamespaceAST
  - typings.adobeCssTools.distCjsTypeMod.CssPageAST
  - typings.adobeCssTools.distCjsTypeMod.CssSupportsAST
*/
trait CssAtRuleAST
  extends StObject
     with CssAllNodesAST
object CssAtRuleAST {
  
  inline def CssCharsetAST(charset: String, `type`: charset): typings.adobeCssTools.distCjsTypeMod.CssCharsetAST = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssCharsetAST]
  }
  
  inline def CssCommentAST(comment: String, `type`: comment): typings.adobeCssTools.distCjsTypeMod.CssCommentAST = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssCommentAST]
  }
  
  inline def CssCustomMediaAST(media: String, name: String, `type`: customMedia): typings.adobeCssTools.distCjsTypeMod.CssCustomMediaAST = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssCustomMediaAST]
  }
  
  inline def CssDocumentAST(document: String, rules: js.Array[CssAtRuleAST], `type`: document): typings.adobeCssTools.distCjsTypeMod.CssDocumentAST = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssDocumentAST]
  }
  
  inline def CssFontFaceAST(declarations: js.Array[CssDeclarationAST | CssCommentAST], `type`: fontFace): typings.adobeCssTools.distCjsTypeMod.CssFontFaceAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssFontFaceAST]
  }
  
  inline def CssHostAST(rules: js.Array[CssAtRuleAST], `type`: host): typings.adobeCssTools.distCjsTypeMod.CssHostAST = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssHostAST]
  }
  
  inline def CssImportAST(`import`: String, `type`: `import`): typings.adobeCssTools.distCjsTypeMod.CssImportAST = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssImportAST]
  }
  
  inline def CssKeyframesAST(keyframes: js.Array[CssKeyframeAST | CssCommentAST], name: String, `type`: keyframes): typings.adobeCssTools.distCjsTypeMod.CssKeyframesAST = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssKeyframesAST]
  }
  
  inline def CssMediaAST(media: String, rules: js.Array[CssAtRuleAST], `type`: media): typings.adobeCssTools.distCjsTypeMod.CssMediaAST = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssMediaAST]
  }
  
  inline def CssNamespaceAST(namespace: String, `type`: namespace): typings.adobeCssTools.distCjsTypeMod.CssNamespaceAST = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssNamespaceAST]
  }
  
  inline def CssPageAST(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    selectors: js.Array[String],
    `type`: page
  ): typings.adobeCssTools.distCjsTypeMod.CssPageAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssPageAST]
  }
  
  inline def CssRuleAST(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    selectors: js.Array[String],
    `type`: rule
  ): typings.adobeCssTools.distCjsTypeMod.CssRuleAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssRuleAST]
  }
  
  inline def CssSupportsAST(rules: js.Array[CssAtRuleAST], supports: String, `type`: supports): typings.adobeCssTools.distCjsTypeMod.CssSupportsAST = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.adobeCssTools.distCjsTypeMod.CssSupportsAST]
  }
}
