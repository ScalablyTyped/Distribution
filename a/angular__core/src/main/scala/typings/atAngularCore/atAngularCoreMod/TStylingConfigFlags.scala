package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.atAngularCoreNumbers.`0`
import typings.atAngularCore.atAngularCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of flags used to configure the config value present within a
  * `TStylingContext` value.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atAngularCore.atAngularCoreNumbers.`0`
  - typings.atAngularCore.atAngularCoreNumbers.`1`
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
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

