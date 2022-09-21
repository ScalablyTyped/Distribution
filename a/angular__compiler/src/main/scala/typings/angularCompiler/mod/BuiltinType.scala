package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "BuiltinType")
@js.native
open class BuiltinType protected () extends Type {
  def this(name: BuiltinTypeName) = this()
  def this(name: BuiltinTypeName, modifiers: TypeModifier) = this()
  
  var name: BuiltinTypeName = js.native
}
