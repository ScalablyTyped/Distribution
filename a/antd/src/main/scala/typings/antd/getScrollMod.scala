package typings.antd

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getScrollMod {
  
  @JSImport("antd/lib/_util/getScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(target: Null, top: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def default(target: Document, top: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def default(target: HTMLElement, top: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def default(target: Window, top: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isWindow(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindow")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
