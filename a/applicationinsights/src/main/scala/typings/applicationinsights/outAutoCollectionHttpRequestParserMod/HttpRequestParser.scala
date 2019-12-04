package typings.applicationinsights.outAutoCollectionHttpRequestParserMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outAutoCollectionRequestParserMod.RequestParser
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesRequestTelemetryMod.RequestTelemetry
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.node.httpMod.ServerResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to read data from the requst/response objects and convert them into the telemetry contract
  */
@js.native
trait HttpRequestParser extends RequestParser {
  var connectionRemoteAddress: js.Any = js.native
  var correlationContextHeader: js.Any = js.native
  var legacyRootId: js.Any = js.native
  var legacySocketRemoteAddress: js.Any = js.native
  var operationId: js.Any = js.native
  var parentId: js.Any = js.native
  var rawHeaders: js.Any = js.native
  var requestId: js.Any = js.native
  var socketRemoteAddress: js.Any = js.native
  var sourceCorrelationId: js.Any = js.native
  var traceparent: js.Any = js.native
  var tracestate: js.Any = js.native
  var userAgent: js.Any = js.native
  /* private */ def _getAbsoluteUrl(request: js.Any): js.Any = js.native
  /* private */ def _getId(name: js.Any): js.Any = js.native
  /* private */ def _getIp(): js.Any = js.native
  def getCorrelationContextHeader(): String = js.native
  def getLegacyRootId(): String = js.native
  def getOperationId(tags: StringDictionary[String]): String = js.native
  def getOperationName(tags: StringDictionary[String]): String = js.native
  def getOperationParentId(tags: StringDictionary[String]): String = js.native
  def getRequestId(): String = js.native
  def getRequestTags(tags: StringDictionary[String]): StringDictionary[String] = js.native
  def getRequestTelemetry(): RequestTelemetry = js.native
  def getRequestTelemetry(baseTelemetry: Telemetry): RequestTelemetry = js.native
  def getTraceparent(): typings.applicationinsights.outLibraryTraceparentMod.^ = js.native
  def getTracestate(): typings.applicationinsights.outLibraryTracestateMod.^ = js.native
  def onError(error: String): Unit = js.native
  def onError(error: String, ellapsedMilliseconds: Double): Unit = js.native
  def onError(error: Error): Unit = js.native
  def onError(error: Error, ellapsedMilliseconds: Double): Unit = js.native
  def onResponse(response: ServerResponse): Unit = js.native
  def onResponse(response: ServerResponse, ellapsedMilliseconds: Double): Unit = js.native
  /* private */ def parseHeaders(request: js.Any): js.Any = js.native
  /* private */ def parseHeaders(request: js.Any, requestId: js.Any): js.Any = js.native
  /**
    * Sets this operation's operationId, parentId, requestId (and legacyRootId, if necessary) based on this operation's traceparent
    */
  /* private */ def setBackCompatFromThisTraceContext(): js.Any = js.native
}

