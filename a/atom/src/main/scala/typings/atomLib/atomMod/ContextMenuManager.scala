package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuManager extends js.Object {
  /** Add context menu items scoped by CSS selectors. */
  def add(itemsBySelector: org.scalablytyped.runtime.StringDictionary[js.Array[ContextMenuOptions]]): Disposable
}

object ContextMenuManager {
  @scala.inline
  def apply(
    add: js.Function1[
      org.scalablytyped.runtime.StringDictionary[js.Array[ContextMenuOptions]], 
      Disposable
    ]
  ): ContextMenuManager = {
    val __obj = js.Dynamic.literal(add = add)
  
    __obj.asInstanceOf[ContextMenuManager]
  }
}

