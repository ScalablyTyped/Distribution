package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRecord extends js.Object {
  /**
    * The name of the DNS record to create in your domain. This is supplied by ACM.
    */
  var Name: String = js.native
  /**
    * The type of DNS record. Currently this can be CNAME.
    */
  var Type: RecordType = js.native
  /**
    * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
    */
  var Value: String = js.native
}

object ResourceRecord {
  @scala.inline
  def apply(Name: String, Type: RecordType, Value: String): ResourceRecord = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRecord]
  }
  @scala.inline
  implicit class ResourceRecordOps[Self <: ResourceRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RecordType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

