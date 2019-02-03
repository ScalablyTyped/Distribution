package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
class MetadataService ()
  extends awsDashSdkLib.libCoreMod.MetadataService {
  def this(options: awsDashSdkLib.libMetadataUnderscoreServiceMod.MetadataServiceOptions) = this()
}

/* static members */
@JSImport("aws-sdk", "MetadataService")
@js.native
object MetadataService extends js.Object {
  /**
    * 169.254.169.254
    */
  var host: java.lang.String = js.native
}

