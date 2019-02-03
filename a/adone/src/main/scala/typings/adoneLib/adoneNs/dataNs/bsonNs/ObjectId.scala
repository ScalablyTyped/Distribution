package typings
package adoneLib.adoneNs.dataNs.bsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON ObjectId type
  */
@JSGlobal("adone.data.bson.ObjectId")
@js.native
class ObjectId ()
  extends adoneLib.adoneNs.dataNs.bsonNs.INs.Type {
  def this(id: adoneLib.Anon_Id) = this()
  def this(id: ObjectId) = this()
  def this(id: java.lang.String) = this()
  def this(id: nodeLib.Buffer) = this()
  /* CompleteClass */
  override var _bsontype: java.lang.String = js.native
  @JSName("_bsontype")
  var _bsontype_ObjectId: adoneLib.adoneLibStrings.ObjectId = js.native
  var generationTime: scala.Double = js.native
  def equals(other: adoneLib.Anon_ToHexString): scala.Boolean = js.native
  def equals(other: ObjectId): scala.Boolean = js.native
  /**
    * Compares the equality of this ObjectID with otherID
    */
  def equals(other: java.lang.String): scala.Boolean = js.native
  def equals(other: nodeLib.Buffer): scala.Boolean = js.native
  /**
    * Generate a 12 byte id buffer used in ObjectId's
    */
  def generate(): nodeLib.Buffer = js.native
  def generate(time: scala.Double): nodeLib.Buffer = js.native
  /**
    * Returns the next ObjectId index
    */
  def getInc(): scala.Double = js.native
  /**
    * Returns the generation date (accurate up to the second) that this ID was generated
    */
  def getTimestamp(): stdLib.Date = js.native
  /**
    * Return the ObjectId id as a 24 byte hex string representation
    */
  def toHexString(): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
}

/* static members */
@JSGlobal("adone.data.bson.ObjectId")
@js.native
object ObjectId extends js.Object {
  var index: scala.Double = js.native
  /**
    * Creates an ObjectID from a hex string representation of an ObjectId
    */
  def createFromHexString(string: java.lang.String): adoneLib.adoneNs.dataNs.bsonNs.ObjectId = js.native
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId
    */
  def createFromTime(time: scala.Double): adoneLib.adoneNs.dataNs.bsonNs.ObjectId = js.native
  /**
    * Creates an ObjectId
    */
  def createPk(): adoneLib.adoneNs.dataNs.bsonNs.ObjectId = js.native
  /**
    * Checks if a value is a valid bson ObjectId
    */
  def isValid(id: js.Any): scala.Boolean = js.native
}

