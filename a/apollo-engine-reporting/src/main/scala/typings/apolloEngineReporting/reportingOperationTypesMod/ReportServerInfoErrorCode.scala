package typings.apolloEngineReporting.reportingOperationTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReportServerInfoErrorCode extends js.Object

@JSImport("apollo-engine-reporting/dist/reportingOperationTypes", "ReportServerInfoErrorCode")
@js.native
object ReportServerInfoErrorCode extends js.Object {
  @js.native
  sealed trait BOOT_ID_IS_NOT_VALID_UUID extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait BOOT_ID_IS_REQUIRED extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait EXECUTABLE_SCHEMA_ID_IS_NOT_SCHEMA_SHA256 extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait EXECUTABLE_SCHEMA_ID_IS_REQUIRED extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait EXECUTABLE_SCHEMA_ID_IS_TOO_LONG extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait GRAPH_VARIANT_DOES_NOT_MATCH_REGEX extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait GRAPH_VARIANT_IS_REQUIRED extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait LIBRARY_VERSION_IS_TOO_LONG extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait PLATFORM_IS_TOO_LONG extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait RUNTIME_VERSION_IS_TOO_LONG extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait SERVER_ID_IS_TOO_LONG extends ReportServerInfoErrorCode
  
  @js.native
  sealed trait USER_VERSION_IS_TOO_LONG extends ReportServerInfoErrorCode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReportServerInfoErrorCode with String] = js.native
  /* "BOOT_ID_IS_NOT_VALID_UUID" */ @js.native
  object BOOT_ID_IS_NOT_VALID_UUID extends TopLevel[BOOT_ID_IS_NOT_VALID_UUID with String]
  
  /* "BOOT_ID_IS_REQUIRED" */ @js.native
  object BOOT_ID_IS_REQUIRED extends TopLevel[BOOT_ID_IS_REQUIRED with String]
  
  /* "EXECUTABLE_SCHEMA_ID_IS_NOT_SCHEMA_SHA256" */ @js.native
  object EXECUTABLE_SCHEMA_ID_IS_NOT_SCHEMA_SHA256 extends TopLevel[EXECUTABLE_SCHEMA_ID_IS_NOT_SCHEMA_SHA256 with String]
  
  /* "EXECUTABLE_SCHEMA_ID_IS_REQUIRED" */ @js.native
  object EXECUTABLE_SCHEMA_ID_IS_REQUIRED extends TopLevel[EXECUTABLE_SCHEMA_ID_IS_REQUIRED with String]
  
  /* "EXECUTABLE_SCHEMA_ID_IS_TOO_LONG" */ @js.native
  object EXECUTABLE_SCHEMA_ID_IS_TOO_LONG extends TopLevel[EXECUTABLE_SCHEMA_ID_IS_TOO_LONG with String]
  
  /* "GRAPH_VARIANT_DOES_NOT_MATCH_REGEX" */ @js.native
  object GRAPH_VARIANT_DOES_NOT_MATCH_REGEX extends TopLevel[GRAPH_VARIANT_DOES_NOT_MATCH_REGEX with String]
  
  /* "GRAPH_VARIANT_IS_REQUIRED" */ @js.native
  object GRAPH_VARIANT_IS_REQUIRED extends TopLevel[GRAPH_VARIANT_IS_REQUIRED with String]
  
  /* "LIBRARY_VERSION_IS_TOO_LONG" */ @js.native
  object LIBRARY_VERSION_IS_TOO_LONG extends TopLevel[LIBRARY_VERSION_IS_TOO_LONG with String]
  
  /* "PLATFORM_IS_TOO_LONG" */ @js.native
  object PLATFORM_IS_TOO_LONG extends TopLevel[PLATFORM_IS_TOO_LONG with String]
  
  /* "RUNTIME_VERSION_IS_TOO_LONG" */ @js.native
  object RUNTIME_VERSION_IS_TOO_LONG extends TopLevel[RUNTIME_VERSION_IS_TOO_LONG with String]
  
  /* "SERVER_ID_IS_TOO_LONG" */ @js.native
  object SERVER_ID_IS_TOO_LONG extends TopLevel[SERVER_ID_IS_TOO_LONG with String]
  
  /* "USER_VERSION_IS_TOO_LONG" */ @js.native
  object USER_VERSION_IS_TOO_LONG extends TopLevel[USER_VERSION_IS_TOO_LONG with String]
  
}

