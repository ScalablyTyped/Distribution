package typings.activexInfopath.global.InfoPath

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.UtilObject")
@js.native
class UtilObject protected ()
  extends typings.activexInfopath.InfoPath.UtilObject {
  /* CompleteClass */
  override val Date: VarDate = js.native
  /* CompleteClass */
  @JSName("InfoPath.UtilObject_typekey")
  override var InfoPathDotUtilObject_typekey: typings.activexInfopath.InfoPath.UtilObject = js.native
  /* CompleteClass */
  override val Math: typings.activexInfopath.InfoPath.MathObject = js.native
  /* CompleteClass */
  override def Match(bstrValue: String, bstrPattern: String): Boolean = js.native
}

