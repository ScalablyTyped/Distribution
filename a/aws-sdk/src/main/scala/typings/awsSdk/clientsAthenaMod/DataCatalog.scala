package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalog extends StObject {
  
  /**
    * An optional description of the data catalog.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The name of the data catalog. The catalog name must be unique for the Amazon Web Services account and can use a maximum of 127 alphanumeric, underscore, at sign, or hyphen characters. The remainder of the length constraint of 256 is reserved for use by Athena.
    */
  var Name: CatalogNameString
  
  /**
    * Specifies the Lambda function or functions to use for the data catalog. This is a mapping whose values depend on the catalog type.    For the HIVE data catalog type, use the following syntax. The metadata-function parameter is required. The sdk-version parameter is optional and defaults to the currently supported version.  metadata-function=lambda_arn, sdk-version=version_number     For the LAMBDA data catalog type, use one of the following sets of required parameters, but not both.   If you have one Lambda function that processes metadata and another for reading the actual data, use the following syntax. Both parameters are required.  metadata-function=lambda_arn, record-function=lambda_arn      If you have a composite Lambda function that processes both metadata and data, use the following syntax to specify your Lambda function.  function=lambda_arn       The GLUE type takes a catalog ID parameter and is required. The  catalog_id  is the account ID of the Amazon Web Services account to which the Glue catalog belongs.  catalog-id=catalog_id     The GLUE data catalog type also applies to the default AwsDataCatalog that already exists in your account, of which you can have only one and cannot modify.   Queries that specify a Glue Data Catalog other than the default AwsDataCatalog must be run on Athena engine version 2.    
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * The type of data catalog to create: LAMBDA for a federated catalog, HIVE for an external hive metastore, or GLUE for an Glue Data Catalog.
    */
  var Type: DataCatalogType
}
object DataCatalog {
  
  inline def apply(Name: CatalogNameString, Type: DataCatalogType): DataCatalog = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalog]
  }
  
  extension [Self <: DataCatalog](x: Self) {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: CatalogNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setType(value: DataCatalogType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
