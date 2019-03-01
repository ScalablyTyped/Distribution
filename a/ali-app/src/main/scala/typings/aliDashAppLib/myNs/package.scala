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
  type TextRiskIdentificationType = _TextRiskIdentificationType | java.lang.String
  type onMessageFun = js.Function1[/* p */ js.Any, scala.Unit]
}
