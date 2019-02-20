package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Execution of the {@link XCommand} animation node causes the slide show component to call back the application to perform the command. */
trait XCommand extends XAnimationNode {
  /** This identifies the application specific command. See documentation of used application for commands. */
  var Command: scala.Double
  /**
    * The application specific parameter for this command. See documentation of used application for supported parameters for different commands and target
    * combinations.
    */
  var Parameter: js.Any
  /** The application specific target. See documentation of used application for supported targets. */
  var Target: js.Any
}

