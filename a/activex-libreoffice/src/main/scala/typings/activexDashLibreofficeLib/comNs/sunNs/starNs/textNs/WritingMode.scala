package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WritingMode extends js.Object

/**
  * this enum covers the different writing directions
  * @deprecated DeprecatedUse WritingMode2 instead
  */
@JSGlobal("com.sun.star.text.WritingMode")
@js.native
object WritingMode extends js.Object {
  /**
    * text within lines is written left-to-right. lines and blocks are placed top-to-bottom.
    *
    * Typically, this is the writing mode for normal "alphabetic" text.
    */
  @js.native
  sealed trait LR_TB
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WritingMode
  
  /**
    * text within a line are written right-to-left. Lines and blocks are placed top-to-bottom.
    *
    * Typically, this writing mode is used in Arabic and Hebrew text.
    */
  @js.native
  sealed trait RL_TB
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WritingMode
  
  /**
    * text within a line is written top-to-bottom. Lines and blocks are placed right-to-left.
    *
    * Typically, this writing mode is used in Chinese and Japanese text.
    */
  @js.native
  sealed trait TB_RL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WritingMode
  
  /* 0 */ val LR_TB: LR_TB with scala.Double = js.native
  /* 1 */ val RL_TB: RL_TB with scala.Double = js.native
  /* 2 */ val TB_RL: TB_RL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.WritingMode with scala.Double
  ] = js.native
}

