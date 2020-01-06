package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobManifest extends js.Object {
  /**
    * Contains the information required to locate the specified job's manifest.
    */
  var Location: JobManifestLocation = js.native
  /**
    * Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.
    */
  var Spec: JobManifestSpec = js.native
}

object JobManifest {
  @scala.inline
  def apply(Location: JobManifestLocation, Spec: JobManifestSpec): JobManifest = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], Spec = Spec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobManifest]
  }
}

