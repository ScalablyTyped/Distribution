package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "Polly")
@js.native
object PollyNs extends js.Object {
  @js.native
  class Presigner ()
    extends awsDashSdkLib.clientsAllMod.PollyNs.Presigner {
    /**
       * Creates a presigner object with a set of configuration options.
       */
    def this(options: awsDashSdkLib.libPollyPresignerMod.PresignerNs.PresignerOptions) = this()
  }
  
  @js.native
  class Types ()
    extends awsDashSdkLib.clientsAllMod.PollyNs.Types {
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
      extends awsDashSdkLib.clientsAllMod.PollyNs.PollyNs.Presigner {
      /**
         * Creates a presigner object with a set of configuration options.
         */
      def this(options: awsDashSdkLib.libPollyPresignerMod.PresignerNs.PresignerOptions) = this()
    }
    
    val TypesNs: this.type = js.native
  }
  
}

