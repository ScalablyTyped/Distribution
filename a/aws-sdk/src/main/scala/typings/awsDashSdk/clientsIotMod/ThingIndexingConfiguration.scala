package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingIndexingConfiguration extends js.Object {
  /**
    * Thing connectivity indexing mode. Valid values are:    STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode must not be set to OFF.   OFF - Thing connectivity status indexing is disabled.  
    */
  var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.undefined
  /**
    * Thing indexing mode. Valid values are:   REGISTRY – Your thing index contains registry data only.   REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.   OFF - Thing indexing is disabled.  
    */
  var thingIndexingMode: ThingIndexingMode
}

object ThingIndexingConfiguration {
  @scala.inline
  def apply(
    thingIndexingMode: ThingIndexingMode,
    thingConnectivityIndexingMode: ThingConnectivityIndexingMode = null
  ): ThingIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingIndexingMode = thingIndexingMode.asInstanceOf[js.Any])
    if (thingConnectivityIndexingMode != null) __obj.updateDynamic("thingConnectivityIndexingMode")(thingConnectivityIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingIndexingConfiguration]
  }
}

