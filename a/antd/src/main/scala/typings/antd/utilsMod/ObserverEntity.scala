package typings.antd.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.antd.affixMod.default
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverEntity extends js.Object {
  var affixList: js.Array[default] = js.native
  var eventHandlers: StringDictionary[js.Any] = js.native
  var target: HTMLElement | Window = js.native
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
  @scala.inline
  implicit class ObserverEntityOps[Self <: ObserverEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAffixListVarargs(value: default*): Self = this.set("affixList", js.Array(value :_*))
    @scala.inline
    def setAffixList(value: js.Array[default]): Self = this.set("affixList", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventHandlers(value: StringDictionary[js.Any]): Self = this.set("eventHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: HTMLElement | Window): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

