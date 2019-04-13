package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeData extends js.Object {
  var items: org.scalablytyped.runtime.StringDictionary[TreeItem] with org.scalablytyped.runtime.NumberDictionary[TreeItem]
  var rootId: ItemId
}

object TreeData {
  @scala.inline
  def apply(
    items: org.scalablytyped.runtime.StringDictionary[TreeItem] with org.scalablytyped.runtime.NumberDictionary[TreeItem],
    rootId: ItemId
  ): TreeData = {
    val __obj = js.Dynamic.literal(items = items, rootId = rootId)
  
    __obj.asInstanceOf[TreeData]
  }
}

