package typings.awsSdk.browserDefaultMod

import typings.awsSdk.rdsMod.ClientConfiguration
import typings.awsSdk.rdsMod.^
import typings.awsSdk.rdsSignerMod.Signer.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/browser_default", "RDS")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class RDS () extends ^ {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk/clients/browser_default", "RDS")
@js.native
object RDS extends js.Object {
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer ()
    extends typings.awsSdk.rdsMod.Signer {
    def this(options: SignerOptions) = this()
  }
  
}

