package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ObjectTypeEnum extends js.Object

@JSGlobal("ADOX.ObjectTypeEnum")
@js.native
object ObjectTypeEnum extends js.Object {
  @js.native
  sealed trait adPermObjColumn
    extends activexDashAdoxLib.ADOXNs.ObjectTypeEnum
  
  @js.native
  sealed trait adPermObjDatabase
    extends activexDashAdoxLib.ADOXNs.ObjectTypeEnum
  
  @js.native
  sealed trait adPermObjProcedure
    extends activexDashAdoxLib.ADOXNs.ObjectTypeEnum
  
  @js.native
  sealed trait adPermObjProviderSpecific
    extends activexDashAdoxLib.ADOXNs.ObjectTypeEnum
  
  @js.native
  sealed trait adPermObjTable
    extends activexDashAdoxLib.ADOXNs.ObjectTypeEnum
  
  @js.native
  sealed trait adPermObjView
    extends activexDashAdoxLib.ADOXNs.ObjectTypeEnum
  
  /* 2 */ val adPermObjColumn: adPermObjColumn with scala.Double = js.native
  /* 3 */ val adPermObjDatabase: adPermObjDatabase with scala.Double = js.native
  /* 4 */ val adPermObjProcedure: adPermObjProcedure with scala.Double = js.native
  /* -1 */ val adPermObjProviderSpecific: adPermObjProviderSpecific with scala.Double = js.native
  /* 1 */ val adPermObjTable: adPermObjTable with scala.Double = js.native
  /* 5 */ val adPermObjView: adPermObjView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdoxLib.ADOXNs.ObjectTypeEnum with scala.Double] = js.native
}

