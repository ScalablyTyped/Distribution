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
  
  inline def apply(): IReportHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReportHeader]
  }
  
  extension [Self <: IReportHeader](x: Self) {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionNull: Self = StObject.set(x, "agentVersion", null)
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    inline def setExecutableSchemaId(value: String): Self = StObject.set(x, "executableSchemaId", value.asInstanceOf[js.Any])
    
    inline def setExecutableSchemaIdNull: Self = StObject.set(x, "executableSchemaId", null)
    
    inline def setExecutableSchemaIdUndefined: Self = StObject.set(x, "executableSchemaId", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionNull: Self = StObject.set(x, "runtimeVersion", null)
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    inline def setSchemaTag(value: String): Self = StObject.set(x, "schemaTag", value.asInstanceOf[js.Any])
    
    inline def setSchemaTagNull: Self = StObject.set(x, "schemaTag", null)
    
    inline def setSchemaTagUndefined: Self = StObject.set(x, "schemaTag", js.undefined)
    
    inline def setServiceVersion(value: String): Self = StObject.set(x, "serviceVersion", value.asInstanceOf[js.Any])
    
    inline def setServiceVersionNull: Self = StObject.set(x, "serviceVersion", null)
    
    inline def setServiceVersionUndefined: Self = StObject.set(x, "serviceVersion", js.undefined)
    
    inline def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
    
    inline def setUnameNull: Self = StObject.set(x, "uname", null)
    
    inline def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
  }
}
