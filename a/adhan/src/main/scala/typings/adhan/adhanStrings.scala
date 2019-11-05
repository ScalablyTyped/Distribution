package typings.adhan

import typings.adhan.adhanMod.TimeMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object adhanStrings {
  @js.native
  sealed trait `12h` extends TimeMode
  
  @js.native
  sealed trait `24h` extends TimeMode
  
  @scala.inline
  def `12h`: `12h` = "12h".asInstanceOf[`12h`]
  @scala.inline
  def `24h`: `24h` = "24h".asInstanceOf[`24h`]
}

