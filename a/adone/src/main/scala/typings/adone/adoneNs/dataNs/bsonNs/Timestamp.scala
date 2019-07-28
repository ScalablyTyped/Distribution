package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type is for INTERNAL use in MongoDB only and should not be used in applications
  */
@JSGlobal("adone.data.bson.Timestamp")
@js.native
class Timestamp ()
  extends typings.adone.adoneNs.mathNs.Long
     with Type {
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_Timestamp: typings.adone.adoneStrings.Timestamp = js.native
}

/* static members */
@JSGlobal("adone.data.bson.Timestamp")
@js.native
object Timestamp extends js.Object {
  var MAX_UNSIGNED_VALUE: Timestamp = js.native
  var MAX_VALUE: Timestamp = js.native
  var MIN_VALUE: Timestamp = js.native
  var NEG_ONE: Timestamp = js.native
  var ONCE: Timestamp = js.native
  var ONE: Timestamp = js.native
  var UONE: Timestamp = js.native
  var UZERO: Timestamp = js.native
  var ZERO: Timestamp = js.native
}

