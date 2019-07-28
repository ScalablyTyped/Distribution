package typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait R3ResolvedDependencyType extends js.Object

@JSImport("@angular/compiler/src/render3/r3_factory", "R3ResolvedDependencyType")
@js.native
object R3ResolvedDependencyType extends js.Object {
  /**
    * The dependency is for an attribute.
    *
    * The token expression is a string representing the attribute name.
    */
  @js.native
  sealed trait Attribute extends R3ResolvedDependencyType
  
  /**
    * A normal token dependency.
    */
  @js.native
  sealed trait Token extends R3ResolvedDependencyType
  
  /* 1 */ val Attribute: typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3ResolvedDependencyType.Attribute with Double = js.native
  /* 0 */ val Token: typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3ResolvedDependencyType.Token with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3ResolvedDependencyType with Double] = js.native
}

