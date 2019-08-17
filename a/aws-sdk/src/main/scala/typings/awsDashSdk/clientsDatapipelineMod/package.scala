package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsDatapipelineMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQ
    - typings.awsDashSdk.awsDashSdkStrings.REF_EQ
    - typings.awsDashSdk.awsDashSdkStrings.LE
    - typings.awsDashSdk.awsDashSdkStrings.GE
    - typings.awsDashSdk.awsDashSdkStrings.BETWEEN
    - java.lang.String
  */
  type OperatorType = _OperatorType | String
  type ParameterAttributeList = js.Array[ParameterAttribute]
  type ParameterObjectList = js.Array[ParameterObject]
  type ParameterValueList = js.Array[ParameterValue]
  type PipelineDescriptionList = js.Array[PipelineDescription]
  type PipelineObjectList = js.Array[PipelineObject]
  type PipelineObjectMap = StringDictionary[PipelineObject]
  type SelectorList = js.Array[Selector]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FINISHED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.FALSE
    - java.lang.String
  */
  type TaskStatus = _TaskStatus | String
  type ValidationErrors = js.Array[ValidationError]
  type ValidationWarnings = js.Array[ValidationWarning]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-10-29`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type attributeNameString = String
  type attributeValueString = String
  type cancelActive = Boolean
  type errorMessage = String
  type fieldList = js.Array[Field]
  type fieldNameString = String
  type fieldStringValue = String
  type id = String
  type idList = js.Array[id]
  type int = Double
  type longString = String
  type pipelineList = js.Array[PipelineIdName]
  type stringList = js.Array[String]
  type tagKey = String
  type tagList = js.Array[Tag]
  type tagValue = String
  type taskId = String
  type timestamp = Date
  type validationMessage = String
  type validationMessages = js.Array[validationMessage]
}
