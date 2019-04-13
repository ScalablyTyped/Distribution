package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDatapipelineMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQ
    - awsDashSdkLib.awsDashSdkLibStrings.REF_EQ
    - awsDashSdkLib.awsDashSdkLibStrings.LE
    - awsDashSdkLib.awsDashSdkLibStrings.GE
    - awsDashSdkLib.awsDashSdkLibStrings.BETWEEN
    - java.lang.String
  */
  type OperatorType = _OperatorType | java.lang.String
  type ParameterAttributeList = js.Array[ParameterAttribute]
  type ParameterObjectList = js.Array[ParameterObject]
  type ParameterValueList = js.Array[ParameterValue]
  type PipelineDescriptionList = js.Array[PipelineDescription]
  type PipelineObjectList = js.Array[PipelineObject]
  type PipelineObjectMap = org.scalablytyped.runtime.StringDictionary[PipelineObject]
  type SelectorList = js.Array[Selector]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FINISHED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.FALSE
    - java.lang.String
  */
  type TaskStatus = _TaskStatus | java.lang.String
  type ValidationErrors = js.Array[ValidationError]
  type ValidationWarnings = js.Array[ValidationWarning]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-10-29`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type attributeNameString = java.lang.String
  type attributeValueString = java.lang.String
  type cancelActive = scala.Boolean
  type errorMessage = java.lang.String
  type fieldList = js.Array[Field]
  type fieldNameString = java.lang.String
  type fieldStringValue = java.lang.String
  type id = java.lang.String
  type idList = js.Array[id]
  type int = scala.Double
  type longString = java.lang.String
  type pipelineList = js.Array[PipelineIdName]
  type stringList = js.Array[java.lang.String]
  type tagKey = java.lang.String
  type tagList = js.Array[Tag]
  type tagValue = java.lang.String
  type taskId = java.lang.String
  type timestamp = stdLib.Date
  type validationMessage = java.lang.String
  type validationMessages = js.Array[validationMessage]
}
