package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhereClause extends js.Object {
  
  /**
    * Executes the where clause against a feature to generate a value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#calculateValue)
    */
  def calculateValue(feature: js.Any): js.Any = js.native
  
  /**
    * An array of the field names used in the where clause.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#fieldNames)
    */
  var fieldNames: js.Array[String] = js.native
  
  /**
    * Returns `true` if the parsed where clause meets the requirements of standardized sql.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#isStandardized)
    */
  val isStandardized: Boolean = js.native
  
  /**
    * Tests the attributes of a feature against the `whereClause`, and returns `true` if the test passes, `false` otherwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#testFeature)
    */
  def testFeature(feature: js.Any): Boolean = js.native
}
object WhereClause {
  
  @scala.inline
  def apply(
    calculateValue: js.Any => js.Any,
    fieldNames: js.Array[String],
    isStandardized: Boolean,
    testFeature: js.Any => Boolean
  ): WhereClause = {
    val __obj = js.Dynamic.literal(calculateValue = js.Any.fromFunction1(calculateValue), fieldNames = fieldNames.asInstanceOf[js.Any], isStandardized = isStandardized.asInstanceOf[js.Any], testFeature = js.Any.fromFunction1(testFeature))
    __obj.asInstanceOf[WhereClause]
  }
  
  @scala.inline
  implicit class WhereClauseOps[Self <: WhereClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculateValue(value: js.Any => js.Any): Self = this.set("calculateValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFieldNamesVarargs(value: String*): Self = this.set("fieldNames", js.Array(value :_*))
    
    @scala.inline
    def setFieldNames(value: js.Array[String]): Self = this.set("fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStandardized(value: Boolean): Self = this.set("isStandardized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFeature(value: js.Any => Boolean): Self = this.set("testFeature", js.Any.fromFunction1(value))
  }
}
