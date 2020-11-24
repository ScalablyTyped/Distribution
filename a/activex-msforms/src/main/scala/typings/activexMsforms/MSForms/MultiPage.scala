package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPage extends js.Object {
  
  var BackColor: Double = js.native
  
  var Enabled: Boolean = js.native
  
  var Font: NewFont = js.native
  
  var FontBold: Boolean = js.native
  
  var FontItalic: Boolean = js.native
  
  var FontName: String = js.native
  
  var FontSize: Double = js.native
  
  var FontStrikethru: Boolean = js.native
  
  var FontUnderline: Boolean = js.native
  
  var FontWeight: Double = js.native
  
  var ForeColor: Double = js.native
  
  @JSName("MSForms.MultiPage_typekey")
  var MSFormsDotMultiPage_typekey: MultiPage = js.native
  
  var MultiRow: Boolean = js.native
  
  def Pages(varg: js.Any): js.Any = js.native
  @JSName("Pages")
  val Pages_Original: Pages = js.native
  
  val SelectedItem: Page = js.native
  
  var Style: fmTabStyle = js.native
  
  var TabFixedHeight: Double = js.native
  
  var TabFixedWidth: Double = js.native
  
  var TabOrientation: fmTabOrientation = js.native
  
  var Value: Double = js.native
  
  val _Font_Reserved: NewFont = js.native
  
  def _GetTabFixedHeight(Height: Double): Unit = js.native
  
  def _GetTabFixedWidth(Width: Double): Unit = js.native
  
  def _SetTabFixedHeight(Height: Double): Unit = js.native
  
  def _SetTabFixedWidth(Width: Double): Unit = js.native
}
