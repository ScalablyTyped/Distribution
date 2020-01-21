package typings.arangodb.arangodbGeneralGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonPropertiesOptions extends js.Object {
  var ignoredProperties: js.UndefOr[js.Array[String] | String] = js.undefined
  var vertex1CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
  var vertex2CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
}

object CommonPropertiesOptions {
  @scala.inline
  def apply(
    ignoredProperties: js.Array[String] | String = null,
    vertex1CollectionRestriction: js.Array[String] | String = null,
    vertex2CollectionRestriction: js.Array[String] | String = null
  ): CommonPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (ignoredProperties != null) __obj.updateDynamic("ignoredProperties")(ignoredProperties.asInstanceOf[js.Any])
    if (vertex1CollectionRestriction != null) __obj.updateDynamic("vertex1CollectionRestriction")(vertex1CollectionRestriction.asInstanceOf[js.Any])
    if (vertex2CollectionRestriction != null) __obj.updateDynamic("vertex2CollectionRestriction")(vertex2CollectionRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPropertiesOptions]
  }
}

