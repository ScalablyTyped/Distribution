package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 扫码 https://docs.alipay.com/mini/api/scan
/* Rewritten from type alias, can be one of: 
  - typings.aliDashApp.aliDashAppStrings.qr
  - typings.aliDashApp.aliDashAppStrings.bar
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def bar: typings.aliDashApp.aliDashAppStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qr: typings.aliDashApp.aliDashAppStrings.qr = this.cast("qr")
}

