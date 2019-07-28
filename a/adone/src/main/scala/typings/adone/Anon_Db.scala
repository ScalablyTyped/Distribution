package typings.adone

import typings.adone.adoneNs.dataNs.bsonNs.ObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Db extends js.Object {
  @JSName("$db")
  var $db: String
  @JSName("$id")
  var $id: ObjectId
  @JSName("$ref")
  var $ref: String
}

object Anon_Db {
  @scala.inline
  def apply($db: String, $id: ObjectId, $ref: String): Anon_Db = {
    val __obj = js.Dynamic.literal($db = $db, $id = $id, $ref = $ref)
  
    __obj.asInstanceOf[Anon_Db]
  }
}

