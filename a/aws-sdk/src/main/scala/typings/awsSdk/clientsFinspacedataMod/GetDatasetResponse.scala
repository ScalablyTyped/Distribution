package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatasetResponse extends StObject {
  
  /**
    * The unique resource identifier for a Dataset.
    */
  var alias: js.UndefOr[AliasString] = js.undefined
  
  /**
    * The timestamp at which the Dataset was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var createTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * The ARN identifier of the Dataset.
    */
  var datasetArn: js.UndefOr[DatasetArn] = js.undefined
  
  /**
    * A description of the Dataset.
    */
  var datasetDescription: js.UndefOr[DatasetDescription] = js.undefined
  
  /**
    * The unique identifier for a Dataset.
    */
  var datasetId: js.UndefOr[DatasetId] = js.undefined
  
  /**
    * Display title for a Dataset.
    */
  var datasetTitle: js.UndefOr[DatasetTitle] = js.undefined
  
  /**
    * The format in which Dataset data is structured.    TABULAR – Data is structured in a tabular format.    NON_TABULAR – Data is structured in a non-tabular format.  
    */
  var kind: js.UndefOr[DatasetKind] = js.undefined
  
  /**
    * The last time that the Dataset was modified. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
    */
  var lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Definition for a schema on a tabular Dataset.
    */
  var schemaDefinition: js.UndefOr[SchemaUnion] = js.undefined
  
  /**
    * Status of the Dataset creation.    PENDING – Dataset is pending creation.    FAILED – Dataset creation has failed.    SUCCESS – Dataset creation has succeeded.    RUNNING – Dataset creation is running.  
    */
  var status: js.UndefOr[DatasetStatus] = js.undefined
}
object GetDatasetResponse {
  
  inline def apply(): GetDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatasetResponse]
  }
  
  extension [Self <: GetDatasetResponse](x: Self) {
    
    inline def setAlias(value: AliasString): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCreateTime(value: TimestampEpoch): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "datasetArn", js.undefined)
    
    inline def setDatasetDescription(value: DatasetDescription): Self = StObject.set(x, "datasetDescription", value.asInstanceOf[js.Any])
    
    inline def setDatasetDescriptionUndefined: Self = StObject.set(x, "datasetDescription", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setDatasetTitle(value: DatasetTitle): Self = StObject.set(x, "datasetTitle", value.asInstanceOf[js.Any])
    
    inline def setDatasetTitleUndefined: Self = StObject.set(x, "datasetTitle", js.undefined)
    
    inline def setKind(value: DatasetKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedTime(value: TimestampEpoch): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setSchemaDefinition(value: SchemaUnion): Self = StObject.set(x, "schemaDefinition", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinitionUndefined: Self = StObject.set(x, "schemaDefinition", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
