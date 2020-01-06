package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecateDomainInput extends js.Object {
  /**
    * The name of the domain to deprecate.
    */
  var name: DomainName = js.native
}

object DeprecateDomainInput {
  @scala.inline
  def apply(name: DomainName): DeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeprecateDomainInput]
  }
}

