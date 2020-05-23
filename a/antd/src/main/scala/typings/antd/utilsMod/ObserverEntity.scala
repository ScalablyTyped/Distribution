package typings.antd.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.antd.affixMod.default
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverEntity extends js.Object {
  var affixList: js.Array[default]
  var eventHandlers: StringDictionary[js.Any]
  var target: HTMLElement | Window
}

object ObserverEntity {
  @scala.inline
  def apply(
    affixList: js.Array[default],
    eventHandlers: StringDictionary[js.Any],
    target: HTMLElement | Window
  ): ObserverEntity = {
    val __obj = js.Dynamic.literal(affixList = affixList.asInstanceOf[js.Any], eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverEntity]
  }
}

