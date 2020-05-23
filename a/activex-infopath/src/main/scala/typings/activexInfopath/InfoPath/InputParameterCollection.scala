package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParameterCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.InputParameterCollection_typekey")
  var InfoPathDotInputParameterCollection_typekey: InputParameterCollection
  def Item(varIndex: js.Any): InputParameterObject
}

object InputParameterCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotInputParameterCollection_typekey: InputParameterCollection,
    Item: js.Any => InputParameterObject
  ): InputParameterCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.InputParameterCollection_typekey")(InfoPathDotInputParameterCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParameterCollection]
  }
}

