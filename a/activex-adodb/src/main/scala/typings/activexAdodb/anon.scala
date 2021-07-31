package typings.activexAdodb

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.EventReasonEnum
import typings.activexAdodb.ADODB.EventStatusEnum
import typings.activexAdodb.ADODB.Field
import typings.activexAdodb.ADODB.Recordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdReason extends StObject {
    
    val adReason: EventReasonEnum
    
    var adStatus: EventStatusEnum
    
    val pError: Error
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object AdReason {
    
    @scala.inline
    def apply(adReason: EventReasonEnum, adStatus: EventStatusEnum, pError: Error, pRecordset: Recordset): AdReason = {
      val __obj = js.Dynamic.literal(adReason = adReason.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdReason]
    }
    
    @scala.inline
    implicit class AdReasonMutableBuilder[Self <: AdReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdReason(value: EventReasonEnum): Self = StObject.set(x, "adReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPError(value: Error): Self = StObject.set(x, "pError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdReasonAdStatus extends StObject {
    
    val adReason: EventReasonEnum
    
    var adStatus: EventStatusEnum
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object AdReasonAdStatus {
    
    @scala.inline
    def apply(adReason: EventReasonEnum, adStatus: EventStatusEnum, pRecordset: Recordset): AdReasonAdStatus = {
      val __obj = js.Dynamic.literal(adReason = adReason.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdReasonAdStatus]
    }
    
    @scala.inline
    implicit class AdReasonAdStatusMutableBuilder[Self <: AdReasonAdStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdReason(value: EventReasonEnum): Self = StObject.set(x, "adReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdStatus extends StObject {
    
    val TransactionLevel: Double
    
    var adStatus: EventStatusEnum
    
    val pConnection: Connection
    
    val pError: Error
  }
  object AdStatus {
    
    @scala.inline
    def apply(TransactionLevel: Double, adStatus: EventStatusEnum, pConnection: Connection, pError: Error): AdStatus = {
      val __obj = js.Dynamic.literal(TransactionLevel = TransactionLevel.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdStatus]
    }
    
    @scala.inline
    implicit class AdStatusMutableBuilder[Self <: AdStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPConnection(value: Connection): Self = StObject.set(x, "pConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPError(value: Error): Self = StObject.set(x, "pError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionLevel(value: Double): Self = StObject.set(x, "TransactionLevel", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdStatusPConnection extends StObject {
    
    var adStatus: EventStatusEnum
    
    val pConnection: Connection
  }
  object AdStatusPConnection {
    
    @scala.inline
    def apply(adStatus: EventStatusEnum, pConnection: Connection): AdStatusPConnection = {
      val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdStatusPConnection]
    }
    
    @scala.inline
    implicit class AdStatusPConnectionMutableBuilder[Self <: AdStatusPConnection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPConnection(value: Connection): Self = StObject.set(x, "pConnection", value.asInstanceOf[js.Any])
    }
  }
  
  trait CFields extends StObject {
    
    val Fields: js.Any
    
    var adStatus: EventStatusEnum
    
    val cFields: Double
    
    val pError: Error
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object CFields {
    
    @scala.inline
    def apply(Fields: js.Any, adStatus: EventStatusEnum, cFields: Double, pError: Error, pRecordset: Recordset): CFields = {
      val __obj = js.Dynamic.literal(Fields = Fields.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], cFields = cFields.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[CFields]
    }
    
    @scala.inline
    implicit class CFieldsMutableBuilder[Self <: CFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCFields(value: Double): Self = StObject.set(x, "cFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: js.Any): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPError(value: Error): Self = StObject.set(x, "pError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
    }
  }
  
  trait CRecords extends StObject {
    
    val adReason: EventReasonEnum
    
    var adStatus: EventStatusEnum
    
    val cRecords: Double
    
    val pError: Error
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object CRecords {
    
    @scala.inline
    def apply(
      adReason: EventReasonEnum,
      adStatus: EventStatusEnum,
      cRecords: Double,
      pError: Error,
      pRecordset: Recordset
    ): CRecords = {
      val __obj = js.Dynamic.literal(adReason = adReason.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], cRecords = cRecords.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[CRecords]
    }
    
    @scala.inline
    implicit class CRecordsMutableBuilder[Self <: CRecords] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdReason(value: EventReasonEnum): Self = StObject.set(x, "adReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCRecords(value: Double): Self = StObject.set(x, "cRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPError(value: Error): Self = StObject.set(x, "pError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
    }
  }
  
  trait FMoreData extends StObject {
    
    var adStatus: EventStatusEnum
    
    var fMoreData: Boolean
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object FMoreData {
    
    @scala.inline
    def apply(adStatus: EventStatusEnum, fMoreData: Boolean, pRecordset: Recordset): FMoreData = {
      val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], fMoreData = fMoreData.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[FMoreData]
    }
    
    @scala.inline
    implicit class FMoreDataMutableBuilder[Self <: FMoreData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFMoreData(value: Boolean): Self = StObject.set(x, "fMoreData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    val Fields: js.Any
    
    var adStatus: EventStatusEnum
    
    val cFields: Double
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object Fields {
    
    @scala.inline
    def apply(Fields: js.Any, adStatus: EventStatusEnum, cFields: Double, pRecordset: Recordset): Fields = {
      val __obj = js.Dynamic.literal(Fields = Fields.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], cFields = cFields.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCFields(value: Double): Self = StObject.set(x, "cFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: js.Any): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxProgress extends StObject {
    
    val MaxProgress: Double
    
    val Progress: Double
    
    var adStatus: EventStatusEnum
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object MaxProgress {
    
    @scala.inline
    def apply(MaxProgress: Double, Progress: Double, adStatus: EventStatusEnum, pRecordset: Recordset): MaxProgress = {
      val __obj = js.Dynamic.literal(MaxProgress = MaxProgress.asInstanceOf[js.Any], Progress = Progress.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxProgress]
    }
    
    @scala.inline
    implicit class MaxProgressMutableBuilder[Self <: MaxProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxProgress(value: Double): Self = StObject.set(x, "MaxProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    }
  }
  
  trait PConnection extends StObject {
    
    var adStatus: EventStatusEnum
    
    val pConnection: Connection
    
    val pError: Error
  }
  object PConnection {
    
    @scala.inline
    def apply(adStatus: EventStatusEnum, pConnection: Connection, pError: Error): PConnection = {
      val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any])
      __obj.asInstanceOf[PConnection]
    }
    
    @scala.inline
    implicit class PConnectionMutableBuilder[Self <: PConnection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPConnection(value: Connection): Self = StObject.set(x, "pConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPError(value: Error): Self = StObject.set(x, "pError", value.asInstanceOf[js.Any])
    }
  }
  
  trait PError extends StObject {
    
    var adStatus: EventStatusEnum
    
    val pError: Error
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object PError {
    
    @scala.inline
    def apply(adStatus: EventStatusEnum, pError: Error, pRecordset: Recordset): PError = {
      val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[PError]
    }
    
    @scala.inline
    implicit class PErrorMutableBuilder[Self <: PError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPError(value: Error): Self = StObject.set(x, "pError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
    }
  }
  
  trait PRecordset extends StObject {
    
    val adReason: EventReasonEnum
    
    var adStatus: EventStatusEnum
    
    val cRecords: Double
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object PRecordset {
    
    @scala.inline
    def apply(adReason: EventReasonEnum, adStatus: EventStatusEnum, cRecords: Double, pRecordset: Recordset): PRecordset = {
      val __obj = js.Dynamic.literal(adReason = adReason.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], cRecords = cRecords.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[PRecordset]
    }
    
    @scala.inline
    implicit class PRecordsetMutableBuilder[Self <: PRecordset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdReason(value: EventReasonEnum): Self = StObject.set(x, "adReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCRecords(value: Double): Self = StObject.set(x, "cRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
    }
  }
}
