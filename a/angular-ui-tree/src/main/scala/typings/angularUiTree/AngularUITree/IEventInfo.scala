package typings.angularUiTree.AngularUITree

import typings.angularUiTree.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventInfo extends js.Object {
  var dest: Index
  var elements: js.Any
  var pos: IPosition
  var source: IEventSourceInfo
}

object IEventInfo {
  @scala.inline
  def apply(dest: Index, elements: js.Any, pos: IPosition, source: IEventSourceInfo): IEventInfo = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventInfo]
  }
}

