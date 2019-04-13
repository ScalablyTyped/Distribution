package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDomainInput extends js.Object {
  /**
    * The name of the domain to describe.
    */
  var name: DomainName
}

object DescribeDomainInput {
  @scala.inline
  def apply(name: DomainName): DescribeDomainInput = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DescribeDomainInput]
  }
}

