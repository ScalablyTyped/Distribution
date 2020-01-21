package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 扫码 https://docs.alipay.com/mini/api/scan
/* Rewritten from type alias, can be one of: 
  - typings.aliApp.aliAppStrings.qr
  - typings.aliApp.aliAppStrings.bar
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def bar: typings.aliApp.aliAppStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qr: typings.aliApp.aliAppStrings.qr = this.cast("qr")
}

