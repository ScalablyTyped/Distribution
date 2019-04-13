package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSuggesterRequest extends js.Object {
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
  /**
    * Specifies the name of the suggester you want to delete.
    */
  var SuggesterName: StandardName
}

object DeleteSuggesterRequest {
  @scala.inline
  def apply(DomainName: DomainName, SuggesterName: StandardName): DeleteSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, SuggesterName = SuggesterName)
  
    __obj.asInstanceOf[DeleteSuggesterRequest]
  }
}

