package typings.adone.adoneNs.dataNs.bsonNs

import typings.adone.Anon_Code
import typings.adone.adoneNs.dataNs.bsonNs.INs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON Code type
  */
@JSGlobal("adone.data.bson.Code")
@js.native
class Code protected () extends Type {
  /**
    * @param code a string or function
    * @param scope an optional scope for the function
    */
  def this(code: String) = this()
  def this(code: js.Function1[/* repeated */ js.Any, Unit]) = this()
  def this(code: String, scope: js.Object) = this()
  def this(code: js.Function1[/* repeated */ js.Any, Unit], scope: js.Object) = this()
  /* CompleteClass */
  override var _bsontype: String = js.native
  @JSName("_bsontype")
  var _bsontype_Code: typings.adone.adoneStrings.Code = js.native
  def toJSON(): Anon_Code = js.native
}

