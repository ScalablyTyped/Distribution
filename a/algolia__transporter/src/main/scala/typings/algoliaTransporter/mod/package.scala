package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def CallEnum: typings.std.Record[java.lang.String, typings.algoliaTransporter.mod.CallType] = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("CallEnum").asInstanceOf[typings.std.Record[java.lang.String, typings.algoliaTransporter.mod.CallType]]

@scala.inline
def HostStatusEnum: typings.std.Record[java.lang.String, typings.algoliaTransporter.mod.HostStatusType] = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HostStatusEnum").asInstanceOf[typings.std.Record[java.lang.String, typings.algoliaTransporter.mod.HostStatusType]]

@scala.inline
def createApiError(
  message: java.lang.String,
  status: scala.Double,
  transporterStackTrace: js.Array[typings.algoliaTransporter.mod.StackFrame]
): typings.algoliaTransporter.mod.ApiError = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiError")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any], transporterStackTrace.asInstanceOf[js.Any])).asInstanceOf[typings.algoliaTransporter.mod.ApiError]

@scala.inline
def createDeserializationError(message: java.lang.String, response: typings.algoliaRequesterCommon.mod.Response): typings.algoliaTransporter.mod.DeserializationError = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createDeserializationError")(message.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[typings.algoliaTransporter.mod.DeserializationError]

@scala.inline
def createMappedRequestOptions(): typings.algoliaTransporter.mod.MappedRequestOptions = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")().asInstanceOf[typings.algoliaTransporter.mod.MappedRequestOptions]
@scala.inline
def createMappedRequestOptions(requestOptions: scala.Unit, timeout: scala.Double): typings.algoliaTransporter.mod.MappedRequestOptions = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[typings.algoliaTransporter.mod.MappedRequestOptions]
@scala.inline
def createMappedRequestOptions(requestOptions: typings.algoliaTransporter.mod.RequestOptions): typings.algoliaTransporter.mod.MappedRequestOptions = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaTransporter.mod.MappedRequestOptions]
@scala.inline
def createMappedRequestOptions(requestOptions: typings.algoliaTransporter.mod.RequestOptions, timeout: scala.Double): typings.algoliaTransporter.mod.MappedRequestOptions = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[typings.algoliaTransporter.mod.MappedRequestOptions]

@scala.inline
def createRetryError(transporterStackTrace: js.Array[typings.algoliaTransporter.mod.StackFrame]): typings.algoliaTransporter.mod.RetryError = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRetryError")(transporterStackTrace.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaTransporter.mod.RetryError]

@scala.inline
def createStatefulHost(host: typings.algoliaTransporter.mod.StatelessHost): typings.algoliaTransporter.mod.StatefulHost = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStatefulHost")(host.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaTransporter.mod.StatefulHost]
@scala.inline
def createStatefulHost(
  host: typings.algoliaTransporter.mod.StatelessHost,
  status: typings.algoliaTransporter.mod.HostStatusType
): typings.algoliaTransporter.mod.StatefulHost = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStatefulHost")(host.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.algoliaTransporter.mod.StatefulHost]

@scala.inline
def createStatelessHost(options: typings.algoliaTransporter.mod.HostOptions): typings.algoliaTransporter.mod.StatelessHost = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStatelessHost")(options.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaTransporter.mod.StatelessHost]

@scala.inline
def createTransporter(options: typings.algoliaTransporter.mod.TransporterOptions): typings.algoliaTransporter.mod.Transporter = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTransporter")(options.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaTransporter.mod.Transporter]

@scala.inline
def createUserAgent(version: java.lang.String): typings.algoliaTransporter.mod.UserAgent = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createUserAgent")(version.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaTransporter.mod.UserAgent]

@scala.inline
def deserializeFailure(
  hasContentStatus: typings.algoliaRequesterCommon.mod.Response,
  stackFrame: js.Array[typings.algoliaTransporter.mod.StackFrame]
): typings.std.Error = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFailure")(hasContentStatus.asInstanceOf[js.Any], stackFrame.asInstanceOf[js.Any])).asInstanceOf[typings.std.Error]

@scala.inline
def deserializeSuccess[TObject](response: typings.algoliaRequesterCommon.mod.Response): TObject = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSuccess")(response.asInstanceOf[js.Any]).asInstanceOf[TObject]

@scala.inline
def isStatefulHostTimeouted(host: typings.algoliaTransporter.mod.StatefulHost): scala.Boolean = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStatefulHostTimeouted")(host.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def isStatefulHostUp(host: typings.algoliaTransporter.mod.StatefulHost): scala.Boolean = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStatefulHostUp")(host.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def serializeData(
  request: typings.algoliaTransporter.mod.Request,
  requestOptions: typings.algoliaTransporter.mod.RequestOptions
): js.UndefOr[java.lang.String] = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeData")(request.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]

@scala.inline
def serializeHeaders(
  transporter: typings.algoliaTransporter.mod.Transporter,
  requestOptions: typings.algoliaTransporter.mod.RequestOptions
): typings.algoliaTransporter.mod.Headers = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeaders")(transporter.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[typings.algoliaTransporter.mod.Headers]

@scala.inline
def serializeQueryParameters(parameters: typings.std.Record[java.lang.String, js.Any]): java.lang.String = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeQueryParameters")(parameters.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def serializeUrl(
  host: typings.algoliaTransporter.mod.StatelessHost,
  path: java.lang.String,
  queryParameters: typings.std.Record[java.lang.String, java.lang.String]
): java.lang.String = (typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeUrl")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], queryParameters.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def stackFrameWithoutCredentials(stackFrame: typings.algoliaTransporter.mod.StackFrame): typings.algoliaTransporter.mod.StackFrame = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stackFrameWithoutCredentials")(stackFrame.asInstanceOf[js.Any]).asInstanceOf[typings.algoliaTransporter.mod.StackFrame]

@scala.inline
def stackTraceWithoutCredentials(stackTrace: js.Array[typings.algoliaTransporter.mod.StackFrame]): js.Array[typings.algoliaTransporter.mod.StackFrame] = typings.algoliaTransporter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stackTraceWithoutCredentials")(stackTrace.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.algoliaTransporter.mod.StackFrame]]

type Headers = typings.std.Record[java.lang.String, java.lang.String]

type HostOptions = java.lang.String | typings.algoliaTransporter.anon.Accept

type QueryParameters = typings.std.Record[java.lang.String, java.lang.String]
