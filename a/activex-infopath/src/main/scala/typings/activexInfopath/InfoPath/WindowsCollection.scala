package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.WindowsCollection_typekey")
  var InfoPathDotWindowsCollection_typekey: WindowsCollection = js.native
  def Item(varIndex: js.Any): Window = js.native
}

object WindowsCollection {
  @scala.inline
  def apply(Count: Double, InfoPathDotWindowsCollection_typekey: WindowsCollection, Item: js.Any => Window): WindowsCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.WindowsCollection_typekey")(InfoPathDotWindowsCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsCollection]
  }
  @scala.inline
  implicit class WindowsCollectionOps[Self <: WindowsCollection] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotWindowsCollection_typekey(value: WindowsCollection): Self = this.set("InfoPath.WindowsCollection_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => Window): Self = this.set("Item", js.Any.fromFunction1(value))
  }
  
}

