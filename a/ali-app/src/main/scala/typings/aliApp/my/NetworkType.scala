package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliApp.aliAppStrings.UNKNOWN
  - typings.aliApp.aliAppStrings.NOTREACHABLE
  - typings.aliApp.aliAppStrings.WIFI
  - typings.aliApp.aliAppStrings.`3G`
  - typings.aliApp.aliAppStrings.`2G`
  - typings.aliApp.aliAppStrings.`4G`
  - typings.aliApp.aliAppStrings.WWAN
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  def `2G`: typings.aliApp.aliAppStrings.`2G` = this.cast("2G")
  @scala.inline
  def `3G`: typings.aliApp.aliAppStrings.`3G` = this.cast("3G")
  @scala.inline
  def `4G`: typings.aliApp.aliAppStrings.`4G` = this.cast("4G")
  @scala.inline
  def NOTREACHABLE: typings.aliApp.aliAppStrings.NOTREACHABLE = this.cast("NOTREACHABLE")
  @scala.inline
  def UNKNOWN: typings.aliApp.aliAppStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def WIFI: typings.aliApp.aliAppStrings.WIFI = this.cast("WIFI")
  @scala.inline
  def WWAN: typings.aliApp.aliAppStrings.WWAN = this.cast("WWAN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

