package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClickAction extends js.Object

/** This enumeration specifies the actions which can be processed when a user clicks on an object. */
@JSGlobal("com.sun.star.presentation.ClickAction")
@js.native
object ClickAction extends js.Object {
  /** The presentation jumps to a bookmark. */
  @js.native
  sealed trait BOOKMARK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** The presentation jumps to another document. */
  @js.native
  sealed trait DOCUMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** The presentation continues with the first page. */
  @js.native
  sealed trait FIRSTPAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** The object renders itself invisible after a click. */
  @js.native
  sealed trait INVISIBLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** The presentation continues with the last page. */
  @js.native
  sealed trait LASTPAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** A star basic macro is executed after the click. */
  @js.native
  sealed trait MACRO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** The presentation jumps to the next page. */
  @js.native
  sealed trait NEXTPAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /**
    * use no animation effects.
    *
    * No action is performed on click.
    *
    * use no fade effects.
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** The presentation jumps to the previous page. */
  @js.native
  sealed trait PREVPAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** Another program is executed after a click. */
  @js.native
  sealed trait PROGRAM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** A sound is played after a click. */
  @js.native
  sealed trait SOUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** The presentation is stopped after the click. */
  @js.native
  sealed trait STOPPRESENTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** The object vanishes with its effect. */
  @js.native
  sealed trait VANISH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /** An OLE verb is performed on this object. */
  @js.native
  sealed trait VERB
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction
  
  /* 5 */ val BOOKMARK: BOOKMARK with scala.Double = js.native
  /* 6 */ val DOCUMENT: DOCUMENT with scala.Double = js.native
  /* 3 */ val FIRSTPAGE: FIRSTPAGE with scala.Double = js.native
  /* 7 */ val INVISIBLE: INVISIBLE with scala.Double = js.native
  /* 4 */ val LASTPAGE: LASTPAGE with scala.Double = js.native
  /* 12 */ val MACRO: MACRO with scala.Double = js.native
  /* 2 */ val NEXTPAGE: NEXTPAGE with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val PREVPAGE: PREVPAGE with scala.Double = js.native
  /* 11 */ val PROGRAM: PROGRAM with scala.Double = js.native
  /* 8 */ val SOUND: SOUND with scala.Double = js.native
  /* 13 */ val STOPPRESENTATION: STOPPRESENTATION with scala.Double = js.native
  /* 10 */ val VANISH: VANISH with scala.Double = js.native
  /* 9 */ val VERB: VERB with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.ClickAction with scala.Double
  ] = js.native
}

