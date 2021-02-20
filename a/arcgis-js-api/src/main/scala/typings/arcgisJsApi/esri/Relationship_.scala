package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`many-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-one`
import typings.arcgisJsApi.arcgisJsApiStrings.destination
import typings.arcgisJsApi.arcgisJsApiStrings.origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relationship_ extends Accessor {
  
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: `one-to-one` | `one-to-many` | `many-to-many` = js.native
  
  /**
    * Indicates whether the relationship is composite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#composite)
    */
  var composite: Boolean = js.native
  
  /**
    * The unique ID for the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#id)
    */
  var id: Double = js.native
  
  /**
    * The field used to establish the relate within the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField)
    */
  var keyField: String = js.native
  
  /**
    * The key field in an attributed relationship class table that matches the [keyField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyFieldInRelationshipTable)
    */
  var keyFieldInRelationshipTable: String = js.native
  
  /**
    * The name of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#name)
    */
  var name: String = js.native
  
  /**
    * The unique ID of the related [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relatedTableId)
    */
  var relatedTableId: Double = js.native
  
  /**
    * The relationship table id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relationshipTableId)
    */
  var relationshipTableId: Double = js.native
  
  /**
    * Indicates whether the table participating in the relationship is the `origin` or `destination` table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#role)
    */
  var role: origin | destination = js.native
}
