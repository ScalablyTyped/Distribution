package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchemaResponse extends StObject {
  
  /**
    * The input ARN that is returned as part of the response. For more information, see arns.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}
object DeleteSchemaResponse {
  
  inline def apply(): DeleteSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSchemaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSchemaResponse] (val x: Self) extends AnyVal {
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
  }
}
