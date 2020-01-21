package typings.antDesignIcons

import typings.antDesignIcons.typesMod.ThemeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object antDesignIconsStrings {
  @js.native
  sealed trait fill extends ThemeType
  
  @js.native
  sealed trait outline extends ThemeType
  
  @js.native
  sealed trait twotone extends ThemeType
  
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  @scala.inline
  def outline: outline = "outline".asInstanceOf[outline]
  @scala.inline
  def twotone: twotone = "twotone".asInstanceOf[twotone]
}

