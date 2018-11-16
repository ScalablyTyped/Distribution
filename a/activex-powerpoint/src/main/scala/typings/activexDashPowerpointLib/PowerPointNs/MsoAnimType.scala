package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimType extends js.Object

@JSGlobal("PowerPoint.MsoAnimType")
@js.native
object MsoAnimType extends js.Object {
  @js.native
  sealed trait msoAnimTypeColor
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeCommand
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeFilter
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeMixed
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeMotion
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeNone
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeProperty
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeRotation
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeScale
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  @js.native
  sealed trait msoAnimTypeSet
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimType
  
  /* 2 */ val msoAnimTypeColor: msoAnimTypeColor with scala.Double = js.native
  /* 6 */ val msoAnimTypeCommand: msoAnimTypeCommand with scala.Double = js.native
  /* 7 */ val msoAnimTypeFilter: msoAnimTypeFilter with scala.Double = js.native
  /* -2 */ val msoAnimTypeMixed: msoAnimTypeMixed with scala.Double = js.native
  /* 1 */ val msoAnimTypeMotion: msoAnimTypeMotion with scala.Double = js.native
  /* 0 */ val msoAnimTypeNone: msoAnimTypeNone with scala.Double = js.native
  /* 5 */ val msoAnimTypeProperty: msoAnimTypeProperty with scala.Double = js.native
  /* 4 */ val msoAnimTypeRotation: msoAnimTypeRotation with scala.Double = js.native
  /* 3 */ val msoAnimTypeScale: msoAnimTypeScale with scala.Double = js.native
  /* 8 */ val msoAnimTypeSet: msoAnimTypeSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimType with scala.Double] = js.native
}

