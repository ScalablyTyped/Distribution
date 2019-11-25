package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxServer
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
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BstrJobIdPFaxServerPJobStatus]
  }
}

