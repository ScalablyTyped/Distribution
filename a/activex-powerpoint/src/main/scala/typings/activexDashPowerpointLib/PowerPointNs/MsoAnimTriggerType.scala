package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimTriggerType extends js.Object

@JSGlobal("PowerPoint.MsoAnimTriggerType")
@js.native
object MsoAnimTriggerType extends js.Object {
  @js.native
  sealed trait msoAnimTriggerAfterPrevious
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTriggerType
  
  @js.native
  sealed trait msoAnimTriggerMixed
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTriggerType
  
  @js.native
  sealed trait msoAnimTriggerNone
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTriggerType
  
  @js.native
  sealed trait msoAnimTriggerOnMediaBookmark
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTriggerType
  
  @js.native
  sealed trait msoAnimTriggerOnPageClick
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTriggerType
  
  @js.native
  sealed trait msoAnimTriggerOnShapeClick
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTriggerType
  
  @js.native
  sealed trait msoAnimTriggerWithPrevious
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTriggerType
  
  /* 3 */ val msoAnimTriggerAfterPrevious: msoAnimTriggerAfterPrevious with scala.Double = js.native
  /* -1 */ val msoAnimTriggerMixed: msoAnimTriggerMixed with scala.Double = js.native
  /* 0 */ val msoAnimTriggerNone: msoAnimTriggerNone with scala.Double = js.native
  /* 5 */ val msoAnimTriggerOnMediaBookmark: msoAnimTriggerOnMediaBookmark with scala.Double = js.native
  /* 1 */ val msoAnimTriggerOnPageClick: msoAnimTriggerOnPageClick with scala.Double = js.native
  /* 4 */ val msoAnimTriggerOnShapeClick: msoAnimTriggerOnShapeClick with scala.Double = js.native
  /* 2 */ val msoAnimTriggerWithPrevious: msoAnimTriggerWithPrevious with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimTriggerType with scala.Double] = js.native
}

