package typings.atlaskitCalendar

import typings.atlaskitCalendar.mod.ArrowKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atlaskitCalendarStrings {
  @js.native
  sealed trait down extends ArrowKeys
  
  @js.native
  sealed trait left extends ArrowKeys
  
  @js.native
  sealed trait next extends js.Object
  
  @js.native
  sealed trait prev extends js.Object
  
  @js.native
  sealed trait right extends ArrowKeys
  
  @js.native
  sealed trait up extends ArrowKeys
  
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def next: next = "next".asInstanceOf[next]
  @scala.inline
  def prev: prev = "prev".asInstanceOf[prev]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}

