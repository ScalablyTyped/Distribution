package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeprecateDomainInput extends js.Object {
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var name: DomainName = js.native
}

object UndeprecateDomainInput {
  @scala.inline
  def apply(name: DomainName): UndeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UndeprecateDomainInput]
  }
}

