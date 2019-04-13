package typings
package awsDashSdkLib.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRecord extends js.Object {
  /**
    * The name of the DNS record to create in your domain. This is supplied by ACM.
    */
  var Name: String
  /**
    * The type of DNS record. Currently this can be CNAME.
    */
  var Type: RecordType
  /**
    * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
    */
  var Value: String
}

object ResourceRecord {
  @scala.inline
  def apply(Name: String, Type: RecordType, Value: String): ResourceRecord = {
    val __obj = js.Dynamic.literal(Name = Name, Type = Type.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[ResourceRecord]
  }
}

