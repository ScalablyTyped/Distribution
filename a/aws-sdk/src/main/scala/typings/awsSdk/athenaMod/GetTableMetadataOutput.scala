package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableMetadataOutput extends StObject {
  
  /**
    * An object that contains table metadata.
    */
  var TableMetadata: js.UndefOr[typings.awsSdk.athenaMod.TableMetadata] = js.undefined
}
object GetTableMetadataOutput {
  
  @scala.inline
  def apply(): GetTableMetadataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableMetadataOutput]
  }
  
  @scala.inline
  implicit class GetTableMetadataOutputMutableBuilder[Self <: GetTableMetadataOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableMetadata(value: TableMetadata): Self = StObject.set(x, "TableMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableMetadataUndefined: Self = StObject.set(x, "TableMetadata", js.undefined)
  }
}
