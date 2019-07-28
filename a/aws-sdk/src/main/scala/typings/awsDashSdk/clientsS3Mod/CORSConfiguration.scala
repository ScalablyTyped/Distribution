package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CORSConfiguration extends js.Object {
  /**
    * A set of allowed origins and methods.
    */
  var CORSRules: typings.awsDashSdk.clientsS3Mod.CORSRules
}

object CORSConfiguration {
  @scala.inline
  def apply(CORSRules: CORSRules): CORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules)
  
    __obj.asInstanceOf[CORSConfiguration]
  }
}

