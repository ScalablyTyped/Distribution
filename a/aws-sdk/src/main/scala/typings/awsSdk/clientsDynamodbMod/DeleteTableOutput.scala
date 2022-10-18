package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableOutput extends StObject {
  
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableDescription] = js.undefined
}
object DeleteTableOutput {
  
  inline def apply(): DeleteTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableOutput]
  }
  
  extension [Self <: DeleteTableOutput](x: Self) {
    
    inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}
