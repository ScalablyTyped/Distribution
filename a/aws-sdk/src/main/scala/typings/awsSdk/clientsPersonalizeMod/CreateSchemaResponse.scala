package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchemaResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.undefined
}
object CreateSchemaResponse {
  
  inline def apply(): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSchemaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSchemaResponse] (val x: Self) extends AnyVal {
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "schemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "schemaArn", js.undefined)
  }
}
