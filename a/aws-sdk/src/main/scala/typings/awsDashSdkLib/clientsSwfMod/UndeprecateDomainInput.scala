package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndeprecateDomainInput extends js.Object {
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var name: DomainName
}

object UndeprecateDomainInput {
  @scala.inline
  def apply(name: DomainName): UndeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[UndeprecateDomainInput]
  }
}

