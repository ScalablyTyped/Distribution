package typings.activexInfopath.InfoPath

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilObject extends js.Object {
  val Date: VarDate
  @JSName("InfoPath.UtilObject_typekey")
  var InfoPathDotUtilObject_typekey: UtilObject
  val Math: MathObject
  def Match(bstrValue: String, bstrPattern: String): Boolean
}

object UtilObject {
  @scala.inline
  def apply(
    Date: VarDate,
    InfoPathDotUtilObject_typekey: UtilObject,
    Match: (String, String) => Boolean,
    Math: MathObject
  ): UtilObject = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Match = js.Any.fromFunction2(Match), Math = Math.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.UtilObject_typekey")(InfoPathDotUtilObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilObject]
  }
}

