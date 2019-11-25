package typings.atAtlaskitTree.atAtlaskitTreeMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeData extends js.Object {
  var items: StringDictionary[TreeItem] with NumberDictionary[TreeItem]
  var rootId: ItemId
}

object TreeData {
  @scala.inline
  def apply(items: StringDictionary[TreeItem] with NumberDictionary[TreeItem], rootId: ItemId): TreeData = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeData]
  }
}

