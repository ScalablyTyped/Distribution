package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportResponse extends StObject {
  
  /**
    * The date and time that the import request was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique identifier for the import.
    */
  var importId: js.UndefOr[Id] = js.undefined
  
  /**
    * The current status of the import. When the status is Complete the bot, bot alias, or custom vocabulary is ready to use.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.undefined
  
  /**
    * The strategy used when there was a name conflict between the imported resource and an existing resource. When the merge strategy is FailOnConflict existing resources are not overwritten and the import fails.
    */
  var mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined
  
  /**
    * The parameters used when importing the resource.
    */
  var resourceSpecification: js.UndefOr[ImportResourceSpecification] = js.undefined
}
object StartImportResponse {
  
  inline def apply(): StartImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartImportResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setImportId(value: Id): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "importStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "importStatus", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    inline def setResourceSpecification(value: ImportResourceSpecification): Self = StObject.set(x, "resourceSpecification", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecificationUndefined: Self = StObject.set(x, "resourceSpecification", js.undefined)
  }
}
