package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String | nodeLib.Buffer | adoneLib.adoneNs.dataNs.bsonNs.ObjectId
  def toHexString(): java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(
    id: java.lang.String | nodeLib.Buffer | adoneLib.adoneNs.dataNs.bsonNs.ObjectId,
    toHexString: js.Function0[java.lang.String]
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("toHexString")(toHexString)
    __obj.asInstanceOf[Anon_Id]
  }
}

