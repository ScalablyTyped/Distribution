package typings.akamaiEdgeworkers

import org.scalablytyped.runtime.StringDictionary
import typings.akamaiEdgeworkers.anon.Body
import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a response that can be returned from the `responseProvider()`
  * callback in a promise.
  */
object createResponseMod {
  
  @JSImport("create-response", "createResponse")
  @js.native
  def createResponse(): js.Object = js.native
  @JSImport("create-response", "createResponse")
  @js.native
  def createResponse(body: js.UndefOr[CreateResponseBody], opts: Body): js.Object = js.native
  @JSImport("create-response", "createResponse")
  @js.native
  def createResponse(body: CreateResponseBody): js.Object = js.native
  /**
    * Generates a return value for responseProvider(). It validates the
    * passed values and returns an opaque object. Callers should be
    * prepared for the function to throw exceptions if they specify invalid
    * arguments.
    *
    * @param status The HTTP status code of the outgoing response. Must be
    *          in the range of 100-599.
    * @param headers Properties used as key:value pairs for the response
    *          headers. Keys are strings that contain header names, values
    *          are either strings or arrays of strings.
    * @param body Content of the response body. When specified as a
    *          string, the body is limited to 100,000 bytes. When specified
    *          as a ReadableStream, there is no limit.
    * @param denyReason Deny reason when the status code is 403.
    */
  @JSImport("create-response", "createResponse")
  @js.native
  def createResponse(status: Double, headers: Headers, body: CreateResponseBody): js.Object = js.native
  @JSImport("create-response", "createResponse")
  @js.native
  def createResponse(status: Double, headers: Headers, body: CreateResponseBody, denyReason: String): js.Object = js.native
  
  /**
    * A response body, either in the form of a static string or a readable stream.
    */
  type CreateResponseBody = String | ReadableStream[js.Any]
  
  /**
    * Specifies headers for createResponse(). Keys are treated as header
    * names, and values are treated as header values.
    */
  type Headers = StringDictionary[String | js.Array[String]]
}
