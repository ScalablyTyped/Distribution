package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobQueryDetails
  extends stdLib.Object {
  /**
    * An array of field aliases included in the select statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var aliases: js.Array[java.lang.String]
  /**
    * An array of fields included in the select statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var fields: js.Array[java.lang.String]
  /**
    * The unique id for the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var id: scala.Double
  /**
    * The name of the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var name: java.lang.String
  /**
    * The field used to order the results returned by the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var orderBy: java.lang.String
  /**
    * An array of tables selected from and used in the where clause.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var tables: js.Array[java.lang.String]
  /**
    * The where clause used as filter for selecting job information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var where: java.lang.String
}

object JobQueryDetails {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String],
    constructor: js.Function,
    fields: js.Array[java.lang.String],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    orderBy: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    tables: js.Array[java.lang.String],
    where: java.lang.String
  ): JobQueryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aliases")(aliases)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("orderBy")(orderBy)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("tables")(tables)
    __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[JobQueryDetails]
  }
}

