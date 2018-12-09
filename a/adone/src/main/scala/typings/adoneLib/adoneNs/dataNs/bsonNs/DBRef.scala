package typings
package adoneLib.adoneNs.dataNs.bsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * Represents BSON DBRef type
             */
@JSGlobal("adone.data.bson.DBRef")
@js.native
class DBRef protected ()
  extends adoneLib.adoneNs.dataNs.bsonNs.INs.Type {
  /**
                   * @param namespace the collection name
                   * @param oid the reference ObjectID
                   * @param db optional db name, if omitted the reference is local to the current db
                   */
  def this(namespace: java.lang.String, oid: ObjectId) = this()
  /**
                   * @param namespace the collection name
                   * @param oid the reference ObjectID
                   * @param db optional db name, if omitted the reference is local to the current db
                   */
  def this(namespace: java.lang.String, oid: ObjectId, db: java.lang.String) = this()
  /* CompleteClass */
  override var _bsontype: java.lang.String = js.native
  @JSName("_bsontype")
  var _bsontype_DBRef: adoneLib.adoneLibStrings.DBRef = js.native
  def toJSON(): adoneLib.Anon_Db = js.native
}

