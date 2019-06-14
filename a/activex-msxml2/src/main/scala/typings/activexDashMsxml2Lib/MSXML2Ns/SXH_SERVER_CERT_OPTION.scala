package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Flags for SXH_OPTION_IGNORE_SERVER_SSL_CERT_ERROR_FLAGS option */
/* Rewritten from type alias, can be one of: 
  - activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`13056`
  - activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`4096`
  - activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`8192`
  - activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`256`
  - activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`512`
*/
trait SXH_SERVER_CERT_OPTION extends js.Object

object SXH_SERVER_CERT_OPTION {
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_ALL_SERVER_ERRORS: activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`13056` = this.cast(13056)
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_CERT_CN_INVALID: activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`4096` = this.cast(4096)
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_CERT_DATE_INVALID: activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`8192` = this.cast(8192)
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_UNKNOWN_CA: activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`256` = this.cast(256)
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_WRONG_USAGE: activexDashMsxml2Lib.activexDashMsxml2LibNumbers.`512` = this.cast(512)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

