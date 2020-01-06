package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPackageGroupSettings extends js.Object {
  /**
    * MediaPackage channel destination.
    */
  var Destination: OutputLocationRef = js.native
}

object MediaPackageGroupSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef): MediaPackageGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaPackageGroupSettings]
  }
}

