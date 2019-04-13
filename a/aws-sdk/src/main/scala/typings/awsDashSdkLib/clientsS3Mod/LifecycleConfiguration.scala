package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleConfiguration extends js.Object {
  /**
    * 
    */
  var Rules: awsDashSdkLib.clientsS3Mod.Rules
}

object LifecycleConfiguration {
  @scala.inline
  def apply(Rules: Rules): LifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules)
  
    __obj.asInstanceOf[LifecycleConfiguration]
  }
}

