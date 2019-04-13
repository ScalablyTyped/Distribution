package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingGroupIndexingConfiguration extends js.Object {
  /**
    * Thing group indexing mode.
    */
  var thingGroupIndexingMode: ThingGroupIndexingMode
}

object ThingGroupIndexingConfiguration {
  @scala.inline
  def apply(thingGroupIndexingMode: ThingGroupIndexingMode): ThingGroupIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingGroupIndexingMode = thingGroupIndexingMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThingGroupIndexingConfiguration]
  }
}

