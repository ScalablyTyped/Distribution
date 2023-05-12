package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableLFTagPolicy extends StObject {
  
  /**
    * A list of LF-tag conditions that apply to table resources.
    */
  var Expression: ListOfLFTags
}
object TableLFTagPolicy {
  
  inline def apply(Expression: ListOfLFTags): TableLFTagPolicy = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLFTagPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableLFTagPolicy] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: ListOfLFTags): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionVarargs(value: LFTag*): Self = StObject.set(x, "Expression", js.Array(value*))
  }
}
