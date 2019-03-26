package typings
package agDashGridLib.distLibInterfacesIMenuFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuFactory extends js.Object {
  def hideActiveMenu(): scala.Unit = js.native
  def isMenuEnabled(column: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Boolean = js.native
  def showMenuAfterButtonClick(column: agDashGridLib.distLibEntitiesColumnMod.Column, eventSource: stdLib.HTMLElement): scala.Unit = js.native
  def showMenuAfterButtonClick(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    eventSource: stdLib.HTMLElement,
    defaultTab: java.lang.String
  ): scala.Unit = js.native
  def showMenuAfterButtonClick(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    eventSource: stdLib.HTMLElement,
    defaultTab: java.lang.String,
    restrictToTabs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def showMenuAfterMouseEvent(column: agDashGridLib.distLibEntitiesColumnMod.Column, mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def showMenuAfterMouseEvent(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    mouseEvent: stdLib.MouseEvent,
    defaultTab: java.lang.String
  ): scala.Unit = js.native
  def showMenuAfterMouseEvent(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    mouseEvent: stdLib.MouseEvent,
    defaultTab: java.lang.String,
    restrictToTabs: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def showMenuAfterMouseEvent(column: agDashGridLib.distLibEntitiesColumnMod.Column, mouseEvent: stdLib.Touch): scala.Unit = js.native
  def showMenuAfterMouseEvent(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    mouseEvent: stdLib.Touch,
    defaultTab: java.lang.String
  ): scala.Unit = js.native
  def showMenuAfterMouseEvent(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    mouseEvent: stdLib.Touch,
    defaultTab: java.lang.String,
    restrictToTabs: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

