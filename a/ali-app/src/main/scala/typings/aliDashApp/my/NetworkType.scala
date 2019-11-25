package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliDashApp.aliDashAppStrings.UNKNOWN
  - typings.aliDashApp.aliDashAppStrings.NOTREACHABLE
  - typings.aliDashApp.aliDashAppStrings.WIFI
  - typings.aliDashApp.aliDashAppStrings.`3G`
  - typings.aliDashApp.aliDashAppStrings.`2G`
  - typings.aliDashApp.aliDashAppStrings.`4G`
  - typings.aliDashApp.aliDashAppStrings.WWAN
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  def `2G`: typings.aliDashApp.aliDashAppStrings.`2G` = this.cast("2G")
  @scala.inline
  def `3G`: typings.aliDashApp.aliDashAppStrings.`3G` = this.cast("3G")
  @scala.inline
  def `4G`: typings.aliDashApp.aliDashAppStrings.`4G` = this.cast("4G")
  @scala.inline
  def NOTREACHABLE: typings.aliDashApp.aliDashAppStrings.NOTREACHABLE = this.cast("NOTREACHABLE")
  @scala.inline
  def UNKNOWN: typings.aliDashApp.aliDashAppStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def WIFI: typings.aliDashApp.aliDashAppStrings.WIFI = this.cast("WIFI")
  @scala.inline
  def WWAN: typings.aliDashApp.aliDashAppStrings.WWAN = this.cast("WWAN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

