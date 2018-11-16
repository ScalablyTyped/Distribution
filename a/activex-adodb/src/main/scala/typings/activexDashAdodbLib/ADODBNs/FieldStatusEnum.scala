package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldStatusEnum extends js.Object

@JSGlobal("ADODB.FieldStatusEnum")
@js.native
object FieldStatusEnum extends js.Object {
  @js.native
  sealed trait adFieldAlreadyExists
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldBadStatus
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldCannotComplete
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldCannotDeleteSource
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldCantConvertValue
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldCantCreate
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldDataOverflow
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldDefault
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldDoesNotExist
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldIgnore
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldIntegrityViolation
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldInvalidURL
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldIsNull
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldOK
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldOutOfSpace
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldPendingChange
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldPendingDelete
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldPendingInsert
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldPendingUnknown
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldPendingUnknownDelete
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldPermissionDenied
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldReadOnly
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldResourceExists
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldResourceLocked
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldResourceOutOfScope
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldSchemaViolation
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldSignMismatch
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldTruncated
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldUnavailable
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  @js.native
  sealed trait adFieldVolumeNotFound
    extends activexDashAdodbLib.ADODBNs.FieldStatusEnum
  
  /* 26 */ val adFieldAlreadyExists: adFieldAlreadyExists with scala.Double = js.native
  /* 12 */ val adFieldBadStatus: adFieldBadStatus with scala.Double = js.native
  /* 20 */ val adFieldCannotComplete: adFieldCannotComplete with scala.Double = js.native
  /* 23 */ val adFieldCannotDeleteSource: adFieldCannotDeleteSource with scala.Double = js.native
  /* 2 */ val adFieldCantConvertValue: adFieldCantConvertValue with scala.Double = js.native
  /* 7 */ val adFieldCantCreate: adFieldCantCreate with scala.Double = js.native
  /* 6 */ val adFieldDataOverflow: adFieldDataOverflow with scala.Double = js.native
  /* 13 */ val adFieldDefault: adFieldDefault with scala.Double = js.native
  /* 16 */ val adFieldDoesNotExist: adFieldDoesNotExist with scala.Double = js.native
  /* 15 */ val adFieldIgnore: adFieldIgnore with scala.Double = js.native
  /* 10 */ val adFieldIntegrityViolation: adFieldIntegrityViolation with scala.Double = js.native
  /* 17 */ val adFieldInvalidURL: adFieldInvalidURL with scala.Double = js.native
  /* 3 */ val adFieldIsNull: adFieldIsNull with scala.Double = js.native
  /* 0 */ val adFieldOK: adFieldOK with scala.Double = js.native
  /* 22 */ val adFieldOutOfSpace: adFieldOutOfSpace with scala.Double = js.native
  /* 262144 */ val adFieldPendingChange: adFieldPendingChange with scala.Double = js.native
  /* 131072 */ val adFieldPendingDelete: adFieldPendingDelete with scala.Double = js.native
  /* 65536 */ val adFieldPendingInsert: adFieldPendingInsert with scala.Double = js.native
  /* 524288 */ val adFieldPendingUnknown: adFieldPendingUnknown with scala.Double = js.native
  /* 1048576 */ val adFieldPendingUnknownDelete: adFieldPendingUnknownDelete with scala.Double = js.native
  /* 9 */ val adFieldPermissionDenied: adFieldPermissionDenied with scala.Double = js.native
  /* 24 */ val adFieldReadOnly: adFieldReadOnly with scala.Double = js.native
  /* 19 */ val adFieldResourceExists: adFieldResourceExists with scala.Double = js.native
  /* 18 */ val adFieldResourceLocked: adFieldResourceLocked with scala.Double = js.native
  /* 25 */ val adFieldResourceOutOfScope: adFieldResourceOutOfScope with scala.Double = js.native
  /* 11 */ val adFieldSchemaViolation: adFieldSchemaViolation with scala.Double = js.native
  /* 5 */ val adFieldSignMismatch: adFieldSignMismatch with scala.Double = js.native
  /* 4 */ val adFieldTruncated: adFieldTruncated with scala.Double = js.native
  /* 8 */ val adFieldUnavailable: adFieldUnavailable with scala.Double = js.native
  /* 21 */ val adFieldVolumeNotFound: adFieldVolumeNotFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.FieldStatusEnum with scala.Double] = js.native
}

