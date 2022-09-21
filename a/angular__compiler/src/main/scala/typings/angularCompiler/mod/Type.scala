package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Type")
@js.native
abstract class Type () extends StObject {
  def this(modifiers: TypeModifier) = this()
  
  def hasModifier(modifier: TypeModifier): Boolean = js.native
  
  var modifiers: TypeModifier = js.native
  
  def visitType(visitor: TypeVisitor, context: Any): Any = js.native
}
