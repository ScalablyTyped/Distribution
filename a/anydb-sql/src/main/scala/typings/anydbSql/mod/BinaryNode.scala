package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryNode extends StObject {
  
  def and(node: BinaryNode): BinaryNode
  
  def or(node: BinaryNode): BinaryNode
}
object BinaryNode {
  
  inline def apply(and: BinaryNode => BinaryNode, or: BinaryNode => BinaryNode): BinaryNode = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[BinaryNode]
  }
  
  extension [Self <: BinaryNode](x: Self) {
    
    inline def setAnd(value: BinaryNode => BinaryNode): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    inline def setOr(value: BinaryNode => BinaryNode): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
  }
}
