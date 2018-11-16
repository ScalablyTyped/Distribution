package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DocumentProperty")
@js.native
class DocumentProperty[TApplication] protected () extends js.Object {
  var Application: TApplication = js.native
  var Creator: scala.Double = js.native
  var LinkSource: java.lang.String = js.native
  var LinkToContent: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var `Office.DocumentProperty_typekey`: DocumentProperty[TApplication] = js.native
  var Parent: js.Any = js.native
  var Type: MsoDocProperties = js.native
  var Value: js.Any = js.native
  def Delete(): scala.Unit = js.native
}

