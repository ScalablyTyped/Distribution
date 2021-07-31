package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReportHeader extends StObject {
  
  /** ReportHeader agentVersion */
  var agentVersion: js.UndefOr[String | Null] = js.undefined
  
  /** ReportHeader executableSchemaId */
  var executableSchemaId: js.UndefOr[String | Null] = js.undefined
  
  /** ReportHeader hostname */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /** ReportHeader runtimeVersion */
  var runtimeVersion: js.UndefOr[String | Null] = js.undefined
  
  /** ReportHeader schemaTag */
  var schemaTag: js.UndefOr[String | Null] = js.undefined
  
  /** ReportHeader serviceVersion */
  var serviceVersion: js.UndefOr[String | Null] = js.undefined
  
  /** ReportHeader uname */
  var uname: js.UndefOr[String | Null] = js.undefined
}
object IReportHeader {
  
  @scala.inline
  def apply(): IReportHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReportHeader]
  }
  
  @scala.inline
  implicit class IReportHeaderMutableBuilder[Self <: IReportHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersionNull: Self = StObject.set(x, "agentVersion", null)
    
    @scala.inline
    def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    @scala.inline
    def setExecutableSchemaId(value: String): Self = StObject.set(x, "executableSchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableSchemaIdNull: Self = StObject.set(x, "executableSchemaId", null)
    
    @scala.inline
    def setExecutableSchemaIdUndefined: Self = StObject.set(x, "executableSchemaId", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeVersionNull: Self = StObject.set(x, "runtimeVersion", null)
    
    @scala.inline
    def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    @scala.inline
    def setSchemaTag(value: String): Self = StObject.set(x, "schemaTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaTagNull: Self = StObject.set(x, "schemaTag", null)
    
    @scala.inline
    def setSchemaTagUndefined: Self = StObject.set(x, "schemaTag", js.undefined)
    
    @scala.inline
    def setServiceVersion(value: String): Self = StObject.set(x, "serviceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceVersionNull: Self = StObject.set(x, "serviceVersion", null)
    
    @scala.inline
    def setServiceVersionUndefined: Self = StObject.set(x, "serviceVersion", js.undefined)
    
    @scala.inline
    def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnameNull: Self = StObject.set(x, "uname", null)
    
    @scala.inline
    def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
  }
}
