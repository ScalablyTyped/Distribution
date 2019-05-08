package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAppsyncMod {
  type AdditionalAuthenticationProviders = js.Array[AdditionalAuthenticationProvider]
  type ApiKeys = js.Array[ApiKey]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.API_KEY
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_IAM
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON_COGNITO_USER_POOLS
    - awsDashSdkLib.awsDashSdkLibStrings.OPENID_CONNECT
    - java.lang.String
  */
  type AuthenticationType = _AuthenticationType | java.lang.String
  type AuthorizationType = awsDashSdkLib.awsDashSdkLibStrings.AWS_IAM | java.lang.String
  type Boolean = scala.Boolean
  type BooleanValue = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_LAMBDA
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON_DYNAMODB
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON_ELASTICSEARCH
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.HTTP
    - awsDashSdkLib.awsDashSdkLibStrings.RELATIONAL_DATABASE
    - java.lang.String
  */
  type DataSourceType = _DataSourceType | java.lang.String
  type DataSources = js.Array[DataSource]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALLOW
    - awsDashSdkLib.awsDashSdkLibStrings.DENY
    - java.lang.String
  */
  type DefaultAction = _DefaultAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type FieldLogLevel = _FieldLogLevel | java.lang.String
  type Functions = js.Array[FunctionConfiguration]
  type FunctionsIds = js.Array[String]
  type GraphqlApis = js.Array[GraphqlApi]
  type Long = scala.Double
  type MapOfStringToString = org.scalablytyped.runtime.StringDictionary[String]
  type MappingTemplate = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SDL
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - java.lang.String
  */
  type OutputType = _OutputType | java.lang.String
  type PaginationToken = java.lang.String
  type RelationalDatabaseSourceType = awsDashSdkLib.awsDashSdkLibStrings.RDS_HTTP_ENDPOINT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNIT
    - awsDashSdkLib.awsDashSdkLibStrings.PIPELINE
    - java.lang.String
  */
  type ResolverKind = _ResolverKind | java.lang.String
  type Resolvers = js.Array[Resolver]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PROCESSING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_APPLICABLE
    - java.lang.String
  */
  type SchemaStatus = _SchemaStatus | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SDL
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - java.lang.String
  */
  type TypeDefinitionFormat = _TypeDefinitionFormat | java.lang.String
  type TypeList = js.Array[Type]
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-07-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
