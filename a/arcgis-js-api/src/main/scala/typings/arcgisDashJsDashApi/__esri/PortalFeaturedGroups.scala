package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalFeaturedGroups extends Object {
  /**
    * Name of the group owner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var owner: String
  /**
    * Group title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#featuredGroups)
    */
  var title: String
}

object PortalFeaturedGroups {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    owner: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String
  ): PortalFeaturedGroups = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), owner = owner, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title)
  
    __obj.asInstanceOf[PortalFeaturedGroups]
  }
}

