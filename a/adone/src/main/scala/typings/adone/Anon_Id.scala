package typings.adone

import typings.adone.adoneNs.dataNs.bsonNs.ObjectId
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String | Buffer | ObjectId
  def toHexString(): String
}

object Anon_Id {
  @scala.inline
  def apply(id: String | Buffer | ObjectId, toHexString: () => String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], toHexString = js.Any.fromFunction0(toHexString))
  
    __obj.asInstanceOf[Anon_Id]
  }
}

