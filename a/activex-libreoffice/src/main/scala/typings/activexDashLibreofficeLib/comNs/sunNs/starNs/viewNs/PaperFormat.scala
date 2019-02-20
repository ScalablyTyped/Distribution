package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaperFormat extends js.Object

/** specifies the format (size) of the paper on a text document. */
@JSGlobal("com.sun.star.view.PaperFormat")
@js.native
object PaperFormat extends js.Object {
  /** specifies the paper format as A3. */
  @js.native
  sealed trait A3
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /** specifies the paper format as A4. */
  @js.native
  sealed trait A4
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /** specifies the paper format as A5. */
  @js.native
  sealed trait A5
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /** specifies the paper format as B4. */
  @js.native
  sealed trait B4
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /** specifies the paper format as B5. */
  @js.native
  sealed trait B5
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /** specifies the paper format as Legal. */
  @js.native
  sealed trait LEGAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /** specifies the paper format as Letter. */
  @js.native
  sealed trait LETTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /** specifies the paper format as Tabloid. */
  @js.native
  sealed trait TABLOID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /** The real paper size is user defined in 100th mm. */
  @js.native
  sealed trait USER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat
  
  /* 0 */ val A3: A3 with scala.Double = js.native
  /* 1 */ val A4: A4 with scala.Double = js.native
  /* 2 */ val A5: A5 with scala.Double = js.native
  /* 3 */ val B4: B4 with scala.Double = js.native
  /* 4 */ val B5: B5 with scala.Double = js.native
  /* 6 */ val LEGAL: LEGAL with scala.Double = js.native
  /* 5 */ val LETTER: LETTER with scala.Double = js.native
  /* 7 */ val TABLOID: TABLOID with scala.Double = js.native
  /* 8 */ val USER: USER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.PaperFormat with scala.Double
  ] = js.native
}

