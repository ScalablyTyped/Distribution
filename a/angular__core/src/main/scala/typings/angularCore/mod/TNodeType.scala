package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`0`
import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import typings.angularCore.angularCoreNumbers.`3`
import typings.angularCore.angularCoreNumbers.`4`
import typings.angularCore.angularCoreNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TNodeType corresponds to the {@link TNode} `type` property.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`0`
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
  - typings.angularCore.angularCoreNumbers.`3`
  - typings.angularCore.angularCoreNumbers.`4`
  - typings.angularCore.angularCoreNumbers.`5`
*/
trait TNodeType extends js.Object

object TNodeType {
  /**
    * The TNode contains information about an {@link LContainer} for embedded views.
    */
  @scala.inline
  def Container: `0` = 0.asInstanceOf[`0`]
  /**
    * The TNode contains information about a DOM element aka {@link RNode}.
    */
  @scala.inline
  def Element: `3` = 3.asInstanceOf[`3`]
  /**
    * The TNode contains information about an `<ng-container>` element {@link RNode}.
    */
  @scala.inline
  def ElementContainer: `4` = 4.asInstanceOf[`4`]
  /**
    * The TNode contains information about an ICU comment used in `i18n`.
    */
  @scala.inline
  def IcuContainer: `5` = 5.asInstanceOf[`5`]
  /**
    * The TNode contains information about an `<ng-content>` projection
    */
  @scala.inline
  def Projection: `1` = 1.asInstanceOf[`1`]
  /**
    * The TNode contains information about an {@link LView}
    */
  @scala.inline
  def View: `2` = 2.asInstanceOf[`2`]
}

