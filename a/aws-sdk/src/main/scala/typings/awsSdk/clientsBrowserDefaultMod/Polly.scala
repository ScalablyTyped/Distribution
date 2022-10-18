package typings.awsSdk.clientsBrowserDefaultMod

import typings.awsSdk.clientsPollyMod.ClientConfiguration
import typings.awsSdk.clientsPollyMod.^
import typings.awsSdk.libPollyPresignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/browser_default", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class Polly () extends ^ {
  def this(options: ClientConfiguration) = this()
}
object Polly {
  
  @JSImport("aws-sdk/clients/browser_default", "Polly.Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  open class Presigner ()
    extends typings.awsSdk.clientsPollyMod.Presigner {
    def this(options: PresignerOptions) = this()
  }
}
