package typings.amazonDashProductDashApi.amazonDashProductDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentials extends js.Object {
  var awsId: String
  var awsSecret: String
  var awsTag: String
}

object ICredentials {
  @scala.inline
  def apply(awsId: String, awsSecret: String, awsTag: String): ICredentials = {
    val __obj = js.Dynamic.literal(awsId = awsId, awsSecret = awsSecret, awsTag = awsTag)
  
    __obj.asInstanceOf[ICredentials]
  }
}

