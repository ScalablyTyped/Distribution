package typings.antvDomUtil

import org.scalablytyped.runtime.StringDictionary
import typings.antvDomUtil.anon.Remove
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/dom-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addEventListener(target: HTMLElement, eventType: String, callback: js.Any): Remove = js.native
  
  def createDom(str: String): js.Any = js.native
  
  def getHeight(el: HTMLElement): Double = js.native
  def getHeight(el: HTMLElement, defaultValue: js.Any): Double = js.native
  
  def getOuterHeight(el: HTMLElement): Double = js.native
  def getOuterHeight(el: HTMLElement, defaultValue: js.Any): Double = js.native
  
  def getOuterWidth(el: HTMLElement): Double = js.native
  def getOuterWidth(el: HTMLElement, defaultValue: js.Any): Double = js.native
  
  def getRatio(): Double = js.native
  
  def getStyle(dom: HTMLElement, name: String): js.Any = js.native
  def getStyle(dom: HTMLElement, name: String, defaultValue: js.Any): js.Any = js.native
  
  def getWidth(el: HTMLElement): Double = js.native
  def getWidth(el: HTMLElement, defaultValue: js.Any): Double = js.native
  
  def modifyCSS(dom: HTMLElement, css: StringDictionary[js.Any]): HTMLElement = js.native
}
