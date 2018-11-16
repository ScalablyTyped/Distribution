package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DatabaseTypeEnum extends js.Object

@JSGlobal("DAO.DatabaseTypeEnum")
@js.native
object DatabaseTypeEnum extends js.Object {
  /** @deprecated */
  @js.native
  sealed trait dbDecrypt
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  /** @deprecated */
  @js.native
  sealed trait dbEncrypt
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  @js.native
  sealed trait dbVersion10
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  @js.native
  sealed trait dbVersion11
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  @js.native
  sealed trait dbVersion120
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  @js.native
  sealed trait dbVersion140
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  @js.native
  sealed trait dbVersion150
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  @js.native
  sealed trait dbVersion20
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  @js.native
  sealed trait dbVersion30
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  @js.native
  sealed trait dbVersion40
    extends activexDashDaoLib.DAONs.DatabaseTypeEnum
  
  /* 4 */ val dbDecrypt: dbDecrypt with scala.Double = js.native
  /* 2 */ val dbEncrypt: dbEncrypt with scala.Double = js.native
  /* 1 */ val dbVersion10: dbVersion10 with scala.Double = js.native
  /* 8 */ val dbVersion11: dbVersion11 with scala.Double = js.native
  /* 128 */ val dbVersion120: dbVersion120 with scala.Double = js.native
  /* 256 */ val dbVersion140: dbVersion140 with scala.Double = js.native
  /* 512 */ val dbVersion150: dbVersion150 with scala.Double = js.native
  /* 16 */ val dbVersion20: dbVersion20 with scala.Double = js.native
  /* 32 */ val dbVersion30: dbVersion30 with scala.Double = js.native
  /* 64 */ val dbVersion40: dbVersion40 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.DatabaseTypeEnum with scala.Double] = js.native
}

