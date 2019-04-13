package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudsearchMod {
  type APIVersion = java.lang.String
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - awsDashSdkLib.awsDashSdkLibStrings.minimal
    - awsDashSdkLib.awsDashSdkLibStrings.light
    - awsDashSdkLib.awsDashSdkLibStrings.full
    - java.lang.String
  */
  type AlgorithmicStemming = _AlgorithmicStemming | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ar
    - awsDashSdkLib.awsDashSdkLibStrings.bg
    - awsDashSdkLib.awsDashSdkLibStrings.ca
    - awsDashSdkLib.awsDashSdkLibStrings.cs
    - awsDashSdkLib.awsDashSdkLibStrings.da
    - awsDashSdkLib.awsDashSdkLibStrings.de
    - awsDashSdkLib.awsDashSdkLibStrings.el
    - awsDashSdkLib.awsDashSdkLibStrings.en
    - awsDashSdkLib.awsDashSdkLibStrings.es
    - awsDashSdkLib.awsDashSdkLibStrings.eu
    - awsDashSdkLib.awsDashSdkLibStrings.fa
    - awsDashSdkLib.awsDashSdkLibStrings.fi
    - awsDashSdkLib.awsDashSdkLibStrings.fr
    - awsDashSdkLib.awsDashSdkLibStrings.ga
    - awsDashSdkLib.awsDashSdkLibStrings.gl
    - awsDashSdkLib.awsDashSdkLibStrings.he
    - awsDashSdkLib.awsDashSdkLibStrings.hi
    - awsDashSdkLib.awsDashSdkLibStrings.hu
    - awsDashSdkLib.awsDashSdkLibStrings.hy
    - awsDashSdkLib.awsDashSdkLibStrings.id
    - awsDashSdkLib.awsDashSdkLibStrings.it
    - awsDashSdkLib.awsDashSdkLibStrings.ja
    - awsDashSdkLib.awsDashSdkLibStrings.ko
    - awsDashSdkLib.awsDashSdkLibStrings.lv
    - awsDashSdkLib.awsDashSdkLibStrings.mul
    - awsDashSdkLib.awsDashSdkLibStrings.nl
    - awsDashSdkLib.awsDashSdkLibStrings.no
    - awsDashSdkLib.awsDashSdkLibStrings.pt
    - awsDashSdkLib.awsDashSdkLibStrings.ro
    - awsDashSdkLib.awsDashSdkLibStrings.ru
    - awsDashSdkLib.awsDashSdkLibStrings.sv
    - awsDashSdkLib.awsDashSdkLibStrings.th
    - awsDashSdkLib.awsDashSdkLibStrings.tr
    - awsDashSdkLib.awsDashSdkLibStrings.`zh-Hans`
    - awsDashSdkLib.awsDashSdkLibStrings.`zh-Hant`
    - java.lang.String
  */
  type AnalysisSchemeLanguage = _AnalysisSchemeLanguage | java.lang.String
  type AnalysisSchemeStatusList = js.Array[AnalysisSchemeStatus]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DomainId = java.lang.String
  type DomainName = java.lang.String
  type DomainNameList = js.Array[DomainName]
  type DomainNameMap = org.scalablytyped.runtime.StringDictionary[APIVersion]
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
    - awsDashSdkLib.awsDashSdkLibStrings.int
    - awsDashSdkLib.awsDashSdkLibStrings.double
    - awsDashSdkLib.awsDashSdkLibStrings.literal
    - awsDashSdkLib.awsDashSdkLibStrings.text
    - awsDashSdkLib.awsDashSdkLibStrings.date
    - awsDashSdkLib.awsDashSdkLibStrings.latlon
    - awsDashSdkLib.awsDashSdkLibStrings.`int-array`
    - awsDashSdkLib.awsDashSdkLibStrings.`double-array`
    - awsDashSdkLib.awsDashSdkLibStrings.`literal-array`
    - awsDashSdkLib.awsDashSdkLibStrings.`text-array`
    - awsDashSdkLib.awsDashSdkLibStrings.`date-array`
    - java.lang.String
  */
  type IndexFieldType = _IndexFieldType | java.lang.String
  type InstanceCount = scala.Double
  type Long = scala.Double
  type MaximumPartitionCount = scala.Double
  type MaximumReplicationCount = scala.Double
  type MultiAZ = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RequiresIndexDocuments
    - awsDashSdkLib.awsDashSdkLibStrings.Processing
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.FailedToValidate
    - java.lang.String
  */
  type OptionState = _OptionState | java.lang.String
  type PartitionCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm1DOTsmall
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm1DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm3DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.searchDOTm3DOT2xlarge
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
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - awsDashSdkLib.awsDashSdkLibStrings.low
    - awsDashSdkLib.awsDashSdkLibStrings.high
    - java.lang.String
  */
  type SuggesterFuzzyMatching = _SuggesterFuzzyMatching | java.lang.String
  type SuggesterStatusList = js.Array[SuggesterStatus]
  type UIntValue = scala.Double
  type UpdateTimestamp = stdLib.Date
  type Word = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2011-02-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-01-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
