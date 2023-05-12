package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssetsFromLakeFormationTagPolicyResponseDetails extends StObject {
  
  /**
    * The identifier for the AWS Glue Data Catalog.
    */
  var CatalogId: AwsAccountId
  
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id
  
  /**
    * A structure for the database object.
    */
  var Database: js.UndefOr[DatabaseLFTagPolicyAndPermissions] = js.undefined
  
  /**
    * The unique identifier for the revision associated with this import job.
    */
  var RevisionId: Id
  
  /**
    * The IAM role's ARN that allows AWS Data Exchange to assume the role and grant and revoke permissions to AWS Lake Formation data permissions.
    */
  var RoleArn: typings.awsSdk.clientsDataexchangeMod.RoleArn
  
  /**
    * A structure for the table object.
    */
  var Table: js.UndefOr[TableLFTagPolicyAndPermissions] = js.undefined
}
object ImportAssetsFromLakeFormationTagPolicyResponseDetails {
  
  inline def apply(CatalogId: AwsAccountId, DataSetId: Id, RevisionId: Id, RoleArn: RoleArn): ImportAssetsFromLakeFormationTagPolicyResponseDetails = {
    val __obj = js.Dynamic.literal(CatalogId = CatalogId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetsFromLakeFormationTagPolicyResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAssetsFromLakeFormationTagPolicyResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: AwsAccountId): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: DatabaseLFTagPolicyAndPermissions): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTable(value: TableLFTagPolicyAndPermissions): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
