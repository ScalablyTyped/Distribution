package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.AND
import typings.arcgisJsApi.arcgisJsApiStrings.Asterisk
import typings.arcgisJsApi.arcgisJsApiStrings.BETWEEN
import typings.arcgisJsApi.arcgisJsApiStrings.Equalssign
import typings.arcgisJsApi.arcgisJsApiStrings.Greaterthansign
import typings.arcgisJsApi.arcgisJsApiStrings.GreaterthansignEqualssign
import typings.arcgisJsApi.arcgisJsApiStrings.IN
import typings.arcgisJsApi.arcgisJsApiStrings.IS
import typings.arcgisJsApi.arcgisJsApiStrings.ISNOT
import typings.arcgisJsApi.arcgisJsApiStrings.LIKE
import typings.arcgisJsApi.arcgisJsApiStrings.Lessthansign
import typings.arcgisJsApi.arcgisJsApiStrings.LessthansignEqualssign
import typings.arcgisJsApi.arcgisJsApiStrings.LessthansignGreaterthansign
import typings.arcgisJsApi.arcgisJsApiStrings.NOTBETWEEN
import typings.arcgisJsApi.arcgisJsApiStrings.OR
import typings.arcgisJsApi.arcgisJsApiStrings.Plussign
import typings.arcgisJsApi.arcgisJsApiStrings.Slash
import typings.arcgisJsApi.arcgisJsApiStrings.`-_`
import typings.arcgisJsApi.arcgisJsApiStrings.`NOT IN`
import typings.arcgisJsApi.arcgisJsApiStrings.`NOT LIKE`
import typings.arcgisJsApi.arcgisJsApiStrings.`binary-expression`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryNode
  extends StObject
     with SQLNode {
  
  /**
  		 * Escape string.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BinaryNode)
  		 */
  var escape: js.UndefOr[String] = js.undefined
  
  /**
  		 * SQL node to the left of the binary node.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BinaryNode)
  		 */
  var left: SQLNode
  
  /**
  		 * Defines the way two expressions are combined to yield a single result.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BinaryNode)
  		 */
  var operator: AND | OR | IS | ISNOT | IN | (`NOT IN`) | BETWEEN | NOTBETWEEN | LIKE | (`NOT LIKE`) | LessthansignGreaterthansign | Lessthansign | Greaterthansign | GreaterthansignEqualssign | LessthansignEqualssign | Equalssign | Asterisk | `-_` | Plussign | Slash
  
  /**
  		 * SQL node to the right of the binary node.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#BinaryNode)
  		 */
  var right: SQLNode
  
  var `type`: `binary-expression`
}
object BinaryNode {
  
  inline def apply(
    left: SQLNode,
    operator: AND | OR | IS | ISNOT | IN | (`NOT IN`) | BETWEEN | NOTBETWEEN | LIKE | (`NOT LIKE`) | LessthansignGreaterthansign | Lessthansign | Greaterthansign | GreaterthansignEqualssign | LessthansignEqualssign | Equalssign | Asterisk | `-_` | Plussign | Slash,
    right: SQLNode
  ): BinaryNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary-expression")
    __obj.asInstanceOf[BinaryNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryNode] (val x: Self) extends AnyVal {
    
    inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setLeft(value: SQLNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(
      value: AND | OR | IS | ISNOT | IN | (`NOT IN`) | BETWEEN | NOTBETWEEN | LIKE | (`NOT LIKE`) | LessthansignGreaterthansign | Lessthansign | Greaterthansign | GreaterthansignEqualssign | LessthansignEqualssign | Equalssign | Asterisk | `-_` | Plussign | Slash
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: SQLNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: `binary-expression`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
