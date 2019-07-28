package typings.awsDashSdk.clientsAllMod

import typings.awsDashSdk.libPollyPresignerMod.PresignerNs.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
object PollyNs extends js.Object {
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typings.awsDashSdk.clientsPollyMod.Presigner {
    def this(options: PresignerOptions) = this()
  }
  
}

