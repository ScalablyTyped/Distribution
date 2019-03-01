package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Db extends js.Object {
  @JSName("$db")
  var $db: java.lang.String
  @JSName("$id")
  var $id: adoneLib.adoneNs.dataNs.bsonNs.ObjectId
  @JSName("$ref")
  var $ref: java.lang.String
}

object Anon_Db {
  @scala.inline
  def apply($db: java.lang.String, $id: adoneLib.adoneNs.dataNs.bsonNs.ObjectId, $ref: java.lang.String): Anon_Db = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$db")($db)
    __obj.updateDynamic("$id")($id)
    __obj.updateDynamic("$ref")($ref)
    __obj.asInstanceOf[Anon_Db]
  }
}

