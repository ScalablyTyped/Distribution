package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityProfileIdentifier extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var arn: SecurityProfileArn = js.native
  /**
    * The name you have given to the security profile.
    */
  var name: SecurityProfileName = js.native
}

object SecurityProfileIdentifier {
  @scala.inline
  def apply(arn: SecurityProfileArn, name: SecurityProfileName): SecurityProfileIdentifier = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityProfileIdentifier]
  }
}

