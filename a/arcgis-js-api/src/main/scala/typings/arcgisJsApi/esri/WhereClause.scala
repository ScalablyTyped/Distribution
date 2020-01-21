package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereClause extends js.Object {
  /**
    * An array of the field names used in the where clause. It can be used to get the appropriate fields when querying layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#fieldNames)
    */
  var fieldNames: js.Array[String]
  /**
    * Returns `true` if the parsed where clause meets the requirements of standardized sql.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#isStandardized)
    */
  val isStandardized: Boolean
  /**
    * Executes the where clause against a feature to generate a value. It is used when the `WhereClause` is being used as a simple expression. For example, you can use the expression to gather values for statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#calculateValue)
    *
    * @param feature The feature to check against the where clause.
    *
    */
  def calculateValue(feature: js.Any): js.Any
  /**
    * Tests the attributes of a feature against the `whereClause`, and returns `true` if the test passes, `false` otherwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#testFeature)
    *
    * @param feature The feature to test against the `whereClause`.
    *
    */
  def testFeature(feature: js.Any): Boolean
}

@JSGlobal("__esri.WhereClause")
@js.native
object WhereClause extends TopLevel[WhereClause]

