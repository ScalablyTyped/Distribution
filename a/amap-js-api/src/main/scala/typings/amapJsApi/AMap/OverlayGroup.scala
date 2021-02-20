package typings.amapJsApi.AMap

import typings.amapJsApi.ReferOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayGroup[O /* <: Overlay[_] */, ExtraData] extends Overlay[ExtraData] {
  
  /**
    * 添加单个覆盖物到集合中，不支持添加重复的覆盖物
    * @param overlay 覆盖物
    */
  def addOverlay(overlay: O): this.type = js.native
  def addOverlay(overlay: js.Array[O]): this.type = js.native
  
  /**
    *     添加覆盖物数组到集合中，不支持添加重复的覆盖物
    * @param overlay 覆盖物数组
    */
  def addOverlays(overlay: O): this.type = js.native
  def addOverlays(overlay: js.Array[O]): this.type = js.native
  
  /**
    * 清空集合
    */
  def clearOverlays(): this.type = js.native
  
  /**
    * 对集合中的覆盖物做迭代操作
    * @param iterator 迭代回调
    * @param context 执行上下文
    */
  def eachOverlay[C](
    iterator: js.ThisFunction3[/* this */ C, /* overlay */ O, /* index */ Double, /* overlays */ js.Array[O], Unit]
  ): this.type = js.native
  def eachOverlay[C](
    iterator: js.ThisFunction3[/* this */ C, /* overlay */ O, /* index */ Double, /* overlays */ js.Array[O], Unit],
    context: C
  ): this.type = js.native
  
  def getOverlay(finder: O): O | Null = js.native
  /**
    * 查找集合中的覆盖物
    * @param finder 查找回调
    */
  def getOverlay(
    finder: js.ThisFunction3[/* this */ Null, /* item */ O, /* index */ Double, /* list */ js.Array[O], Boolean]
  ): O | Null = js.native
  
  /**
    * 返回当前集合中所有的覆盖物
    */
  def getOverlays(): js.Array[O] = js.native
  
  /**
    * 判断传入的覆盖物实例是否在集合中
    * @param overlay 覆盖物
    */
  def hasOverlay(overlay: O): Boolean = js.native
  def hasOverlay(
    overlay: js.ThisFunction3[/* this */ Null, /* item */ O, /* index */ Double, /* list */ js.Array[O], Boolean]
  ): Boolean = js.native
  
  /**
    * 从集合中删除传入的覆盖物实例
    * @param overlay 覆盖物
    */
  def removeOverlay(overlay: O): this.type = js.native
  def removeOverlay(overlay: js.Array[O]): this.type = js.native
  
  /**
    *     从集合中删除传入的覆盖物实例数组
    * @param overlay 覆盖物数组
    */
  def removeOverlays(overlay: O): this.type = js.native
  def removeOverlays(overlay: js.Array[O]): this.type = js.native
  
  /**
    * 修改覆盖物属性
    * @param options 属性
    */
  def setOptions(options: ReferOverlayOptions[O]): this.type = js.native
}
