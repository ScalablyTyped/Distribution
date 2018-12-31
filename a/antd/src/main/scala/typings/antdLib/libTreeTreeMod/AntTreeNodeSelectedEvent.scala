package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeSelectedEvent extends AntTreeNodeBaseEvent {
  var event: antdLib.antdLibStrings.select
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var selectedNodes: js.UndefOr[js.Array[AntTreeNode]] = js.undefined
}

