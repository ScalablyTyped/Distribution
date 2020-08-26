package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes version clashes of a deployment unit.
  *
  * This exception is intended to be used with an {@link com.sun.star.task.XInteractionHandler} .
  * @since OOo 2.1
  */
@js.native
trait VersionException extends Exception {
  /**
    * represents the already installed version of the deployment unit.
    *
    * Must not be `NULL` .
    */
  var Deployed: XPackage = js.native
  /** the display name of the extension which is being installed. */
  var NewDisplayName: String = js.native
  /** the version of the extension which is being installed. */
  var NewVersion: String = js.native
}

object VersionException {
  @scala.inline
  def apply(
    Context: XInterface,
    Deployed: XPackage,
    Message: String,
    NewDisplayName: String,
    NewVersion: String
  ): VersionException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Deployed = Deployed.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NewDisplayName = NewDisplayName.asInstanceOf[js.Any], NewVersion = NewVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionException]
  }
  @scala.inline
  implicit class VersionExceptionOps[Self <: VersionException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeployed(value: XPackage): Self = this.set("Deployed", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewDisplayName(value: String): Self = this.set("NewDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewVersion(value: String): Self = this.set("NewVersion", value.asInstanceOf[js.Any])
  }
  
}

