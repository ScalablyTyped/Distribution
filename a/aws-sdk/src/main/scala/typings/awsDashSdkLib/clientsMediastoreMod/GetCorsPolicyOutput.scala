package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCorsPolicyOutput extends js.Object {
  /**
    * The CORS policy assigned to the container.
    */
  var CorsPolicy: awsDashSdkLib.clientsMediastoreMod.CorsPolicy
}

object GetCorsPolicyOutput {
  @scala.inline
  def apply(CorsPolicy: CorsPolicy): GetCorsPolicyOutput = {
    val __obj = js.Dynamic.literal(CorsPolicy = CorsPolicy)
  
    __obj.asInstanceOf[GetCorsPolicyOutput]
  }
}

