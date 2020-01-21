package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`0`
import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import typings.angularCore.angularCoreNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of flags used to configure the config value present within a
  * `TStylingContext` value.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`0`
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
  - typings.angularCore.angularCoreNumbers.`3`
*/
trait TStylingConfigFlags extends js.Object

object TStylingConfigFlags {
  /**
    * The initial state of the styling context config
    */
  @scala.inline
  def Initial: `0` = this.cast(0)
  /**
    * A flag which marks the context as being locked.
    *
    * The styling context is constructed across an element template
    * function as well as any associated hostBindings functions. When
    * this occurs, the context itself is open to mutation and only once
    * it has been flushed once then it will be locked for good (no extra
    * bindings can be added to it).
    */
  @scala.inline
  def Locked: `1` = this.cast(1)
  /** A Mask of all the configurations */
  @scala.inline
  def Mask: `3` = this.cast(3)
  /**
    * Whether or not to store the state between updates in a global storage map.
    *
    * This flag helps the algorithm avoid storing all state values temporarily in
    * a storage map (that lives in `state.ts`). The flag is only flipped to true if
    * and when an element contains style/class bindings that exist both on the
    * template-level as well as within host bindings on the same element. This is a
    * rare case, and a storage map is required so that the state values can be restored
    * between the template code running and the host binding code executing.
    */
  @scala.inline
  def PersistStateValues: `2` = this.cast(2)
  /** Total amount of configuration bits used */
  @scala.inline
  def TotalBits: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

