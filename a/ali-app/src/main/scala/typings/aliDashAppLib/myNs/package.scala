package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object myNs {
  type Color = java.lang.String | js.Array[scala.Double] | scala.Double | CanvasAction
  type RemoveSavedFileOptions = GetSavedFileInfoOptions
  //#endregion
  //#region 文本风险识别 https://docs.alipay.com/mini/api/text-identification
  /* Rewritten from type alias, can be one of: 
    - aliDashAppLib.aliDashAppLibStrings.keyword
    - aliDashAppLib.aliDashAppLibStrings.`0`
    - aliDashAppLib.aliDashAppLibStrings.`1`
    - aliDashAppLib.aliDashAppLibStrings.`2`
    - aliDashAppLib.aliDashAppLibStrings.`3`
    - java.lang.String
  */
  type TextRiskIdentificationType = _TextRiskIdentificationType | java.lang.String
  type onMessageFun = js.Function1[/* p */ js.Any, scala.Unit]
}
