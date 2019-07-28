package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPackageGroupSettings extends js.Object {
  /**
    * MediaPackage channel destination.
    */
  var Destination: OutputLocationRef
}

object MediaPackageGroupSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef): MediaPackageGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination)
  
    __obj.asInstanceOf[MediaPackageGroupSettings]
  }
}

