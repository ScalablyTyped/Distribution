package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetRequest extends StObject {
  
  /**
    * The unique resource identifier for a Dataset.
    */
  var alias: js.UndefOr[AliasString] = js.undefined
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A description for the Dataset.
    */
  var datasetDescription: js.UndefOr[DatasetDescription] = js.undefined
  
  /**
    * The unique identifier for the Dataset to update.
    */
  var datasetId: DatasetId
  
  /**
    * A display title for the Dataset.
    */
  var datasetTitle: DatasetTitle
  
  /**
    * The format in which the Dataset data is structured.    TABULAR – Data is structured in a tabular format.    NON_TABULAR – Data is structured in a non-tabular format.  
    */
  var kind: DatasetKind
  
  /**
    * Definition for a schema on a tabular Dataset.
    */
  var schemaDefinition: js.UndefOr[SchemaUnion] = js.undefined
}
object UpdateDatasetRequest {
  
  inline def apply(datasetId: DatasetId, datasetTitle: DatasetTitle, kind: DatasetKind): UpdateDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], datasetTitle = datasetTitle.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetRequest]
  }
  
  extension [Self <: UpdateDatasetRequest](x: Self) {
    
    inline def setAlias(value: AliasString): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDatasetDescription(value: DatasetDescription): Self = StObject.set(x, "datasetDescription", value.asInstanceOf[js.Any])
    
    inline def setDatasetDescriptionUndefined: Self = StObject.set(x, "datasetDescription", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetTitle(value: DatasetTitle): Self = StObject.set(x, "datasetTitle", value.asInstanceOf[js.Any])
    
    inline def setKind(value: DatasetKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinition(value: SchemaUnion): Self = StObject.set(x, "schemaDefinition", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinitionUndefined: Self = StObject.set(x, "schemaDefinition", js.undefined)
  }
}
