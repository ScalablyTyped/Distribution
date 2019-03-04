package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalFeaturedGroups
  extends stdLib.Object {
  /**
    * Name of the group owner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var owner: java.lang.String
  /**
    * Group title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var title: java.lang.String
}

object PortalFeaturedGroups {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    owner: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    title: java.lang.String
  ): PortalFeaturedGroups = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, owner = owner, propertyIsEnumerable = propertyIsEnumerable, title = title)
  
    __obj.asInstanceOf[PortalFeaturedGroups]
  }
}

