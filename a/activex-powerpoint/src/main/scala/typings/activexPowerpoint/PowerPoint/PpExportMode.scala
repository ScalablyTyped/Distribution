package typings.activexPowerpoint.PowerPoint

import typings.activexPowerpoint.activexPowerpointNumbers.`1`
import typings.activexPowerpoint.activexPowerpointNumbers.`2`
import typings.activexPowerpoint.activexPowerpointNumbers.`3`
import typings.activexPowerpoint.activexPowerpointNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexPowerpoint.activexPowerpointNumbers.`2`
  - typings.activexPowerpoint.activexPowerpointNumbers.`1`
  - typings.activexPowerpoint.activexPowerpointNumbers.`3`
  - typings.activexPowerpoint.activexPowerpointNumbers.`4`
*/
trait PpExportMode extends js.Object

object PpExportMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ppClipRelativeToSlide: `2` = this.cast(2)
  @scala.inline
  def ppRelativeToSlide: `1` = this.cast(1)
  @scala.inline
  def ppScaleToFit: `3` = this.cast(3)
  @scala.inline
  def ppScaleXY: `4` = this.cast(4)
}

