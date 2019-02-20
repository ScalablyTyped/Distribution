package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the text of a progress monitor.
  * @deprecated Deprecated
  */
trait XProgressMonitor extends XProgressBar {
  /** adds a new text line to the control. */
  def addText(Topic: java.lang.String, Text: java.lang.String, beforeProgress: scala.Boolean): scala.Unit
  /** removes a text line from the control. */
  def removeText(Topic: java.lang.String, beforeProgress: scala.Boolean): scala.Unit
  /** updates an existing text line at the control. */
  def updateText(Topic: java.lang.String, Text: java.lang.String, beforeProgress: scala.Boolean): scala.Unit
}

