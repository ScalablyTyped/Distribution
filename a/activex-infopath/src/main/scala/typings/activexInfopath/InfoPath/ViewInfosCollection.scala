package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewInfosCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.ViewInfosCollection_typekey")
  var InfoPathDotViewInfosCollection_typekey: ViewInfosCollection
  def Item(varIndex: js.Any): ViewInfoObject
}

object ViewInfosCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotViewInfosCollection_typekey: ViewInfosCollection,
    Item: js.Any => ViewInfoObject
  ): ViewInfosCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.ViewInfosCollection_typekey")(InfoPathDotViewInfosCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewInfosCollection]
  }
}

