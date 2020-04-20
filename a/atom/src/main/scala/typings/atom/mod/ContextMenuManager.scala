package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuManager extends js.Object {
  /** Add context menu items scoped by CSS selectors. */
  def add(itemsBySelector: StringDictionary[js.Array[ContextMenuOptions]]): Disposable
}

object ContextMenuManager {
  @scala.inline
  def apply(add: StringDictionary[js.Array[ContextMenuOptions]] => Disposable): ContextMenuManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
    __obj.asInstanceOf[ContextMenuManager]
  }
}

