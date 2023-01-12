package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportResponse extends StObject {
  
  /**
    * The date and time that the import was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If the importStatus field is Failed, this provides one or more reasons for the failure.
    */
  var failureReasons: js.UndefOr[FailureReasons] = js.undefined
  
  /**
    * The unique identifier of the described import.
    */
  var importId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the import process. When the status is Completed the resource is imported and ready for use.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.undefined
  
  /**
    * The unique identifier that Amazon Lex assigned to the resource created by the import.
    */
  var importedResourceId: js.UndefOr[ImportedResourceId] = js.undefined
  
  /**
    * The name of the imported resource.
    */
  var importedResourceName: js.UndefOr[Name] = js.undefined
  
  /**
    * The date and time that the import was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The strategy used when there was a name conflict between the imported resource and an existing resource. When the merge strategy is FailOnConflict existing resources are not overwritten and the import fails.
    */
  var mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined
  
  /**
    * The specifications of the imported bot, bot locale, or custom vocabulary.
    */
  var resourceSpecification: js.UndefOr[ImportResourceSpecification] = js.undefined
}
object DescribeImportResponse {
  
  inline def apply(): DescribeImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImportResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setFailureReasons(value: FailureReasons): Self = StObject.set(x, "failureReasons", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonsUndefined: Self = StObject.set(x, "failureReasons", js.undefined)
    
    inline def setFailureReasonsVarargs(value: FailureReason*): Self = StObject.set(x, "failureReasons", js.Array(value*))
    
    inline def setImportId(value: Id): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "importStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "importStatus", js.undefined)
    
    inline def setImportedResourceId(value: ImportedResourceId): Self = StObject.set(x, "importedResourceId", value.asInstanceOf[js.Any])
    
    inline def setImportedResourceIdUndefined: Self = StObject.set(x, "importedResourceId", js.undefined)
    
    inline def setImportedResourceName(value: Name): Self = StObject.set(x, "importedResourceName", value.asInstanceOf[js.Any])
    
    inline def setImportedResourceNameUndefined: Self = StObject.set(x, "importedResourceName", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    inline def setResourceSpecification(value: ImportResourceSpecification): Self = StObject.set(x, "resourceSpecification", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecificationUndefined: Self = StObject.set(x, "resourceSpecification", js.undefined)
  }
}
