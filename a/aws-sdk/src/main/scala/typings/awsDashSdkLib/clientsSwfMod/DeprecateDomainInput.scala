package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecateDomainInput extends js.Object {
  /**
    * The name of the domain to deprecate.
    */
  var name: DomainName
}

object DeprecateDomainInput {
  @scala.inline
  def apply(name: DomainName): DeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DeprecateDomainInput]
  }
}

