package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobManifest extends js.Object {
  /**
    * Contains the information required to locate the specified job's manifest.
    */
  var Location: JobManifestLocation
  /**
    * Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.
    */
  var Spec: JobManifestSpec
}

object JobManifest {
  @scala.inline
  def apply(Location: JobManifestLocation, Spec: JobManifestSpec): JobManifest = {
    val __obj = js.Dynamic.literal(Location = Location, Spec = Spec)
  
    __obj.asInstanceOf[JobManifest]
  }
}

