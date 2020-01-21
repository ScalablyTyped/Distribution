package typings.activexPowerpoint.PowerPoint

import typings.activexPowerpoint.activexPowerpointNumbers.`0`
import typings.activexPowerpoint.activexPowerpointNumbers.`1`
import typings.activexPowerpoint.activexPowerpointNumbers.`2`
import typings.activexPowerpoint.activexPowerpointNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexPowerpoint.activexPowerpointNumbers.`3`
  - typings.activexPowerpoint.activexPowerpointNumbers.`1`
  - typings.activexPowerpoint.activexPowerpointNumbers.`0`
  - typings.activexPowerpoint.activexPowerpointNumbers.`2`
*/
trait PpPlayerState extends js.Object

object PpPlayerState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ppNotReady: `3` = this.cast(3)
  @scala.inline
  def ppPaused: `1` = this.cast(1)
  @scala.inline
  def ppPlaying: `0` = this.cast(0)
  @scala.inline
  def ppStopped: `2` = this.cast(2)
}

