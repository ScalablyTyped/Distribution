package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildEnvironmentOptions extends js.Object {
  /**
    *  An object responsible for Atom's interaction with the browser process and host OS.
    *  Use buildDefaultApplicationDelegate for a default instance.
    */
  var applicationDelegate: js.UndefOr[js.Object] = js.undefined
  /** A path to the configuration directory (usually ~/.atom). */
  var configDirPath: js.UndefOr[java.lang.String] = js.undefined
  /** A document global. */
  var document: js.UndefOr[stdLib.Document] = js.undefined
  /**
    *  A boolean indicating whether the Atom environment should save or load state
    *  from the file system. You probably want this to be false.
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** A window global. */
  var window: js.UndefOr[stdLib.Window] = js.undefined
}

