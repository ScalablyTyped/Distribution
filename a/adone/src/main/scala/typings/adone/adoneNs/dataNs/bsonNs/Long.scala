package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON Long type
  */
@JSGlobal("adone.data.bson.Long")
@js.native
class Long ()
  extends typings.adone.adoneNs.mathNs.Long
     with Type {
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_Long: typings.adone.adoneStrings.Long = js.native
}

/* static members */
@JSGlobal("adone.data.bson.Long")
@js.native
object Long extends js.Object {
  var MAX_UNSIGNED_VALUE: Long = js.native
  var MAX_VALUE: Long = js.native
  var MIN_VALUE: Long = js.native
  var NEG_ONE: Long = js.native
  var ONCE: Long = js.native
  var ONE: Long = js.native
  var UONE: Long = js.native
  var UZERO: Long = js.native
  var ZERO: Long = js.native
}

