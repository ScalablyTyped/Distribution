package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdReadOnlyViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.IInitEventHandler")
@js.native
class IInitEventHandler protected ()
  extends typings.activexInfopath.InfoPath.IInitEventHandler {
  /* CompleteClass */
  @JSName("InfoPath.IInitEventHandler_typekey")
  override var InfoPathDotIInitEventHandler_typekey: typings.activexInfopath.InfoPath.IInitEventHandler = js.native
  /* CompleteClass */
  override def InitEventHandler(
    punkSender: js.Any,
    pDocument: typings.activexInfopath.InfoPath._XDocument,
    pROMode: XdReadOnlyViewMode
  ): Unit = js.native
}

