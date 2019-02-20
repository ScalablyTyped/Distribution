package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.ScriptType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ASIAN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptTypeNs.Constants
  
  @js.native
  sealed trait COMPLEX
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptTypeNs.Constants
  
  @js.native
  sealed trait LATIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptTypeNs.Constants
  
  @js.native
  sealed trait WEAK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptTypeNs.Constants
  
  /* 2 */ val ASIAN: ASIAN with scala.Double = js.native
  /* 3 */ val COMPLEX: COMPLEX with scala.Double = js.native
  /* 1 */ val LATIN: LATIN with scala.Double = js.native
  /* 4 */ val WEAK: WEAK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.ScriptTypeNs.Constants with scala.Double
  ] = js.native
}

