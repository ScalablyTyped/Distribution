package typings
package activexDashAccessLib.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WIZ_WIN32_FIND_DATA extends js.Object {
  val cAlternate: activexDashInteropLib.SafeArray[scala.Double]
  val cFileName: activexDashInteropLib.SafeArray[scala.Double]
  val dwFileAttributes: scala.Double
  val dwReserved0: scala.Double
  val dwReserved1: scala.Double
  val ftCreationTime: WIZ_FILETIME
  val ftLastAccessTime: WIZ_FILETIME
  val ftLastWriteTime: WIZ_FILETIME
  val nFileSizeHigh: scala.Double
  val nFileSizeLow: scala.Double
}

object WIZ_WIN32_FIND_DATA {
  @scala.inline
  def apply(
    cAlternate: activexDashInteropLib.SafeArray[scala.Double],
    cFileName: activexDashInteropLib.SafeArray[scala.Double],
    dwFileAttributes: scala.Double,
    dwReserved0: scala.Double,
    dwReserved1: scala.Double,
    ftCreationTime: WIZ_FILETIME,
    ftLastAccessTime: WIZ_FILETIME,
    ftLastWriteTime: WIZ_FILETIME,
    nFileSizeHigh: scala.Double,
    nFileSizeLow: scala.Double
  ): WIZ_WIN32_FIND_DATA = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cAlternate")(cAlternate)
    __obj.updateDynamic("cFileName")(cFileName)
    __obj.updateDynamic("dwFileAttributes")(dwFileAttributes)
    __obj.updateDynamic("dwReserved0")(dwReserved0)
    __obj.updateDynamic("dwReserved1")(dwReserved1)
    __obj.updateDynamic("ftCreationTime")(ftCreationTime)
    __obj.updateDynamic("ftLastAccessTime")(ftLastAccessTime)
    __obj.updateDynamic("ftLastWriteTime")(ftLastWriteTime)
    __obj.updateDynamic("nFileSizeHigh")(nFileSizeHigh)
    __obj.updateDynamic("nFileSizeLow")(nFileSizeLow)
    __obj.asInstanceOf[WIZ_WIN32_FIND_DATA]
  }
}

