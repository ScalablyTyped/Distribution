package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableMetadataOutput extends StObject {
  
  /**
    * An object that contains table metadata.
    */
  var TableMetadata: js.UndefOr[typings.awsSdk.clientsAthenaMod.TableMetadata] = js.undefined
}
object GetTableMetadataOutput {
  
  inline def apply(): GetTableMetadataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableMetadataOutput]
  }
  
  extension [Self <: GetTableMetadataOutput](x: Self) {
    
    inline def setTableMetadata(value: TableMetadata): Self = StObject.set(x, "TableMetadata", value.asInstanceOf[js.Any])
    
    inline def setTableMetadataUndefined: Self = StObject.set(x, "TableMetadata", js.undefined)
  }
}
