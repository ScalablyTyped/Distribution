package typings
package aliDashAppLib.myNs

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
  var dataset: java.lang.String = js.native
  /**
  		 * 节点id
  		 */
  var id: java.lang.String = js.native
  /**
  		 * 组件的文件路径
  		 */
  var is: java.lang.String = js.native
  /**
  		 * 组件数据，包括内部数据和属性值（与 data 一致）
  		 */
  var properties: js.Any = js.native
  def createIntersectionObserver(): IntersectionObserver = js.native
  def createIntersectionObserver(options: CreateIntersectionObserverOption): IntersectionObserver = js.native
  def createSelectorQuery(): SelectorQuery = js.native
  def getRelationNodes(relationKey: java.lang.String): js.Array[ComponentRelation] = js.native
  def hasBehavior(behavior: js.Any): scala.Boolean = js.native
  /**
  		 * selector  使用选择器选择组件实例节点，返回匹配到的全部组件实例对象组成的数组
  		 */
  def selectAllComponents(selector: java.lang.String): js.Array[Component] = js.native
  /**
  		 * 使用选择器选择组件实例节点
  		 * 返回匹配到的第一个组件实例对象
  		 */
  def selectComponent(selector: java.lang.String): Component = js.native
  /**
  		 * 将数据从逻辑层发送到视图层，同时改变对应的 this.data 的值
  		 * 1. 直接修改 this.data 而不调用 this.setData 是无法改变页面的状态的，还会造成数据不一致。
  		 * 2. 单次设置的数据不能超过1024kB，请尽量避免一次设置过多的数据。
  		 * 3. 请不要把 data 中任何一项的 value 设为 undefined ，否则这一项将不被设置并可能遗留一些潜在问题
  		 * @param data object 以 key，value 的形式表示将 this.data 中的 key 对应的值改变成 value
  		 * @param [callback] callback 是一个回调函数，在这次setData对界面渲染完毕后调用
  		 */
  def setData(data: js.Any): scala.Unit = js.native
  def setData(data: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def triggerEvent(name: java.lang.String): scala.Unit = js.native
  def triggerEvent(name: java.lang.String, details: js.Any): scala.Unit = js.native
  def triggerEvent(name: java.lang.String, details: js.Any, options: stdLib.Partial[aliDashAppLib.Anon_Composed]): scala.Unit = js.native
}

