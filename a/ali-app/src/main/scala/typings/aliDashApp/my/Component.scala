package typings.aliDashApp.my

import typings.aliDashApp.Anon_Bubbles
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  /**
  		 * 组件数据，包括内部数据和属性值
  		 */
  var data: js.Any = js.native
  /**
  		 * 节点dataset
  		 */
  var dataset: String = js.native
  /**
  		 * 节点id
  		 */
  var id: String = js.native
  /**
  		 * 组件的文件路径
  		 */
  var is: String = js.native
  /**
  		 * 组件数据，包括内部数据和属性值（与 data 一致）
  		 */
  var properties: js.Any = js.native
  def createIntersectionObserver(): IntersectionObserver = js.native
  def createIntersectionObserver(options: CreateIntersectionObserverOption): IntersectionObserver = js.native
  def createSelectorQuery(): SelectorQuery = js.native
  def getRelationNodes(relationKey: String): js.Array[ComponentRelation] = js.native
  def hasBehavior(behavior: js.Any): Boolean = js.native
  /**
  		 * selector  使用选择器选择组件实例节点，返回匹配到的全部组件实例对象组成的数组
  		 */
  def selectAllComponents(selector: String): js.Array[typings.aliDashApp.my.Component] = js.native
  /**
  		 * 使用选择器选择组件实例节点
  		 * 返回匹配到的第一个组件实例对象
  		 */
  def selectComponent(selector: String): typings.aliDashApp.my.Component = js.native
  /**
  		 * 将数据从逻辑层发送到视图层，同时改变对应的 this.data 的值
  		 * 1. 直接修改 this.data 而不调用 this.setData 是无法改变页面的状态的，还会造成数据不一致。
  		 * 2. 单次设置的数据不能超过1024kB，请尽量避免一次设置过多的数据。
  		 * 3. 请不要把 data 中任何一项的 value 设为 undefined ，否则这一项将不被设置并可能遗留一些潜在问题
  		 * @param data object 以 key，value 的形式表示将 this.data 中的 key 对应的值改变成 value
  		 * @param [callback] callback 是一个回调函数，在这次setData对界面渲染完毕后调用
  		 */
  def setData(data: js.Any): Unit = js.native
  def setData(data: js.Any, callback: js.Function0[Unit]): Unit = js.native
  def triggerEvent(name: String): Unit = js.native
  def triggerEvent(name: String, details: js.Any): Unit = js.native
  def triggerEvent(name: String, details: js.Any, options: Partial[Anon_Bubbles]): Unit = js.native
}

