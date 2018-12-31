package typings
package adoneLib.adoneNs.dataNs.bsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents BSON Code type
  */
@JSGlobal("adone.data.bson.Code")
@js.native
class Code protected ()
  extends adoneLib.adoneNs.dataNs.bsonNs.INs.Type {
  /**
    * @param code a string or function
    * @param scope an optional scope for the function
    */
  def this(code: java.lang.String) = this()
  def this(code: js.Function1[/* repeated */ js.Any, scala.Unit]) = this()
  def this(code: java.lang.String, scope: js.Object) = this()
  def this(code: js.Function1[/* repeated */ js.Any, scala.Unit], scope: js.Object) = this()
  /* CompleteClass */
  override var _bsontype: java.lang.String = js.native
  @JSName("_bsontype")
  var _bsontype_Code: adoneLib.adoneLibStrings.Code = js.native
  def toJSON(): adoneLib.Anon_Scope = js.native
}

