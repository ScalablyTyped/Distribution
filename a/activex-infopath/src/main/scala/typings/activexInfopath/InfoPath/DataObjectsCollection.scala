package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObjectsCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.DataObjectsCollection_typekey")
  var InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection = js.native
  def Item(varIndex: js.Any): DataSourceObject = js.native
}

object DataObjectsCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection,
    Item: js.Any => DataSourceObject
  ): DataObjectsCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.DataObjectsCollection_typekey")(InfoPathDotDataObjectsCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectsCollection]
  }
  @scala.inline
  implicit class DataObjectsCollectionOps[Self <: DataObjectsCollection] (val x: Self) extends AnyVal {
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
    def setInfoPathDotDataObjectsCollection_typekey(value: DataObjectsCollection): Self = this.set("InfoPath.DataObjectsCollection_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => DataSourceObject): Self = this.set("Item", js.Any.fromFunction1(value))
  }
  
}

