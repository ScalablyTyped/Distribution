package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TNodeType extends js.Object

/**
  * TNodeType corresponds to the {@link TNode} `type` property.
  */
@JSImport("@angular/core", "TNodeType")
@js.native
object TNodeType extends js.Object {
  /**
    * The TNode contains information about an {@link LContainer} for embedded views.
    */
  @js.native
  sealed trait Container
    extends atAngularCoreLib.atAngularCoreMod.TNodeType
  
  /**
    * The TNode contains information about a DOM element aka {@link RNode}.
    */
  @js.native
  sealed trait Element
    extends atAngularCoreLib.atAngularCoreMod.TNodeType
  
  /**
    * The TNode contains information about an `<ng-container>` element {@link RNode}.
    */
  @js.native
  sealed trait ElementContainer
    extends atAngularCoreLib.atAngularCoreMod.TNodeType
  
  /**
    * The TNode contains information about an ICU comment used in `i18n`.
    */
  @js.native
  sealed trait IcuContainer
    extends atAngularCoreLib.atAngularCoreMod.TNodeType
  
  /**
    * The TNode contains information about an `<ng-content>` projection
    */
  @js.native
  sealed trait Projection
    extends atAngularCoreLib.atAngularCoreMod.TNodeType
  
  /**
    * The TNode contains information about an {@link LView}
    */
  @js.native
  sealed trait View
    extends atAngularCoreLib.atAngularCoreMod.TNodeType
  
}

