package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainInput extends js.Object {
  /**
    * The name of the domain to describe.
    */
  var name: DomainName = js.native
}

object DescribeDomainInput {
  @scala.inline
  def apply(name: DomainName): DescribeDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDomainInput]
  }
}

