package typings.awsDashSdk.libCredentialsEc2UnderscoreMetadataUnderscoreCredentialsMod

import typings.awsDashSdk.libCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/ec2_metadata_credentials", "EC2MetadataCredentials")
@js.native
/**
		 * Creates credentials from the metadata service on an EC2 instance.
		 * @param {object} options - Override the default (1s) timeout period.
		 */
class EC2MetadataCredentials () extends Credentials {
  def this(options: EC2MetadataCredentialsOptions) = this()
}

