package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShuffleConfig extends js.Object {
  /**
    * Determines the shuffling order in ShuffleConfig value.
    */
  var Seed: awsDashSdkLib.clientsSagemakerMod.Seed
}

object ShuffleConfig {
  @scala.inline
  def apply(Seed: Seed): ShuffleConfig = {
    val __obj = js.Dynamic.literal(Seed = Seed)
  
    __obj.asInstanceOf[ShuffleConfig]
  }
}

