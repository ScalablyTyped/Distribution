package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountId extends js.Object {
  var accountId: java.lang.String
  var data: Anon_ActionConfiguration
  var id: java.lang.String
}

object Anon_AccountId {
  @scala.inline
  def apply(accountId: java.lang.String, data: Anon_ActionConfiguration, id: java.lang.String): Anon_AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId, data = data, id = id)
  
    __obj.asInstanceOf[Anon_AccountId]
  }
}

