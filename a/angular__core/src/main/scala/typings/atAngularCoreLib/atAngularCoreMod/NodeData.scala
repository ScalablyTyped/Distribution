package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node instance data.
  *
  * We have a separate type per NodeType to save memory
  * (TextData | ElementData | ProviderData | PureExpressionData | QueryList<any>)
  *
  * To keep our code monomorphic,
  * we prohibit using `NodeData` directly but enforce the use of accessors (`asElementData`, ...).
  * This way, no usage site can get a `NodeData` from view.nodes and then use it for different
  * purposes.
  */
trait NodeData extends js.Object {
  var __brand: js.Any
}

object NodeData {
  @scala.inline
  def apply(__brand: js.Any): NodeData = {
    val __obj = js.Dynamic.literal(__brand = __brand)
  
    __obj.asInstanceOf[NodeData]
  }
}

