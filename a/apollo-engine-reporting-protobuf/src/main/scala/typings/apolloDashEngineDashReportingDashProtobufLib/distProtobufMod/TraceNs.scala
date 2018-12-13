package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Trace")
@js.native
object TraceNs extends js.Object {
  /** Represents a CachePolicy. */
  @js.native
  class CachePolicy () extends ICachePolicy {
    /**
             * Constructs a new CachePolicy.
             * @param [properties] Properties to set
             */
    def this(properties: ICachePolicy) = this()
    /** CachePolicy maxAgeNs. */
    @JSName("maxAgeNs")
    var maxAgeNs_CachePolicy: scala.Double = js.native
    /** CachePolicy scope. */
    @JSName("scope")
    var scope_CachePolicy: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope = js.native
    /**
             * Converts this CachePolicy to JSON.
             * @returns JSON object
             */
    def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents a Details. */
  @js.native
  class Details () extends IDetails {
    /**
             * Constructs a new Details.
             * @param [properties] Properties to set
             */
    def this(properties: IDetails) = this()
    /** Details operationName. */
    @JSName("operationName")
    var operationName_Details: java.lang.String = js.native
    /** Details rawQuery. */
    @JSName("rawQuery")
    var rawQuery_Details: java.lang.String = js.native
    /** Details variablesJson. */
    @JSName("variablesJson")
    var variablesJson_Details: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
    /** Details variables. */
    @JSName("variables")
    var variables_Details: ScalablyTyped.runtime.StringDictionary[stdLib.Uint8Array] = js.native
    /**
             * Converts this Details to JSON.
             * @returns JSON object
             */
    def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents an Error. */
  @js.native
  class Error () extends IError {
    /**
             * Constructs a new Error.
             * @param [properties] Properties to set
             */
    def this(properties: IError) = this()
    /** Error json. */
    @JSName("json")
    var json_Error: java.lang.String = js.native
    /** Error location. */
    @JSName("location")
    var location_Error: js.Array[ILocation] = js.native
    /** Error message. */
    @JSName("message")
    var message_Error: java.lang.String = js.native
    /** Error timeNs. */
    @JSName("timeNs")
    var timeNs_Error: scala.Double = js.native
    /**
             * Converts this Error to JSON.
             * @returns JSON object
             */
    def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents a HTTP. */
  @js.native
  class HTTP () extends IHTTP {
    /**
             * Constructs a new HTTP.
             * @param [properties] Properties to set
             */
    def this(properties: IHTTP) = this()
    /** HTTP host. */
    @JSName("host")
    var host_HTTP: java.lang.String = js.native
    /** HTTP method. */
    @JSName("method")
    var method_HTTP: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method = js.native
    /** HTTP path. */
    @JSName("path")
    var path_HTTP: java.lang.String = js.native
    /** HTTP protocol. */
    @JSName("protocol")
    var protocol_HTTP: java.lang.String = js.native
    /** HTTP requestHeaders. */
    @JSName("requestHeaders")
    var requestHeaders_HTTP: ScalablyTyped.runtime.StringDictionary[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues
      ] = js.native
    /** HTTP responseHeaders. */
    @JSName("responseHeaders")
    var responseHeaders_HTTP: ScalablyTyped.runtime.StringDictionary[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues
      ] = js.native
    /** HTTP secure. */
    @JSName("secure")
    var secure_HTTP: scala.Boolean = js.native
    /** HTTP statusCode. */
    @JSName("statusCode")
    var statusCode_HTTP: scala.Double = js.native
    /**
             * Converts this HTTP to JSON.
             * @returns JSON object
             */
    def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Properties of a CachePolicy. */
  
  trait ICachePolicy extends js.Object {
    /** CachePolicy maxAgeNs */
    var maxAgeNs: js.UndefOr[scala.Double | scala.Null] = js.undefined
    /** CachePolicy scope */
    var scope: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope | scala.Null
      ] = js.undefined
  }
  
  /** Properties of a Details. */
  
  trait IDetails extends js.Object {
    /** Details operationName */
    var operationName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Details rawQuery */
    var rawQuery: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Details variables */
    var variables: js.UndefOr[ScalablyTyped.runtime.StringDictionary[stdLib.Uint8Array] | scala.Null] = js.undefined
    /** Details variablesJson */
    var variablesJson: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
  }
  
  /** Properties of an Error. */
  
  trait IError extends js.Object {
    /** Error json */
    var json: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Error location */
    var location: js.UndefOr[js.Array[ILocation] | scala.Null] = js.undefined
    /** Error message */
    var message: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Error timeNs */
    var timeNs: js.UndefOr[scala.Double | scala.Null] = js.undefined
  }
  
  /** Properties of a HTTP. */
  
  trait IHTTP extends js.Object {
    /** HTTP host */
    var host: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** HTTP method */
    var method: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method | scala.Null
      ] = js.undefined
    /** HTTP path */
    var path: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** HTTP protocol */
    var protocol: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** HTTP requestHeaders */
    var requestHeaders: js.UndefOr[
        (ScalablyTyped.runtime.StringDictionary[
          apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues
        ]) | scala.Null
      ] = js.undefined
    /** HTTP responseHeaders */
    var responseHeaders: js.UndefOr[
        (ScalablyTyped.runtime.StringDictionary[
          apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues
        ]) | scala.Null
      ] = js.undefined
    /** HTTP secure */
    var secure: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    /** HTTP statusCode */
    var statusCode: js.UndefOr[scala.Double | scala.Null] = js.undefined
  }
  
  /** Properties of a Location. */
  
  trait ILocation extends js.Object {
    /** Location column */
    var column: js.UndefOr[scala.Double | scala.Null] = js.undefined
    /** Location line */
    var line: js.UndefOr[scala.Double | scala.Null] = js.undefined
  }
  
  /** Properties of a Node. */
  
  trait INode extends js.Object {
    /** Node cachePolicy */
    var cachePolicy: js.UndefOr[ICachePolicy | scala.Null] = js.undefined
    /** Node child */
    var child: js.UndefOr[js.Array[INode] | scala.Null] = js.undefined
    /** Node endTime */
    var endTime: js.UndefOr[scala.Double | scala.Null] = js.undefined
    /** Node error */
    var error: js.UndefOr[js.Array[IError] | scala.Null] = js.undefined
    /** Node fieldName */
    var fieldName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Node index */
    var index: js.UndefOr[scala.Double | scala.Null] = js.undefined
    /** Node parentType */
    var parentType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Node startTime */
    var startTime: js.UndefOr[scala.Double | scala.Null] = js.undefined
    /** Node type */
    var `type`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  }
  
  /** Represents a Location. */
  @js.native
  class Location () extends ILocation {
    /**
             * Constructs a new Location.
             * @param [properties] Properties to set
             */
    def this(properties: ILocation) = this()
    /** Location column. */
    @JSName("column")
    var column_Location: scala.Double = js.native
    /** Location line. */
    @JSName("line")
    var line_Location: scala.Double = js.native
    /**
             * Converts this Location to JSON.
             * @returns JSON object
             */
    def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents a Node. */
  @js.native
  class Node () extends INode {
    /**
             * Constructs a new Node.
             * @param [properties] Properties to set
             */
    def this(properties: INode) = this()
    /** Node child. */
    @JSName("child")
    var child_Node: js.Array[INode] = js.native
    /** Node endTime. */
    @JSName("endTime")
    var endTime_Node: scala.Double = js.native
    /** Node error. */
    @JSName("error")
    var error_Node: js.Array[IError] = js.native
    /** Node fieldName. */
    @JSName("fieldName")
    var fieldName_Node: java.lang.String = js.native
    /** Node id. */
    var id: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.fieldName | apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.index
      ] = js.native
    /** Node index. */
    @JSName("index")
    var index_Node: scala.Double = js.native
    /** Node parentType. */
    @JSName("parentType")
    var parentType_Node: java.lang.String = js.native
    /** Node startTime. */
    @JSName("startTime")
    var startTime_Node: scala.Double = js.native
    /** Node type. */
    @JSName("type")
    var type_Node: java.lang.String = js.native
    /**
             * Converts this Node to JSON.
             * @returns JSON object
             */
    def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents a CachePolicy. */
  @js.native
  object CachePolicy extends js.Object {
    /**
             * Creates a new CachePolicy instance using the specified properties.
             * @param [properties] Properties to set
             * @returns CachePolicy instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Creates a new CachePolicy instance using the specified properties.
             * @param [properties] Properties to set
             * @returns CachePolicy instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns CachePolicy
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
             * @param message CachePolicy message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
             * @param message CachePolicy message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
             * @param message CachePolicy message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
             * @param message CachePolicy message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns CachePolicy
             */
    def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
             * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
             * @param message CachePolicy
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
             * @param message CachePolicy
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a CachePolicy message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  @JSName("CachePolicy")
  @js.native
  object CachePolicyNs extends js.Object {
    @js.native
    sealed trait Scope extends js.Object
    
    /** Scope enum. */
    @js.native
    object Scope extends js.Object {
      @js.native
      sealed trait PRIVATE
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope
      
      @js.native
      sealed trait PUBLIC
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope
      
      @js.native
      sealed trait UNKNOWN
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope
      
      /* 2 */ val PRIVATE: PRIVATE with scala.Double = js.native
      /* 1 */ val PUBLIC: PUBLIC with scala.Double = js.native
      /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicyNs.Scope with scala.Double
          ] = js.native
    }
    
  }
  
  /** Represents a Details. */
  @js.native
  object Details extends js.Object {
    /**
             * Creates a new Details instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Details instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Creates a new Details instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Details instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Decodes a Details message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Details
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
             * @param message Details message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
             * @param message Details message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
             * @param message Details message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
             * @param message Details message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a Details message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns Details
             */
    def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
             * Creates a plain object from a Details message. Also converts values to other types if specified.
             * @param message Details
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a Details message. Also converts values to other types if specified.
             * @param message Details
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a Details message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /** Represents an Error. */
  @js.native
  object Error extends js.Object {
    /**
             * Creates a new Error instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Error instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Creates a new Error instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Error instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Decodes an Error message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Error
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
             * @param message Error message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
             * @param message Error message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
             * @param message Error message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
             * @param message Error message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates an Error message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns Error
             */
    def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
             * Creates a plain object from an Error message. Also converts values to other types if specified.
             * @param message Error
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from an Error message. Also converts values to other types if specified.
             * @param message Error
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies an Error message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /** Represents a HTTP. */
  @js.native
  object HTTP extends js.Object {
    /**
             * Creates a new HTTP instance using the specified properties.
             * @param [properties] Properties to set
             * @returns HTTP instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Creates a new HTTP instance using the specified properties.
             * @param [properties] Properties to set
             * @returns HTTP instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Decodes a HTTP message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns HTTP
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
             * @param message HTTP message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
             * @param message HTTP message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
             * @param message HTTP message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
             * @param message HTTP message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns HTTP
             */
    def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
             * Creates a plain object from a HTTP message. Also converts values to other types if specified.
             * @param message HTTP
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a HTTP message. Also converts values to other types if specified.
             * @param message HTTP
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a HTTP message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  @JSName("HTTP")
  @js.native
  object HTTPNs extends js.Object {
    /** Properties of a Values. */
    
    trait IValues extends js.Object {
      /** Values value */
      var value: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
    }
    
    @js.native
    sealed trait Method extends js.Object
    
    /** Represents a Values. */
    @js.native
    class Values () extends IValues {
      /**
                   * Constructs a new Values.
                   * @param [properties] Properties to set
                   */
      def this(properties: IValues) = this()
      /** Values value. */
      @JSName("value")
      var value_Values: js.Array[java.lang.String] = js.native
      /**
                   * Converts this Values to JSON.
                   * @returns JSON object
                   */
      def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Method enum. */
    @js.native
    object Method extends js.Object {
      @js.native
      sealed trait CONNECT
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait DELETE
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait GET
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait HEAD
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait OPTIONS
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait PATCH
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait POST
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait PUT
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait TRACE
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      @js.native
      sealed trait UNKNOWN
        extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method
      
      /* 8 */ val CONNECT: CONNECT with scala.Double = js.native
      /* 6 */ val DELETE: DELETE with scala.Double = js.native
      /* 2 */ val GET: GET with scala.Double = js.native
      /* 3 */ val HEAD: HEAD with scala.Double = js.native
      /* 1 */ val OPTIONS: OPTIONS with scala.Double = js.native
      /* 9 */ val PATCH: PATCH with scala.Double = js.native
      /* 4 */ val POST: POST with scala.Double = js.native
      /* 5 */ val PUT: PUT with scala.Double = js.native
      /* 7 */ val TRACE: TRACE with scala.Double = js.native
      /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Method with scala.Double
          ] = js.native
    }
    
    /** Represents a Values. */
    @js.native
    object Values extends js.Object {
      /**
                   * Creates a new Values instance using the specified properties.
                   * @param [properties] Properties to set
                   * @returns Values instance
                   */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Creates a new Values instance using the specified properties.
                   * @param [properties] Properties to set
                   * @returns Values instance
                   */
      def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer.
                   * @param reader Reader or buffer to decode from
                   * @param [length] Message length if known beforehand
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer.
                   * @param reader Reader or buffer to decode from
                   * @param [length] Message length if known beforehand
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer.
                   * @param reader Reader or buffer to decode from
                   * @param [length] Message length if known beforehand
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer.
                   * @param reader Reader or buffer to decode from
                   * @param [length] Message length if known beforehand
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer, length delimited.
                   * @param reader Reader or buffer to decode from
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Decodes a Values message from the specified reader or buffer, length delimited.
                   * @param reader Reader or buffer to decode from
                   * @returns Values
                   * @throws {Error} If the payload is not a reader or valid buffer
                   * @throws {$protobuf.util.ProtocolError} If required fields are missing
                   */
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
                   * @param message Values message or plain object to encode
                   * @param [writer] Writer to encode to
                   * @returns Writer
                   */
      def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues): protobufjsLib.protobufjsMod.Writer = js.native
      /**
                   * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
                   * @param message Values message or plain object to encode
                   * @param [writer] Writer to encode to
                   * @returns Writer
                   */
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
                   * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
                   * @param message Values message or plain object to encode
                   * @param [writer] Writer to encode to
                   * @returns Writer
                   */
      def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues): protobufjsLib.protobufjsMod.Writer = js.native
      /**
                   * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
                   * @param message Values message or plain object to encode
                   * @param [writer] Writer to encode to
                   * @returns Writer
                   */
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
                   * Creates a Values message from a plain object. Also converts values to their respective internal types.
                   * @param object Plain object
                   * @returns Values
                   */
      def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
                   * Creates a plain object from a Values message. Also converts values to other types if specified.
                   * @param message Values
                   * @param [options] Conversion options
                   * @returns Plain object
                   */
      def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
      /**
                   * Creates a plain object from a Values message. Also converts values to other types if specified.
                   * @param message Values
                   * @param [options] Conversion options
                   * @returns Plain object
                   */
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
      /**
                   * Verifies a Values message.
                   * @param message Plain object to verify
                   * @returns `null` if valid, otherwise the reason why it is not
                   */
      def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
  }
  
  /** Represents a Location. */
  @js.native
  object Location extends js.Object {
    /**
             * Creates a new Location instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Location instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Creates a new Location instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Location instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Decodes a Location message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Location
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
             * @param message Location message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
             * @param message Location message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
             * @param message Location message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
             * @param message Location message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a Location message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns Location
             */
    def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
             * Creates a plain object from a Location message. Also converts values to other types if specified.
             * @param message Location
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a Location message. Also converts values to other types if specified.
             * @param message Location
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a Location message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /** Represents a Node. */
  @js.native
  object Node extends js.Object {
    /**
             * Creates a new Node instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Node instance
             */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Creates a new Node instance using the specified properties.
             * @param [properties] Properties to set
             * @returns Node instance
             */
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer.
             * @param reader Reader or buffer to decode from
             * @param [length] Message length if known beforehand
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Decodes a Node message from the specified reader or buffer, length delimited.
             * @param reader Reader or buffer to decode from
             * @returns Node
             * @throws {Error} If the payload is not a reader or valid buffer
             * @throws {$protobuf.util.ProtocolError} If required fields are missing
             */
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
             * @param message Node message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
             * @param message Node message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
             * @param message Node message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
             * @param message Node message or plain object to encode
             * @param [writer] Writer to encode to
             * @returns Writer
             */
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
             * Creates a Node message from a plain object. Also converts values to their respective internal types.
             * @param object Plain object
             * @returns Node
             */
    def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
             * Creates a plain object from a Node message. Also converts values to other types if specified.
             * @param message Node
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Creates a plain object from a Node message. Also converts values to other types if specified.
             * @param message Node
             * @param [options] Conversion options
             * @returns Plain object
             */
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    /**
             * Verifies a Node message.
             * @param message Plain object to verify
             * @returns `null` if valid, otherwise the reason why it is not
             */
    def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
}

