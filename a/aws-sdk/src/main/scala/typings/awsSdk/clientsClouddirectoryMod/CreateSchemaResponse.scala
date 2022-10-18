package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchemaResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}
object CreateSchemaResponse {
  
  inline def apply(): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSchemaResponse]
  }
  
  extension [Self <: CreateSchemaResponse](x: Self) {
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
  }
}
