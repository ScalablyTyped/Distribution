package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleConfiguration extends js.Object {
  /**
    * Specifies lifecycle configuration rules for an Amazon S3 bucket. 
    */
  var Rules: typings.awsDashSdk.clientsS3Mod.Rules = js.native
}

object LifecycleConfiguration {
  @scala.inline
  def apply(Rules: Rules): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecycleConfiguration]
  }
}

