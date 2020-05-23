package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedDataBlocksCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.SignedDataBlocksCollection_typekey")
  var InfoPathDotSignedDataBlocksCollection_typekey: SignedDataBlocksCollection
  def Item(varIndex: js.Any): SignedDataBlockObject
}

object SignedDataBlocksCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotSignedDataBlocksCollection_typekey: SignedDataBlocksCollection,
    Item: js.Any => SignedDataBlockObject
  ): SignedDataBlocksCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignedDataBlocksCollection_typekey")(InfoPathDotSignedDataBlocksCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataBlocksCollection]
  }
}

