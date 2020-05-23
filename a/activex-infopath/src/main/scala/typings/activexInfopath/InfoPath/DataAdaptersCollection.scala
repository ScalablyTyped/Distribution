package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataAdaptersCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.DataAdaptersCollection_typekey")
  var InfoPathDotDataAdaptersCollection_typekey: DataAdaptersCollection
  def Item(varIndex: js.Any): js.Any
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
}

