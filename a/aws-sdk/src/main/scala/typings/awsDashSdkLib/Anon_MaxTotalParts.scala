package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MaxTotalParts
  extends org.scalablytyped.runtime.Instantiable1[
      /* options */ awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions, 
      awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUpload
    ] {
  /**
    * Default value: 10000
    */
  var maxTotalParts: scala.Double = js.native
  /**
    * Returns the minimum number of bytes for an individual part upload.
    * Note: Minimum allowed size is 5 MB.
    * 1024 * 5
    */
  var minPartSize: scala.Double = js.native
}

