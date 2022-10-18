package typings.antvG2

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.libInterfaceMod.Size
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilDomMod {
  
  @JSImport("@antv/g2/lib/util/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDom(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDom")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getChartSize(ele: HTMLElement, autoFit: Boolean, width: Double, height: Double): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("getChartSize")(ele.asInstanceOf[js.Any], autoFit.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Size]
  
  inline def modifyCSS(dom: HTMLElement, css: StringDictionary[Any]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyCSS")(dom.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def removeDom(dom: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDom")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
