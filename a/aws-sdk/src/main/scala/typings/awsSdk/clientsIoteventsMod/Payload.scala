package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  /**
    * The content of the payload. You can use a string expression that includes quoted strings ('&lt;string&gt;'), variables ($variable.&lt;variable-name&gt;), input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;), string concatenations, and quoted strings that contain ${} as the content. The recommended maximum size of a content expression is 1 KB.
    */
  var contentExpression: ContentExpression
  
  /**
    * The value of the payload type can be either STRING or JSON.
    */
  var `type`: PayloadType
}
object Payload {
  
  inline def apply(contentExpression: ContentExpression, `type`: PayloadType): Payload = {
    val __obj = js.Dynamic.literal(contentExpression = contentExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    inline def setContentExpression(value: ContentExpression): Self = StObject.set(x, "contentExpression", value.asInstanceOf[js.Any])
    
    inline def setType(value: PayloadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
