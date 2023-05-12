package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TransplantedType")
@js.native
open class TransplantedType[T] protected () extends Type {
  def this(`type`: T) = this()
  def this(`type`: T, modifiers: TypeModifier) = this()
  
  val `type`: T = js.native
}
