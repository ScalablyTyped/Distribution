package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelPosition extends js.Object {
  
  def absolute(): IPanelPosition = js.native
  
  def addPanelPosition(xPosition: String, yPosition: String): IPanelPosition = js.native
  
   // default: '0'
  def bottom(): IPanelPosition = js.native
  def bottom(bottom: String): IPanelPosition = js.native
  
  def center(): IPanelPosition = js.native
  
   // default: '0'
  def centerHorizontally(): IPanelPosition = js.native
  
  def centerVertically(): IPanelPosition = js.native
  
   // default: '0'
  def end(): IPanelPosition = js.native
  def end(end: String): IPanelPosition = js.native
  
   // default: '0'
  def left(): IPanelPosition = js.native
  def left(left: String): IPanelPosition = js.native
  
  def relativeTo(someElement: String): IPanelPosition = js.native
  def relativeTo(someElement: JQuery): IPanelPosition = js.native
  def relativeTo(someElement: Element): IPanelPosition = js.native
  
   // default: '0'
  def right(): IPanelPosition = js.native
  def right(right: String): IPanelPosition = js.native
  
   // default: '0'
  def start(): IPanelPosition = js.native
  def start(start: String): IPanelPosition = js.native
  
  def top(): IPanelPosition = js.native
  def top(top: String): IPanelPosition = js.native
  
  def withOffsetX(offsetX: String): IPanelPosition = js.native
  def withOffsetX(offsetX: js.Function1[/* panel */ this.type, String]): IPanelPosition = js.native
  
  def withOffsetY(offsetY: String): IPanelPosition = js.native
  def withOffsetY(offsetY: js.Function1[/* panel */ this.type, String]): IPanelPosition = js.native
}
