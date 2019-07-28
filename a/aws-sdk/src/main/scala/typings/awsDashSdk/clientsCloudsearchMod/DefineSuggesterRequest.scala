package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineSuggesterRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
  var Suggester: typings.awsDashSdk.clientsCloudsearchMod.Suggester
}

object DefineSuggesterRequest {
  @scala.inline
  def apply(DomainName: DomainName, Suggester: Suggester): DefineSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, Suggester = Suggester)
  
    __obj.asInstanceOf[DefineSuggesterRequest]
  }
}

