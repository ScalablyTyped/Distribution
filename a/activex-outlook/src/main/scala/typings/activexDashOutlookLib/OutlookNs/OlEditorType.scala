package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlEditorType extends js.Object

@JSGlobal("Outlook.OlEditorType")
@js.native
object OlEditorType extends js.Object {
  @js.native
  sealed trait olEditorHTML
    extends activexDashOutlookLib.OutlookNs.OlEditorType
  
  @js.native
  sealed trait olEditorRTF
    extends activexDashOutlookLib.OutlookNs.OlEditorType
  
  @js.native
  sealed trait olEditorText
    extends activexDashOutlookLib.OutlookNs.OlEditorType
  
  @js.native
  sealed trait olEditorWord
    extends activexDashOutlookLib.OutlookNs.OlEditorType
  
  /* 2 */ val olEditorHTML: olEditorHTML with scala.Double = js.native
  /* 3 */ val olEditorRTF: olEditorRTF with scala.Double = js.native
  /* 1 */ val olEditorText: olEditorText with scala.Double = js.native
  /* 4 */ val olEditorWord: olEditorWord with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlEditorType with scala.Double] = js.native
}

