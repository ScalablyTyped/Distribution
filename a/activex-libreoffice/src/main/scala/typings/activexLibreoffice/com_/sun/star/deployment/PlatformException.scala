package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link DeploymentException} indicates that the current platform is not supported.
  * @since OOo 3.0
  */
trait PlatformException extends Exception {
  /** The package which does not support the current platform. */
  @JSName("package")
  var _package: XPackage
}

object PlatformException {
  @scala.inline
  def apply(Context: XInterface, Message: String, _package: XPackage): PlatformException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformException]
  }
}

