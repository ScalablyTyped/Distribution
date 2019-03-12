package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRelationship
  extends stdLib.Object {
  /**
    * The type of extra property table relationship, one-to-one represents one row for each property and one-to-many represents there will be multiple values for the property.  **Possible Values:** one-to-one | one-to-many
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship)
    */
  var cardinality: java.lang.String
  /**
    * The foreign key field used to join the jobs table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship)
    */
  var linkField: java.lang.String
  /**
    * The alias name of the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship)
    */
  var tableAlias: java.lang.String
  /**
    * The name of the extended properties table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship)
    */
  var tableName: java.lang.String
}

object TableRelationship {
  @scala.inline
  def apply(
    cardinality: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    linkField: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    tableAlias: java.lang.String,
    tableName: java.lang.String
  ): TableRelationship = {
    val __obj = js.Dynamic.literal(cardinality = cardinality, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), linkField = linkField, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tableAlias = tableAlias, tableName = tableName)
  
    __obj.asInstanceOf[TableRelationship]
  }
}

