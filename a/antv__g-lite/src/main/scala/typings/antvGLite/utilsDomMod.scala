package typings.antvGLite

import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.distTypesMod.CanvasLike
import typings.antvGLite.domInterfacesMod.IElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDomMod {
  
  @JSImport("@antv/g-lite/dist/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findClosestClipPathTarget(`object`: DisplayObject[Any, Any]): DisplayObject[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findClosestClipPathTarget")(`object`.asInstanceOf[js.Any]).asInstanceOf[DisplayObject[Any, Any]]
  
  inline def getHeight($el: CanvasLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")($el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getHeight($el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")($el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getStyle($el: CanvasLike, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")($el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getStyle($el: HTMLElement, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")($el.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWidth($el: CanvasLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")($el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWidth($el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")($el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setDOMSize($el: CanvasLike, width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDOMSize")($el.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sortByZIndex(o1: IElement[Any, Any], o2: IElement[Any, Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByZIndex")(o1.asInstanceOf[js.Any], o2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
