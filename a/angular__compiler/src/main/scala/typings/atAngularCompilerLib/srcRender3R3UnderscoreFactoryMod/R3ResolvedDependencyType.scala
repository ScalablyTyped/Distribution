package typings
package atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod

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
  sealed trait Attribute
    extends atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3ResolvedDependencyType
  
  /**
    * A normal token dependency.
    */
  @js.native
  sealed trait Token
    extends atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3ResolvedDependencyType
  
  /* 1 */ val Attribute: Attribute with scala.Double = js.native
  /* 0 */ val Token: Token with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3ResolvedDependencyType with scala.Double
  ] = js.native
}

