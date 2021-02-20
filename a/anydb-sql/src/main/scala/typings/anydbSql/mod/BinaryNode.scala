package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryNode extends StObject {
  
  def and(node: BinaryNode): BinaryNode = js.native
  
  def or(node: BinaryNode): BinaryNode = js.native
}
object BinaryNode {
  
  @scala.inline
  def apply(and: BinaryNode => BinaryNode, or: BinaryNode => BinaryNode): BinaryNode = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[BinaryNode]
  }
  
  @scala.inline
  implicit class BinaryNodeMutableBuilder[Self <: BinaryNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: BinaryNode => BinaryNode): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOr(value: BinaryNode => BinaryNode): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
  }
}
