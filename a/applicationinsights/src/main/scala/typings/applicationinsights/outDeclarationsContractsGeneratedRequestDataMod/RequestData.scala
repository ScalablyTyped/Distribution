package typings.applicationinsights.outDeclarationsContractsGeneratedRequestDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of Request represents completion of an external request to the application to do work and contains a summary of that request execution and the results.
  */
@js.native
trait RequestData
  extends typings.applicationinsights.outDeclarationsContractsGeneratedDomainMod.^ {
  /**
    * Request duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
    */
  var duration: String = js.native
  /**
    * Identifier of a request call instance. Used for correlation between request and other telemetry items.
    */
  var id: String = js.native
  /**
    * Collection of custom measurements.
    */
  var measurements: js.Any = js.native
  /**
    * Name of the request. Represents code path taken to process request. Low cardinality value to allow better grouping of requests. For HTTP requests it represents the HTTP method and URL path template like 'GET /values/{id}'.
    */
  var name: String = js.native
  /**
    * Collection of custom properties.
    */
  var properties: js.Any = js.native
  /**
    * Result of a request execution. HTTP status code for HTTP requests.
    */
  var responseCode: String = js.native
  /**
    * Source of the request. Examples are the instrumentation key of the caller or the ip address of the caller.
    */
  var source: String = js.native
  /**
    * Indication of successfull or unsuccessfull call.
    */
  var success: Boolean = js.native
  /**
    * Request URL with all query string parameters.
    */
  var url: String = js.native
  /**
    * Schema version
    */
  var ver: Double = js.native
}

