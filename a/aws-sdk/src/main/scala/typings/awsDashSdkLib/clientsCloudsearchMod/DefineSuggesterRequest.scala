package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineSuggesterRequest extends js.Object {
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
  var Suggester: awsDashSdkLib.clientsCloudsearchMod.Suggester
}

object DefineSuggesterRequest {
  @scala.inline
  def apply(DomainName: DomainName, Suggester: Suggester): DefineSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, Suggester = Suggester)
  
    __obj.asInstanceOf[DefineSuggesterRequest]
  }
}

