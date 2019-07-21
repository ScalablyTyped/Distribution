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
  /**
    * Constructs a new CachePolicy.
    * @param [properties] Properties to set
    */
  class CachePolicy () extends ICachePolicy {
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
    def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents a Details. */
  @js.native
  /**
    * Constructs a new Details.
    * @param [properties] Properties to set
    */
  class Details () extends IDetails {
    def this(properties: IDetails) = this()
    /** Details operationName. */
    @JSName("operationName")
    var operationName_Details: java.lang.String = js.native
    /** Details rawQuery. */
    @JSName("rawQuery")
    var rawQuery_Details: java.lang.String = js.native
    /** Details variablesJson. */
    @JSName("variablesJson")
    var variablesJson_Details: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    /** Details variables. */
    @JSName("variables")
    var variables_Details: org.scalablytyped.runtime.StringDictionary[stdLib.Uint8Array] = js.native
    /**
      * Converts this Details to JSON.
      * @returns JSON object
      */
    def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents an Error. */
  @js.native
  /**
    * Constructs a new Error.
    * @param [properties] Properties to set
    */
  class Error () extends IError {
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
    def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents a HTTP. */
  @js.native
  /**
    * Constructs a new HTTP.
    * @param [properties] Properties to set
    */
  class HTTP () extends IHTTP {
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
    var requestHeaders_HTTP: org.scalablytyped.runtime.StringDictionary[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues
      ] = js.native
    /** HTTP responseHeaders. */
    @JSName("responseHeaders")
    var responseHeaders_HTTP: org.scalablytyped.runtime.StringDictionary[
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
    def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
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
    var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[stdLib.Uint8Array] | scala.Null] = js.undefined
    /** Details variablesJson */
    var variablesJson: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
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
        (org.scalablytyped.runtime.StringDictionary[
          apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues
        ]) | scala.Null
      ] = js.undefined
    /** HTTP responseHeaders */
    var responseHeaders: js.UndefOr[
        (org.scalablytyped.runtime.StringDictionary[
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
    /** Node index */
    var index: js.UndefOr[scala.Double | scala.Null] = js.undefined
    /** Node originalFieldName */
    var originalFieldName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Node parentType */
    var parentType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Node responseName */
    var responseName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    /** Node startTime */
    var startTime: js.UndefOr[scala.Double | scala.Null] = js.undefined
    /** Node type */
    var `type`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  }
  
  /** Properties of a QueryPlanNode. */
  trait IQueryPlanNode extends js.Object {
    /** QueryPlanNode fetch */
    var fetch: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFetchNode | scala.Null
      ] = js.undefined
    /** QueryPlanNode flatten */
    var flatten: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFlattenNode | scala.Null
      ] = js.undefined
    /** QueryPlanNode parallel */
    var parallel: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IParallelNode | scala.Null
      ] = js.undefined
    /** QueryPlanNode sequence */
    var sequence: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ISequenceNode | scala.Null
      ] = js.undefined
  }
  
  /** Represents a Location. */
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location () extends ILocation {
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
    def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents a Node. */
  @js.native
  /**
    * Constructs a new Node.
    * @param [properties] Properties to set
    */
  class Node () extends INode {
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
    /** Node id. */
    var id: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.responseName | apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.index
      ] = js.native
    /** Node index. */
    @JSName("index")
    var index_Node: scala.Double = js.native
    /** Node originalFieldName. */
    @JSName("originalFieldName")
    var originalFieldName_Node: java.lang.String = js.native
    /** Node parentType. */
    @JSName("parentType")
    var parentType_Node: java.lang.String = js.native
    /** Node responseName. */
    @JSName("responseName")
    var responseName_Node: java.lang.String = js.native
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
    def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /** Represents a QueryPlanNode. */
  @js.native
  /**
    * Constructs a new QueryPlanNode.
    * @param [properties] Properties to set
    */
  class QueryPlanNode () extends IQueryPlanNode {
    def this(properties: IQueryPlanNode) = this()
    /** QueryPlanNode node. */
    var node: js.UndefOr[
        apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.sequence | apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.parallel | apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.fetch | apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.flatten
      ] = js.native
    /**
      * Converts this QueryPlanNode to JSON.
      * @returns JSON object
      */
    def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  }
  
  /* static members */
  @js.native
  object CachePolicy extends js.Object {
    /**
      * Creates a new CachePolicy instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CachePolicy instance
      */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
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
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
      * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
      * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy): protobufjsLib.protobufjsMod.Writer = js.native
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
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
      * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CachePolicy
      */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy = js.native
    /**
      * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
      * @param message CachePolicy
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.CachePolicy,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * Verifies a CachePolicy message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
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
  
  /* static members */
  @js.native
  object Details extends js.Object {
    /**
      * Creates a new Details instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Details instance
      */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
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
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
      * Decodes a Details message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
      * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails): protobufjsLib.protobufjsMod.Writer = js.native
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
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
      * Creates a Details message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Details
      */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details = js.native
    /**
      * Creates a plain object from a Details message. Also converts values to other types if specified.
      * @param message Details
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Details,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * Verifies a Details message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /* static members */
  @js.native
  object Error extends js.Object {
    /**
      * Creates a new Error instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Error instance
      */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
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
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
      * Decodes an Error message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
      * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError): protobufjsLib.protobufjsMod.Writer = js.native
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
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IError,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
      * Creates an Error message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Error
      */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error = js.native
    /**
      * Creates a plain object from an Error message. Also converts values to other types if specified.
      * @param message Error
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Error,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * Verifies an Error message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /* static members */
  @js.native
  object HTTP extends js.Object {
    /**
      * Creates a new HTTP instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HTTP instance
      */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
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
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
      * Decodes a HTTP message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
      * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP): protobufjsLib.protobufjsMod.Writer = js.native
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
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
      * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HTTP
      */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP = js.native
    /**
      * Creates a plain object from a HTTP message. Also converts values to other types if specified.
      * @param message HTTP
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTP,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * Verifies a HTTP message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
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
    /**
      * Constructs a new Values.
      * @param [properties] Properties to set
      */
    class Values () extends IValues {
      def this(properties: IValues) = this()
      /** Values value. */
      @JSName("value")
      var value_Values: js.Array[java.lang.String] = js.native
      /**
        * Converts this Values to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
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
    
    /* static members */
    @js.native
    object Values extends js.Object {
      /**
        * Creates a new Values instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Values instance
        */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
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
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
        * Decodes a Values message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
        * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues): protobufjsLib.protobufjsMod.Writer = js.native
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
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.IValues,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a Values message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Values
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values = js.native
      /**
        * Creates a plain object from a Values message. Also converts values to other types if specified.
        * @param message Values
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.HTTPNs.Values,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a Values message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Location extends js.Object {
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
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
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
      * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation): protobufjsLib.protobufjsMod.Writer = js.native
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
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ILocation,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location = js.native
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Location,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /* static members */
  @js.native
  object Node extends js.Object {
    /**
      * Creates a new Node instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Node instance
      */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
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
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
      * Decodes a Node message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
      * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode): protobufjsLib.protobufjsMod.Writer = js.native
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
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
      * Creates a Node message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Node
      */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node = js.native
    /**
      * Creates a plain object from a Node message. Also converts values to other types if specified.
      * @param message Node
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.Node,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * Verifies a Node message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  /* static members */
  @js.native
  object QueryPlanNode extends js.Object {
    /**
      * Creates a new QueryPlanNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns QueryPlanNode instance
      */
    def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    /**
      * Encodes the specified QueryPlanNode message. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode): protobufjsLib.protobufjsMod.Writer = js.native
    def encode(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
      * Encodes the specified QueryPlanNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode): protobufjsLib.protobufjsMod.Writer = js.native
    def encodeDelimited(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode,
      writer: protobufjsLib.protobufjsMod.Writer
    ): protobufjsLib.protobufjsMod.Writer = js.native
    /**
      * Creates a QueryPlanNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns QueryPlanNode
      */
    def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode = js.native
    /**
      * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
      * @param message QueryPlanNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def toObject(
      message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNode,
      options: protobufjsLib.protobufjsMod.IConversionOptions
    ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * Verifies a QueryPlanNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
  }
  
  @JSName("QueryPlanNode")
  @js.native
  object QueryPlanNodeNs extends js.Object {
    /** Represents a FetchNode. */
    @js.native
    /**
      * Constructs a new FetchNode.
      * @param [properties] Properties to set
      */
    class FetchNode () extends IFetchNode {
      def this(properties: IFetchNode) = this()
      /** FetchNode sentTimeOffset. */
      @JSName("sentTimeOffset")
      var sentTimeOffset_FetchNode: scala.Double = js.native
      /** FetchNode serviceName. */
      @JSName("serviceName")
      var serviceName_FetchNode: java.lang.String = js.native
      /** FetchNode traceParsingFailed. */
      @JSName("traceParsingFailed")
      var traceParsingFailed_FetchNode: scala.Boolean = js.native
      /**
        * Converts this FetchNode to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a FlattenNode. */
    @js.native
    /**
      * Constructs a new FlattenNode.
      * @param [properties] Properties to set
      */
    class FlattenNode () extends IFlattenNode {
      def this(properties: IFlattenNode) = this()
      /** FlattenNode responsePath. */
      @JSName("responsePath")
      var responsePath_FlattenNode: js.Array[IResponsePathElement] = js.native
      /**
        * Converts this FlattenNode to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Properties of a FetchNode. */
    trait IFetchNode extends js.Object {
      /** FetchNode receivedTime */
      var receivedTime: js.UndefOr[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
          ] = js.undefined
      /** FetchNode sentTime */
      var sentTime: js.UndefOr[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
          ] = js.undefined
      /** FetchNode sentTimeOffset */
      var sentTimeOffset: js.UndefOr[scala.Double | scala.Null] = js.undefined
      /** FetchNode serviceName */
      var serviceName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FetchNode trace */
      var trace: js.UndefOr[apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITrace | scala.Null] = js.undefined
      /** FetchNode traceParsingFailed */
      var traceParsingFailed: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    }
    
    /** Properties of a FlattenNode. */
    trait IFlattenNode extends js.Object {
      /** FlattenNode node */
      var node: js.UndefOr[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode | scala.Null
          ] = js.undefined
      /** FlattenNode responsePath */
      var responsePath: js.UndefOr[js.Array[IResponsePathElement] | scala.Null] = js.undefined
    }
    
    /** Properties of a ParallelNode. */
    trait IParallelNode extends js.Object {
      /** ParallelNode nodes */
      var nodes: js.UndefOr[
            (js.Array[
              apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode
            ]) | scala.Null
          ] = js.undefined
    }
    
    /** Properties of a ResponsePathElement. */
    trait IResponsePathElement extends js.Object {
      /** ResponsePathElement fieldName */
      var fieldName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** ResponsePathElement index */
      var index: js.UndefOr[scala.Double | scala.Null] = js.undefined
    }
    
    /** Properties of a SequenceNode. */
    trait ISequenceNode extends js.Object {
      /** SequenceNode nodes */
      var nodes: js.UndefOr[
            (js.Array[
              apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode
            ]) | scala.Null
          ] = js.undefined
    }
    
    /** Represents a ParallelNode. */
    @js.native
    /**
      * Constructs a new ParallelNode.
      * @param [properties] Properties to set
      */
    class ParallelNode () extends IParallelNode {
      def this(properties: IParallelNode) = this()
      /** ParallelNode nodes. */
      @JSName("nodes")
      var nodes_ParallelNode: js.Array[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode
          ] = js.native
      /**
        * Converts this ParallelNode to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a ResponsePathElement. */
    @js.native
    /**
      * Constructs a new ResponsePathElement.
      * @param [properties] Properties to set
      */
    class ResponsePathElement () extends IResponsePathElement {
      def this(properties: IResponsePathElement) = this()
      /** ResponsePathElement fieldName. */
      @JSName("fieldName")
      var fieldName_ResponsePathElement: java.lang.String = js.native
      /** ResponsePathElement id. */
      var id: js.UndefOr[
            apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.fieldName | apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufLibStrings.index
          ] = js.native
      /** ResponsePathElement index. */
      @JSName("index")
      var index_ResponsePathElement: scala.Double = js.native
      /**
        * Converts this ResponsePathElement to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a SequenceNode. */
    @js.native
    /**
      * Constructs a new SequenceNode.
      * @param [properties] Properties to set
      */
    class SequenceNode () extends ISequenceNode {
      def this(properties: ISequenceNode) = this()
      /** SequenceNode nodes. */
      @JSName("nodes")
      var nodes_SequenceNode: js.Array[
            apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IQueryPlanNode
          ] = js.native
      /**
        * Converts this SequenceNode to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /* static members */
    @js.native
    object FetchNode extends js.Object {
      /**
        * Creates a new FetchNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FetchNode instance
        */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def create(
        properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFetchNode
      ): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      /**
        * Decodes a FetchNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      /**
        * Decodes a FetchNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      /**
        * Encodes the specified FetchNode message. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFetchNode
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFetchNode,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FetchNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFetchNode
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFetchNode,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FetchNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FetchNode
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode = js.native
      /**
        * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
        * @param message FetchNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FetchNode,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a FetchNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object FlattenNode extends js.Object {
      /**
        * Creates a new FlattenNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FlattenNode instance
        */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def create(
        properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFlattenNode
      ): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      /**
        * Decodes a FlattenNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      /**
        * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      /**
        * Encodes the specified FlattenNode message. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFlattenNode
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFlattenNode,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FlattenNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFlattenNode
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IFlattenNode,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FlattenNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FlattenNode
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode = js.native
      /**
        * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
        * @param message FlattenNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.FlattenNode,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a FlattenNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object ParallelNode extends js.Object {
      /**
        * Creates a new ParallelNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ParallelNode instance
        */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def create(
        properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IParallelNode
      ): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      /**
        * Decodes a ParallelNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      /**
        * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      /**
        * Encodes the specified ParallelNode message. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IParallelNode
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IParallelNode,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified ParallelNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IParallelNode
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IParallelNode,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a ParallelNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ParallelNode
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode = js.native
      /**
        * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
        * @param message ParallelNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ParallelNode,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a ParallelNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object ResponsePathElement extends js.Object {
      /**
        * Creates a new ResponsePathElement instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ResponsePathElement instance
        */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def create(
        properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IResponsePathElement
      ): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      /**
        * Encodes the specified ResponsePathElement message. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IResponsePathElement
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IResponsePathElement,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified ResponsePathElement message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IResponsePathElement
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.IResponsePathElement,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a ResponsePathElement message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ResponsePathElement
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement = js.native
      /**
        * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
        * @param message ResponsePathElement
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ResponsePathElement,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a ResponsePathElement message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object SequenceNode extends js.Object {
      /**
        * Creates a new SequenceNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SequenceNode instance
        */
      def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def create(
        properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ISequenceNode
      ): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      /**
        * Decodes a SequenceNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      /**
        * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      /**
        * Encodes the specified SequenceNode message. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ISequenceNode
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ISequenceNode,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified SequenceNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ISequenceNode
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.ISequenceNode,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a SequenceNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SequenceNode
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode = js.native
      /**
        * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
        * @param message SequenceNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.QueryPlanNodeNs.SequenceNode,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a SequenceNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
  }
  
}

