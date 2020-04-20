package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`0`
import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Explicitly marks `TView` as a specific type in `ngDevMode`
  *
  * It is useful to know conceptually what time of `TView` we are dealing with when
  * debugging an application (even if the runtime does not need it.) For this reason
  * we store this information in the `ngDevMode` `TView` and than use it for
  * better debugging experience.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`0`
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
*/
trait TViewType extends js.Object

object TViewType {
  /**
    * `TView` associated with a Component. This would be the `TView` directly associated with the
    * component view (as opposed an `Embedded` `TView` which would be a child of `Component` `TView`)
    */
  @scala.inline
  def Component: `1` = 1.asInstanceOf[`1`]
  /**
    * `TView` associated with a template. Such as `*ngIf`, `<ng-template>` etc... A `Component`
    * can have zero or more `Embedede` `TView`s.
    */
  @scala.inline
  def Embedded: `2` = 2.asInstanceOf[`2`]
  /**
    * Root `TView` is the used to bootstrap components into. It is used in conjunction with
    * `LView` which takes an existing DOM node not owned by Angular and wraps it in `TView`/`LView`
    * so that other components can be loaded into it.
    */
  @scala.inline
  def Root: `0` = 0.asInstanceOf[`0`]
}

