package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Plussign
import typings.arcgisJsApi.arcgisJsApiStrings._empty
import typings.arcgisJsApi.arcgisJsApiStrings.`-_`
import typings.arcgisJsApi.arcgisJsApiStrings.interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalNode
  extends StObject
     with SQLNode {
  
  /**
    * Interval node sign.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalNode)
    */
  var op: Plussign | `-_` | _empty
  
  /**
    * The interval qualifier can either be a single datetime field or be composed of two datetime fields, in the form: <leading field> TO <trailing field>.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalNode)
    */
  var qualifier: IntervalQualifierNode | IntervalPeriodNode
  
  var `type`: interval
  
  /**
    * Interval node value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalNode)
    */
  var value: StringNode
}
object IntervalNode {
  
  inline def apply(
    op: Plussign | `-_` | _empty,
    qualifier: IntervalQualifierNode | IntervalPeriodNode,
    value: StringNode
  ): IntervalNode = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[IntervalNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntervalNode] (val x: Self) extends AnyVal {
    
    inline def setOp(value: Plussign | `-_` | _empty): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: IntervalQualifierNode | IntervalPeriodNode): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: interval): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
