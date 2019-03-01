package typings
package antdLib.libTreeDirectoryTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryTreeState extends js.Object {
  var expandedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DirectoryTreeState {
  @scala.inline
  def apply(expandedKeys: js.Array[java.lang.String] = null, selectedKeys: js.Array[java.lang.String] = null): DirectoryTreeState = {
    val __obj = js.Dynamic.literal()
    if (expandedKeys != null) __obj.updateDynamic("expandedKeys")(expandedKeys)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    __obj.asInstanceOf[DirectoryTreeState]
  }
}

