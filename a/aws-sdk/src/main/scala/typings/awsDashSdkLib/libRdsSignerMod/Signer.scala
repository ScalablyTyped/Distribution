package typings
package awsDashSdkLib.libRdsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/rds/signer", "Signer")
@js.native
/**
  * A signer object can be used to generate an auth token to a database.
  */
class Signer () extends js.Object {
  def this(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions) = this()
  /**
    * Generate an auth token to a database.
    */
  def getAuthToken(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions): java.lang.String = js.native
  /**
    * Generate an auth token to a database.
    */
  def getAuthToken(
    options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* token */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

