package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobQueryDetails extends Object {
  /**
    * An array of field aliases included in the select statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var aliases: js.Array[String]
  /**
    * An array of fields included in the select statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var fields: js.Array[String]
  /**
    * The unique id for the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var id: Double
  /**
    * The name of the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var name: String
  /**
    * The field used to order the results returned by the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var orderBy: String
  /**
    * An array of tables selected from and used in the where clause.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var tables: js.Array[String]
  /**
    * The where clause used as filter for selecting job information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobQueryDetails)
    */
  var where: String
}

object JobQueryDetails {
  @scala.inline
  def apply(
    aliases: js.Array[String],
    constructor: js.Function,
    fields: js.Array[String],
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    name: String,
    orderBy: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    tables: js.Array[String],
    where: String
  ): JobQueryDetails = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tables = tables.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobQueryDetails]
  }
}

