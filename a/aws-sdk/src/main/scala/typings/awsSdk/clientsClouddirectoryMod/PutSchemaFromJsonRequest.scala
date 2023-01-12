package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSchemaFromJsonRequest extends StObject {
  
  /**
    * The replacement JSON schema.
    */
  var Document: SchemaJsonDocument
  
  /**
    * The ARN of the schema to update.
    */
  var SchemaArn: Arn
}
object PutSchemaFromJsonRequest {
  
  inline def apply(Document: SchemaJsonDocument, SchemaArn: Arn): PutSchemaFromJsonRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSchemaFromJsonRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSchemaFromJsonRequest] (val x: Self) extends AnyVal {
    
    inline def setDocument(value: SchemaJsonDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
