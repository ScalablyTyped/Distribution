package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoCustomXMLNodeType extends js.Object

@JSGlobal("Office.MsoCustomXMLNodeType")
@js.native
object MsoCustomXMLNodeType extends js.Object {
  @js.native
  sealed trait msoCustomXMLNodeAttribute
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLNodeType
  
  @js.native
  sealed trait msoCustomXMLNodeCData
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLNodeType
  
  @js.native
  sealed trait msoCustomXMLNodeComment
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLNodeType
  
  @js.native
  sealed trait msoCustomXMLNodeDocument
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLNodeType
  
  @js.native
  sealed trait msoCustomXMLNodeElement
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLNodeType
  
  @js.native
  sealed trait msoCustomXMLNodeProcessingInstruction
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLNodeType
  
  @js.native
  sealed trait msoCustomXMLNodeText
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLNodeType
  
  /* 2 */ val msoCustomXMLNodeAttribute: msoCustomXMLNodeAttribute with scala.Double = js.native
  /* 4 */ val msoCustomXMLNodeCData: msoCustomXMLNodeCData with scala.Double = js.native
  /* 8 */ val msoCustomXMLNodeComment: msoCustomXMLNodeComment with scala.Double = js.native
  /* 9 */ val msoCustomXMLNodeDocument: msoCustomXMLNodeDocument with scala.Double = js.native
  /* 1 */ val msoCustomXMLNodeElement: msoCustomXMLNodeElement with scala.Double = js.native
  /* 7 */ val msoCustomXMLNodeProcessingInstruction: msoCustomXMLNodeProcessingInstruction with scala.Double = js.native
  /* 3 */ val msoCustomXMLNodeText: msoCustomXMLNodeText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoCustomXMLNodeType with scala.Double] = js.native
}

