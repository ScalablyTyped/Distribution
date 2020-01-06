package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingIndexingConfiguration extends js.Object {
  /**
    * Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.native
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.native
  /**
    * Thing connectivity indexing mode. Valid values are:    STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode must not be set to OFF.   OFF - Thing connectivity status indexing is disabled.  
    */
  var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.native
  /**
    * Thing indexing mode. Valid values are:   REGISTRY – Your thing index contains registry data only.   REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.   OFF - Thing indexing is disabled.  
    */
  var thingIndexingMode: ThingIndexingMode = js.native
}

object ThingIndexingConfiguration {
  @scala.inline
  def apply(
    thingIndexingMode: ThingIndexingMode,
    customFields: Fields = null,
    managedFields: Fields = null,
    thingConnectivityIndexingMode: ThingConnectivityIndexingMode = null
  ): ThingIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingIndexingMode = thingIndexingMode.asInstanceOf[js.Any])
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (managedFields != null) __obj.updateDynamic("managedFields")(managedFields.asInstanceOf[js.Any])
    if (thingConnectivityIndexingMode != null) __obj.updateDynamic("thingConnectivityIndexingMode")(thingConnectivityIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingIndexingConfiguration]
  }
}

