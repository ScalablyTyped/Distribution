package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectorFlags extends js.Object

/** Flags used to build up CssSelectors */
@JSImport("@angular/core", "SelectorFlags")
@js.native
object SelectorFlags extends js.Object {
  /** Mode for matching attributes */
  @js.native
  sealed trait ATTRIBUTE
    extends atAngularCoreLib.atAngularCoreMod.SelectorFlags
  
  /** Mode for matching class names */
  @js.native
  sealed trait CLASS
    extends atAngularCoreLib.atAngularCoreMod.SelectorFlags
  
  /** Mode for matching tag names */
  @js.native
  sealed trait ELEMENT
    extends atAngularCoreLib.atAngularCoreMod.SelectorFlags
  
  /** Indicates this is the beginning of a new negative selector */
  @js.native
  sealed trait NOT
    extends atAngularCoreLib.atAngularCoreMod.SelectorFlags
  
}

