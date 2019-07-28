package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.Anon_Id
import typings.adone.Anon_ToHexString
import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON ObjectId type
  */
@JSGlobal("adone.data.bson.ObjectId")
@js.native
class ObjectId () extends Type {
  def this(id: String) = this()
  def this(id: Anon_Id) = this()
  def this(id: ObjectId) = this()
  def this(id: Buffer) = this()
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_ObjectId: typings.adone.adoneStrings.ObjectId = js.native
  var generationTime: scala.Double = js.native
  /**
    * Compares the equality of this ObjectID with otherID
    */
  def equals(other: String): Boolean = js.native
  def equals(other: Anon_ToHexString): Boolean = js.native
  def equals(other: ObjectId): Boolean = js.native
  def equals(other: Buffer): Boolean = js.native
  /**
    * Generate a 12 byte id buffer used in ObjectId's
    */
  def generate(): Buffer = js.native
  def generate(time: scala.Double): Buffer = js.native
  /**
    * Returns the next ObjectId index
    */
  def getInc(): scala.Double = js.native
  /**
    * Returns the generation date (accurate up to the second) that this ID was generated
    */
  def getTimestamp(): typings.std.Date = js.native
  /**
    * Return the ObjectId id as a 24 byte hex string representation
    */
  def toHexString(): String = js.native
  def toJSON(): String = js.native
  def toString(format: String): String = js.native
}

/* static members */
@JSGlobal("adone.data.bson.ObjectId")
@js.native
object ObjectId extends js.Object {
  var index: scala.Double = js.native
  /**
    * Creates an ObjectID from a hex string representation of an ObjectId
    */
  def createFromHexString(string: String): ObjectId = js.native
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId
    */
  def createFromTime(time: scala.Double): ObjectId = js.native
  /**
    * Creates an ObjectId
    */
  def createPk(): ObjectId = js.native
  /**
    * Checks if a value is a valid bson ObjectId
    */
  def isValid(id: js.Any): Boolean = js.native
}

