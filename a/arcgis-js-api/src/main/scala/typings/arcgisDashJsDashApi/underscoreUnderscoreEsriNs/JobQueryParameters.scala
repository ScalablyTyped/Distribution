package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobQueryParameters extends Object {
  /**
    * An alias of fields included in the select statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var aliases: String
  /**
    * An array of fields included in the select statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var fields: String
  /**
    * The field that will be used to order the results returned by the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var orderBy: String
  /**
    * The tables that will be used in the where clause for selection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var tables: String
  /**
    * The username of the user who is requesting query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var user: String
  /**
    * The where clause used as a filter for selecting job information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var where: String
}

object JobQueryParameters {
  @scala.inline
  def apply(
    aliases: String,
    constructor: js.Function,
    fields: String,
    hasOwnProperty: PropertyKey => Boolean,
    orderBy: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    tables: String,
    user: String,
    where: String
  ): JobQueryParameters = {
    val __obj = js.Dynamic.literal(aliases = aliases, constructor = constructor, fields = fields, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), orderBy = orderBy, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tables = tables, user = user, where = where)
  
    __obj.asInstanceOf[JobQueryParameters]
  }
}

