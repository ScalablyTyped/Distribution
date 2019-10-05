package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typings.activexDashAccess.activexDashAccessStrings.Cancel
  import typings.activexDashAccess.activexDashAccessStrings.Headers
  import typings.activexDashAccess.activexDashAccessStrings.PostData
  import typings.activexDashAccess.activexDashAccessStrings.TargetFrameName
  import typings.activexDashAccess.activexDashAccessStrings.URL
  import typings.activexDashAccess.activexDashAccessStrings.flags
  import typings.activexDashAccess.activexDashAccessStrings.pDisp

  type WebBrowserControl_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, flags, TargetFrameName, PostData, Headers, Cancel]
}
