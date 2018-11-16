package typings
package awsDashSdkLib.clientsAllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
object PollyNs extends js.Object {
  @js.native
  class Presigner ()
    extends awsDashSdkLib.clientsPollyMod.Presigner {
    /**
       * Creates a presigner object with a set of configuration options.
       */
    def this(options: awsDashSdkLib.libPollyPresignerMod.PresignerNs.PresignerOptions) = this()
  }
  
  @js.native
  class Types ()
    extends awsDashSdkLib.clientsPollyMod.Types {
    /**
       * Constructs a service object. This object has one method for each API operation.
       */
    def this(options: awsDashSdkLib.clientsPollyMod.PollyNs.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
  @JSName("Polly")
  @js.native
  object PollyNs extends js.Object {
    @js.native
    class Presigner ()
      extends awsDashSdkLib.clientsPollyMod.PollyNs.Presigner {
      /**
         * Creates a presigner object with a set of configuration options.
         */
      def this(options: awsDashSdkLib.libPollyPresignerMod.PresignerNs.PresignerOptions) = this()
    }
    
    val TypesNs: this.type = js.native
  }
  
}

