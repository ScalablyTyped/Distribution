package typings.antd.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.antd.affixMod.default
import typings.std.HTMLElement
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserverEntity extends js.Object {
  var affixList: js.Array[default]
  var eventHandlers: StringDictionary[js.Any]
  var target: HTMLElement | Window_
}

object ObserverEntity {
  @scala.inline
  def apply(
    affixList: js.Array[default],
    eventHandlers: StringDictionary[js.Any],
    target: HTMLElement | Window_
  ): ObserverEntity = {
    val __obj = js.Dynamic.literal(affixList = affixList.asInstanceOf[js.Any], eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObserverEntity]
  }
}

