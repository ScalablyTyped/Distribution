package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AWSXRAY
import typings.awsSdk.awsSdkStrings.BRANCH
import typings.awsSdk.awsSdkStrings.GITHUB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ASConfigMaxConcurrency = Double

type ASConfigMaxSize = Double

type ASConfigMinSize = Double

type AppRunnerResourceArn = java.lang.String

type AutoScalingConfigurationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AutoScalingConfigurationStatus = _AutoScalingConfigurationStatus | java.lang.String

type AutoScalingConfigurationSummaryList = js.Array[AutoScalingConfigurationSummary]

type Boolean = scala.Boolean

type BuildCommand = java.lang.String

type CertificateValidationRecordList = js.Array[CertificateValidationRecord]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CertificateValidationRecordStatus = _CertificateValidationRecordStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REPOSITORY
  - typings.awsSdk.awsSdkStrings.API
  - java.lang.String
*/
type ConfigurationSource = _ConfigurationSource | java.lang.String

type ConnectionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_HANDSHAKE
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ConnectionStatus = _ConnectionStatus | java.lang.String

type ConnectionSummaryList = js.Array[ConnectionSummary]

type Cpu = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.PENDING_CERTIFICATE_DNS_VALIDATION
  - typings.awsSdk.awsSdkStrings.BINDING_CERTIFICATE
  - java.lang.String
*/
type CustomDomainAssociationStatus = _CustomDomainAssociationStatus | java.lang.String

type CustomDomainList = js.Array[CustomDomain]

type DescribeCustomDomainsMaxResults = Double

type DomainName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.VPC
  - java.lang.String
*/
type EgressType = _EgressType | java.lang.String

type HealthCheckHealthyThreshold = Double

type HealthCheckInterval = Double

type HealthCheckPath = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TCP
  - typings.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type HealthCheckProtocol = _HealthCheckProtocol | java.lang.String

type HealthCheckTimeout = Double

type HealthCheckUnhealthyThreshold = Double

type ImageIdentifier = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ECR
  - typings.awsSdk.awsSdkStrings.ECR_PUBLIC
  - java.lang.String
*/
type ImageRepositoryType = _ImageRepositoryType | java.lang.String

type Integer = Double

type KmsKeyArn = java.lang.String

type ListOperationsMaxResults = Double

type MaxResults = Double

type Memory = java.lang.String

type NextToken = java.lang.String

type NullableBoolean = scala.Boolean

type ObservabilityConfigurationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type ObservabilityConfigurationStatus = _ObservabilityConfigurationStatus | java.lang.String

type ObservabilityConfigurationSummaryList = js.Array[ObservabilityConfigurationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.ROLLBACK_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ROLLBACK_FAILED
  - typings.awsSdk.awsSdkStrings.ROLLBACK_SUCCEEDED
  - java.lang.String
*/
type OperationStatus = _OperationStatus | java.lang.String

type OperationSummaryList = js.Array[OperationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START_DEPLOYMENT
  - typings.awsSdk.awsSdkStrings.CREATE_SERVICE
  - typings.awsSdk.awsSdkStrings.PAUSE_SERVICE
  - typings.awsSdk.awsSdkStrings.RESUME_SERVICE
  - typings.awsSdk.awsSdkStrings.DELETE_SERVICE
  - java.lang.String
*/
type OperationType = _OperationType | java.lang.String

type ProviderType = GITHUB | java.lang.String

type RoleArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PYTHON_3
  - typings.awsSdk.awsSdkStrings.NODEJS_12
  - typings.awsSdk.awsSdkStrings.NODEJS_14
  - typings.awsSdk.awsSdkStrings.CORRETTO_8
  - typings.awsSdk.awsSdkStrings.CORRETTO_11
  - typings.awsSdk.awsSdkStrings.NODEJS_16
  - typings.awsSdk.awsSdkStrings.GO_1
  - typings.awsSdk.awsSdkStrings.DOTNET_6
  - typings.awsSdk.awsSdkStrings.PHP_81
  - typings.awsSdk.awsSdkStrings.RUBY_31
  - java.lang.String
*/
type Runtime = _Runtime | java.lang.String

type RuntimeEnvironmentVariables = StringDictionary[RuntimeEnvironmentVariablesValue]

type RuntimeEnvironmentVariablesKey = java.lang.String

type RuntimeEnvironmentVariablesValue = java.lang.String

type ServiceId = java.lang.String

type ServiceMaxResults = Double

type ServiceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.OPERATION_IN_PROGRESS
  - java.lang.String
*/
type ServiceStatus = _ServiceStatus | java.lang.String

type ServiceSummaryList = js.Array[ServiceSummary]

type SourceCodeVersionType = BRANCH | java.lang.String

type StartCommand = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type TracingVendor = AWSXRAY | java.lang.String

type UUID = java.lang.String

type VpcConnectorName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type VpcConnectorStatus = _VpcConnectorStatus | java.lang.String

type VpcConnectors = js.Array[VpcConnector]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-05-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
