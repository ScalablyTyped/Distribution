package typings.atAtlaskitButton

import typings.atAtlaskitButton.atAtlaskitButtonMod.ButtonAppearances
import typings.atAtlaskitButton.atAtlaskitButtonMod.ButtonSpacing
import typings.atAtlaskitButton.atAtlaskitButtonMod.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atAtlaskitButtonStrings {
  @js.native
  sealed trait button extends ButtonType
  
  @js.native
  sealed trait compact extends ButtonSpacing
  
  @js.native
  sealed trait danger extends ButtonAppearances
  
  @js.native
  sealed trait default
    extends ButtonAppearances
       with ButtonSpacing
  
  @js.native
  sealed trait help extends ButtonAppearances
  
  @js.native
  sealed trait link extends ButtonAppearances
  
  @js.native
  sealed trait none extends ButtonSpacing
  
  @js.native
  sealed trait primary extends ButtonAppearances
  
  @js.native
  sealed trait submit extends ButtonType
  
  @js.native
  sealed trait subtle extends ButtonAppearances
  
  @js.native
  sealed trait `subtle-link` extends ButtonAppearances
  
  @js.native
  sealed trait warning extends ButtonAppearances
  
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  @scala.inline
  def danger: danger = "danger".asInstanceOf[danger]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def help: help = "help".asInstanceOf[help]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  @scala.inline
  def subtle: subtle = "subtle".asInstanceOf[subtle]
  @scala.inline
  def `subtle-link`: `subtle-link` = "subtle-link".asInstanceOf[`subtle-link`]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

