package typings
package amazonDashProductDashApiLib.amazonDashProductDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentials extends js.Object {
  var awsId: java.lang.String
  var awsSecret: java.lang.String
  var awsTag: java.lang.String
}

object ICredentials {
  @scala.inline
  def apply(awsId: java.lang.String, awsSecret: java.lang.String, awsTag: java.lang.String): ICredentials = {
    val __obj = js.Dynamic.literal(awsId = awsId, awsSecret = awsSecret, awsTag = awsTag)
  
    __obj.asInstanceOf[ICredentials]
  }
}

