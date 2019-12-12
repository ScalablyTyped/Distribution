package typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3ResolvedDependencyType.Attribute
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3ResolvedDependencyType.ChangeDetectorRef
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3ResolvedDependencyType.Token
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
    * Injecting the `ChangeDetectorRef` token. Needs special handling when injected into a pipe.
    */
  @js.native
  sealed trait ChangeDetectorRef extends R3ResolvedDependencyType
  
  /**
    * A normal token dependency.
    */
  @js.native
  sealed trait Token extends R3ResolvedDependencyType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3ResolvedDependencyType with Double] = js.native
  /* 1 */ @js.native
  object Attribute extends TopLevel[Attribute with Double]
  
  /* 2 */ @js.native
  object ChangeDetectorRef extends TopLevel[ChangeDetectorRef with Double]
  
  /* 0 */ @js.native
  object Token extends TopLevel[Token with Double]
  
}

