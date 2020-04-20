package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`-1`
import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to track:
  *  - Inline embedded views (see: `ɵɵembeddedViewStart`)
  *  - Transplanted `LView`s (see: `LView[DECLARATION_COMPONENT_VIEW])`
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`-1`
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
*/
trait ActiveIndexFlag extends js.Object

object ActiveIndexFlag {
  /**
    * Flag which signifies that the `LContainer` does not have any inline embedded views.
    */
  @scala.inline
  def DYNAMIC_EMBEDDED_VIEWS_ONLY: `-1` = -1.asInstanceOf[`-1`]
  /**
    * Flag to signify that this `LContainer` may have transplanted views which need to be change
    * detected. (see: `LView[DECLARATION_COMPONENT_VIEW])`.
    *
    * This flag once set is never unset for the `LContainer`. This means that when unset we can skip
    * a lot of work in `refreshDynamicEmbeddedViews`. But when set we still need to verify
    * that the `MOVED_VIEWS` are transplanted and on-push.
    */
  @scala.inline
  def HAS_TRANSPLANTED_VIEWS: `1` = 1.asInstanceOf[`1`]
  /**
    * When incrementing the active index for inline embedded views, the amount to increment to leave
    * space for other flags.
    */
  @scala.inline
  def INCREMENT: `2` = 2.asInstanceOf[`2`]
  /**
    * Number of bits to shift inline embedded views counter to make space for other flags.
    */
  @scala.inline
  def SHIFT: `1` = 1.asInstanceOf[`1`]
}

