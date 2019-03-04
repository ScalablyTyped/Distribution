package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobQueryParameters
  extends stdLib.Object {
  /**
    * An alias of fields included in the select statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var aliases: java.lang.String
  /**
    * An array of fields included in the select statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var fields: java.lang.String
  /**
    * The field that will be used to order the results returned by the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var orderBy: java.lang.String
  /**
    * The tables that will be used in the where clause for selection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var tables: java.lang.String
  /**
    * The username of the user who is requesting query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var user: java.lang.String
  /**
    * The where clause used as a filter for selecting job information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters)
    */
  var where: java.lang.String
}

object JobQueryParameters {
  @scala.inline
  def apply(
    aliases: java.lang.String,
    constructor: js.Function,
    fields: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    orderBy: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    tables: java.lang.String,
    user: java.lang.String,
    where: java.lang.String
  ): JobQueryParameters = {
    val __obj = js.Dynamic.literal(aliases = aliases, constructor = constructor, fields = fields, hasOwnProperty = hasOwnProperty, orderBy = orderBy, propertyIsEnumerable = propertyIsEnumerable, tables = tables, user = user, where = where)
  
    __obj.asInstanceOf[JobQueryParameters]
  }
}

