package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableDefAttributeEnum extends js.Object

@JSGlobal("DAO.TableDefAttributeEnum")
@js.native
object TableDefAttributeEnum extends js.Object {
  @js.native
  sealed trait dbAttachExclusive
    extends activexDashDaoLib.DAONs.TableDefAttributeEnum
  
  @js.native
  sealed trait dbAttachSavePWD
    extends activexDashDaoLib.DAONs.TableDefAttributeEnum
  
  @js.native
  sealed trait dbAttachedODBC
    extends activexDashDaoLib.DAONs.TableDefAttributeEnum
  
  @js.native
  sealed trait dbAttachedTable
    extends activexDashDaoLib.DAONs.TableDefAttributeEnum
  
  @js.native
  sealed trait dbHiddenObject
    extends activexDashDaoLib.DAONs.TableDefAttributeEnum
  
  @js.native
  sealed trait dbSystemObject
    extends activexDashDaoLib.DAONs.TableDefAttributeEnum
  
  /* 65536 */ val dbAttachExclusive: dbAttachExclusive with scala.Double = js.native
  /* 131072 */ val dbAttachSavePWD: dbAttachSavePWD with scala.Double = js.native
  /* 536870912 */ val dbAttachedODBC: dbAttachedODBC with scala.Double = js.native
  /* 1073741824 */ val dbAttachedTable: dbAttachedTable with scala.Double = js.native
  /* 1 */ val dbHiddenObject: dbHiddenObject with scala.Double = js.native
  /* -2147483646 */ val dbSystemObject: dbSystemObject with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.TableDefAttributeEnum with scala.Double] = js.native
}

