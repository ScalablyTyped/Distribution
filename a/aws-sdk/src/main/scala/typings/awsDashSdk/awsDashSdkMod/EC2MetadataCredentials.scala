package typings.awsDashSdk.awsDashSdkMod

import typings.awsDashSdk.libCredentialsEc2UnderscoreMetadataUnderscoreCredentialsMod.EC2MetadataCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "EC2MetadataCredentials")
@js.native
/**
		 * Creates credentials from the metadata service on an EC2 instance.
		 * @param {object} options - Override the default (1s) timeout period.
		 */
class EC2MetadataCredentials ()
  extends typings.awsDashSdk.libCoreMod.EC2MetadataCredentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}

