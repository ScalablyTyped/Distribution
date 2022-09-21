package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareComponentTemplateInfo extends StObject {
  
  /**
    * The string contents of the template.
    *
    * This is the "logical" template string, after expansion of any escaped characters (for inline
    * templates). This may differ from the actual template bytes as they appear in the .ts file.
    */
  var content: String
  
  /**
    * If the template was defined inline by a direct string literal, then this is that literal
    * expression. Otherwise `null`, if the template was not defined inline or was not a literal.
    */
  var inlineTemplateLiteralExpression: Expression | Null
  
  /**
    * Whether the template was inline (using `template`) or external (using `templateUrl`).
    */
  var isInline: Boolean
  
  /**
    * A full path to the file which contains the template.
    *
    * This can be either the original .ts file if the template is inline, or the .html file if an
    * external file was used.
    */
  var sourceUrl: String
}
object DeclareComponentTemplateInfo {
  
  inline def apply(content: String, isInline: Boolean, sourceUrl: String): DeclareComponentTemplateInfo = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any], inlineTemplateLiteralExpression = null)
    __obj.asInstanceOf[DeclareComponentTemplateInfo]
  }
  
  extension [Self <: DeclareComponentTemplateInfo](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setInlineTemplateLiteralExpression(value: Expression): Self = StObject.set(x, "inlineTemplateLiteralExpression", value.asInstanceOf[js.Any])
    
    inline def setInlineTemplateLiteralExpressionNull: Self = StObject.set(x, "inlineTemplateLiteralExpression", null)
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
  }
}
