package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.dataNs.bsonNs.ObjectId
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassObjectId
  extends Instantiable0[ObjectId]
     with Instantiable1[
      (/* id */ Anon_Id) | (/* id */ Buffer) | (/* id */ ObjectId) | (/* id */ String), 
      ObjectId
    ] {
  var index: Double = js.native
  /**
    * Creates an ObjectID from a hex string representation of an ObjectId
    */
  def createFromHexString(string: String): ObjectId = js.native
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId
    */
  def createFromTime(time: Double): ObjectId = js.native
  /**
    * Creates an ObjectId
    */
  def createPk(): ObjectId = js.native
  /**
    * Checks if a value is a valid bson ObjectId
    */
  def isValid(id: js.Any): Boolean = js.native
}

