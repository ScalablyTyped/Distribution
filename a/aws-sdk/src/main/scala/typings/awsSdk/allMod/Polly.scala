package typings.awsSdk.allMod

import typings.awsSdk.pollyMod.ClientConfiguration
import typings.awsSdk.pollyMod.^
import typings.awsSdk.presignerMod.Presigner.PresignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/all", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly () extends ^ {
  def this(options: ClientConfiguration) = this()
}
object Polly {
  
  @JSImport("aws-sdk/clients/all", "Polly.Presigner")
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typings.awsSdk.pollyMod.Presigner {
    def this(options: PresignerOptions) = this()
  }
}
