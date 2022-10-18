package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchemaRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schema to delete.
    */
  var schemaArn: Arn
}
object DeleteSchemaRequest {
  
  inline def apply(schemaArn: Arn): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(schemaArn = schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
  
  extension [Self <: DeleteSchemaRequest](x: Self) {
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "schemaArn", value.asInstanceOf[js.Any])
  }
}
