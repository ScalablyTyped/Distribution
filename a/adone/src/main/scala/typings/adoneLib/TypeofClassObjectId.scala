package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassObjectId
  extends org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.dataNs.bsonNs.ObjectId]
     with org.scalablytyped.runtime.Instantiable1[
      (/* id */ Anon_Id) | (/* id */ nodeLib.Buffer) | (/* id */ adoneLib.adoneNs.dataNs.bsonNs.ObjectId) | (/* id */ java.lang.String), 
      adoneLib.adoneNs.dataNs.bsonNs.ObjectId
    ] {
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

