package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the speed values of animation/fade effects. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait AnimationSpeed extends js.Object

object AnimationSpeed {
  /** set the speed from the animation/fade to fast. */
  @scala.inline
  def FAST: `2` = this.cast(2)
  /** set the speed from the animation/fade to medium. */
  @scala.inline
  def MEDIUM: `1` = this.cast(1)
  /** set the speed from the animation/fade to slow. */
  @scala.inline
  def SLOW: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

