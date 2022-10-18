package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The credentials Amazon QuickSight that uses to connect to your underlying source. Currently, only credentials based on user name and password are supported.
    */
  var Credentials: js.UndefOr[DataSourceCredentials] = js.undefined
  
  /**
    * An ID for the data source. This ID is unique per Amazon Web Services Region for each Amazon Web Services account. 
    */
  var DataSourceId: ResourceId
  
  /**
    * The parameters that Amazon QuickSight uses to connect to your underlying source.
    */
  var DataSourceParameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataSourceParameters] = js.undefined
  
  /**
    * A display name for the data source.
    */
  var Name: ResourceName
  
  /**
    * A list of resource permissions on the data source.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source.
    */
  var SslProperties: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SslProperties] = js.undefined
  
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of the data source. To return a list of all data sources, use ListDataSources. Use AMAZON_ELASTICSEARCH for Amazon OpenSearch Service.
    */
  var Type: DataSourceType
  
  /**
    * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source.
    */
  var VpcConnectionProperties: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VpcConnectionProperties] = js.undefined
}
object CreateDataSourceRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DataSourceId: ResourceId, Name: ResourceName, Type: DataSourceType): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSourceId = DataSourceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
  
  extension [Self <: CreateDataSourceRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: DataSourceCredentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setDataSourceId(value: ResourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceParameters(value: DataSourceParameters): Self = StObject.set(x, "DataSourceParameters", value.asInstanceOf[js.Any])
    
    inline def setDataSourceParametersUndefined: Self = StObject.set(x, "DataSourceParameters", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setSslProperties(value: SslProperties): Self = StObject.set(x, "SslProperties", value.asInstanceOf[js.Any])
    
    inline def setSslPropertiesUndefined: Self = StObject.set(x, "SslProperties", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectionProperties(value: VpcConnectionProperties): Self = StObject.set(x, "VpcConnectionProperties", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectionPropertiesUndefined: Self = StObject.set(x, "VpcConnectionProperties", js.undefined)
  }
}
