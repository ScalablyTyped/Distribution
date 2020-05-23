package typings.activexInfopath.global.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SaveEventObject")
@js.native
class SaveEventObject protected ()
  extends typings.activexInfopath.InfoPath.SaveEventObject {
  /* CompleteClass */
  override val FileName: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.SaveEventObject_typekey")
  override var InfoPathDotSaveEventObject_typekey: typings.activexInfopath.InfoPath.SaveEventObject = js.native
  /* CompleteClass */
  override var IsCancelled: Boolean = js.native
  /* CompleteClass */
  override val IsSaveAs: Boolean = js.native
  /* CompleteClass */
  override var ReturnStatus: Boolean = js.native
  /* CompleteClass */
  override val XDocument: typings.activexInfopath.InfoPath._XDocument = js.native
  /* CompleteClass */
  override def PerformSaveOperation(): Boolean = js.native
}

