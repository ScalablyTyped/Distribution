package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRelationship extends Object {
  /**
    * The type of extra property table relationship, one-to-one represents one row for each property and one-to-many represents there will be multiple values for the property.  **Possible Values:** one-to-one | one-to-many
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship)
    */
  var cardinality: String
  /**
    * The foreign key field used to join the jobs table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship)
    */
  var linkField: String
  /**
    * The alias name of the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship)
    */
  var tableAlias: String
  /**
    * The name of the extended properties table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship)
    */
  var tableName: String
}

object TableRelationship {
  @scala.inline
  def apply(
    cardinality: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    linkField: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    tableAlias: String,
    tableName: String
  ): TableRelationship = {
    val __obj = js.Dynamic.literal(cardinality = cardinality, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), linkField = linkField, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tableAlias = tableAlias, tableName = tableName)
  
    __obj.asInstanceOf[TableRelationship]
  }
}

