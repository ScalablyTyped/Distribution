package typings.activexAccess.AccWizObjects

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WIZ_WIN32_FIND_DATA extends js.Object {
  val cAlternate: SafeArray[Double] = js.native
  val cFileName: SafeArray[Double] = js.native
  val dwFileAttributes: Double = js.native
  val dwReserved0: Double = js.native
  val dwReserved1: Double = js.native
  val ftCreationTime: WIZ_FILETIME = js.native
  val ftLastAccessTime: WIZ_FILETIME = js.native
  val ftLastWriteTime: WIZ_FILETIME = js.native
  val nFileSizeHigh: Double = js.native
  val nFileSizeLow: Double = js.native
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
  @scala.inline
  implicit class WIZ_WIN32_FIND_DATAOps[Self <: WIZ_WIN32_FIND_DATA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCAlternate(value: SafeArray[Double]): Self = this.set("cAlternate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCFileName(value: SafeArray[Double]): Self = this.set("cFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDwFileAttributes(value: Double): Self = this.set("dwFileAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDwReserved0(value: Double): Self = this.set("dwReserved0", value.asInstanceOf[js.Any])
    @scala.inline
    def setDwReserved1(value: Double): Self = this.set("dwReserved1", value.asInstanceOf[js.Any])
    @scala.inline
    def setFtCreationTime(value: WIZ_FILETIME): Self = this.set("ftCreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFtLastAccessTime(value: WIZ_FILETIME): Self = this.set("ftLastAccessTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFtLastWriteTime(value: WIZ_FILETIME): Self = this.set("ftLastWriteTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setNFileSizeHigh(value: Double): Self = this.set("nFileSizeHigh", value.asInstanceOf[js.Any])
    @scala.inline
    def setNFileSizeLow(value: Double): Self = this.set("nFileSizeLow", value.asInstanceOf[js.Any])
  }
  
}

