package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object myNs {
  type Color = java.lang.String | js.Array[scala.Double] | scala.Double | CanvasAction
  type EventType = aliDashAppLib.aliDashAppLibStrings.input | aliDashAppLib.aliDashAppLibStrings.form | aliDashAppLib.aliDashAppLibStrings.submit | aliDashAppLib.aliDashAppLibStrings.scroll | TouchEventType | TransitionEventType | aliDashAppLib.aliDashAppLibStrings.tap | aliDashAppLib.aliDashAppLibStrings.longpress
  //#region 图片 https://docs.alipay.com/mini/api/media-image
  type ImageSourceType = aliDashAppLib.aliDashAppLibStrings.album | aliDashAppLib.aliDashAppLibStrings.camera
  type NetworkType = aliDashAppLib.aliDashAppLibStrings.UNKNOWN | aliDashAppLib.aliDashAppLibStrings.NOTREACHABLE | aliDashAppLib.aliDashAppLibStrings.WIFI | aliDashAppLib.aliDashAppLibStrings.`3G` | aliDashAppLib.aliDashAppLibStrings.`2G` | aliDashAppLib.aliDashAppLibStrings.`4G` | aliDashAppLib.aliDashAppLibStrings.WWAN
  type RemoveSavedFileOptions = GetSavedFileInfoOptions
  //#endregion
  //#region 文本风险识别 https://docs.alipay.com/mini/api/text-identification
  type TextRiskIdentificationType = aliDashAppLib.aliDashAppLibStrings.keyword | aliDashAppLib.aliDashAppLibStrings.`0` | aliDashAppLib.aliDashAppLibStrings.`1` | aliDashAppLib.aliDashAppLibStrings.`2` | aliDashAppLib.aliDashAppLibStrings.`3` | java.lang.String
  //#endregion
  //#region 动画 https://docs.alipay.com/mini/api/ui-animation
  type TimingFunction = aliDashAppLib.aliDashAppLibStrings.linear | aliDashAppLib.aliDashAppLibStrings.ease | aliDashAppLib.aliDashAppLibStrings.`ease-in` | aliDashAppLib.aliDashAppLibStrings.`ease-in-out` | aliDashAppLib.aliDashAppLibStrings.`ease-out` | aliDashAppLib.aliDashAppLibStrings.`step-start` | aliDashAppLib.aliDashAppLibStrings.`step-end`
  type TouchEventType = aliDashAppLib.aliDashAppLibStrings.tap | aliDashAppLib.aliDashAppLibStrings.touchstart | aliDashAppLib.aliDashAppLibStrings.touchmove | aliDashAppLib.aliDashAppLibStrings.touchcancel | aliDashAppLib.aliDashAppLibStrings.touchend | aliDashAppLib.aliDashAppLibStrings.touchforcechange
  type TransitionEventType = aliDashAppLib.aliDashAppLibStrings.transitionend | aliDashAppLib.aliDashAppLibStrings.animationstart | aliDashAppLib.aliDashAppLibStrings.animationiteration | aliDashAppLib.aliDashAppLibStrings.animationend
  type onMessageFun = js.Function1[/* p */ js.Any, scala.Unit]
  //#region 扫码 https://docs.alipay.com/mini/api/scan
  type scanType = aliDashAppLib.aliDashAppLibStrings.qr | aliDashAppLib.aliDashAppLibStrings.bar
}
