package typings.amazonProductApi.mod

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
    val __obj = js.Dynamic.literal(awsId = awsId.asInstanceOf[js.Any], awsSecret = awsSecret.asInstanceOf[js.Any], awsTag = awsTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICredentials]
  }
}

