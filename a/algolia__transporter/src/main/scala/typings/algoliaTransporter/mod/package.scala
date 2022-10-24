package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.Response
import typings.algoliaTransporter.anon.Accept
import typings.algoliaTransporter.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CallEnum: Record[String, CallType] = ^.asInstanceOf[js.Dynamic].selectDynamic("CallEnum").asInstanceOf[Record[String, CallType]]

inline def HostStatusEnum: Record[String, HostStatusType] = ^.asInstanceOf[js.Dynamic].selectDynamic("HostStatusEnum").asInstanceOf[Record[String, HostStatusType]]

inline def createApiError(message: String, status: Double, transporterStackTrace: js.Array[StackFrame]): ApiError = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiError")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any], transporterStackTrace.asInstanceOf[js.Any])).asInstanceOf[ApiError]

inline def createDeserializationError(message: String, response: Response): DeserializationError = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeserializationError")(message.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[DeserializationError]

inline def createMappedRequestOptions(): MappedRequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")().asInstanceOf[MappedRequestOptions]
inline def createMappedRequestOptions(requestOptions: Unit, timeout: Double): MappedRequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MappedRequestOptions]
inline def createMappedRequestOptions(requestOptions: RequestOptions): MappedRequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any]).asInstanceOf[MappedRequestOptions]
inline def createMappedRequestOptions(requestOptions: RequestOptions, timeout: Double): MappedRequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createMappedRequestOptions")(requestOptions.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MappedRequestOptions]

inline def createRetryError(transporterStackTrace: js.Array[StackFrame]): RetryError = ^.asInstanceOf[js.Dynamic].applyDynamic("createRetryError")(transporterStackTrace.asInstanceOf[js.Any]).asInstanceOf[RetryError]

inline def createStatefulHost(host: StatelessHost): StatefulHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatefulHost")(host.asInstanceOf[js.Any]).asInstanceOf[StatefulHost]
inline def createStatefulHost(host: StatelessHost, status: HostStatusType): StatefulHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatefulHost")(host.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[StatefulHost]

inline def createStatelessHost(options: HostOptions): StatelessHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatelessHost")(options.asInstanceOf[js.Any]).asInstanceOf[StatelessHost]

inline def createTransporter(options: TransporterOptions): Transporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransporter")(options.asInstanceOf[js.Any]).asInstanceOf[Transporter]

inline def createUserAgent(version: String): UserAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserAgent")(version.asInstanceOf[js.Any]).asInstanceOf[UserAgent]

inline def deserializeFailure(param0: Response, stackFrame: js.Array[StackFrame]): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeFailure")(param0.asInstanceOf[js.Any], stackFrame.asInstanceOf[js.Any])).asInstanceOf[js.Error]

inline def deserializeSuccess[TObject](response: Response): TObject = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSuccess")(response.asInstanceOf[js.Any]).asInstanceOf[TObject]

inline def isStatefulHostTimeouted(host: StatefulHost): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatefulHostTimeouted")(host.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isStatefulHostUp(host: StatefulHost): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatefulHostUp")(host.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def serializeData(request: Request, requestOptions: RequestOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeData")(request.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]

inline def serializeHeaders(transporter: Transporter, requestOptions: RequestOptions): Headers = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeaders")(transporter.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[Headers]

inline def serializeQueryParameters(parameters: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeQueryParameters")(parameters.asInstanceOf[js.Any]).asInstanceOf[String]

inline def serializeUrl(host: StatelessHost, path: String, queryParameters: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeUrl")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], queryParameters.asInstanceOf[js.Any])).asInstanceOf[String]

inline def stackFrameWithoutCredentials(stackFrame: StackFrame): StackFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("stackFrameWithoutCredentials")(stackFrame.asInstanceOf[js.Any]).asInstanceOf[StackFrame]

inline def stackTraceWithoutCredentials(stackTrace: js.Array[StackFrame]): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackTraceWithoutCredentials")(stackTrace.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]

type Headers = Record[String, String]

type HostOptions = String | Accept

type QueryParameters = Record[String, String]
