package typings.antDesignProUtils.typingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProCoreActionType extends js.Object {
  
  /**
    * @name 清空选择
    */
  var clearSelected: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * @name 刷新
    */
  def reload(): Unit = js.native
  def reload(resetPageIndex: Boolean): Unit = js.native
  
  /**
    * @name 刷新并清空
    */
  var reloadAndRest: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * @name 重置
    */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
}
