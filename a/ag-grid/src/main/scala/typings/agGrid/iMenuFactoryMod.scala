package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iMenuFactoryMod {
  
  @js.native
  trait IMenuFactory extends StObject {
    
    def hideActiveMenu(): Unit = js.native
    
    def isMenuEnabled(column: Column): Boolean = js.native
    
    def showMenuAfterButtonClick(column: Column, eventSource: HTMLElement): Unit = js.native
    def showMenuAfterButtonClick(column: Column, eventSource: HTMLElement, defaultTab: String): Unit = js.native
    def showMenuAfterButtonClick(column: Column, eventSource: HTMLElement, defaultTab: String, restrictToTabs: js.Array[String]): Unit = js.native
    def showMenuAfterButtonClick(column: Column, eventSource: HTMLElement, defaultTab: Unit, restrictToTabs: js.Array[String]): Unit = js.native
    
    def showMenuAfterMouseEvent(column: Column, mouseEvent: MouseEvent): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: MouseEvent, defaultTab: String): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: MouseEvent, defaultTab: String, restrictToTabs: js.Array[String]): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: MouseEvent, defaultTab: Unit, restrictToTabs: js.Array[String]): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: Touch): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: Touch, defaultTab: String): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: Touch, defaultTab: String, restrictToTabs: js.Array[String]): Unit = js.native
    def showMenuAfterMouseEvent(column: Column, mouseEvent: Touch, defaultTab: Unit, restrictToTabs: js.Array[String]): Unit = js.native
  }
}
