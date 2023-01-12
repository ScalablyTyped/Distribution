package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfiguration extends StObject {
  
  /**
    * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
  
  /**
    * Specifies the name of the AWS Glue database that contains the schema for the output data.  If the SchemaConfiguration request parameter is used as part of invoking the CreateDeliveryStream API, then the DatabaseName property is required and its value must be specified. 
    */
  var DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
  
  /**
    * If you don't specify an AWS Region, the default is the current Region.
    */
  var Region: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
  
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.  If the SchemaConfiguration request parameter is used as part of invoking the CreateDeliveryStream API, then the RoleARN property is required and its value must be specified. 
    */
  var RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
  
  /**
    * Specifies the AWS Glue table that contains the column information that constitutes your data schema.  If the SchemaConfiguration request parameter is used as part of invoking the CreateDeliveryStream API, then the TableName property is required and its value must be specified. 
    */
  var TableName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
  
  /**
    * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to LATEST, Kinesis Data Firehose uses the most recent version. This means that any updates to the table are automatically picked up.
    */
  var VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
}
object SchemaConfiguration {
  
  inline def apply(): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: NonEmptyStringWithoutWhitespace): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NonEmptyStringWithoutWhitespace): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setRegion(value: NonEmptyStringWithoutWhitespace): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setRoleARN(value: NonEmptyStringWithoutWhitespace): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setTableName(value: NonEmptyStringWithoutWhitespace): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setVersionId(value: NonEmptyStringWithoutWhitespace): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
