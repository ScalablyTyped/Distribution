package typings.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredicateType[T]
  extends BaseType[T]
     with Type[T] {
  
  val kind: typings.astTypes.astTypesStrings.PredicateType = js.native
  
  val name: String = js.native
  
  def predicate(value: js.Any): Boolean = js.native
  def predicate(value: js.Any, deep: Deep): Boolean = js.native
}
