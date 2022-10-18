package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSchemaResponse extends StObject {
  
  /**
    * The requested schema.
    */
  var schema: js.UndefOr[DatasetSchema] = js.undefined
}
object DescribeSchemaResponse {
  
  inline def apply(): DescribeSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSchemaResponse]
  }
  
  extension [Self <: DescribeSchemaResponse](x: Self) {
    
    inline def setSchema(value: DatasetSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
