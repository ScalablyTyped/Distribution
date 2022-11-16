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
import typings.arcgisJsApi.arcgisJsApiStrings._empty
import typings.arcgisJsApi.arcgisJsApiStrings.`-_`
import typings.arcgisJsApi.arcgisJsApiStrings.`NOT IN`
import typings.arcgisJsApi.arcgisJsApiStrings.`NOT LIKE`
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.day
import typings.arcgisJsApi.arcgisJsApiStrings.hour
import typings.arcgisJsApi.arcgisJsApiStrings.minute
import typings.arcgisJsApi.arcgisJsApiStrings.month
import typings.arcgisJsApi.arcgisJsApiStrings.second
import typings.arcgisJsApi.arcgisJsApiStrings.timestamp
import typings.arcgisJsApi.arcgisJsApiStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.BinaryNode
  - typings.arcgisJsApi.esri.BoolNode
  - typings.arcgisJsApi.esri.ColumnNode
  - typings.arcgisJsApi.esri.CurrentTimeNode
  - typings.arcgisJsApi.esri.DateNode
  - typings.arcgisJsApi.esri.FunctionNode
  - typings.arcgisJsApi.esri.IntervalNode
  - typings.arcgisJsApi.esri.IntervalPeriodNode
  - typings.arcgisJsApi.esri.IntervalQualifierNode
  - typings.arcgisJsApi.esri.NullNode
  - typings.arcgisJsApi.esri.StringNode
  - typings.arcgisJsApi.esri.ListNode
  - typings.arcgisJsApi.esri.NumberNode
  - typings.arcgisJsApi.esri.SimpleCaseNode
  - typings.arcgisJsApi.esri.SearchedCaseNode
  - typings.arcgisJsApi.esri.TimeStampNode
  - typings.arcgisJsApi.esri.UnaryNode
  - typings.arcgisJsApi.esri.WhenNode
*/
trait SQLNode extends StObject
object SQLNode {
  
  inline def BinaryNode(
    left: SQLNode,
    operator: AND | OR | IS | ISNOT | IN | (`NOT IN`) | BETWEEN | NOTBETWEEN | LIKE | (`NOT LIKE`) | LessthansignGreaterthansign | Lessthansign | Greaterthansign | GreaterthansignEqualssign | LessthansignEqualssign | Equalssign | Asterisk | `-_` | Plussign | Slash,
    right: SQLNode
  ): typings.arcgisJsApi.esri.BinaryNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary-expression")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.BinaryNode]
  }
  
  inline def BoolNode(value: Boolean): typings.arcgisJsApi.esri.BoolNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.BoolNode]
  }
  
  inline def ColumnNode(): typings.arcgisJsApi.esri.ColumnNode = {
    val __obj = js.Dynamic.literal(column = "string")
    __obj.updateDynamic("type")("column-reference")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ColumnNode]
  }
  
  inline def CurrentTimeNode(mode: timestamp | date): typings.arcgisJsApi.esri.CurrentTimeNode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("current-time")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CurrentTimeNode]
  }
  
  inline def DateNode(value: String): typings.arcgisJsApi.esri.DateNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.DateNode]
  }
  
  inline def FunctionNode(args: ListNode, name: String): typings.arcgisJsApi.esri.FunctionNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("function")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.FunctionNode]
  }
  
  inline def IntervalNode(
    op: Plussign | `-_` | _empty,
    qualifier: IntervalQualifierNode | IntervalPeriodNode,
    value: StringNode
  ): typings.arcgisJsApi.esri.IntervalNode = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.IntervalNode]
  }
  
  inline def IntervalPeriodNode(period: day | month | hour | second | year | minute, precision: Double): typings.arcgisJsApi.esri.IntervalPeriodNode = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], secondary = "number")
    __obj.updateDynamic("type")("interval-period")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.IntervalPeriodNode]
  }
  
  inline def IntervalQualifierNode(period: day | month | hour | second | year | minute, precision: Double): typings.arcgisJsApi.esri.IntervalQualifierNode = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], secondary = "number")
    __obj.updateDynamic("type")("interval-qualifier")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.IntervalQualifierNode]
  }
  
  inline def ListNode(expr: SQLNode): typings.arcgisJsApi.esri.ListNode = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("expression-list")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ListNode]
  }
  
  inline def NullNode(value: Null): typings.arcgisJsApi.esri.NullNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.NullNode]
  }
  
  inline def NumberNode(value: Double): typings.arcgisJsApi.esri.NumberNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.NumberNode]
  }
  
  inline def SearchedCaseNode(clauses: js.Array[WhenNode], `else`: SQLNode): typings.arcgisJsApi.esri.SearchedCaseNode = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], format = "searched")
    __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("case-expression")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SearchedCaseNode]
  }
  
  inline def SimpleCaseNode(clauses: js.Array[WhenNode], `else`: SQLNode, operand: SQLNode): typings.arcgisJsApi.esri.SimpleCaseNode = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], format = "simple", operand = operand.asInstanceOf[js.Any])
    __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("case_expression")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SimpleCaseNode]
  }
  
  inline def StringNode(value: String): typings.arcgisJsApi.esri.StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.StringNode]
  }
  
  inline def TimeStampNode(value: String): typings.arcgisJsApi.esri.TimeStampNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.TimeStampNode]
  }
  
  inline def UnaryNode(expr: SQLNode): typings.arcgisJsApi.esri.UnaryNode = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unary-expression")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.UnaryNode]
  }
  
  inline def WhenNode(operand: SQLNode, value: SQLNode): typings.arcgisJsApi.esri.WhenNode = {
    val __obj = js.Dynamic.literal(operand = operand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("when-clause")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.WhenNode]
  }
}
