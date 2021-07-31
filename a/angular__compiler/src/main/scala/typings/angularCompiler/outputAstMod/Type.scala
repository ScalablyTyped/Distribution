package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "Type")
@js.native
abstract class Type () extends StObject {
  def this(modifiers: js.Array[TypeModifier]) = this()
  
  def hasModifier(modifier: TypeModifier): Boolean = js.native
  
  var modifiers: js.Array[TypeModifier] = js.native
  
  def visitType(visitor: TypeVisitor, context: js.Any): js.Any = js.native
}
