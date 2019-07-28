package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSqlInjectionMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafMod.ChangeToken
  /**
    * A friendly name or description for the SqlInjectionMatchSet that you're creating. You can't change Name after you create the SqlInjectionMatchSet.
    */
  var Name: ResourceName
}

object CreateSqlInjectionMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateSqlInjectionMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, Name = Name)
  
    __obj.asInstanceOf[CreateSqlInjectionMatchSetRequest]
  }
}

