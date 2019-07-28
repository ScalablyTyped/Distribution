package typings.awsDashSdk.awsDashSdkMod

import typings.awsDashSdk.libPollyPresignerMod.PresignerNs.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "Polly")
@js.native
object PollyNs extends js.Object {
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typings.awsDashSdk.clientsAllMod.PollyNs.Presigner {
    def this(options: PresignerOptions) = this()
  }
  
}

