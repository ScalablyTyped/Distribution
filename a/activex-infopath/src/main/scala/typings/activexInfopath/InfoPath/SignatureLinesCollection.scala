package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureLinesCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.SignatureLinesCollection_typekey")
  var InfoPathDotSignatureLinesCollection_typekey: SignatureLinesCollection
  def Item(varIndex: js.Any): SignatureLineObject
}

object SignatureLinesCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotSignatureLinesCollection_typekey: SignatureLinesCollection,
    Item: js.Any => SignatureLineObject
  ): SignatureLinesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignatureLinesCollection_typekey")(InfoPathDotSignatureLinesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureLinesCollection]
  }
}

