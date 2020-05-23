package typings.atom.mod

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
    if (applicationDelegate != null) __obj.updateDynamic("applicationDelegate")(applicationDelegate.asInstanceOf[js.Any])
    if (configDirPath != null) __obj.updateDynamic("configDirPath")(configDirPath.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.get.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildEnvironmentOptions]
  }
}

