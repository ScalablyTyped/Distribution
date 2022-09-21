package typings.antDesignProUtils.anon

import typings.antDesignProUtils.typingMod.PageInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearSelected extends StObject {
  
  /** @name 清空选择 */
  var clearSelected: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** @name p页面的信息都在里面 */
  var pageInfo: js.UndefOr[PageInfo] = js.native
  
  /** @name 刷新 */
  def reload(): js.Promise[Unit] = js.native
  def reload(resetPageIndex: Boolean): js.Promise[Unit] = js.native
  
  /** @name 刷新并清空，只清空页面，不包括表单 */
  var reloadAndRest: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  
  /** @name 重置任何输入项，包括表单 */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
}
