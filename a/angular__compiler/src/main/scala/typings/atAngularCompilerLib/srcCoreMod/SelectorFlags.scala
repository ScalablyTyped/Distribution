package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectorFlags extends js.Object

@JSImport("@angular/compiler/src/core", "SelectorFlags")
@js.native
object SelectorFlags extends js.Object {
  /** Mode for matching attributes */
  @js.native
  sealed trait ATTRIBUTE
    extends atAngularCompilerLib.srcCoreMod.SelectorFlags
  
  /** Mode for matching class names */
  @js.native
  sealed trait CLASS
    extends atAngularCompilerLib.srcCoreMod.SelectorFlags
  
  /** Mode for matching tag names */
  @js.native
  sealed trait ELEMENT
    extends atAngularCompilerLib.srcCoreMod.SelectorFlags
  
  /** Indicates this is the beginning of a new negative selector */
  @js.native
  sealed trait NOT
    extends atAngularCompilerLib.srcCoreMod.SelectorFlags
  
  /* 2 */ val ATTRIBUTE: ATTRIBUTE with scala.Double = js.native
  /* 8 */ val CLASS: CLASS with scala.Double = js.native
  /* 4 */ val ELEMENT: ELEMENT with scala.Double = js.native
  /* 1 */ val NOT: NOT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.SelectorFlags with scala.Double] = js.native
}

