package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudsearchMod {
  type APIVersion = java.lang.String
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.none
    - typings.awsDashSdk.awsDashSdkStrings.minimal
    - typings.awsDashSdk.awsDashSdkStrings.light
    - typings.awsDashSdk.awsDashSdkStrings.full
    - java.lang.String
  */
  type AlgorithmicStemming = _AlgorithmicStemming | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ar
    - typings.awsDashSdk.awsDashSdkStrings.bg
    - typings.awsDashSdk.awsDashSdkStrings.ca
    - typings.awsDashSdk.awsDashSdkStrings.cs
    - typings.awsDashSdk.awsDashSdkStrings.da
    - typings.awsDashSdk.awsDashSdkStrings.de
    - typings.awsDashSdk.awsDashSdkStrings.el
    - typings.awsDashSdk.awsDashSdkStrings.en
    - typings.awsDashSdk.awsDashSdkStrings.es
    - typings.awsDashSdk.awsDashSdkStrings.eu
    - typings.awsDashSdk.awsDashSdkStrings.fa
    - typings.awsDashSdk.awsDashSdkStrings.fi
    - typings.awsDashSdk.awsDashSdkStrings.fr
    - typings.awsDashSdk.awsDashSdkStrings.ga
    - typings.awsDashSdk.awsDashSdkStrings.gl
    - typings.awsDashSdk.awsDashSdkStrings.he
    - typings.awsDashSdk.awsDashSdkStrings.hi
    - typings.awsDashSdk.awsDashSdkStrings.hu
    - typings.awsDashSdk.awsDashSdkStrings.hy
    - typings.awsDashSdk.awsDashSdkStrings.id
    - typings.awsDashSdk.awsDashSdkStrings.it
    - typings.awsDashSdk.awsDashSdkStrings.ja
    - typings.awsDashSdk.awsDashSdkStrings.ko
    - typings.awsDashSdk.awsDashSdkStrings.lv
    - typings.awsDashSdk.awsDashSdkStrings.mul
    - typings.awsDashSdk.awsDashSdkStrings.nl
    - typings.awsDashSdk.awsDashSdkStrings.no
    - typings.awsDashSdk.awsDashSdkStrings.pt
    - typings.awsDashSdk.awsDashSdkStrings.ro
    - typings.awsDashSdk.awsDashSdkStrings.ru
    - typings.awsDashSdk.awsDashSdkStrings.sv
    - typings.awsDashSdk.awsDashSdkStrings.th
    - typings.awsDashSdk.awsDashSdkStrings.tr
    - typings.awsDashSdk.awsDashSdkStrings.`zh-Hans`
    - typings.awsDashSdk.awsDashSdkStrings.`zh-Hant`
    - java.lang.String
  */
  type AnalysisSchemeLanguage = _AnalysisSchemeLanguage | java.lang.String
  type AnalysisSchemeStatusList = js.Array[AnalysisSchemeStatus]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DomainId = java.lang.String
  type DomainName = java.lang.String
  type DomainNameList = js.Array[DomainName]
  type DomainNameMap = StringDictionary[APIVersion]
  type DomainStatusList = js.Array[DomainStatus]
  type Double = scala.Double
  type DynamicFieldName = java.lang.String
  type DynamicFieldNameList = js.Array[DynamicFieldName]
  type ExpressionStatusList = js.Array[ExpressionStatus]
  type ExpressionValue = java.lang.String
  type FieldName = java.lang.String
  type FieldNameCommaList = java.lang.String
  type FieldNameList = js.Array[FieldName]
  type FieldValue = java.lang.String
  type IndexFieldStatusList = js.Array[IndexFieldStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.int
    - typings.awsDashSdk.awsDashSdkStrings.double
    - typings.awsDashSdk.awsDashSdkStrings.literal
    - typings.awsDashSdk.awsDashSdkStrings.text
    - typings.awsDashSdk.awsDashSdkStrings.date
    - typings.awsDashSdk.awsDashSdkStrings.latlon
    - typings.awsDashSdk.awsDashSdkStrings.`int-array`
    - typings.awsDashSdk.awsDashSdkStrings.`double-array`
    - typings.awsDashSdk.awsDashSdkStrings.`literal-array`
    - typings.awsDashSdk.awsDashSdkStrings.`text-array`
    - typings.awsDashSdk.awsDashSdkStrings.`date-array`
    - java.lang.String
  */
  type IndexFieldType = _IndexFieldType | java.lang.String
  type InstanceCount = scala.Double
  type Long = scala.Double
  type MaximumPartitionCount = scala.Double
  type MaximumReplicationCount = scala.Double
  type MultiAZ = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RequiresIndexDocuments
    - typings.awsDashSdk.awsDashSdkStrings.Processing
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.FailedToValidate
    - java.lang.String
  */
  type OptionState = _OptionState | java.lang.String
  type PartitionCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.searchDOTm1DOTsmall
    - typings.awsDashSdk.awsDashSdkStrings.searchDOTm1DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDOTm2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDOTm2DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDOTm3DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.searchDOTm3DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDOTm3DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDOTm3DOT2xlarge
    - java.lang.String
  */
  type PartitionInstanceType = _PartitionInstanceType | java.lang.String
  type PolicyDocument = java.lang.String
  type SearchInstanceType = java.lang.String
  type ServiceUrl = java.lang.String
  type StandardName = java.lang.String
  type StandardNameList = js.Array[StandardName]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.none
    - typings.awsDashSdk.awsDashSdkStrings.low
    - typings.awsDashSdk.awsDashSdkStrings.high
    - java.lang.String
  */
  type SuggesterFuzzyMatching = _SuggesterFuzzyMatching | java.lang.String
  type SuggesterStatusList = js.Array[SuggesterStatus]
  type UIntValue = scala.Double
  type UpdateTimestamp = Date
  type Word = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2011-02-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2013-01-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
