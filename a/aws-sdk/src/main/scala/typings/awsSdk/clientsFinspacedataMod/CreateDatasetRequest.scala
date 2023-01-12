package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    * The unique resource identifier for a Dataset.
    */
  var alias: js.UndefOr[AliasString] = js.undefined
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * Description of a Dataset.
    */
  var datasetDescription: js.UndefOr[DatasetDescription] = js.undefined
  
  /**
    * Display title for a FinSpace Dataset.
    */
  var datasetTitle: DatasetTitle
  
  /**
    * The format in which Dataset data is structured.    TABULAR – Data is structured in a tabular format.    NON_TABULAR – Data is structured in a non-tabular format.  
    */
  var kind: DatasetKind
  
  /**
    * Contact information for a Dataset owner.
    */
  var ownerInfo: js.UndefOr[DatasetOwnerInfo] = js.undefined
  
  /**
    * Permission group parameters for Dataset permissions.
    */
  var permissionGroupParams: PermissionGroupParams
  
  /**
    * Definition for a schema on a tabular Dataset.
    */
  var schemaDefinition: js.UndefOr[SchemaUnion] = js.undefined
}
object CreateDatasetRequest {
  
  inline def apply(datasetTitle: DatasetTitle, kind: DatasetKind, permissionGroupParams: PermissionGroupParams): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetTitle = datasetTitle.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], permissionGroupParams = permissionGroupParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: AliasString): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDatasetDescription(value: DatasetDescription): Self = StObject.set(x, "datasetDescription", value.asInstanceOf[js.Any])
    
    inline def setDatasetDescriptionUndefined: Self = StObject.set(x, "datasetDescription", js.undefined)
    
    inline def setDatasetTitle(value: DatasetTitle): Self = StObject.set(x, "datasetTitle", value.asInstanceOf[js.Any])
    
    inline def setKind(value: DatasetKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOwnerInfo(value: DatasetOwnerInfo): Self = StObject.set(x, "ownerInfo", value.asInstanceOf[js.Any])
    
    inline def setOwnerInfoUndefined: Self = StObject.set(x, "ownerInfo", js.undefined)
    
    inline def setPermissionGroupParams(value: PermissionGroupParams): Self = StObject.set(x, "permissionGroupParams", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinition(value: SchemaUnion): Self = StObject.set(x, "schemaDefinition", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinitionUndefined: Self = StObject.set(x, "schemaDefinition", js.undefined)
  }
}
