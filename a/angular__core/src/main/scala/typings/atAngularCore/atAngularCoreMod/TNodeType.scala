package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.atAngularCoreNumbers.`0`
import typings.atAngularCore.atAngularCoreNumbers.`1`
import typings.atAngularCore.atAngularCoreNumbers.`2`
import typings.atAngularCore.atAngularCoreNumbers.`3`
import typings.atAngularCore.atAngularCoreNumbers.`4`
import typings.atAngularCore.atAngularCoreNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TNodeType corresponds to the {@link TNode} `type` property.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atAngularCore.atAngularCoreNumbers.`0`
  - typings.atAngularCore.atAngularCoreNumbers.`1`
  - typings.atAngularCore.atAngularCoreNumbers.`2`
  - typings.atAngularCore.atAngularCoreNumbers.`3`
  - typings.atAngularCore.atAngularCoreNumbers.`4`
  - typings.atAngularCore.atAngularCoreNumbers.`5`
*/
trait TNodeType extends js.Object

object TNodeType {
  /**
    * The TNode contains information about an {@link LContainer} for embedded views.
    */
  @scala.inline
  def Container: `0` = this.cast(0)
  /**
    * The TNode contains information about a DOM element aka {@link RNode}.
    */
  @scala.inline
  def Element: `3` = this.cast(3)
  /**
    * The TNode contains information about an `<ng-container>` element {@link RNode}.
    */
  @scala.inline
  def ElementContainer: `4` = this.cast(4)
  /**
    * The TNode contains information about an ICU comment used in `i18n`.
    */
  @scala.inline
  def IcuContainer: `5` = this.cast(5)
  /**
    * The TNode contains information about an `<ng-content>` projection
    */
  @scala.inline
  def Projection: `1` = this.cast(1)
  /**
    * The TNode contains information about an {@link LView}
    */
  @scala.inline
  def View: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

