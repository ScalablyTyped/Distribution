package typings
package angularDashPdfjsDashViewerLib.angularMod.pdfjsViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigProvider
  extends angularLib.angularMod.IServiceProvider {
  def disableWorker(): scala.Unit = js.native
  def setCmapDir(dir: java.lang.String): scala.Unit = js.native
  def setImageDir(dir: java.lang.String): scala.Unit = js.native
  @JSName("setVerbosity")
  def setVerbosity_errors(verbosity: angularDashPdfjsDashViewerLib.angularDashPdfjsDashViewerLibStrings.errors): scala.Unit = js.native
  @JSName("setVerbosity")
  def setVerbosity_infos(verbosity: angularDashPdfjsDashViewerLib.angularDashPdfjsDashViewerLibStrings.infos): scala.Unit = js.native
  @JSName("setVerbosity")
  def setVerbosity_warnings(verbosity: angularDashPdfjsDashViewerLib.angularDashPdfjsDashViewerLibStrings.warnings): scala.Unit = js.native
  def setWorkerSrc(src: java.lang.String): scala.Unit = js.native
}

