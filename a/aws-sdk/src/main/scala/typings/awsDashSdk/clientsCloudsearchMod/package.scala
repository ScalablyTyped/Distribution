package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudsearchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type APIVersion = java.lang.String
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.none__
    - typings.awsDashSdk.awsDashSdkStrings.minimal
    - typings.awsDashSdk.awsDashSdkStrings.light
    - typings.awsDashSdk.awsDashSdkStrings.full_
    - java.lang.String
  */
  type AlgorithmicStemming = _AlgorithmicStemming | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ar_
    - typings.awsDashSdk.awsDashSdkStrings.bg_
    - typings.awsDashSdk.awsDashSdkStrings.ca_
    - typings.awsDashSdk.awsDashSdkStrings.cs
    - typings.awsDashSdk.awsDashSdkStrings.da
    - typings.awsDashSdk.awsDashSdkStrings.de_
    - typings.awsDashSdk.awsDashSdkStrings.el
    - typings.awsDashSdk.awsDashSdkStrings.en
    - typings.awsDashSdk.awsDashSdkStrings.es_
    - typings.awsDashSdk.awsDashSdkStrings.eu_
    - typings.awsDashSdk.awsDashSdkStrings.fa
    - typings.awsDashSdk.awsDashSdkStrings.fi_
    - typings.awsDashSdk.awsDashSdkStrings.fr_
    - typings.awsDashSdk.awsDashSdkStrings.ga_
    - typings.awsDashSdk.awsDashSdkStrings.gl_
    - typings.awsDashSdk.awsDashSdkStrings.he
    - typings.awsDashSdk.awsDashSdkStrings.hi
    - typings.awsDashSdk.awsDashSdkStrings.hu_
    - typings.awsDashSdk.awsDashSdkStrings.hy
    - typings.awsDashSdk.awsDashSdkStrings.id__
    - typings.awsDashSdk.awsDashSdkStrings.it_
    - typings.awsDashSdk.awsDashSdkStrings.ja
    - typings.awsDashSdk.awsDashSdkStrings.ko
    - typings.awsDashSdk.awsDashSdkStrings.lv_
    - typings.awsDashSdk.awsDashSdkStrings.mul
    - typings.awsDashSdk.awsDashSdkStrings.nl_
    - typings.awsDashSdk.awsDashSdkStrings.no_
    - typings.awsDashSdk.awsDashSdkStrings.pt_
    - typings.awsDashSdk.awsDashSdkStrings.ro_
    - typings.awsDashSdk.awsDashSdkStrings.ru_
    - typings.awsDashSdk.awsDashSdkStrings.sv_
    - typings.awsDashSdk.awsDashSdkStrings.th_
    - typings.awsDashSdk.awsDashSdkStrings.tr_
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
    - typings.awsDashSdk.awsDashSdkStrings.text_
    - typings.awsDashSdk.awsDashSdkStrings.date_
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
    - typings.awsDashSdk.awsDashSdkStrings.Processing_
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.FailedToValidate
    - java.lang.String
  */
  type OptionState = _OptionState | java.lang.String
  type PartitionCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.searchDotm1Dotsmall
    - typings.awsDashSdk.awsDashSdkStrings.searchDotm1Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDotm2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDotm2Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDotm3Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.searchDotm3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDotm3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.searchDotm3Dot2xlarge
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
    - typings.awsDashSdk.awsDashSdkStrings.none__
    - typings.awsDashSdk.awsDashSdkStrings.low__
    - typings.awsDashSdk.awsDashSdkStrings.high__
    - java.lang.String
  */
  type SuggesterFuzzyMatching = _SuggesterFuzzyMatching | java.lang.String
  type SuggesterStatusList = js.Array[SuggesterStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`Policy-Min-TLS-1-0-2019-07`
    - typings.awsDashSdk.awsDashSdkStrings.`Policy-Min-TLS-1-2-2019-07`
    - java.lang.String
  */
  type TLSSecurityPolicy = _TLSSecurityPolicy | java.lang.String
  type UIntValue = scala.Double
  type UpdateTimestamp = Date
  type Word = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2011-02-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2013-01-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
