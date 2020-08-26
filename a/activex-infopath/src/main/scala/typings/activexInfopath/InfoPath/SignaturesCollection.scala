package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaturesCollection extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.SignaturesCollection_typekey")
  var InfoPathDotSignaturesCollection_typekey: SignaturesCollection = js.native
  def Create(): SignatureObject = js.native
  def Item(varIndex: js.Any): SignatureObject = js.native
}

object SignaturesCollection {
  @scala.inline
  def apply(
    Count: Double,
    Create: () => SignatureObject,
    InfoPathDotSignaturesCollection_typekey: SignaturesCollection,
    Item: js.Any => SignatureObject
  ): SignaturesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Create = js.Any.fromFunction0(Create), Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignaturesCollection_typekey")(InfoPathDotSignaturesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturesCollection]
  }
  @scala.inline
  implicit class SignaturesCollectionOps[Self <: SignaturesCollection] (val x: Self) extends AnyVal {
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
    def setCreate(value: () => SignatureObject): Self = this.set("Create", js.Any.fromFunction0(value))
    @scala.inline
    def setInfoPathDotSignaturesCollection_typekey(value: SignaturesCollection): Self = this.set("InfoPath.SignaturesCollection_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => SignatureObject): Self = this.set("Item", js.Any.fromFunction1(value))
  }
  
}

