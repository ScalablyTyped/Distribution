package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecordStatusEnum extends js.Object

@JSGlobal("ADODB.RecordStatusEnum")
@js.native
object RecordStatusEnum extends js.Object {
  @js.native
  sealed trait adRecCanceled
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecCantRelease
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecConcurrencyViolation
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecDBDeleted
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecDeleted
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecIntegrityViolation
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecInvalid
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecMaxChangesExceeded
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecModified
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecMultipleChanges
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecNew
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecOK
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecObjectOpen
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecOutOfMemory
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecPendingChanges
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecPermissionDenied
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecSchemaViolation
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  @js.native
  sealed trait adRecUnmodified
    extends activexDashAdodbLib.ADODBNs.RecordStatusEnum
  
  /* 256 */ val adRecCanceled: adRecCanceled with scala.Double = js.native
  /* 1024 */ val adRecCantRelease: adRecCantRelease with scala.Double = js.native
  /* 2048 */ val adRecConcurrencyViolation: adRecConcurrencyViolation with scala.Double = js.native
  /* 262144 */ val adRecDBDeleted: adRecDBDeleted with scala.Double = js.native
  /* 4 */ val adRecDeleted: adRecDeleted with scala.Double = js.native
  /* 4096 */ val adRecIntegrityViolation: adRecIntegrityViolation with scala.Double = js.native
  /* 16 */ val adRecInvalid: adRecInvalid with scala.Double = js.native
  /* 8192 */ val adRecMaxChangesExceeded: adRecMaxChangesExceeded with scala.Double = js.native
  /* 2 */ val adRecModified: adRecModified with scala.Double = js.native
  /* 64 */ val adRecMultipleChanges: adRecMultipleChanges with scala.Double = js.native
  /* 1 */ val adRecNew: adRecNew with scala.Double = js.native
  /* 0 */ val adRecOK: adRecOK with scala.Double = js.native
  /* 16384 */ val adRecObjectOpen: adRecObjectOpen with scala.Double = js.native
  /* 32768 */ val adRecOutOfMemory: adRecOutOfMemory with scala.Double = js.native
  /* 128 */ val adRecPendingChanges: adRecPendingChanges with scala.Double = js.native
  /* 65536 */ val adRecPermissionDenied: adRecPermissionDenied with scala.Double = js.native
  /* 131072 */ val adRecSchemaViolation: adRecSchemaViolation with scala.Double = js.native
  /* 8 */ val adRecUnmodified: adRecUnmodified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.RecordStatusEnum with scala.Double] = js.native
}

