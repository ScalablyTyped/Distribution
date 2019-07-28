package typings.ansiDashColors

import typings.ansiDashColors.ansiDashColorsMod.OtherPlatformsSymbols
import typings.ansiDashColors.ansiDashColorsMod.WindowsSymbols
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Other extends js.Object {
  var other: OtherPlatformsSymbols
  var windows: WindowsSymbols
}

object Anon_Other {
  @scala.inline
  def apply(other: OtherPlatformsSymbols, windows: WindowsSymbols): Anon_Other = {
    val __obj = js.Dynamic.literal(other = other, windows = windows)
  
    __obj.asInstanceOf[Anon_Other]
  }
}

