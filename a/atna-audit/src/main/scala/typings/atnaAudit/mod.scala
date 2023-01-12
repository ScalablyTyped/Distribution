package typings.atnaAudit

import typings.atnaAudit.atnaAuditInts.`0`
import typings.atnaAudit.atnaAuditInts.`10`
import typings.atnaAudit.atnaAuditInts.`11`
import typings.atnaAudit.atnaAuditInts.`12`
import typings.atnaAudit.atnaAuditInts.`13`
import typings.atnaAudit.atnaAuditInts.`14`
import typings.atnaAudit.atnaAuditInts.`15`
import typings.atnaAudit.atnaAuditInts.`16`
import typings.atnaAudit.atnaAuditInts.`17`
import typings.atnaAudit.atnaAuditInts.`18`
import typings.atnaAudit.atnaAuditInts.`19`
import typings.atnaAudit.atnaAuditInts.`1`
import typings.atnaAudit.atnaAuditInts.`20`
import typings.atnaAudit.atnaAuditInts.`21`
import typings.atnaAudit.atnaAuditInts.`24`
import typings.atnaAudit.atnaAuditInts.`2`
import typings.atnaAudit.atnaAuditInts.`3`
import typings.atnaAudit.atnaAuditInts.`4`
import typings.atnaAudit.atnaAuditInts.`5`
import typings.atnaAudit.atnaAuditInts.`6`
import typings.atnaAudit.atnaAuditInts.`7`
import typings.atnaAudit.atnaAuditInts.`8`
import typings.atnaAudit.atnaAuditInts.`9`
import typings.atnaAudit.atnaAuditStrings.C
import typings.atnaAudit.atnaAuditStrings.D
import typings.atnaAudit.atnaAuditStrings.E
import typings.atnaAudit.atnaAuditStrings.R
import typings.atnaAudit.atnaAuditStrings.U
import typings.atnaAudit.atnaAuditStrings.tcp
import typings.atnaAudit.atnaAuditStrings.tls
import typings.atnaAudit.atnaAuditStrings.udp
import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atna-audit", "constants")
  @js.native
  val constants: Constants_ = js.native
  
  object construct {
    
    @JSImport("atna-audit", "construct")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("atna-audit", "construct.ActiveParticipant")
    @js.native
    open class ActiveParticipant protected () extends StObject {
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: String,
        netAccessPointTypeCode: Double,
        roleCodes: js.Array[Code]
      ) = this()
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: String,
        netAccessPointTypeCode: Null,
        roleCodes: js.Array[Code]
      ) = this()
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: String,
        netAccessPointTypeCode: Unit,
        roleCodes: js.Array[Code]
      ) = this()
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: Null,
        netAccessPointTypeCode: Double,
        roleCodes: js.Array[Code]
      ) = this()
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: Null,
        netAccessPointTypeCode: Null,
        roleCodes: js.Array[Code]
      ) = this()
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: Null,
        netAccessPointTypeCode: Unit,
        roleCodes: js.Array[Code]
      ) = this()
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: Unit,
        netAccessPointTypeCode: Double,
        roleCodes: js.Array[Code]
      ) = this()
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: Unit,
        netAccessPointTypeCode: Null,
        roleCodes: js.Array[Code]
      ) = this()
      def this(
        userId: String,
        altUserId: String,
        userIsRequestor: Boolean,
        netAccessPointId: Unit,
        netAccessPointTypeCode: Unit,
        roleCodes: js.Array[Code]
      ) = this()
      
      def toXML(): String = js.native
    }
    
    @JSImport("atna-audit", "construct.AuditMessage")
    @js.native
    open class AuditMessage protected () extends StObject {
      def this(
        eventIdent: js.UndefOr[EventIdentification | Null],
        activeParticipants: js.UndefOr[js.Array[ActiveParticipant] | Null],
        participantObjs: js.UndefOr[js.Array[Any] | Null],
        auditSources: js.UndefOr[js.Array[AuditSourceIdentification] | Null]
      ) = this()
      
      def toXML(): String = js.native
    }
    
    @JSImport("atna-audit", "construct.AuditSourceIdentification")
    @js.native
    open class AuditSourceIdentification protected () extends StObject {
      def this(auditEnterpriseSiteId: String, auditSourceId: String, auditSourceTypeCode: Code) = this()
      def this(auditEnterpriseSiteId: Null, auditSourceId: String, auditSourceTypeCode: Code) = this()
      def this(auditEnterpriseSiteId: Unit, auditSourceId: String, auditSourceTypeCode: Code) = this()
      
      def toXML(): String = js.native
    }
    
    @JSImport("atna-audit", "construct.Code")
    @js.native
    open class Code protected () extends StObject {
      def this(code: Double, originalText: String, codeSystemName: String) = this()
      def this(code: Double, originalText: String, codeSystemName: String, displayName: String) = this()
      
      def toXML(): String = js.native
    }
    
    @JSImport("atna-audit", "construct.EventIdentification")
    @js.native
    open class EventIdentification protected () extends StObject {
      def this(actionCode: String, datetime: js.Date, outcome: Double, eventID: Code) = this()
      def this(actionCode: String, datetime: js.Date, outcome: Double, eventID: Code, typeCode: Code) = this()
      
      def toXML(): String = js.native
    }
    
    inline def userLoginAudit(
      outcome: Double,
      sysname: String,
      hostname: String,
      username: String,
      userRole: String,
      userRoleCode: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userLoginAudit")(outcome.asInstanceOf[js.Any], sysname.asInstanceOf[js.Any], hostname.asInstanceOf[js.Any], username.asInstanceOf[js.Any], userRole.asInstanceOf[js.Any], userRoleCode.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def wrapInSyslog(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInSyslog")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object send {
    
    @JSImport("atna-audit", "send")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sendAuditEvent(msg: String, connDetail: SendConnDetail): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendAuditEvent")(msg.asInstanceOf[js.Any], connDetail.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sendAuditEvent(msg: String, connDetail: SendConnDetail, callback: SendCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendAuditEvent")(msg.asInstanceOf[js.Any], connDetail.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    trait CommonConnDetail extends StObject {
      
      var host: String
      
      var port: Double
    }
    object CommonConnDetail {
      
      inline def apply(host: String, port: Double): CommonConnDetail = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[CommonConnDetail]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: CommonConnDetail] (val x: Self) extends AnyVal {
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      }
    }
    
    type SendCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    
    /* Rewritten from type alias, can be one of: 
      - typings.atnaAudit.mod.send.UdpConnDetail
      - typings.atnaAudit.mod.send.TcpConnDetail
      - typings.atnaAudit.mod.send.TlsConnDetail
    */
    trait SendConnDetail extends StObject
    object SendConnDetail {
      
      inline def TcpConnDetail(host: String, port: Double): typings.atnaAudit.mod.send.TcpConnDetail = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], interface = "tcp", port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.atnaAudit.mod.send.TcpConnDetail]
      }
      
      inline def TlsConnDetail(host: String, port: Double): typings.atnaAudit.mod.send.TlsConnDetail = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], interface = "tls", port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.atnaAudit.mod.send.TlsConnDetail]
      }
      
      inline def UdpConnDetail(host: String, port: Double): typings.atnaAudit.mod.send.UdpConnDetail = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], interface = "udp", port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.atnaAudit.mod.send.UdpConnDetail]
      }
    }
    
    trait TcpConnDetail
      extends StObject
         with CommonConnDetail
         with SendConnDetail {
      
      var interface: tcp
    }
    object TcpConnDetail {
      
      inline def apply(host: String, port: Double): TcpConnDetail = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], interface = "tcp", port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[TcpConnDetail]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TcpConnDetail] (val x: Self) extends AnyVal {
        
        inline def setInterface(value: tcp): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      }
    }
    
    trait TlsConnDetail
      extends StObject
         with CommonConnDetail
         with SendConnDetail {
      
      var interface: tls
      
      var options: js.UndefOr[ConnectionOptions] = js.undefined
    }
    object TlsConnDetail {
      
      inline def apply(host: String, port: Double): TlsConnDetail = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], interface = "tls", port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[TlsConnDetail]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TlsConnDetail] (val x: Self) extends AnyVal {
        
        inline def setInterface(value: tls): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: ConnectionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      }
    }
    
    trait UdpConnDetail
      extends StObject
         with CommonConnDetail
         with SendConnDetail {
      
      var interface: udp
    }
    object UdpConnDetail {
      
      inline def apply(host: String, port: Double): UdpConnDetail = {
        val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], interface = "udp", port = port.asInstanceOf[js.Any])
        __obj.asInstanceOf[UdpConnDetail]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UdpConnDetail] (val x: Self) extends AnyVal {
        
        inline def setInterface(value: udp): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait Constants_ extends StObject {
    
    var AUDIT_SRC_TYPE_APP_SERVER: `4`
    
    var AUDIT_SRC_TYPE_DATA_AQUISITION: `2`
    
    var AUDIT_SRC_TYPE_DB_SERVER: `5`
    
    var AUDIT_SRC_TYPE_EXTERN: `9`
    
    var AUDIT_SRC_TYPE_NET_COMP: `7`
    
    var AUDIT_SRC_TYPE_OS: `8`
    
    var AUDIT_SRC_TYPE_SECURITY_SERVER: `6`
    
    // Audit Source Type Code
    var AUDIT_SRC_TYPE_UI: `1`
    
    var AUDIT_SRC_TYPE_WEB_SERVER: `3`
    
    // Network Access Point Type Code
    var EVENT_ACTION_CREATE: C
    
    var EVENT_ACTION_DELETE: D
    
    var EVENT_ACTION_EXECUTE: E
    
    var EVENT_ACTION_READ: R
    
    var EVENT_ACTION_UPDATE: U
    
    // Network Access Point Type Code
    var NET_AP_TYPE_DNS: `1`
    
    var NET_AP_TYPE_IP: `2`
    
    var NET_AP_TYPE_TEL: `3`
    
    var OBJ_ID_TYPE_ACC_NUM: `6`
    
    var OBJ_ID_TYPE_ENCOUNTER_NUM: `3`
    
    var OBJ_ID_TYPE_ENROLLEE_NUM: `4`
    
    var OBJ_ID_TYPE_GUARANTOR_NUM: `7`
    
    // Participant Object ID Type Code
    var OBJ_ID_TYPE_MRN: `1`
    
    var OBJ_ID_TYPE_PAT_NUM: `2`
    
    var OBJ_ID_TYPE_REPORT_NAME: `8`
    
    var OBJ_ID_TYPE_REPORT_NUM: `9`
    
    var OBJ_ID_TYPE_SEARCH_CRIT: `10`
    
    var OBJ_ID_TYPE_SSN: `5`
    
    var OBJ_ID_TYPE_URI: `12`
    
    var OBJ_ID_TYPE_USER_ID: `11`
    
    var OBJ_TYPE_CODE_ROLE_CUSTOMER: `19`
    
    var OBJ_TYPE_CODE_ROLE_DATA_DESTINATION: `16`
    
    var OBJ_TYPE_CODE_ROLE_DATA_REPOSITORY: `17`
    
    var OBJ_TYPE_CODE_ROLE_DOCTOR: `8`
    
    var OBJ_TYPE_CODE_ROLE_GUARANTOR: `10`
    
    var OBJ_TYPE_CODE_ROLE_JOB: `20`
    
    var OBJ_TYPE_CODE_ROLE_JOB_STREAM: `21`
    
    var OBJ_TYPE_CODE_ROLE_LIST: `7`
    
    var OBJ_TYPE_CODE_ROLE_LOCATION: `2`
    
    var OBJ_TYPE_CODE_ROLE_MASTER_FILE: `5`
    
    // Participant Object Type Code Role
    var OBJ_TYPE_CODE_ROLE_PATIENT: `1`
    
    var OBJ_TYPE_CODE_ROLE_PROVIDER: `15`
    
    var OBJ_TYPE_CODE_ROLE_QUERY: `24`
    
    var OBJ_TYPE_CODE_ROLE_REPORT: `3`
    
    var OBJ_TYPE_CODE_ROLE_RESOURCE: `4`
    
    var OBJ_TYPE_CODE_ROLE_SCHEDULE: `18`
    
    var OBJ_TYPE_CODE_ROLE_SECURITY_GRANULARITY: `14`
    
    var OBJ_TYPE_CODE_ROLE_SECURITY_RESOURCE: `13`
    
    var OBJ_TYPE_CODE_ROLE_SECURITY_USER_ENTITY: `11`
    
    var OBJ_TYPE_CODE_ROLE_SECURITY_USER_GROUP: `12`
    
    var OBJ_TYPE_CODE_ROLE_SUBSCRIBER: `9`
    
    var OBJ_TYPE_CODE_ROLE_USER: `6`
    
    var OBJ_TYPE_ORG: `3`
    
    var OBJ_TYPE_OTHER: `4`
    
    // Participant Object Type Code
    var OBJ_TYPE_PERSON: `1`
    
    var OBJ_TYPE_SYS_OBJ: `2`
    
    var OUTCOME_MAJOR_FAILURE: `12`
    
    var OUTCOME_MINOR_FAILURE: `4`
    
    var OUTCOME_SERIOUS_FAILURE: `8`
    
    var OUTCOME_SUCCESS: `0`
  }
  object Constants_ {
    
    inline def apply(): Constants_ = {
      val __obj = js.Dynamic.literal(AUDIT_SRC_TYPE_APP_SERVER = 4, AUDIT_SRC_TYPE_DATA_AQUISITION = 2, AUDIT_SRC_TYPE_DB_SERVER = 5, AUDIT_SRC_TYPE_EXTERN = 9, AUDIT_SRC_TYPE_NET_COMP = 7, AUDIT_SRC_TYPE_OS = 8, AUDIT_SRC_TYPE_SECURITY_SERVER = 6, AUDIT_SRC_TYPE_UI = 1, AUDIT_SRC_TYPE_WEB_SERVER = 3, EVENT_ACTION_CREATE = "C", EVENT_ACTION_DELETE = "D", EVENT_ACTION_EXECUTE = "E", EVENT_ACTION_READ = "R", EVENT_ACTION_UPDATE = "U", NET_AP_TYPE_DNS = 1, NET_AP_TYPE_IP = 2, NET_AP_TYPE_TEL = 3, OBJ_ID_TYPE_ACC_NUM = 6, OBJ_ID_TYPE_ENCOUNTER_NUM = 3, OBJ_ID_TYPE_ENROLLEE_NUM = 4, OBJ_ID_TYPE_GUARANTOR_NUM = 7, OBJ_ID_TYPE_MRN = 1, OBJ_ID_TYPE_PAT_NUM = 2, OBJ_ID_TYPE_REPORT_NAME = 8, OBJ_ID_TYPE_REPORT_NUM = 9, OBJ_ID_TYPE_SEARCH_CRIT = 10, OBJ_ID_TYPE_SSN = 5, OBJ_ID_TYPE_URI = 12, OBJ_ID_TYPE_USER_ID = 11, OBJ_TYPE_CODE_ROLE_CUSTOMER = 19, OBJ_TYPE_CODE_ROLE_DATA_DESTINATION = 16, OBJ_TYPE_CODE_ROLE_DATA_REPOSITORY = 17, OBJ_TYPE_CODE_ROLE_DOCTOR = 8, OBJ_TYPE_CODE_ROLE_GUARANTOR = 10, OBJ_TYPE_CODE_ROLE_JOB = 20, OBJ_TYPE_CODE_ROLE_JOB_STREAM = 21, OBJ_TYPE_CODE_ROLE_LIST = 7, OBJ_TYPE_CODE_ROLE_LOCATION = 2, OBJ_TYPE_CODE_ROLE_MASTER_FILE = 5, OBJ_TYPE_CODE_ROLE_PATIENT = 1, OBJ_TYPE_CODE_ROLE_PROVIDER = 15, OBJ_TYPE_CODE_ROLE_QUERY = 24, OBJ_TYPE_CODE_ROLE_REPORT = 3, OBJ_TYPE_CODE_ROLE_RESOURCE = 4, OBJ_TYPE_CODE_ROLE_SCHEDULE = 18, OBJ_TYPE_CODE_ROLE_SECURITY_GRANULARITY = 14, OBJ_TYPE_CODE_ROLE_SECURITY_RESOURCE = 13, OBJ_TYPE_CODE_ROLE_SECURITY_USER_ENTITY = 11, OBJ_TYPE_CODE_ROLE_SECURITY_USER_GROUP = 12, OBJ_TYPE_CODE_ROLE_SUBSCRIBER = 9, OBJ_TYPE_CODE_ROLE_USER = 6, OBJ_TYPE_ORG = 3, OBJ_TYPE_OTHER = 4, OBJ_TYPE_PERSON = 1, OBJ_TYPE_SYS_OBJ = 2, OUTCOME_MAJOR_FAILURE = 12, OUTCOME_MINOR_FAILURE = 4, OUTCOME_SERIOUS_FAILURE = 8, OUTCOME_SUCCESS = 0)
      __obj.asInstanceOf[Constants_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constants_] (val x: Self) extends AnyVal {
      
      inline def setAUDIT_SRC_TYPE_APP_SERVER(value: `4`): Self = StObject.set(x, "AUDIT_SRC_TYPE_APP_SERVER", value.asInstanceOf[js.Any])
      
      inline def setAUDIT_SRC_TYPE_DATA_AQUISITION(value: `2`): Self = StObject.set(x, "AUDIT_SRC_TYPE_DATA_AQUISITION", value.asInstanceOf[js.Any])
      
      inline def setAUDIT_SRC_TYPE_DB_SERVER(value: `5`): Self = StObject.set(x, "AUDIT_SRC_TYPE_DB_SERVER", value.asInstanceOf[js.Any])
      
      inline def setAUDIT_SRC_TYPE_EXTERN(value: `9`): Self = StObject.set(x, "AUDIT_SRC_TYPE_EXTERN", value.asInstanceOf[js.Any])
      
      inline def setAUDIT_SRC_TYPE_NET_COMP(value: `7`): Self = StObject.set(x, "AUDIT_SRC_TYPE_NET_COMP", value.asInstanceOf[js.Any])
      
      inline def setAUDIT_SRC_TYPE_OS(value: `8`): Self = StObject.set(x, "AUDIT_SRC_TYPE_OS", value.asInstanceOf[js.Any])
      
      inline def setAUDIT_SRC_TYPE_SECURITY_SERVER(value: `6`): Self = StObject.set(x, "AUDIT_SRC_TYPE_SECURITY_SERVER", value.asInstanceOf[js.Any])
      
      inline def setAUDIT_SRC_TYPE_UI(value: `1`): Self = StObject.set(x, "AUDIT_SRC_TYPE_UI", value.asInstanceOf[js.Any])
      
      inline def setAUDIT_SRC_TYPE_WEB_SERVER(value: `3`): Self = StObject.set(x, "AUDIT_SRC_TYPE_WEB_SERVER", value.asInstanceOf[js.Any])
      
      inline def setEVENT_ACTION_CREATE(value: C): Self = StObject.set(x, "EVENT_ACTION_CREATE", value.asInstanceOf[js.Any])
      
      inline def setEVENT_ACTION_DELETE(value: D): Self = StObject.set(x, "EVENT_ACTION_DELETE", value.asInstanceOf[js.Any])
      
      inline def setEVENT_ACTION_EXECUTE(value: E): Self = StObject.set(x, "EVENT_ACTION_EXECUTE", value.asInstanceOf[js.Any])
      
      inline def setEVENT_ACTION_READ(value: R): Self = StObject.set(x, "EVENT_ACTION_READ", value.asInstanceOf[js.Any])
      
      inline def setEVENT_ACTION_UPDATE(value: U): Self = StObject.set(x, "EVENT_ACTION_UPDATE", value.asInstanceOf[js.Any])
      
      inline def setNET_AP_TYPE_DNS(value: `1`): Self = StObject.set(x, "NET_AP_TYPE_DNS", value.asInstanceOf[js.Any])
      
      inline def setNET_AP_TYPE_IP(value: `2`): Self = StObject.set(x, "NET_AP_TYPE_IP", value.asInstanceOf[js.Any])
      
      inline def setNET_AP_TYPE_TEL(value: `3`): Self = StObject.set(x, "NET_AP_TYPE_TEL", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_ACC_NUM(value: `6`): Self = StObject.set(x, "OBJ_ID_TYPE_ACC_NUM", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_ENCOUNTER_NUM(value: `3`): Self = StObject.set(x, "OBJ_ID_TYPE_ENCOUNTER_NUM", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_ENROLLEE_NUM(value: `4`): Self = StObject.set(x, "OBJ_ID_TYPE_ENROLLEE_NUM", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_GUARANTOR_NUM(value: `7`): Self = StObject.set(x, "OBJ_ID_TYPE_GUARANTOR_NUM", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_MRN(value: `1`): Self = StObject.set(x, "OBJ_ID_TYPE_MRN", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_PAT_NUM(value: `2`): Self = StObject.set(x, "OBJ_ID_TYPE_PAT_NUM", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_REPORT_NAME(value: `8`): Self = StObject.set(x, "OBJ_ID_TYPE_REPORT_NAME", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_REPORT_NUM(value: `9`): Self = StObject.set(x, "OBJ_ID_TYPE_REPORT_NUM", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_SEARCH_CRIT(value: `10`): Self = StObject.set(x, "OBJ_ID_TYPE_SEARCH_CRIT", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_SSN(value: `5`): Self = StObject.set(x, "OBJ_ID_TYPE_SSN", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_URI(value: `12`): Self = StObject.set(x, "OBJ_ID_TYPE_URI", value.asInstanceOf[js.Any])
      
      inline def setOBJ_ID_TYPE_USER_ID(value: `11`): Self = StObject.set(x, "OBJ_ID_TYPE_USER_ID", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_CUSTOMER(value: `19`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_CUSTOMER", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_DATA_DESTINATION(value: `16`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_DATA_DESTINATION", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_DATA_REPOSITORY(value: `17`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_DATA_REPOSITORY", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_DOCTOR(value: `8`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_DOCTOR", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_GUARANTOR(value: `10`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_GUARANTOR", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_JOB(value: `20`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_JOB", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_JOB_STREAM(value: `21`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_JOB_STREAM", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_LIST(value: `7`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_LIST", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_LOCATION(value: `2`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_LOCATION", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_MASTER_FILE(value: `5`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_MASTER_FILE", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_PATIENT(value: `1`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_PATIENT", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_PROVIDER(value: `15`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_PROVIDER", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_QUERY(value: `24`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_QUERY", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_REPORT(value: `3`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_REPORT", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_RESOURCE(value: `4`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_RESOURCE", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_SCHEDULE(value: `18`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_SCHEDULE", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_SECURITY_GRANULARITY(value: `14`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_SECURITY_GRANULARITY", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_SECURITY_RESOURCE(value: `13`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_SECURITY_RESOURCE", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_SECURITY_USER_ENTITY(value: `11`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_SECURITY_USER_ENTITY", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_SECURITY_USER_GROUP(value: `12`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_SECURITY_USER_GROUP", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_SUBSCRIBER(value: `9`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_SUBSCRIBER", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_CODE_ROLE_USER(value: `6`): Self = StObject.set(x, "OBJ_TYPE_CODE_ROLE_USER", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_ORG(value: `3`): Self = StObject.set(x, "OBJ_TYPE_ORG", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_OTHER(value: `4`): Self = StObject.set(x, "OBJ_TYPE_OTHER", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_PERSON(value: `1`): Self = StObject.set(x, "OBJ_TYPE_PERSON", value.asInstanceOf[js.Any])
      
      inline def setOBJ_TYPE_SYS_OBJ(value: `2`): Self = StObject.set(x, "OBJ_TYPE_SYS_OBJ", value.asInstanceOf[js.Any])
      
      inline def setOUTCOME_MAJOR_FAILURE(value: `12`): Self = StObject.set(x, "OUTCOME_MAJOR_FAILURE", value.asInstanceOf[js.Any])
      
      inline def setOUTCOME_MINOR_FAILURE(value: `4`): Self = StObject.set(x, "OUTCOME_MINOR_FAILURE", value.asInstanceOf[js.Any])
      
      inline def setOUTCOME_SERIOUS_FAILURE(value: `8`): Self = StObject.set(x, "OUTCOME_SERIOUS_FAILURE", value.asInstanceOf[js.Any])
      
      inline def setOUTCOME_SUCCESS(value: `0`): Self = StObject.set(x, "OUTCOME_SUCCESS", value.asInstanceOf[js.Any])
    }
  }
}
