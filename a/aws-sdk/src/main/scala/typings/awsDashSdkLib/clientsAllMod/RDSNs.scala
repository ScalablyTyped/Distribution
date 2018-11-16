package typings
package awsDashSdkLib.clientsAllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "RDS")
@js.native
object RDSNs extends js.Object {
  @js.native
  class Signer ()
    extends awsDashSdkLib.clientsRdsMod.Signer {
    /**
         * A signer object can be used to generate an auth token to a database.
         */
    def this(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions) = this()
  }
  
  @js.native
  class Types ()
    extends awsDashSdkLib.clientsRdsMod.Types {
    /**
       * Constructs a service object. This object has one method for each API operation.
       */
    def this(options: awsDashSdkLib.clientsRdsMod.RDSNs.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
  @JSName("RDS")
  @js.native
  object RDSNs extends js.Object {
    @js.native
    class Signer ()
      extends awsDashSdkLib.clientsRdsMod.RDSNs.Signer {
      /**
           * A signer object can be used to generate an auth token to a database.
           */
      def this(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions) = this()
    }
    
    val TypesNs: this.type = js.native
  }
  
}

