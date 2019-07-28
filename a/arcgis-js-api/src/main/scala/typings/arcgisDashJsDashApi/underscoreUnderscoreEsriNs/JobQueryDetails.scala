package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

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
    val __obj = js.Dynamic.literal(aliases = aliases, constructor = constructor, fields = fields, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, orderBy = orderBy, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tables = tables, where = where)
  
    __obj.asInstanceOf[JobQueryDetails]
  }
}

