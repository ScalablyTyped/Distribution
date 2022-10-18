package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableOutput extends StObject {
  
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableDescription] = js.undefined
}
object UpdateTableOutput {
  
  inline def apply(): UpdateTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableOutput]
  }
  
  extension [Self <: UpdateTableOutput](x: Self) {
    
    inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
