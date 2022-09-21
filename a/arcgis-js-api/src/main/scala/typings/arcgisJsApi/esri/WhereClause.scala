package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The WhereClause is used to extract the features that meet a specified condition by parsing the provided results in to a value.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html)
  */
trait WhereClause extends StObject {
  
  /**
    * Executes the where clause against a feature to generate a value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#calculateValue)
    */
  def calculateValue(feature: Any): Any
  
  /**
    * An array of the field names used in the where clause.
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
    * A parse tree is a data structure for representing a parsed sql statement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#parseTree)
    */
  var parseTree: SQLNode
  
  /**
    * Tests the attributes of a feature against the `whereClause`, and returns `true` if the test passes, `false` otherwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#testFeature)
    */
  def testFeature(feature: Any): Boolean
}
object WhereClause {
  
  inline def apply(
    calculateValue: Any => Any,
    fieldNames: js.Array[String],
    isStandardized: Boolean,
    parseTree: SQLNode,
    testFeature: Any => Boolean
  ): WhereClause = {
    val __obj = js.Dynamic.literal(calculateValue = js.Any.fromFunction1(calculateValue), fieldNames = fieldNames.asInstanceOf[js.Any], isStandardized = isStandardized.asInstanceOf[js.Any], parseTree = parseTree.asInstanceOf[js.Any], testFeature = js.Any.fromFunction1(testFeature))
    __obj.asInstanceOf[WhereClause]
  }
  
  extension [Self <: WhereClause](x: Self) {
    
    inline def setCalculateValue(value: Any => Any): Self = StObject.set(x, "calculateValue", js.Any.fromFunction1(value))
    
    inline def setFieldNames(value: js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value*))
    
    inline def setIsStandardized(value: Boolean): Self = StObject.set(x, "isStandardized", value.asInstanceOf[js.Any])
    
    inline def setParseTree(value: SQLNode): Self = StObject.set(x, "parseTree", value.asInstanceOf[js.Any])
    
    inline def setTestFeature(value: Any => Boolean): Self = StObject.set(x, "testFeature", js.Any.fromFunction1(value))
  }
}
