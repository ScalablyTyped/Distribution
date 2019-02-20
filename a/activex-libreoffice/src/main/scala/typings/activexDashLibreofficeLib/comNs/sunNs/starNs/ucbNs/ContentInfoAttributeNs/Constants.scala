package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfoAttributeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ucb.ContentInfoAttribute.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait INSERT_WITH_INPUTSTREAM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfoAttributeNs.Constants
  
  @js.native
  sealed trait KIND_DOCUMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfoAttributeNs.Constants
  
  @js.native
  sealed trait KIND_FOLDER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfoAttributeNs.Constants
  
  @js.native
  sealed trait KIND_LINK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfoAttributeNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfoAttributeNs.Constants
  
  /* 1 */ val INSERT_WITH_INPUTSTREAM: INSERT_WITH_INPUTSTREAM with scala.Double = js.native
  /* 2 */ val KIND_DOCUMENT: KIND_DOCUMENT with scala.Double = js.native
  /* 4 */ val KIND_FOLDER: KIND_FOLDER with scala.Double = js.native
  /* 8 */ val KIND_LINK: KIND_LINK with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfoAttributeNs.Constants with scala.Double
  ] = js.native
}

