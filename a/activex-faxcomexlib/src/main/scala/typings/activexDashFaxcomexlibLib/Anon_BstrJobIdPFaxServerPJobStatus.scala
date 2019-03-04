package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrJobIdPFaxServerPJobStatus extends js.Object {
  val bstrJobId: java.lang.String
  val pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
  val pJobStatus: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxJobStatus
}

object Anon_BstrJobIdPFaxServerPJobStatus {
  @scala.inline
  def apply(
    bstrJobId: java.lang.String,
    pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    pJobStatus: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxJobStatus
  ): Anon_BstrJobIdPFaxServerPJobStatus = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId, pFaxServer = pFaxServer, pJobStatus = pJobStatus)
  
    __obj.asInstanceOf[Anon_BstrJobIdPFaxServerPJobStatus]
  }
}

