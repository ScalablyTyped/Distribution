package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLibNs.FaxJobStatus
import typings.activexDashFaxcomexlib.FAXCOMEXLibNs.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrJobIdPFaxServerPJobStatus extends js.Object {
  val bstrJobId: String
  val pFaxServer: FaxServer
  val pJobStatus: FaxJobStatus
}

object Anon_BstrJobIdPFaxServerPJobStatus {
  @scala.inline
  def apply(bstrJobId: String, pFaxServer: FaxServer, pJobStatus: FaxJobStatus): Anon_BstrJobIdPFaxServerPJobStatus = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId, pFaxServer = pFaxServer, pJobStatus = pJobStatus)
  
    __obj.asInstanceOf[Anon_BstrJobIdPFaxServerPJobStatus]
  }
}

