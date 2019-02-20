package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableOperationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdb.application.CopyTableOperation.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait AppendData
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableOperationNs.Constants
  
  @js.native
  sealed trait CopyDefinitionAndData
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableOperationNs.Constants
  
  @js.native
  sealed trait CopyDefinitionOnly
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableOperationNs.Constants
  
  @js.native
  sealed trait CreateAsView
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableOperationNs.Constants
  
  /* 3 */ val AppendData: AppendData with scala.Double = js.native
  /* 0 */ val CopyDefinitionAndData: CopyDefinitionAndData with scala.Double = js.native
  /* 1 */ val CopyDefinitionOnly: CopyDefinitionOnly with scala.Double = js.native
  /* 2 */ val CreateAsView: CreateAsView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.applicationNs.CopyTableOperationNs.Constants with scala.Double
  ] = js.native
}

