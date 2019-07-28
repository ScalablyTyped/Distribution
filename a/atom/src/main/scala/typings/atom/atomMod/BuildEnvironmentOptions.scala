package typings.atom.atomMod

import typings.std.Document
import typings.std.Window
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
  var configDirPath: js.UndefOr[String] = js.undefined
  /** A document global. */
  var document: js.UndefOr[Document] = js.undefined
  /**
    *  A boolean indicating whether the Atom environment should save or load state
    *  from the file system. You probably want this to be false.
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** A window global. */
  var window: js.UndefOr[Window] = js.undefined
}

object BuildEnvironmentOptions {
  @scala.inline
  def apply(
    applicationDelegate: js.Object = null,
    configDirPath: String = null,
    document: Document = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    window: Window = null
  ): BuildEnvironmentOptions = {
    val __obj = js.Dynamic.literal()
    if (applicationDelegate != null) __obj.updateDynamic("applicationDelegate")(applicationDelegate)
    if (configDirPath != null) __obj.updateDynamic("configDirPath")(configDirPath)
    if (document != null) __obj.updateDynamic("document")(document)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[BuildEnvironmentOptions]
  }
}

