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
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    owner: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    title: java.lang.String
  ): PortalFeaturedGroups = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), owner = owner, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title)
  
    __obj.asInstanceOf[PortalFeaturedGroups]
  }
}

