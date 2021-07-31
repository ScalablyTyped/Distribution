package typings.activexAdodb.ADODB

import typings.activexAdodb.activexAdodbStrings.ConnectionString
import typings.activexAdodb.activexAdodbStrings.CursorType
import typings.activexAdodb.activexAdodbStrings.LockType
import typings.activexAdodb.activexAdodbStrings.Options
import typings.activexAdodb.activexAdodbStrings.Password
import typings.activexAdodb.activexAdodbStrings.RecordsAffected
import typings.activexAdodb.activexAdodbStrings.Source
import typings.activexAdodb.activexAdodbStrings.UserID
import typings.activexAdodb.activexAdodbStrings.adStatus
import typings.activexAdodb.activexAdodbStrings.pCommand
import typings.activexAdodb.activexAdodbStrings.pConnection
import typings.activexAdodb.activexAdodbStrings.pError
import typings.activexAdodb.activexAdodbStrings.pRecordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ConnectionExecuteCompleteArgNames = js.Tuple6[RecordsAffected, pError, adStatus, pCommand, pRecordset, pConnection]
  
  trait ConnectionExecuteCompleteParameter extends StObject {
    
    val RecordsAffected: Double
    
    var adStatus: EventStatusEnum
    
    val pCommand: Command
    
    val pConnection: Connection
    
    val pError: Error
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object ConnectionExecuteCompleteParameter {
    
    @scala.inline
    def apply(
      RecordsAffected: Double,
      adStatus: EventStatusEnum,
      pCommand: Command,
      pConnection: Connection,
      pError: Error,
      pRecordset: Recordset
    ): ConnectionExecuteCompleteParameter = {
      val __obj = js.Dynamic.literal(RecordsAffected = RecordsAffected.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pCommand = pCommand.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionExecuteCompleteParameter]
    }
    
    @scala.inline
    implicit class ConnectionExecuteCompleteParameterMutableBuilder[Self <: ConnectionExecuteCompleteParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPCommand(value: Command): Self = StObject.set(x, "pCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPConnection(value: Connection): Self = StObject.set(x, "pConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPError(value: Error): Self = StObject.set(x, "pError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsAffected(value: Double): Self = StObject.set(x, "RecordsAffected", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionWillConnectArgNames = js.Tuple6[ConnectionString, UserID, Password, Options, adStatus, pConnection]
  
  trait ConnectionWillConnectParameter extends StObject {
    
    var ConnectionString: String
    
    var Options: Double
    
    var Password: String
    
    var UserID: String
    
    var adStatus: EventStatusEnum
    
    val pConnection: Connection
  }
  object ConnectionWillConnectParameter {
    
    @scala.inline
    def apply(
      ConnectionString: String,
      Options: Double,
      Password: String,
      UserID: String,
      adStatus: EventStatusEnum,
      pConnection: Connection
    ): ConnectionWillConnectParameter = {
      val __obj = js.Dynamic.literal(ConnectionString = ConnectionString.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionWillConnectParameter]
    }
    
    @scala.inline
    implicit class ConnectionWillConnectParameterMutableBuilder[Self <: ConnectionWillConnectParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionString(value: String): Self = StObject.set(x, "ConnectionString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Double): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPConnection(value: Connection): Self = StObject.set(x, "pConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserID(value: String): Self = StObject.set(x, "UserID", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionWillExecuteArgNames = js.Tuple8[Source, CursorType, LockType, Options, adStatus, pCommand, pRecordset, pConnection]
  
  trait ConnectionWillExecuteParameter extends StObject {
    
    var CursorType: CursorTypeEnum
    
    var LockType: LockTypeEnum
    
    var Options: Double
    
    var Source: String
    
    var adStatus: EventStatusEnum
    
    val pCommand: Command
    
    val pConnection: Connection
    
    def pRecordset(FieldIndex: String): Field
    def pRecordset(FieldIndex: Double): Field
    @JSName("pRecordset")
    val pRecordset_Original: Recordset
  }
  object ConnectionWillExecuteParameter {
    
    @scala.inline
    def apply(
      CursorType: CursorTypeEnum,
      LockType: LockTypeEnum,
      Options: Double,
      Source: String,
      adStatus: EventStatusEnum,
      pCommand: Command,
      pConnection: Connection,
      pRecordset: Recordset
    ): ConnectionWillExecuteParameter = {
      val __obj = js.Dynamic.literal(CursorType = CursorType.asInstanceOf[js.Any], LockType = LockType.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pCommand = pCommand.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pRecordset = pRecordset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionWillExecuteParameter]
    }
    
    @scala.inline
    implicit class ConnectionWillExecuteParameterMutableBuilder[Self <: ConnectionWillExecuteParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorType(value: CursorTypeEnum): Self = StObject.set(x, "CursorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockType(value: LockTypeEnum): Self = StObject.set(x, "LockType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Double): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPCommand(value: Command): Self = StObject.set(x, "pCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPConnection(value: Connection): Self = StObject.set(x, "pConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRecordset(value: Recordset): Self = StObject.set(x, "pRecordset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    }
  }
}
