package typings.activexAdodb

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.EventReasonEnum
import typings.activexAdodb.ADODB.EventStatusEnum
import typings.activexAdodb.ADODB.Field
import typings.activexAdodb.ADODB.Recordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AdReason extends StObject {
    
    val adReason: EventReasonEnum = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    val pError: Error = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
  
  @js.native
  trait AdReasonAdStatus extends StObject {
    
    val adReason: EventReasonEnum = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
  
  @js.native
  trait AdStatus extends StObject {
    
    val TransactionLevel: Double = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    val pConnection: Connection = js.native
    
    val pError: Error = js.native
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
  
  @js.native
  trait AdStatusPConnection extends StObject {
    
    var adStatus: EventStatusEnum = js.native
    
    val pConnection: Connection = js.native
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
  
  @js.native
  trait CFields extends StObject {
    
    val Fields: js.Any = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    val cFields: Double = js.native
    
    val pError: Error = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
  
  @js.native
  trait CRecords extends StObject {
    
    val adReason: EventReasonEnum = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    val cRecords: Double = js.native
    
    val pError: Error = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
  
  @js.native
  trait FMoreData extends StObject {
    
    var adStatus: EventStatusEnum = js.native
    
    var fMoreData: Boolean = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
  
  @js.native
  trait Fields extends StObject {
    
    val Fields: js.Any = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    val cFields: Double = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
  
  @js.native
  trait MaxProgress extends StObject {
    
    val MaxProgress: Double = js.native
    
    val Progress: Double = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
  
  @js.native
  trait PConnection extends StObject {
    
    var adStatus: EventStatusEnum = js.native
    
    val pConnection: Connection = js.native
    
    val pError: Error = js.native
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
  
  @js.native
  trait PError extends StObject {
    
    var adStatus: EventStatusEnum = js.native
    
    val pError: Error = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
  
  @js.native
  trait PRecordset extends StObject {
    
    val adReason: EventReasonEnum = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    val cRecords: Double = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
}
