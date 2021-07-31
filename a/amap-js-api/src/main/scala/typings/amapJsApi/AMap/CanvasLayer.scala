package typings.amapJsApi.AMap

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasLayer
  extends StObject
     with MediaLayer[HTMLCanvasElement] {
  
  /**
    * 返回Canvas对象
    */
  def getCanvas(): js.UndefOr[HTMLCanvasElement] = js.native
  
  /**
    * 当canvas的内容发生改变是用于刷新图层
    */
  def reFresh(): Unit = js.native
  
  /**
    * 修改显示的Canvas
    * @param canvas Canvas对象
    */
  def setCanvas(canvas: HTMLCanvasElement): Unit = js.native
}
