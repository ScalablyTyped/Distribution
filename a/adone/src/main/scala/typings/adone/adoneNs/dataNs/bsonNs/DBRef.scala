package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.Anon_Db
import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON DBRef type
  */
@JSGlobal("adone.data.bson.DBRef")
@js.native
class DBRef protected () extends Type {
  /**
    * @param namespace the collection name
    * @param oid the reference ObjectID
    * @param db optional db name, if omitted the reference is local to the current db
    */
  def this(namespace: String, oid: ObjectId) = this()
  def this(namespace: String, oid: ObjectId, db: String) = this()
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_DBRef: typings.adone.adoneStrings.DBRef = js.native
  def toJSON(): Anon_Db = js.native
}

