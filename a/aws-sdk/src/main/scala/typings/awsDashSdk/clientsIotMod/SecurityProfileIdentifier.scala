package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityProfileIdentifier extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var arn: SecurityProfileArn
  /**
    * The name you have given to the security profile.
    */
  var name: SecurityProfileName
}

object SecurityProfileIdentifier {
  @scala.inline
  def apply(arn: SecurityProfileArn, name: SecurityProfileName): SecurityProfileIdentifier = {
    val __obj = js.Dynamic.literal(arn = arn, name = name)
  
    __obj.asInstanceOf[SecurityProfileIdentifier]
  }
}

