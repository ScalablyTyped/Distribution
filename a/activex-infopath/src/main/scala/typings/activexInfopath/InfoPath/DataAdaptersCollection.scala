package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataAdaptersCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.DataAdaptersCollection_typekey")
  var InfoPathDotDataAdaptersCollection_typekey: DataAdaptersCollection = js.native
  def Item(varIndex: js.Any): js.Any = js.native
}

object DataAdaptersCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotDataAdaptersCollection_typekey: DataAdaptersCollection,
    Item: js.Any => js.Any
  ): DataAdaptersCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.DataAdaptersCollection_typekey")(InfoPathDotDataAdaptersCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAdaptersCollection]
  }
  @scala.inline
  implicit class DataAdaptersCollectionOps[Self <: DataAdaptersCollection] (val x: Self) extends AnyVal {
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
    def setInfoPathDotDataAdaptersCollection_typekey(value: DataAdaptersCollection): Self = this.set("InfoPath.DataAdaptersCollection_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => js.Any): Self = this.set("Item", js.Any.fromFunction1(value))
  }
  
}

