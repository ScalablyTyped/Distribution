package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartPicturePlacement extends js.Object

@JSGlobal("Word.XlChartPicturePlacement")
@js.native
object XlChartPicturePlacement extends js.Object {
  @js.native
  sealed trait xlAllFaces
    extends activexDashWordLib.WordNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlEnd
    extends activexDashWordLib.WordNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlEndSides
    extends activexDashWordLib.WordNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlFront
    extends activexDashWordLib.WordNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlFrontEnd
    extends activexDashWordLib.WordNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlFrontSides
    extends activexDashWordLib.WordNs.XlChartPicturePlacement
  
  @js.native
  sealed trait xlSides
    extends activexDashWordLib.WordNs.XlChartPicturePlacement
  
  /* 7 */ val xlAllFaces: xlAllFaces with scala.Double = js.native
  /* 2 */ val xlEnd: xlEnd with scala.Double = js.native
  /* 3 */ val xlEndSides: xlEndSides with scala.Double = js.native
  /* 4 */ val xlFront: xlFront with scala.Double = js.native
  /* 6 */ val xlFrontEnd: xlFrontEnd with scala.Double = js.native
  /* 5 */ val xlFrontSides: xlFrontSides with scala.Double = js.native
  /* 1 */ val xlSides: xlSides with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlChartPicturePlacement with scala.Double] = js.native
}

