package typings.angularUiTree.AngularUITree

import typings.angularUiTree.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventInfo extends js.Object {
  var dest: Index = js.native
  var elements: js.Any = js.native
  var pos: IPosition = js.native
  var source: IEventSourceInfo = js.native
}

object IEventInfo {
  @scala.inline
  def apply(dest: Index, elements: js.Any, pos: IPosition, source: IEventSourceInfo): IEventInfo = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventInfo]
  }
  @scala.inline
  implicit class IEventInfoOps[Self <: IEventInfo] (val x: Self) extends AnyVal {
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
    def setDest(value: Index): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def setElements(value: js.Any): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: IPosition): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: IEventSourceInfo): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

