package typings.awsDashSdk.libMetadataUnderscoreServiceMod

import typings.awsDashSdk.Anon_Headers
import typings.awsDashSdk.Anon_TimeoutNumber
import typings.awsDashSdk.libErrorMod.AWSError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/metadata_service", "MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
class MetadataService () extends js.Object {
  def this(options: MetadataServiceOptions) = this()
  /**
    * A map of options to pass to the underlying HTTP request.
    */
  var httpOptions: Anon_TimeoutNumber = js.native
  /**
    * Sends a request to the instance metadata service for a given resource.
    */
  def request(path: String, callback: js.Function2[/* err */ AWSError, /* data */ String, Unit]): Unit = js.native
  def request(
    path: String,
    options: Anon_Headers,
    callback: js.Function2[/* err */ AWSError, /* data */ String, Unit]
  ): Unit = js.native
}

/* static members */
@JSImport("aws-sdk/lib/metadata_service", "MetadataService")
@js.native
object MetadataService extends js.Object {
  /**
    * 169.254.169.254
    */
  var host: String = js.native
}

