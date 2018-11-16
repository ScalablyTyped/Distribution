package typings
package atAngularCoreLib.srcRender3InterfacesProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectorFlags extends js.Object

@JSImport("@angular/core/src/render3/interfaces/projection", "SelectorFlags")
@js.native
object SelectorFlags extends js.Object {
  /** Mode for matching attributes */
  @js.native
  sealed trait ATTRIBUTE
    extends atAngularCoreLib.srcRender3InterfacesProjectionMod.SelectorFlags
  
  /** Mode for matching class names */
  @js.native
  sealed trait CLASS
    extends atAngularCoreLib.srcRender3InterfacesProjectionMod.SelectorFlags
  
  /** Mode for matching tag names */
  @js.native
  sealed trait ELEMENT
    extends atAngularCoreLib.srcRender3InterfacesProjectionMod.SelectorFlags
  
  /** Indicates this is the beginning of a new negative selector */
  @js.native
  sealed trait NOT
    extends atAngularCoreLib.srcRender3InterfacesProjectionMod.SelectorFlags
  
  /* 2 */ val ATTRIBUTE: ATTRIBUTE with scala.Double = js.native
  /* 8 */ val CLASS: CLASS with scala.Double = js.native
  /* 4 */ val ELEMENT: ELEMENT with scala.Double = js.native
  /* 1 */ val NOT: NOT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCoreLib.srcRender3InterfacesProjectionMod.SelectorFlags with scala.Double
  ] = js.native
}

