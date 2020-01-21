package typings.antd.tableInterfaceMod

import typings.antd.createStoreMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStore extends js.Object {
  var checkboxPropsCache: CheckboxPropsCache
  var store: Store
  def setCheckboxPropsCache(cache: CheckboxPropsCache): Unit
}

object WithStore {
  @scala.inline
  def apply(
    checkboxPropsCache: CheckboxPropsCache,
    setCheckboxPropsCache: CheckboxPropsCache => Unit,
    store: Store
  ): WithStore = {
    val __obj = js.Dynamic.literal(checkboxPropsCache = checkboxPropsCache.asInstanceOf[js.Any], setCheckboxPropsCache = js.Any.fromFunction1(setCheckboxPropsCache), store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithStore]
  }
}

