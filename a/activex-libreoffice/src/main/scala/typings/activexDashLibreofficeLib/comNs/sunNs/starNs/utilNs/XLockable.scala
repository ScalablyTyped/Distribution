package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows locking a component
  *
  * `lock` and `unlock` calls can be nested. However, they must be in pairs. As long as there has been one more call to `lock` than to `unlock` , the
  * component is considered locked, which is reflected by {@link isLocked()} returning `TRUE` .
  */
trait XLockable extends js.Object {
  /**
    * determines whether the component is currently locked.
    * @see lock
    * @see unlock
    */
  def isLocked(): scala.Boolean
  /**
    * locks the component
    * @see unlock
    * @see isLocked
    */
  def lock(): scala.Unit
  /**
    * unlocks the component
    * @see lock
    * @see isLocked
    * @throws NotLockedException if the component is not currently locked.
    */
  def unlock(): scala.Unit
}

