package typings.antd.libTableInterfaceMod

import typings.antd.libTableCreateStoreMod.Store
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
    val __obj = js.Dynamic.literal(checkboxPropsCache = checkboxPropsCache, setCheckboxPropsCache = js.Any.fromFunction1(setCheckboxPropsCache), store = store)
  
    __obj.asInstanceOf[WithStore]
  }
}

