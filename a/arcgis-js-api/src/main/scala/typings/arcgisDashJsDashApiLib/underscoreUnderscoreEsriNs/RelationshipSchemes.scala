package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipSchemes
  extends stdLib.Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemes)
    */
  var basemapId: java.lang.String
  /**
    * The relationship scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemes)
    */
  var primaryScheme: RelationshipScheme
  /**
    * Additional relationship schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemes)
    */
  var secondarySchemes: js.Array[RelationshipScheme]
}

object RelationshipSchemes {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    primaryScheme: RelationshipScheme,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    secondarySchemes: js.Array[RelationshipScheme]
  ): RelationshipSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = hasOwnProperty, primaryScheme = primaryScheme, propertyIsEnumerable = propertyIsEnumerable, secondarySchemes = secondarySchemes)
  
    __obj.asInstanceOf[RelationshipSchemes]
  }
}

