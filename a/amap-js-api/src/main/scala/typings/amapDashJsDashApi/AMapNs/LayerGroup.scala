package typings.amapDashJsDashApi.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.LayerGroup")
@js.native
class LayerGroup[L] protected () extends Layer {
  /**
    * 图层集合
    * @param layers 集合中的图层
    */
  def this(layers: L) = this()
  def this(layers: js.Array[L]) = this()
  /**
    * 添加单个图层到集合中，不支持添加重复的图层
    * @param layer 图层
    */
  def addLayer(layer: L): this.type = js.native
  def addLayer(layer: js.Array[L]): this.type = js.native
  /**
    * 添加图层数组到集合中，不支持添加重复的图层
    * @param layers 图层数组
    */
  def addLayers(layers: L): this.type = js.native
  def addLayers(layers: js.Array[L]): this.type = js.native
  /**
    * 清空集合
    */
  def clearLayers(): this.type = js.native
  /**
    * 对集合中的图层做迭代操作
    * @param iterator 迭代回调
    * @param context 执行上下文
    */
  def eachLayer[C](
    iterator: js.ThisFunction3[/* this */ C, /* layer */ L, /* index */ Double, /* list */ js.Array[L], Unit]
  ): Unit = js.native
  def eachLayer[C](
    iterator: js.ThisFunction3[/* this */ C, /* layer */ L, /* index */ Double, /* list */ js.Array[L], Unit],
    context: C
  ): Unit = js.native
  def getLayer(
    finder: js.ThisFunction3[/* this */ Null, /* item */ L, /* index */ Double, /* list */ js.Array[L], Boolean]
  ): L | Null = js.native
  /**
    * 返回当前集合中所有的图层
    */
  def getLayers(): js.Array[L] = js.native
  /**
    * 判断传入的图层实例是否在集合中
    * @param layer 目标图层
    */
  def hasLayer(layer: L): Boolean = js.native
  def hasLayer(
    layer: js.ThisFunction3[/* this */ Null, /* item */ L, /* index */ Double, /* list */ js.Array[L], Boolean]
  ): Boolean = js.native
  def reload(): this.type = js.native
  /**
    * 	从集合中删除传入的图层实例
    * @param layer 图层
    */
  def removeLayer(layer: L): this.type = js.native
  def removeLayer(layer: js.Array[L]): this.type = js.native
  /**
    * 从集合中删除传入的图层实例数组
    * @param layers 图层数组
    */
  def removeLayers(layers: L): this.type = js.native
  def removeLayers(layers: js.Array[L]): this.type = js.native
  def setOptions(options: js.Any): this.type = js.native
}

