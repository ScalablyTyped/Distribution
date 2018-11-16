package typings
package awsDashSdkLib.libRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/request", "Request")
@js.native
class Request[D, E] protected () extends js.Object {
  /**
       * Creates a request for an operation on a given service with a set of input parameters.
       *
       * @param {AWS.Service} service - The service to perform the operation on.
       * @param {string} operation - The operation to perform on the service.
       * @param {object} params - Parameters to send to the operation.
       */
  def this(service: awsDashSdkLib.libServiceMod.Service, operation: java.lang.String) = this()
  /**
       * Creates a request for an operation on a given service with a set of input parameters.
       *
       * @param {AWS.Service} service - The service to perform the operation on.
       * @param {string} operation - The operation to perform on the service.
       * @param {object} params - Parameters to send to the operation.
       */
  def this(service: awsDashSdkLib.libServiceMod.Service, operation: java.lang.String, params: js.Any) = this()
  /**
       * The raw HTTP request object containing request headers and body information sent by the service.
       */
  var httpRequest: awsDashSdkLib.libHttpUnderscoreRequestMod.HttpRequest = js.native
  /**
       * The time that the request started.
       */
  var startTime: stdLib.Date = js.native
  /**
       * Aborts a request, emitting the error and complete events.
       * This feature is not supported in the browser environment of the SDK.
       */
  def abort(): scala.Unit = js.native
  /**
       * Converts the request object into a readable stream that can be read from or piped into a writable stream.
       * The data read from a readable stream contains only the raw HTTP body contents.
       * This feature is not supported in the browser environment of the SDK.
       */
  def createReadStream(): nodeLib.streamMod.Readable = js.native
  /**
       * Iterates over each page of results given a pageable request, calling the provided callback with each page of data.
       * After all pages have been retrieved, the callback is called with null data.
       *
       * @param {eachPage} callback - The callback that handles the response.
       */
  def eachPage(
    callback: js.Function3[
      /* err */ E, 
      /* data */ D, 
      /* doneCallback */ js.UndefOr[js.Function0[scala.Unit]], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  /**
       * Returns whether the operation can return multiple pages of response data.
       */
  def isPageable(): scala.Boolean = js.native
  /**
       * Adds a listener that is triggered when a request emits the specified event.
       *
       * @param {string} event - 'Name of a request event.'
       * @param {function} listener - Callback to run when the event is triggered on the request.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  def on(event: java.lang.String, listener: js.Function0[scala.Unit]): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request emits the specified event.
       *
       * @param {string} event - 'Name of a request event.'
       * @param {function} listener - Callback to run when the event is triggered on the request.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  def on(event: java.lang.String, listener: js.Function0[scala.Unit], prepend: scala.Boolean): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request emits the specified event.
       *
       * @param {string} event - 'Name of a request event.'
       * @param {function} listener - Callback to run when the event is triggered on the request.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  def onAsync(event: java.lang.String, listener: js.Function0[scala.Unit]): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request emits the specified event.
       *
       * @param {string} event - 'Name of a request event.'
       * @param {function} listener - Callback to run when the event is triggered on the request.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  def onAsync(event: java.lang.String, listener: js.Function0[scala.Unit], prepend: scala.Boolean): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the request payload is being built.
       *
       * @param {string} event - build: triggered when the request payload is being built.
       * @param {function} listener - Callback to run when the request's payload is being built.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_build(
    event: awsDashSdkLib.awsDashSdkLibStrings.build,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the request payload is being built.
       *
       * @param {string} event - build: triggered when the request payload is being built.
       * @param {function} listener - Callback to run when the request's payload is being built.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_build(
    event: awsDashSdkLib.awsDashSdkLibStrings.build,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered whenever a request cycle completes.
       *
       * @param {string} event - complete: triggered whenever a request cycle completes.
       * @param {function} listener - Callback to run when the request cycle completes.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_complete(
    event: awsDashSdkLib.awsDashSdkLibStrings.complete,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered whenever a request cycle completes.
       *
       * @param {string} event - complete: triggered whenever a request cycle completes.
       * @param {function} listener - Callback to run when the request cycle completes.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_complete(
    event: awsDashSdkLib.awsDashSdkLibStrings.complete,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when an error occurs at any point during the request.
       *
       * @param {string} event - error: triggered when an error occurs at any point during the request.
       * @param {function} listener - Callback to run when the request errors at any point.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_error(
    event: awsDashSdkLib.awsDashSdkLibStrings.error,
    listener: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when an error occurs at any point during the request.
       *
       * @param {string} event - error: triggered when an error occurs at any point during the request.
       * @param {function} listener - Callback to run when the request errors at any point.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_error(
    event: awsDashSdkLib.awsDashSdkLibStrings.error,
    listener: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered in successful requests to allow listeners to de-serialize the response body into response.data.
       *
       * @param {string} event - extractData: triggered in successful requests to allow listeners to de-serialize the response body into response.data.
       * @param {function} listener - Callback to run when the request succeeded.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_extractData(
    event: awsDashSdkLib.awsDashSdkLibStrings.extractData,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered in successful requests to allow listeners to de-serialize the response body into response.data.
       *
       * @param {string} event - extractData: triggered in successful requests to allow listeners to de-serialize the response body into response.data.
       * @param {function} listener - Callback to run when the request succeeded.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_extractData(
    event: awsDashSdkLib.awsDashSdkLibStrings.extractData,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered on all non-2xx requests so that listeners can extract error details from the response body.
       *
       * @param {string} event - extractError: triggered on all non-2xx requests so that listeners can extract error details from the response body.
       * @param {function} listener - Callback to run when the request failed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_extractError(
    event: awsDashSdkLib.awsDashSdkLibStrings.extractError,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered on all non-2xx requests so that listeners can extract error details from the response body.
       *
       * @param {string} event - extractError: triggered on all non-2xx requests so that listeners can extract error details from the response body.
       * @param {function} listener - Callback to run when the request failed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_extractError(
    event: awsDashSdkLib.awsDashSdkLibStrings.extractError,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when data is sent by the remote server.
       *
       * @param {string} event - httpData: triggered when data is sent by the remote server.
       * @param {function} listener - Callback to run when data is sent by the remote server.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpData(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpData,
    listener: js.Function2[
      /* chunk */ nodeLib.Buffer | stdLib.Uint8Array, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when data is sent by the remote server.
       *
       * @param {string} event - httpData: triggered when data is sent by the remote server.
       * @param {function} listener - Callback to run when data is sent by the remote server.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpData(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpData,
    listener: js.Function2[
      /* chunk */ nodeLib.Buffer | stdLib.Uint8Array, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the server is finished sending data.
       *
       * @param {string} event - httpDone: triggered when the server is finished sending data.
       * @param {function} listener - Callback to run when the server is finished sending data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpDone(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpDone,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the server is finished sending data.
       *
       * @param {string} event - httpDone: triggered when the server is finished sending data.
       * @param {function} listener - Callback to run when the server is finished sending data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpDone(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpDone,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request has downloaded more data.
       *
       * @param {string} event - httpDownloadProgress: triggered when the HTTP request has downloaded more data.
       * @param {function} listener - Callback to run when the HTTP request has downloaded more data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpDownloadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpDownloadProgress,
    listener: js.Function2[
      /* progress */ Progress, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request has downloaded more data.
       *
       * @param {string} event - httpDownloadProgress: triggered when the HTTP request has downloaded more data.
       * @param {function} listener - Callback to run when the HTTP request has downloaded more data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpDownloadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpDownloadProgress,
    listener: js.Function2[
      /* progress */ Progress, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request failed.
       *
       * @param {string} event - httpError: triggered when the HTTP request failed.
       * @param {function} listener - Callback to run when the HTTP request failed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpError(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpError,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request failed.
       *
       * @param {string} event - httpError: triggered when the HTTP request failed.
       * @param {function} listener - Callback to run when the HTTP request failed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpError(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpError,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when headers are sent by the remote server.
       *
       * @param {string} event - httpHeaders: triggered when headers are sent by the remote server.
       * @param {function} listener - Callback to run when the headers are sent by the remote server.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpHeaders(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpHeaders,
    listener: js.Function4[
      /* statusCode */ scala.Double, 
      /* headers */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      /* statusMessage */ java.lang.String, 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when headers are sent by the remote server.
       *
       * @param {string} event - httpHeaders: triggered when headers are sent by the remote server.
       * @param {function} listener - Callback to run when the headers are sent by the remote server.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpHeaders(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpHeaders,
    listener: js.Function4[
      /* statusCode */ scala.Double, 
      /* headers */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      /* statusMessage */ java.lang.String, 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request has uploaded more data.
       *
       * @param {string} event - httpUploadProgress: triggered when the HTTP request has uploaded more data.
       * @param {function} listener - Callback to run when the HTTP request has uploaded more data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpUploadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpUploadProgress,
    listener: js.Function2[
      /* progress */ Progress, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request has uploaded more data.
       *
       * @param {string} event - httpUploadProgress: triggered when the HTTP request has uploaded more data.
       * @param {function} listener - Callback to run when the HTTP request has uploaded more data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_httpUploadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpUploadProgress,
    listener: js.Function2[
      /* progress */ Progress, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request failed and might need to be retried or redirected.
       *
       * @param {string} event - retry: triggered when a request failed and might need to be retried or redirected.
       * @param {function} listener - Callback to run when the request failed and may be retried.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_retry(
    event: awsDashSdkLib.awsDashSdkLibStrings.retry,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request failed and might need to be retried or redirected.
       *
       * @param {string} event - retry: triggered when a request failed and might need to be retried or redirected.
       * @param {function} listener - Callback to run when the request failed and may be retried.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_retry(
    event: awsDashSdkLib.awsDashSdkLibStrings.retry,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is ready to be sent.
       *
       * @param {string} event - send: triggered when a request is ready to be sent.
       * @param {function} listener - Callback to run when the request is ready to be sent.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_send(
    event: awsDashSdkLib.awsDashSdkLibStrings.send,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is ready to be sent.
       *
       * @param {string} event - send: triggered when a request is ready to be sent.
       * @param {function} listener - Callback to run when the request is ready to be sent.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_send(
    event: awsDashSdkLib.awsDashSdkLibStrings.send,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is being signed.
       *
       * @param {string} event - sign: triggered when a request is being signed.
       * @param {function} listener - Callback to run when the request is being signed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_sign(
    event: awsDashSdkLib.awsDashSdkLibStrings.sign,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is being signed.
       *
       * @param {string} event - sign: triggered when a request is being signed.
       * @param {function} listener - Callback to run when the request is being signed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_sign(
    event: awsDashSdkLib.awsDashSdkLibStrings.sign,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the request completed successfully.
       *
       * @param {string} event - success: triggered when the request completed successfully.
       * @param {function} listener - Callback to run when the request completed successfully.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_success(
    event: awsDashSdkLib.awsDashSdkLibStrings.success,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the request completed successfully.
       *
       * @param {string} event - success: triggered when the request completed successfully.
       * @param {function} listener - Callback to run when the request completed successfully.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_success(
    event: awsDashSdkLib.awsDashSdkLibStrings.success,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is being validated.
       *
       * @param {string} event - validate: triggered when a request is being validated.
       * @param {function} listener - Callback to run when the request is being validated.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_validate(
    event: awsDashSdkLib.awsDashSdkLibStrings.validate,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is being validated.
       *
       * @param {string} event - validate: triggered when a request is being validated.
       * @param {function} listener - Callback to run when the request is being validated.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("onAsync")
  def onAsync_validate(
    event: awsDashSdkLib.awsDashSdkLibStrings.validate,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the request payload is being built.
       *
       * @param {string} event - build: triggered when the request payload is being built.
       * @param {function} listener - Callback to run when the request's payload is being built.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_build(
    event: awsDashSdkLib.awsDashSdkLibStrings.build,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the request payload is being built.
       *
       * @param {string} event - build: triggered when the request payload is being built.
       * @param {function} listener - Callback to run when the request's payload is being built.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_build(
    event: awsDashSdkLib.awsDashSdkLibStrings.build,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered whenever a request cycle completes.
       *
       * @param {string} event - complete: triggered whenever a request cycle completes.
       * @param {function} listener - Callback to run when the request cycle completes.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_complete(
    event: awsDashSdkLib.awsDashSdkLibStrings.complete,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered whenever a request cycle completes.
       *
       * @param {string} event - complete: triggered whenever a request cycle completes.
       * @param {function} listener - Callback to run when the request cycle completes.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_complete(
    event: awsDashSdkLib.awsDashSdkLibStrings.complete,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when an error occurs at any point during the request.
       *
       * @param {string} event - error: triggered when an error occurs at any point during the request.
       * @param {function} listener - Callback to run when the request errors at any point.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_error(
    event: awsDashSdkLib.awsDashSdkLibStrings.error,
    listener: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when an error occurs at any point during the request.
       *
       * @param {string} event - error: triggered when an error occurs at any point during the request.
       * @param {function} listener - Callback to run when the request errors at any point.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_error(
    event: awsDashSdkLib.awsDashSdkLibStrings.error,
    listener: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered in successful requests to allow listeners to de-serialize the response body into response.data.
       *
       * @param {string} event - extractData: triggered in successful requests to allow listeners to de-serialize the response body into response.data.
       * @param {function} listener - Callback to run when the request succeeded.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_extractData(
    event: awsDashSdkLib.awsDashSdkLibStrings.extractData,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered in successful requests to allow listeners to de-serialize the response body into response.data.
       *
       * @param {string} event - extractData: triggered in successful requests to allow listeners to de-serialize the response body into response.data.
       * @param {function} listener - Callback to run when the request succeeded.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_extractData(
    event: awsDashSdkLib.awsDashSdkLibStrings.extractData,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered on all non-2xx requests so that listeners can extract error details from the response body.
       *
       * @param {string} event - extractError: triggered on all non-2xx requests so that listeners can extract error details from the response body.
       * @param {function} listener - Callback to run when the request failed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_extractError(
    event: awsDashSdkLib.awsDashSdkLibStrings.extractError,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered on all non-2xx requests so that listeners can extract error details from the response body.
       *
       * @param {string} event - extractError: triggered on all non-2xx requests so that listeners can extract error details from the response body.
       * @param {function} listener - Callback to run when the request failed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_extractError(
    event: awsDashSdkLib.awsDashSdkLibStrings.extractError,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when data is sent by the remote server.
       *
       * @param {string} event - httpData: triggered when data is sent by the remote server.
       * @param {function} listener - Callback to run when data is sent by the remote server.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpData(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpData,
    listener: js.Function2[
      /* chunk */ nodeLib.Buffer | stdLib.Uint8Array, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when data is sent by the remote server.
       *
       * @param {string} event - httpData: triggered when data is sent by the remote server.
       * @param {function} listener - Callback to run when data is sent by the remote server.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpData(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpData,
    listener: js.Function2[
      /* chunk */ nodeLib.Buffer | stdLib.Uint8Array, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the server is finished sending data.
       *
       * @param {string} event - httpDone: triggered when the server is finished sending data.
       * @param {function} listener - Callback to run when the server is finished sending data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpDone(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpDone,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the server is finished sending data.
       *
       * @param {string} event - httpDone: triggered when the server is finished sending data.
       * @param {function} listener - Callback to run when the server is finished sending data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpDone(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpDone,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request has downloaded more data.
       *
       * @param {string} event - httpDownloadProgress: triggered when the HTTP request has downloaded more data.
       * @param {function} listener - Callback to run when the HTTP request has downloaded more data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpDownloadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpDownloadProgress,
    listener: js.Function2[
      /* progress */ Progress, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request has downloaded more data.
       *
       * @param {string} event - httpDownloadProgress: triggered when the HTTP request has downloaded more data.
       * @param {function} listener - Callback to run when the HTTP request has downloaded more data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpDownloadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpDownloadProgress,
    listener: js.Function2[
      /* progress */ Progress, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request failed.
       *
       * @param {string} event - httpError: triggered when the HTTP request failed.
       * @param {function} listener - Callback to run when the HTTP request failed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpError(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpError,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request failed.
       *
       * @param {string} event - httpError: triggered when the HTTP request failed.
       * @param {function} listener - Callback to run when the HTTP request failed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpError(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpError,
    listener: js.Function2[
      /* err */ nodeLib.Error, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when headers are sent by the remote server.
       *
       * @param {string} event - httpHeaders: triggered when headers are sent by the remote server.
       * @param {function} listener - Callback to run when the headers are sent by the remote server.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpHeaders(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpHeaders,
    listener: js.Function4[
      /* statusCode */ scala.Double, 
      /* headers */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      /* statusMessage */ java.lang.String, 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when headers are sent by the remote server.
       *
       * @param {string} event - httpHeaders: triggered when headers are sent by the remote server.
       * @param {function} listener - Callback to run when the headers are sent by the remote server.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpHeaders(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpHeaders,
    listener: js.Function4[
      /* statusCode */ scala.Double, 
      /* headers */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      /* statusMessage */ java.lang.String, 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request has uploaded more data.
       *
       * @param {string} event - httpUploadProgress: triggered when the HTTP request has uploaded more data.
       * @param {function} listener - Callback to run when the HTTP request has uploaded more data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpUploadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpUploadProgress,
    listener: js.Function2[
      /* progress */ Progress, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the HTTP request has uploaded more data.
       *
       * @param {string} event - httpUploadProgress: triggered when the HTTP request has uploaded more data.
       * @param {function} listener - Callback to run when the HTTP request has uploaded more data.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_httpUploadProgress(
    event: awsDashSdkLib.awsDashSdkLibStrings.httpUploadProgress,
    listener: js.Function2[
      /* progress */ Progress, 
      /* response */ awsDashSdkLib.libResponseMod.Response[D, E], 
      scala.Unit
    ],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request failed and might need to be retried or redirected.
       *
       * @param {string} event - retry: triggered when a request failed and might need to be retried or redirected.
       * @param {function} listener - Callback to run when the request failed and may be retried.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_retry(
    event: awsDashSdkLib.awsDashSdkLibStrings.retry,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request failed and might need to be retried or redirected.
       *
       * @param {string} event - retry: triggered when a request failed and might need to be retried or redirected.
       * @param {function} listener - Callback to run when the request failed and may be retried.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_retry(
    event: awsDashSdkLib.awsDashSdkLibStrings.retry,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is ready to be sent.
       *
       * @param {string} event - send: triggered when a request is ready to be sent.
       * @param {function} listener - Callback to run when the request is ready to be sent.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_send(
    event: awsDashSdkLib.awsDashSdkLibStrings.send,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is ready to be sent.
       *
       * @param {string} event - send: triggered when a request is ready to be sent.
       * @param {function} listener - Callback to run when the request is ready to be sent.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_send(
    event: awsDashSdkLib.awsDashSdkLibStrings.send,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is being signed.
       *
       * @param {string} event - sign: triggered when a request is being signed.
       * @param {function} listener - Callback to run when the request is being signed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_sign(
    event: awsDashSdkLib.awsDashSdkLibStrings.sign,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is being signed.
       *
       * @param {string} event - sign: triggered when a request is being signed.
       * @param {function} listener - Callback to run when the request is being signed.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_sign(
    event: awsDashSdkLib.awsDashSdkLibStrings.sign,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the request completed successfully.
       *
       * @param {string} event - success: triggered when the request completed successfully.
       * @param {function} listener - Callback to run when the request completed successfully.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_success(
    event: awsDashSdkLib.awsDashSdkLibStrings.success,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when the request completed successfully.
       *
       * @param {string} event - success: triggered when the request completed successfully.
       * @param {function} listener - Callback to run when the request completed successfully.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_success(
    event: awsDashSdkLib.awsDashSdkLibStrings.success,
    listener: js.Function1[/* response */ awsDashSdkLib.libResponseMod.Response[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is being validated.
       *
       * @param {string} event - validate: triggered when a request is being validated.
       * @param {function} listener - Callback to run when the request is being validated.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_validate(
    event: awsDashSdkLib.awsDashSdkLibStrings.validate,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit]
  ): Request[D, E] = js.native
  /**
       * Adds a listener that is triggered when a request is being validated.
       *
       * @param {string} event - validate: triggered when a request is being validated.
       * @param {function} listener - Callback to run when the request is being validated.
       * @param {boolean} prepend - If set, prepends listener instead of appending.
       */
  @JSName("on")
  def on_validate(
    event: awsDashSdkLib.awsDashSdkLibStrings.validate,
    listener: js.Function1[/* request */ Request[D, E], scala.Unit],
    prepend: scala.Boolean
  ): Request[D, E] = js.native
  /**
       * Returns a 'thenable' promise.
       */
  def promise(): stdLib.Promise[PromiseResult[D, E]] = js.native
  /**
       * Sends the request object.
       * If a callback is supplied, it is called when a response is returned from the service.
       */
  def send(): scala.Unit = js.native
  /**
       * Sends the request object.
       * If a callback is supplied, it is called when a response is returned from the service.
       */
  def send(callback: js.Function2[/* err */ E, /* data */ D, scala.Unit]): scala.Unit = js.native
}

