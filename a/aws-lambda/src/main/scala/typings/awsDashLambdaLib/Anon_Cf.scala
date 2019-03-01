package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cf extends js.Object {
  var cf: awsDashLambdaLib.awsDashLambdaMod.CloudFrontEvent with Anon_Request
}

object Anon_Cf {
  @scala.inline
  def apply(cf: awsDashLambdaLib.awsDashLambdaMod.CloudFrontEvent with Anon_Request): Anon_Cf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cf")(cf)
    __obj.asInstanceOf[Anon_Cf]
  }
}

