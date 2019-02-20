package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Work in progress, don't use unless you know what you are doing. */
trait XToolkitExperimental extends XToolkit2 {
  /** Get the number of OpenGL buffer swaps. */
  val OpenGLBufferSwapCounter: scala.Double
  /** Get the number of OpenGL buffer swaps. */
  def getOpenGLBufferSwapCounter(): scala.Double
  /** Pause the main thread of LibreOffice for the requested amount of time. */
  def pause(nMilliseconds: scala.Double): scala.Unit
  /** Process all pending idle events */
  def processEventsToIdle(): scala.Unit
  /** Turn on or off deterministic scheduling (off is the default). */
  def setDeterministicScheduling(bDeterministicMode: scala.Boolean): scala.Unit
}

