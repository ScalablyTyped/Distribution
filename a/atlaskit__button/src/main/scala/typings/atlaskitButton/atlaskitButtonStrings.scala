package typings.atlaskitButton

import typings.atlaskitButton.mod.ButtonAppearances
import typings.atlaskitButton.mod.ButtonSpacing
import typings.atlaskitButton.mod.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atlaskitButtonStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ButtonAppearances
       with ButtonSpacing
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait button
    extends StObject
       with ButtonType
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait compact
    extends StObject
       with ButtonSpacing
  inline def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait danger
    extends StObject
       with ButtonAppearances
  inline def danger: danger = "danger".asInstanceOf[danger]
  
  @js.native
  sealed trait help
    extends StObject
       with ButtonAppearances
  inline def help: help = "help".asInstanceOf[help]
  
  @js.native
  sealed trait link
    extends StObject
       with ButtonAppearances
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait none
    extends StObject
       with ButtonSpacing
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait primary
    extends StObject
       with ButtonAppearances
  inline def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait submit
    extends StObject
       with ButtonType
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait subtle
    extends StObject
       with ButtonAppearances
  inline def subtle: subtle = "subtle".asInstanceOf[subtle]
  
  @js.native
  sealed trait `subtle-link`
    extends StObject
       with ButtonAppearances
  inline def `subtle-link`: `subtle-link` = "subtle-link".asInstanceOf[`subtle-link`]
  
  @js.native
  sealed trait warning
    extends StObject
       with ButtonAppearances
  inline def warning: warning = "warning".asInstanceOf[warning]
}
