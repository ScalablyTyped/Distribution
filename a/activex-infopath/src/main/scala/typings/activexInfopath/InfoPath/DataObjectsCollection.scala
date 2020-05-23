package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObjectsCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.DataObjectsCollection_typekey")
  var InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection
  def Item(varIndex: js.Any): DataSourceObject
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
}

