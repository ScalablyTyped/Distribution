package typings.applicationinsights.outLibraryUtilMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.Anon_Code
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.Agent
import typings.node.httpsMod.RequestOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/Util", JSImport.Namespace)
@js.native
class ^ () extends Util

@JSImport("applicationinsights/out/Library/Util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var MAX_PROPERTY_LENGTH: Double = js.native
  var tlsRestrictedAgent: Agent = js.native
  /* private */ def addCorrelationIdHeaderFromString(client: js.Any, response: js.Any, correlationHeader: js.Any): js.Any = js.native
  /**
    * Checks if a request url is not on a excluded domain list
    * and if it is safe to add correlation headers
    */
  def canIncludeCorrelationHeader(client: typings.applicationinsights.outLibraryTelemetryClientMod.^, requestUrl: String): Boolean = js.native
  /**
    * Using JSON.stringify, by default Errors do not serialize to something useful:
    * Simplify a generic Node Error into a simpler map for customDimensions
    * Custom errors can still implement toJSON to override this functionality
    */
  /* protected */ def extractError(err: Error): Anon_Code = js.native
  /**
    * Manually call toJSON if available to pre-convert the value.
    * If a primitive is returned, then the consumer of this function can skip JSON.stringify.
    * This avoids double escaping of quotes for Date objects, for example.
    */
  /* protected */ def extractObject(origProperty: js.Any): js.Any = js.native
  /**
    * helper method to access userId and sessionId cookie
    */
  def getCookie(name: String, cookie: String): String = js.native
  def getCorrelationContextTarget(
    response: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify http.ClientResponse */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify http.ServerRequest */ js.Any,
    key: String
  ): js.Any = js.native
  /**
    * Convert an array of int32 to Base64 (no '==' at the end).
    * MSB first.
    */
  def int32ArrayToBase64(array: js.Array[Double]): String = js.native
  /**
    * Check if an object is of type Array
    */
  def isArray(obj: js.Any): Boolean = js.native
  /**
    * Check if an object is of type Date
    */
  def isDate(obj: js.Any): Boolean = js.native
  /**
    * Check if an object is of type Error
    */
  def isError(obj: js.Any): Boolean = js.native
  def isPrimitive(input: js.Any): Boolean = js.native
  def isValidW3CId(id: String): Boolean = js.native
  /**
    * Generate request
    *
    * Proxify the request creation to handle proxy http
    *
    * @param {string} requestUrl url endpoint
    * @param {Object} requestOptions Request option
    * @param {Function} requestCallback callback on request
    * @returns {http.ClientRequest} request object
    */
  def makeRequest(
    config: typings.applicationinsights.outLibraryConfigMod.^,
    requestUrl: String,
    requestOptions: RequestOptions | typings.node.httpMod.RequestOptions,
    requestCallback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  /**
    * Convert ms to c# time span format
    */
  def msToTimeSpan(totalms: Double): String = js.native
  /**
    * generate a random 32bit number (-0x80000000..0x7FFFFFFF).
    */
  def random32(): Double = js.native
  /**
    * generate a random 32bit number (0x00000000..0xFFFFFFFF).
    */
  def randomu32(): Double = js.native
  /**
    * Parse standard <string | string[] | number> request-context header
    */
  def safeIncludeCorrelationHeader(
    client: typings.applicationinsights.outLibraryTelemetryClientMod.^,
    request: ClientRequest,
    correlationHeader: js.Any
  ): Unit = js.native
  def safeIncludeCorrelationHeader(
    client: typings.applicationinsights.outLibraryTelemetryClientMod.^,
    request: ServerResponse,
    correlationHeader: js.Any
  ): Unit = js.native
  /**
    * helper method to trim strings (IE8 does not implement String.prototype.trim)
    */
  def trim(str: String): String = js.native
  /**
    * Validate that an object is of type { [key: string]: string }
    */
  def validateStringMap(obj: js.Any): StringDictionary[String] = js.native
  /**
    * generate W3C-compatible trace id
    * https://github.com/w3c/distributed-tracing/blob/master/trace_context/HTTP_HEADER_FORMAT.md#trace-id
    */
  def w3cTraceId(): String = js.native
}

