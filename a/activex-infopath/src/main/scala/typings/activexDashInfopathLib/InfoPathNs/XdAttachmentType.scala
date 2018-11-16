package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdAttachmentType extends js.Object

@JSGlobal("InfoPath.XdAttachmentType")
@js.native
object XdAttachmentType extends js.Object {
  @js.native
  sealed trait xdNone
    extends activexDashInfopathLib.InfoPathNs.XdAttachmentType
  
  @js.native
  sealed trait xdXml
    extends activexDashInfopathLib.InfoPathNs.XdAttachmentType
  
  @js.native
  sealed trait xdXmlXsn
    extends activexDashInfopathLib.InfoPathNs.XdAttachmentType
  
  /* 2 */ val xdNone: xdNone with scala.Double = js.native
  /* 0 */ val xdXml: xdXml with scala.Double = js.native
  /* 1 */ val xdXmlXsn: xdXmlXsn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdAttachmentType with scala.Double] = js.native
}

