package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextMenuManager extends js.Object {
  /** Add context menu items scoped by CSS selectors. */
  def add(itemsBySelector: ScalablyTyped.runtime.StringDictionary[js.Array[ContextMenuOptions]]): Disposable
}

