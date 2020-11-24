package typings.apolloReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.IValues
import typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a HTTP. */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP")
@js.native
/**
  * Constructs a new HTTP.
  * @param [properties] Properties to set
  */
class HTTP_ () extends IHTTP {
  def this(properties: IHTTP) = this()
  
  /** HTTP host. */
  @JSName("host")
  var host_HTTP_ : String = js.native
  
  /** HTTP method. */
  @JSName("method")
  var method_HTTP_ : Method = js.native
  
  /** HTTP path. */
  @JSName("path")
  var path_HTTP_ : String = js.native
  
  /** HTTP protocol. */
  @JSName("protocol")
  var protocol_HTTP_ : String = js.native
  
  /** HTTP requestHeaders. */
  @JSName("requestHeaders")
  var requestHeaders_HTTP_ : StringDictionary[IValues] = js.native
  
  /** HTTP responseHeaders. */
  @JSName("responseHeaders")
  var responseHeaders_HTTP_ : StringDictionary[IValues] = js.native
  
  /** HTTP secure. */
  @JSName("secure")
  var secure_HTTP_ : Boolean = js.native
  
  /** HTTP statusCode. */
  @JSName("statusCode")
  var statusCode_HTTP_ : Double = js.native
  
  /**
    * Converts this HTTP to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
