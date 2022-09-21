package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atv.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: seperate the one for generate request and the actual one
/**
  * Extend the normal XMLHttpRequest, since you can access the URL directly.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
@js.native
trait XMLHttpRequest extends StObject {
  
  /**
    * Aborts the request if it has already been sent.
    */
  def abort(): Unit = js.native
  
  /**
    * Get all of the headers in the response, in the standard raw header format.
    */
  def getAllResponseHeaders(): String | Null = js.native
  
  /**
    * Get a specific header from the response.
    * @param headerName The name of the header to retrieve.
    */
  def getResponseHeader(headerName: String): String | Null = js.native
  
  /**
    * Called whenever the ready state changes (e.g. when the request is complete).
    */
  var onreadystatechange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Initialises the request.
    * @param method The method to use to retrieve the resource.
    * @param url The URL to hit.
    * @param async Whether this request should be made asynchronously or not.
    */
  def open(method: String, url: String, async: Boolean): Unit = js.native
  
  /**
    * Get the current state of the request.
    */
  val readyState: XMLHttpRequestState = js.native
  
  /**
    * Get the response body as base64.
    */
  var responseDataAsBase64: String = js.native
  
  /**
    * Get the response body as a string;
    */
  var responseText: String = js.native
  
  /**
    * Get the response body as a pre-parsed XML document. This will return an exception if invalid, or the request is not done.
    */
  var responseXML: js.UndefOr[Document] = js.native
  
  /**
    * Execute the request.
    * @param body A body to post to the server.
    */
  def send(): Unit = js.native
  def send(body: Any): Unit = js.native
  
  /**
    * Set a header on the request. This must be done in the OPEN state.
    * @param key The key of the header to set.
    * @param value The value of the header.
    */
  def setRequestHeader(key: String, value: String): Unit = js.native
  
  /**
    * The HTTP status code of the request.
    */
  var status: Double = js.native
  
  /**
    * The corresponding description for the status code.
    */
  var statusText: String = js.native
}
