package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object my {
  import org.scalablytyped.runtime.StringDictionary

  type Color = String | js.Array[Double] | Double | CanvasAction
  type RemoveSavedFileOptions = GetSavedFileInfoOptions
  //#region 网络 https://docs.alipay.com/mini/api/network
  type RequestHeader = StringDictionary[String]
  //#endregion
  //#region 文本风险识别 https://docs.alipay.com/mini/api/text-identification
  /* Rewritten from type alias, can be one of: 
    - typings.aliDashApp.aliDashAppStrings.keyword
    - typings.aliDashApp.aliDashAppStrings.`0`
    - typings.aliDashApp.aliDashAppStrings.`1`
    - typings.aliDashApp.aliDashAppStrings.`2`
    - typings.aliDashApp.aliDashAppStrings.`3`
    - java.lang.String
  */
  type TextRiskIdentificationType = _TextRiskIdentificationType | String
  type onMessageFun = js.Function1[/* p */ js.Any, Unit]
}
