package typings.applicationinsights

import typings.applicationinsights.outDeclarationsContractsGeneratedMod.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts/Constants", JSImport.Namespace)
@js.native
object outDeclarationsContractsConstantsMod extends js.Object {
  @js.native
  trait ISupportProperties extends Domain {
    var properties: js.Any = js.native
  }
  
  @js.native
  class RemoteDependencyDataConstants () extends js.Object
  
  def domainSupportsProperties(domain: Domain): /* is applicationinsights.applicationinsights/out/Declarations/Contracts/Constants.ISupportProperties */ Boolean = js.native
  /* static members */
  @js.native
  object RemoteDependencyDataConstants extends js.Object {
    var TYPE_AI: String = js.native
    var TYPE_HTTP: String = js.native
  }
  
}

