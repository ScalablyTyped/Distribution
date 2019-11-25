package typings.activexDashAccess.AccWizObjects

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WIZ_WIN32_FIND_DATA extends js.Object {
  val cAlternate: SafeArray[Double]
  val cFileName: SafeArray[Double]
  val dwFileAttributes: Double
  val dwReserved0: Double
  val dwReserved1: Double
  val ftCreationTime: WIZ_FILETIME
  val ftLastAccessTime: WIZ_FILETIME
  val ftLastWriteTime: WIZ_FILETIME
  val nFileSizeHigh: Double
  val nFileSizeLow: Double
}

object WIZ_WIN32_FIND_DATA {
  @scala.inline
  def apply(
    cAlternate: SafeArray[Double],
    cFileName: SafeArray[Double],
    dwFileAttributes: Double,
    dwReserved0: Double,
    dwReserved1: Double,
    ftCreationTime: WIZ_FILETIME,
    ftLastAccessTime: WIZ_FILETIME,
    ftLastWriteTime: WIZ_FILETIME,
    nFileSizeHigh: Double,
    nFileSizeLow: Double
  ): WIZ_WIN32_FIND_DATA = {
    val __obj = js.Dynamic.literal(cAlternate = cAlternate.asInstanceOf[js.Any], cFileName = cFileName.asInstanceOf[js.Any], dwFileAttributes = dwFileAttributes.asInstanceOf[js.Any], dwReserved0 = dwReserved0.asInstanceOf[js.Any], dwReserved1 = dwReserved1.asInstanceOf[js.Any], ftCreationTime = ftCreationTime.asInstanceOf[js.Any], ftLastAccessTime = ftLastAccessTime.asInstanceOf[js.Any], ftLastWriteTime = ftLastWriteTime.asInstanceOf[js.Any], nFileSizeHigh = nFileSizeHigh.asInstanceOf[js.Any], nFileSizeLow = nFileSizeLow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WIZ_WIN32_FIND_DATA]
  }
}

