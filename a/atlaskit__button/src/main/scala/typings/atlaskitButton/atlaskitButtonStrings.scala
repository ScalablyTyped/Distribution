package typings.atlaskitButton

import typings.atlaskitButton.mod.ButtonAppearances
import typings.atlaskitButton.mod.ButtonSpacing
import typings.atlaskitButton.mod.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atlaskitButtonStrings {
  
  @js.native
  sealed trait default
    extends ButtonAppearances
       with ButtonSpacing
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait button extends ButtonType
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait compact extends ButtonSpacing
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait danger extends ButtonAppearances
  @scala.inline
  def danger: danger = "danger".asInstanceOf[danger]
  
  @js.native
  sealed trait help extends ButtonAppearances
  @scala.inline
  def help: help = "help".asInstanceOf[help]
  
  @js.native
  sealed trait link extends ButtonAppearances
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait none extends ButtonSpacing
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait primary extends ButtonAppearances
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait submit extends ButtonType
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait subtle extends ButtonAppearances
  @scala.inline
  def subtle: subtle = "subtle".asInstanceOf[subtle]
  
  @js.native
  sealed trait `subtle-link` extends ButtonAppearances
  @scala.inline
  def `subtle-link`: `subtle-link` = "subtle-link".asInstanceOf[`subtle-link`]
  
  @js.native
  sealed trait warning extends ButtonAppearances
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
