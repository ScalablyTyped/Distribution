package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetOptionEnum extends js.Object

@JSGlobal("DAO.SetOptionEnum")
@js.native
object SetOptionEnum extends js.Object {
  @js.native
  sealed trait dbExclusiveAsyncDelay
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbFlushTransactionTimeout
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbImplicitCommitSync
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbLockDelay
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbLockRetry
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbMaxBufferSize
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbMaxLocksPerFile
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbPageTimeout
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbPasswordEncryptionAlgorithm
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbPasswordEncryptionKeyLength
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbPasswordEncryptionProvider
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbRecycleLVs
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbSharedAsyncDelay
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  @js.native
  sealed trait dbUserCommitSync
    extends activexDashDaoLib.DAONs.SetOptionEnum
  
  /* 60 */ val dbExclusiveAsyncDelay: dbExclusiveAsyncDelay with scala.Double = js.native
  /* 66 */ val dbFlushTransactionTimeout: dbFlushTransactionTimeout with scala.Double = js.native
  /* 59 */ val dbImplicitCommitSync: dbImplicitCommitSync with scala.Double = js.native
  /* 63 */ val dbLockDelay: dbLockDelay with scala.Double = js.native
  /* 57 */ val dbLockRetry: dbLockRetry with scala.Double = js.native
  /* 8 */ val dbMaxBufferSize: dbMaxBufferSize with scala.Double = js.native
  /* 62 */ val dbMaxLocksPerFile: dbMaxLocksPerFile with scala.Double = js.native
  /* 6 */ val dbPageTimeout: dbPageTimeout with scala.Double = js.native
  /* 81 */ val dbPasswordEncryptionAlgorithm: dbPasswordEncryptionAlgorithm with scala.Double = js.native
  /* 82 */ val dbPasswordEncryptionKeyLength: dbPasswordEncryptionKeyLength with scala.Double = js.native
  /* 80 */ val dbPasswordEncryptionProvider: dbPasswordEncryptionProvider with scala.Double = js.native
  /* 65 */ val dbRecycleLVs: dbRecycleLVs with scala.Double = js.native
  /* 61 */ val dbSharedAsyncDelay: dbSharedAsyncDelay with scala.Double = js.native
  /* 58 */ val dbUserCommitSync: dbUserCommitSync with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.SetOptionEnum with scala.Double] = js.native
}

