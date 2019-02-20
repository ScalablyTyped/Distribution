package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmartTagRecognizerMode extends js.Object

/**
  * specifies the which type of text is passed to {@link XSmartTagRecognizer.recognize()}
  * @since OOo 2.3
  */
@JSGlobal("com.sun.star.smarttags.SmartTagRecognizerMode")
@js.native
object SmartTagRecognizerMode extends js.Object {
  @js.native
  sealed trait CELL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagRecognizerMode
  
  @js.native
  sealed trait CHAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagRecognizerMode
  
  @js.native
  sealed trait PARAGRAPH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagRecognizerMode
  
  @js.native
  sealed trait SINGLE_WORD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagRecognizerMode
  
  /* 3 */ val CELL: CELL with scala.Double = js.native
  /* 0 */ val CHAR: CHAR with scala.Double = js.native
  /* 2 */ val PARAGRAPH: PARAGRAPH with scala.Double = js.native
  /* 1 */ val SINGLE_WORD: SINGLE_WORD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs.SmartTagRecognizerMode with scala.Double
  ] = js.native
}

