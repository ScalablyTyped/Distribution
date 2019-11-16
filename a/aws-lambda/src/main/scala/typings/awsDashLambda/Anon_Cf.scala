package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CloudFrontEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cf extends js.Object {
  var cf: CloudFrontEvent with Anon_Body
}

object Anon_Cf {
  @scala.inline
  def apply(cf: CloudFrontEvent with Anon_Body): Anon_Cf = {
    val __obj = js.Dynamic.literal(cf = cf)
  
    __obj.asInstanceOf[Anon_Cf]
  }
}

