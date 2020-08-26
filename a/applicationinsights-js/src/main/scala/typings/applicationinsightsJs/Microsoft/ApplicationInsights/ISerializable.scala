package typings.applicationinsightsJs.Microsoft.ApplicationInsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerializable extends js.Object {
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  var aiDataContract: js.Any = js.native
}

object ISerializable {
  @scala.inline
  def apply(aiDataContract: js.Any): ISerializable = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerializable]
  }
  @scala.inline
  implicit class ISerializableOps[Self <: ISerializable] (val x: Self) extends AnyVal {
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
    def setAiDataContract(value: js.Any): Self = this.set("aiDataContract", value.asInstanceOf[js.Any])
  }
  
}

