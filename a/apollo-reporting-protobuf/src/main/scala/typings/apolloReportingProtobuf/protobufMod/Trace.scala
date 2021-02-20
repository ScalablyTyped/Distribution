package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.fetch
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.fieldName
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.flatten
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.index
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.parallel
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.responseName
import typings.apolloReportingProtobuf.apolloReportingProtobufStrings.sequence
import typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope
import typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.IValues
import typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFetchNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFlattenNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IParallelNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ISequenceNode
import typings.apolloReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace")
@js.native
/**
  * Constructs a new Trace.
  * @param [properties] Properties to set
  */
class Trace () extends ITrace {
  def this(properties: ITrace) = this()
  
  /** Trace clientAddress. */
  @JSName("clientAddress")
  var clientAddress_Trace: String = js.native
  
  /** Trace clientName. */
  @JSName("clientName")
  var clientName_Trace: String = js.native
  
  /** Trace clientReferenceId. */
  @JSName("clientReferenceId")
  var clientReferenceId_Trace: String = js.native
  
  /** Trace clientVersion. */
  @JSName("clientVersion")
  var clientVersion_Trace: String = js.native
  
  /** Trace durationNs. */
  @JSName("durationNs")
  var durationNs_Trace: Double = js.native
  
  /** Trace forbiddenOperation. */
  @JSName("forbiddenOperation")
  var forbiddenOperation_Trace: Boolean = js.native
  
  /** Trace fullQueryCacheHit. */
  @JSName("fullQueryCacheHit")
  var fullQueryCacheHit_Trace: Boolean = js.native
  
  /** Trace legacySignatureNeedsResigning. */
  @JSName("legacySignatureNeedsResigning")
  var legacySignatureNeedsResigning_Trace: String = js.native
  
  /** Trace persistedQueryHit. */
  @JSName("persistedQueryHit")
  var persistedQueryHit_Trace: Boolean = js.native
  
  /** Trace persistedQueryRegister. */
  @JSName("persistedQueryRegister")
  var persistedQueryRegister_Trace: Boolean = js.native
  
  /** Trace registeredOperation. */
  @JSName("registeredOperation")
  var registeredOperation_Trace: Boolean = js.native
  
  /** Trace signature. */
  @JSName("signature")
  var signature_Trace: String = js.native
  
  /**
    * Converts this Trace to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Trace unexecutedOperationBody. */
  @JSName("unexecutedOperationBody")
  var unexecutedOperationBody_Trace: String = js.native
  
  /** Trace unexecutedOperationName. */
  @JSName("unexecutedOperationName")
  var unexecutedOperationName_Trace: String = js.native
}
/* static members */
object Trace {
  
  /** Represents a CachePolicy. */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy")
  @js.native
  /**
    * Constructs a new CachePolicy.
    * @param [properties] Properties to set
    */
  class CachePolicy () extends ICachePolicy {
    def this(properties: ICachePolicy) = this()
    
    /** CachePolicy maxAgeNs. */
    @JSName("maxAgeNs")
    var maxAgeNs_CachePolicy: Double = js.native
    
    /** CachePolicy scope. */
    @JSName("scope")
    var scope_CachePolicy: Scope = js.native
    
    /**
      * Converts this CachePolicy to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object CachePolicy {
    
    @js.native
    sealed trait Scope extends StObject
    /** Scope enum. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.Scope")
    @js.native
    object Scope extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Scope with Double] = js.native
      
      @js.native
      sealed trait PRIVATE extends Scope
      /* 2 */ val PRIVATE: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PRIVATE with Double = js.native
      
      @js.native
      sealed trait PUBLIC extends Scope
      /* 1 */ val PUBLIC: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PUBLIC with Double = js.native
      
      @js.native
      sealed trait UNKNOWN extends Scope
      /* 0 */ val UNKNOWN: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.UNKNOWN with Double = js.native
    }
    
    /**
      * Creates a new CachePolicy instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CachePolicy instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.create")
    @js.native
    def create(): CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.create")
    @js.native
    def create(properties: ICachePolicy): CachePolicy = js.native
    
    /**
      * Decodes a CachePolicy message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.decode")
    @js.native
    def decode(reader: Reader): CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.decode")
    @js.native
    def decode(reader: Reader, length: Double): CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.decode")
    @js.native
    def decode(reader: Uint8Array): CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): CachePolicy = js.native
    
    /**
      * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): CachePolicy = js.native
    
    /**
      * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.encode")
    @js.native
    def encode(message: ICachePolicy): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.encode")
    @js.native
    def encode(message: ICachePolicy, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICachePolicy): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICachePolicy, writer: Writer): Writer = js.native
    
    /**
      * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CachePolicy
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): CachePolicy = js.native
    
    /**
      * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
      * @param message CachePolicy
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.toObject")
    @js.native
    def toObject(message: CachePolicy): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.toObject")
    @js.native
    def toObject(message: CachePolicy, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a CachePolicy message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.CachePolicy.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Details. */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details")
  @js.native
  /**
    * Constructs a new Details.
    * @param [properties] Properties to set
    */
  class Details () extends IDetails {
    def this(properties: IDetails) = this()
    
    /** Details deprecatedVariables. */
    @JSName("deprecatedVariables")
    var deprecatedVariables_Details: StringDictionary[Uint8Array] = js.native
    
    /** Details operationName. */
    @JSName("operationName")
    var operationName_Details: String = js.native
    
    /**
      * Converts this Details to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Details variablesJson. */
    @JSName("variablesJson")
    var variablesJson_Details: StringDictionary[String] = js.native
  }
  object Details {
    
    /**
      * Creates a new Details instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Details instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.create")
    @js.native
    def create(): Details = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.create")
    @js.native
    def create(properties: IDetails): Details = js.native
    
    /**
      * Decodes a Details message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.decode")
    @js.native
    def decode(reader: Reader): Details = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.decode")
    @js.native
    def decode(reader: Reader, length: Double): Details = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.decode")
    @js.native
    def decode(reader: Uint8Array): Details = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Details = js.native
    
    /**
      * Decodes a Details message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Details = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Details = js.native
    
    /**
      * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.encode")
    @js.native
    def encode(message: IDetails): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.encode")
    @js.native
    def encode(message: IDetails, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.encodeDelimited")
    @js.native
    def encodeDelimited(message: IDetails): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.encodeDelimited")
    @js.native
    def encodeDelimited(message: IDetails, writer: Writer): Writer = js.native
    
    /**
      * Creates a Details message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Details
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Details = js.native
    
    /**
      * Creates a plain object from a Details message. Also converts values to other types if specified.
      * @param message Details
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.toObject")
    @js.native
    def toObject(message: Details): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.toObject")
    @js.native
    def toObject(message: Details, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Details message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Details.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents an Error. */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error")
  @js.native
  /**
    * Constructs a new Error.
    * @param [properties] Properties to set
    */
  class Error () extends IError {
    def this(properties: IError) = this()
    
    /** Error json. */
    @JSName("json")
    var json_Error: String = js.native
    
    /** Error location. */
    @JSName("location")
    var location_Error: js.Array[ILocation] = js.native
    
    /** Error message. */
    @JSName("message")
    var message_Error: String = js.native
    
    /** Error timeNs. */
    @JSName("timeNs")
    var timeNs_Error: Double = js.native
    
    /**
      * Converts this Error to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Error {
    
    /**
      * Creates a new Error instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Error instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.create")
    @js.native
    def create(): Error = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.create")
    @js.native
    def create(properties: IError): Error = js.native
    
    /**
      * Decodes an Error message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.decode")
    @js.native
    def decode(reader: Reader): Error = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.decode")
    @js.native
    def decode(reader: Reader, length: Double): Error = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.decode")
    @js.native
    def decode(reader: Uint8Array): Error = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Error = js.native
    
    /**
      * Decodes an Error message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Error = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Error = js.native
    
    /**
      * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.encode")
    @js.native
    def encode(message: IError): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.encode")
    @js.native
    def encode(message: IError, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.encodeDelimited")
    @js.native
    def encodeDelimited(message: IError): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.encodeDelimited")
    @js.native
    def encodeDelimited(message: IError, writer: Writer): Writer = js.native
    
    /**
      * Creates an Error message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Error
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Error = js.native
    
    /**
      * Creates a plain object from an Error message. Also converts values to other types if specified.
      * @param message Error
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.toObject")
    @js.native
    def toObject(message: Error): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.toObject")
    @js.native
    def toObject(message: Error, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Error message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Error.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a HTTP. */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP")
  @js.native
  /**
    * Constructs a new HTTP.
    * @param [properties] Properties to set
    */
  class HTTP () extends IHTTP {
    def this(properties: IHTTP) = this()
    
    /** HTTP host. */
    @JSName("host")
    var host_HTTP: String = js.native
    
    /** HTTP method. */
    @JSName("method")
    var method_HTTP: Method = js.native
    
    /** HTTP path. */
    @JSName("path")
    var path_HTTP: String = js.native
    
    /** HTTP protocol. */
    @JSName("protocol")
    var protocol_HTTP: String = js.native
    
    /** HTTP requestHeaders. */
    @JSName("requestHeaders")
    var requestHeaders_HTTP: StringDictionary[IValues] = js.native
    
    /** HTTP responseHeaders. */
    @JSName("responseHeaders")
    var responseHeaders_HTTP: StringDictionary[IValues] = js.native
    
    /** HTTP secure. */
    @JSName("secure")
    var secure_HTTP: Boolean = js.native
    
    /** HTTP statusCode. */
    @JSName("statusCode")
    var statusCode_HTTP: Double = js.native
    
    /**
      * Converts this HTTP to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object HTTP {
    
    @js.native
    sealed trait Method extends StObject
    /** Method enum. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Method")
    @js.native
    object Method extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Method with Double] = js.native
      
      @js.native
      sealed trait CONNECT extends Method
      /* 8 */ val CONNECT: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.CONNECT with Double = js.native
      
      @js.native
      sealed trait DELETE extends Method
      /* 6 */ val DELETE: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.DELETE with Double = js.native
      
      @js.native
      sealed trait GET extends Method
      /* 2 */ val GET: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.GET with Double = js.native
      
      @js.native
      sealed trait HEAD extends Method
      /* 3 */ val HEAD: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.HEAD with Double = js.native
      
      @js.native
      sealed trait OPTIONS extends Method
      /* 1 */ val OPTIONS: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.OPTIONS with Double = js.native
      
      @js.native
      sealed trait PATCH extends Method
      /* 9 */ val PATCH: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.PATCH with Double = js.native
      
      @js.native
      sealed trait POST extends Method
      /* 4 */ val POST: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.POST with Double = js.native
      
      @js.native
      sealed trait PUT extends Method
      /* 5 */ val PUT: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.PUT with Double = js.native
      
      @js.native
      sealed trait TRACE extends Method
      /* 7 */ val TRACE: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.TRACE with Double = js.native
      
      @js.native
      sealed trait UNKNOWN extends Method
      /* 0 */ val UNKNOWN: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.UNKNOWN with Double = js.native
    }
    
    /** Represents a Values. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values")
    @js.native
    /**
      * Constructs a new Values.
      * @param [properties] Properties to set
      */
    class Values () extends IValues {
      def this(properties: IValues) = this()
      
      /**
        * Converts this Values to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
      
      /** Values value. */
      @JSName("value")
      var value_Values: js.Array[String] = js.native
    }
    object Values {
      
      /**
        * Creates a new Values instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Values instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.create")
      @js.native
      def create(): Values = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.create")
      @js.native
      def create(properties: IValues): Values = js.native
      
      /**
        * Decodes a Values message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.decode")
      @js.native
      def decode(reader: Reader): Values = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.decode")
      @js.native
      def decode(reader: Reader, length: Double): Values = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.decode")
      @js.native
      def decode(reader: Uint8Array): Values = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): Values = js.native
      
      /**
        * Decodes a Values message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): Values = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): Values = js.native
      
      /**
        * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.encode")
      @js.native
      def encode(message: IValues): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.encode")
      @js.native
      def encode(message: IValues, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.encodeDelimited")
      @js.native
      def encodeDelimited(message: IValues): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.encodeDelimited")
      @js.native
      def encodeDelimited(message: IValues, writer: Writer): Writer = js.native
      
      /**
        * Creates a Values message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Values
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): Values = js.native
      
      /**
        * Creates a plain object from a Values message. Also converts values to other types if specified.
        * @param message Values
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.toObject")
      @js.native
      def toObject(message: Values): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.toObject")
      @js.native
      def toObject(message: Values, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Values message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.Values.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /**
      * Creates a new HTTP instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HTTP instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.create")
    @js.native
    def create(): HTTP = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.create")
    @js.native
    def create(properties: IHTTP): HTTP = js.native
    
    /**
      * Decodes a HTTP message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.decode")
    @js.native
    def decode(reader: Reader): HTTP = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.decode")
    @js.native
    def decode(reader: Reader, length: Double): HTTP = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.decode")
    @js.native
    def decode(reader: Uint8Array): HTTP = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): HTTP = js.native
    
    /**
      * Decodes a HTTP message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): HTTP = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): HTTP = js.native
    
    /**
      * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.encode")
    @js.native
    def encode(message: IHTTP): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.encode")
    @js.native
    def encode(message: IHTTP, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHTTP): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHTTP, writer: Writer): Writer = js.native
    
    /**
      * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HTTP
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): HTTP = js.native
    
    /**
      * Creates a plain object from a HTTP message. Also converts values to other types if specified.
      * @param message HTTP
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.toObject")
    @js.native
    def toObject(message: HTTP): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.toObject")
    @js.native
    def toObject(message: HTTP, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a HTTP message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.HTTP.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
    
    /** Properties of a Values. */
    @js.native
    trait IValues extends StObject {
      
      /** Values value */
      var value: js.UndefOr[js.Array[String] | Null] = js.native
    }
    object IValues {
      
      @scala.inline
      def apply(): IValues = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IValues]
      }
      
      @scala.inline
      implicit class IValuesMutableBuilder[Self <: IValues] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueNull: Self = StObject.set(x, "value", null)
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        @scala.inline
        def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      }
    }
  }
  
  /** Represents a Location. */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location () extends ILocation {
    def this(properties: ILocation) = this()
    
    /** Location column. */
    @JSName("column")
    var column_Location: Double = js.native
    
    /** Location line. */
    @JSName("line")
    var line_Location: Double = js.native
    
    /**
      * Converts this Location to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Location {
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.create")
    @js.native
    def create(): Location = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.create")
    @js.native
    def create(properties: ILocation): Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.decode")
    @js.native
    def decode(reader: Reader): Location = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.decode")
    @js.native
    def decode(reader: Reader, length: Double): Location = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.decode")
    @js.native
    def decode(reader: Uint8Array): Location = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Location = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Location = js.native
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.encode")
    @js.native
    def encode(message: ILocation): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.encode")
    @js.native
    def encode(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Location = js.native
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.toObject")
    @js.native
    def toObject(message: Location): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.toObject")
    @js.native
    def toObject(message: Location, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Location.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Node. */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node")
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
    var endTime_Node: Double = js.native
    
    /** Node error. */
    @JSName("error")
    var error_Node: js.Array[IError] = js.native
    
    /** Node id. */
    var id: js.UndefOr[responseName | index] = js.native
    
    /** Node index. */
    @JSName("index")
    var index_Node: Double = js.native
    
    /** Node originalFieldName. */
    @JSName("originalFieldName")
    var originalFieldName_Node: String = js.native
    
    /** Node parentType. */
    @JSName("parentType")
    var parentType_Node: String = js.native
    
    /** Node responseName. */
    @JSName("responseName")
    var responseName_Node: String = js.native
    
    /** Node startTime. */
    @JSName("startTime")
    var startTime_Node: Double = js.native
    
    /**
      * Converts this Node to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /** Node type. */
    @JSName("type")
    var type_Node: String = js.native
  }
  object Node {
    
    /**
      * Creates a new Node instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Node instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.create")
    @js.native
    def create(): Node = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.create")
    @js.native
    def create(properties: INode): Node = js.native
    
    /**
      * Decodes a Node message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.decode")
    @js.native
    def decode(reader: Reader): Node = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.decode")
    @js.native
    def decode(reader: Reader, length: Double): Node = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.decode")
    @js.native
    def decode(reader: Uint8Array): Node = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Node = js.native
    
    /**
      * Decodes a Node message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Node = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Node = js.native
    
    /**
      * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.encode")
    @js.native
    def encode(message: INode): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.encode")
    @js.native
    def encode(message: INode, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.encodeDelimited")
    @js.native
    def encodeDelimited(message: INode): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.encodeDelimited")
    @js.native
    def encodeDelimited(message: INode, writer: Writer): Writer = js.native
    
    /**
      * Creates a Node message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Node
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Node = js.native
    
    /**
      * Creates a plain object from a Node message. Also converts values to other types if specified.
      * @param message Node
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.toObject")
    @js.native
    def toObject(message: Node): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.toObject")
    @js.native
    def toObject(message: Node, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Node message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.Node.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a QueryPlanNode. */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode")
  @js.native
  /**
    * Constructs a new QueryPlanNode.
    * @param [properties] Properties to set
    */
  class QueryPlanNode () extends IQueryPlanNode {
    def this(properties: IQueryPlanNode) = this()
    
    /** QueryPlanNode node. */
    var node: js.UndefOr[sequence | parallel | fetch | flatten] = js.native
    
    /**
      * Converts this QueryPlanNode to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object QueryPlanNode {
    
    /** Represents a FetchNode. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode")
    @js.native
    /**
      * Constructs a new FetchNode.
      * @param [properties] Properties to set
      */
    class FetchNode () extends IFetchNode {
      def this(properties: IFetchNode) = this()
      
      /** FetchNode sentTimeOffset. */
      @JSName("sentTimeOffset")
      var sentTimeOffset_FetchNode: Double = js.native
      
      /** FetchNode serviceName. */
      @JSName("serviceName")
      var serviceName_FetchNode: String = js.native
      
      /**
        * Converts this FetchNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
      
      /** FetchNode traceParsingFailed. */
      @JSName("traceParsingFailed")
      var traceParsingFailed_FetchNode: Boolean = js.native
    }
    object FetchNode {
      
      /**
        * Creates a new FetchNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FetchNode instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.create")
      @js.native
      def create(): FetchNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.create")
      @js.native
      def create(properties: IFetchNode): FetchNode = js.native
      
      /**
        * Decodes a FetchNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.decode")
      @js.native
      def decode(reader: Reader): FetchNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.decode")
      @js.native
      def decode(reader: Reader, length: Double): FetchNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.decode")
      @js.native
      def decode(reader: Uint8Array): FetchNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): FetchNode = js.native
      
      /**
        * Decodes a FetchNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): FetchNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): FetchNode = js.native
      
      /**
        * Encodes the specified FetchNode message. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.encode")
      @js.native
      def encode(message: IFetchNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.encode")
      @js.native
      def encode(message: IFetchNode, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified FetchNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFetchNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFetchNode, writer: Writer): Writer = js.native
      
      /**
        * Creates a FetchNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FetchNode
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): FetchNode = js.native
      
      /**
        * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
        * @param message FetchNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.toObject")
      @js.native
      def toObject(message: FetchNode): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.toObject")
      @js.native
      def toObject(message: FetchNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a FetchNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FetchNode.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a FlattenNode. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode")
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
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object FlattenNode {
      
      /**
        * Creates a new FlattenNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FlattenNode instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.create")
      @js.native
      def create(): FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.create")
      @js.native
      def create(properties: IFlattenNode): FlattenNode = js.native
      
      /**
        * Decodes a FlattenNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.decode")
      @js.native
      def decode(reader: Reader): FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.decode")
      @js.native
      def decode(reader: Reader, length: Double): FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.decode")
      @js.native
      def decode(reader: Uint8Array): FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): FlattenNode = js.native
      
      /**
        * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): FlattenNode = js.native
      
      /**
        * Encodes the specified FlattenNode message. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.encode")
      @js.native
      def encode(message: IFlattenNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.encode")
      @js.native
      def encode(message: IFlattenNode, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified FlattenNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFlattenNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFlattenNode, writer: Writer): Writer = js.native
      
      /**
        * Creates a FlattenNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FlattenNode
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): FlattenNode = js.native
      
      /**
        * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
        * @param message FlattenNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.toObject")
      @js.native
      def toObject(message: FlattenNode): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.toObject")
      @js.native
      def toObject(message: FlattenNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a FlattenNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.FlattenNode.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a ParallelNode. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode")
    @js.native
    /**
      * Constructs a new ParallelNode.
      * @param [properties] Properties to set
      */
    class ParallelNode () extends IParallelNode {
      def this(properties: IParallelNode) = this()
      
      /** ParallelNode nodes. */
      @JSName("nodes")
      var nodes_ParallelNode: js.Array[IQueryPlanNode] = js.native
      
      /**
        * Converts this ParallelNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object ParallelNode {
      
      /**
        * Creates a new ParallelNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ParallelNode instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.create")
      @js.native
      def create(): ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.create")
      @js.native
      def create(properties: IParallelNode): ParallelNode = js.native
      
      /**
        * Decodes a ParallelNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.decode")
      @js.native
      def decode(reader: Reader): ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.decode")
      @js.native
      def decode(reader: Reader, length: Double): ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.decode")
      @js.native
      def decode(reader: Uint8Array): ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): ParallelNode = js.native
      
      /**
        * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): ParallelNode = js.native
      
      /**
        * Encodes the specified ParallelNode message. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.encode")
      @js.native
      def encode(message: IParallelNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.encode")
      @js.native
      def encode(message: IParallelNode, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified ParallelNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IParallelNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IParallelNode, writer: Writer): Writer = js.native
      
      /**
        * Creates a ParallelNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ParallelNode
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): ParallelNode = js.native
      
      /**
        * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
        * @param message ParallelNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.toObject")
      @js.native
      def toObject(message: ParallelNode): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.toObject")
      @js.native
      def toObject(message: ParallelNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a ParallelNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ParallelNode.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a ResponsePathElement. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement")
    @js.native
    /**
      * Constructs a new ResponsePathElement.
      * @param [properties] Properties to set
      */
    class ResponsePathElement () extends IResponsePathElement {
      def this(properties: IResponsePathElement) = this()
      
      /** ResponsePathElement fieldName. */
      @JSName("fieldName")
      var fieldName_ResponsePathElement: String = js.native
      
      /** ResponsePathElement id. */
      var id: js.UndefOr[fieldName | index] = js.native
      
      /** ResponsePathElement index. */
      @JSName("index")
      var index_ResponsePathElement: Double = js.native
      
      /**
        * Converts this ResponsePathElement to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object ResponsePathElement {
      
      /**
        * Creates a new ResponsePathElement instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ResponsePathElement instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.create")
      @js.native
      def create(): ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.create")
      @js.native
      def create(properties: IResponsePathElement): ResponsePathElement = js.native
      
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.decode")
      @js.native
      def decode(reader: Reader): ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.decode")
      @js.native
      def decode(reader: Reader, length: Double): ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.decode")
      @js.native
      def decode(reader: Uint8Array): ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): ResponsePathElement = js.native
      
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): ResponsePathElement = js.native
      
      /**
        * Encodes the specified ResponsePathElement message. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.encode")
      @js.native
      def encode(message: IResponsePathElement): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.encode")
      @js.native
      def encode(message: IResponsePathElement, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified ResponsePathElement message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.encodeDelimited")
      @js.native
      def encodeDelimited(message: IResponsePathElement): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.encodeDelimited")
      @js.native
      def encodeDelimited(message: IResponsePathElement, writer: Writer): Writer = js.native
      
      /**
        * Creates a ResponsePathElement message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ResponsePathElement
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): ResponsePathElement = js.native
      
      /**
        * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
        * @param message ResponsePathElement
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.toObject")
      @js.native
      def toObject(message: ResponsePathElement): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.toObject")
      @js.native
      def toObject(message: ResponsePathElement, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a ResponsePathElement message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.ResponsePathElement.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a SequenceNode. */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode")
    @js.native
    /**
      * Constructs a new SequenceNode.
      * @param [properties] Properties to set
      */
    class SequenceNode () extends ISequenceNode {
      def this(properties: ISequenceNode) = this()
      
      /** SequenceNode nodes. */
      @JSName("nodes")
      var nodes_SequenceNode: js.Array[IQueryPlanNode] = js.native
      
      /**
        * Converts this SequenceNode to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object SequenceNode {
      
      /**
        * Creates a new SequenceNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SequenceNode instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.create")
      @js.native
      def create(): SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.create")
      @js.native
      def create(properties: ISequenceNode): SequenceNode = js.native
      
      /**
        * Decodes a SequenceNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.decode")
      @js.native
      def decode(reader: Reader): SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.decode")
      @js.native
      def decode(reader: Reader, length: Double): SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.decode")
      @js.native
      def decode(reader: Uint8Array): SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): SequenceNode = js.native
      
      /**
        * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): SequenceNode = js.native
      
      /**
        * Encodes the specified SequenceNode message. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.encode")
      @js.native
      def encode(message: ISequenceNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.encode")
      @js.native
      def encode(message: ISequenceNode, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified SequenceNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISequenceNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISequenceNode, writer: Writer): Writer = js.native
      
      /**
        * Creates a SequenceNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SequenceNode
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): SequenceNode = js.native
      
      /**
        * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
        * @param message SequenceNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.toObject")
      @js.native
      def toObject(message: SequenceNode): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.toObject")
      @js.native
      def toObject(message: SequenceNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a SequenceNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.SequenceNode.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /**
      * Creates a new QueryPlanNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns QueryPlanNode instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.create")
    @js.native
    def create(): QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.create")
    @js.native
    def create(properties: IQueryPlanNode): QueryPlanNode = js.native
    
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.decode")
    @js.native
    def decode(reader: Reader): QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.decode")
    @js.native
    def decode(reader: Reader, length: Double): QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.decode")
    @js.native
    def decode(reader: Uint8Array): QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): QueryPlanNode = js.native
    
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): QueryPlanNode = js.native
    
    /**
      * Encodes the specified QueryPlanNode message. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.encode")
    @js.native
    def encode(message: IQueryPlanNode): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.encode")
    @js.native
    def encode(message: IQueryPlanNode, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified QueryPlanNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.encodeDelimited")
    @js.native
    def encodeDelimited(message: IQueryPlanNode): Writer = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.encodeDelimited")
    @js.native
    def encodeDelimited(message: IQueryPlanNode, writer: Writer): Writer = js.native
    
    /**
      * Creates a QueryPlanNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns QueryPlanNode
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): QueryPlanNode = js.native
    
    /**
      * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
      * @param message QueryPlanNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.toObject")
    @js.native
    def toObject(message: QueryPlanNode): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.toObject")
    @js.native
    def toObject(message: QueryPlanNode, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a QueryPlanNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.QueryPlanNode.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
    
    /** Properties of a FetchNode. */
    @js.native
    trait IFetchNode extends StObject {
      
      /** FetchNode receivedTime */
      var receivedTime: js.UndefOr[ITimestamp | Null] = js.native
      
      /** FetchNode sentTime */
      var sentTime: js.UndefOr[ITimestamp | Null] = js.native
      
      /** FetchNode sentTimeOffset */
      var sentTimeOffset: js.UndefOr[Double | Null] = js.native
      
      /** FetchNode serviceName */
      var serviceName: js.UndefOr[String | Null] = js.native
      
      /** FetchNode trace */
      var trace: js.UndefOr[ITrace | Null] = js.native
      
      /** FetchNode traceParsingFailed */
      var traceParsingFailed: js.UndefOr[Boolean | Null] = js.native
    }
    object IFetchNode {
      
      @scala.inline
      def apply(): IFetchNode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFetchNode]
      }
      
      @scala.inline
      implicit class IFetchNodeMutableBuilder[Self <: IFetchNode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReceivedTime(value: ITimestamp): Self = StObject.set(x, "receivedTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReceivedTimeNull: Self = StObject.set(x, "receivedTime", null)
        
        @scala.inline
        def setReceivedTimeUndefined: Self = StObject.set(x, "receivedTime", js.undefined)
        
        @scala.inline
        def setSentTime(value: ITimestamp): Self = StObject.set(x, "sentTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSentTimeNull: Self = StObject.set(x, "sentTime", null)
        
        @scala.inline
        def setSentTimeOffset(value: Double): Self = StObject.set(x, "sentTimeOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSentTimeOffsetNull: Self = StObject.set(x, "sentTimeOffset", null)
        
        @scala.inline
        def setSentTimeOffsetUndefined: Self = StObject.set(x, "sentTimeOffset", js.undefined)
        
        @scala.inline
        def setSentTimeUndefined: Self = StObject.set(x, "sentTime", js.undefined)
        
        @scala.inline
        def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
        
        @scala.inline
        def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
        
        @scala.inline
        def setTrace(value: ITrace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTraceNull: Self = StObject.set(x, "trace", null)
        
        @scala.inline
        def setTraceParsingFailed(value: Boolean): Self = StObject.set(x, "traceParsingFailed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTraceParsingFailedNull: Self = StObject.set(x, "traceParsingFailed", null)
        
        @scala.inline
        def setTraceParsingFailedUndefined: Self = StObject.set(x, "traceParsingFailed", js.undefined)
        
        @scala.inline
        def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      }
    }
    
    /** Properties of a FlattenNode. */
    @js.native
    trait IFlattenNode extends StObject {
      
      /** FlattenNode node */
      var node: js.UndefOr[IQueryPlanNode | Null] = js.native
      
      /** FlattenNode responsePath */
      var responsePath: js.UndefOr[js.Array[IResponsePathElement] | Null] = js.native
    }
    object IFlattenNode {
      
      @scala.inline
      def apply(): IFlattenNode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFlattenNode]
      }
      
      @scala.inline
      implicit class IFlattenNodeMutableBuilder[Self <: IFlattenNode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNode(value: IQueryPlanNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeNull: Self = StObject.set(x, "node", null)
        
        @scala.inline
        def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
        
        @scala.inline
        def setResponsePath(value: js.Array[IResponsePathElement]): Self = StObject.set(x, "responsePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponsePathNull: Self = StObject.set(x, "responsePath", null)
        
        @scala.inline
        def setResponsePathUndefined: Self = StObject.set(x, "responsePath", js.undefined)
        
        @scala.inline
        def setResponsePathVarargs(value: IResponsePathElement*): Self = StObject.set(x, "responsePath", js.Array(value :_*))
      }
    }
    
    /** Properties of a ParallelNode. */
    @js.native
    trait IParallelNode extends StObject {
      
      /** ParallelNode nodes */
      var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.native
    }
    object IParallelNode {
      
      @scala.inline
      def apply(): IParallelNode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IParallelNode]
      }
      
      @scala.inline
      implicit class IParallelNodeMutableBuilder[Self <: IParallelNode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNodes(value: js.Array[IQueryPlanNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodesNull: Self = StObject.set(x, "nodes", null)
        
        @scala.inline
        def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
        
        @scala.inline
        def setNodesVarargs(value: IQueryPlanNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      }
    }
    
    /** Properties of a ResponsePathElement. */
    @js.native
    trait IResponsePathElement extends StObject {
      
      /** ResponsePathElement fieldName */
      var fieldName: js.UndefOr[String | Null] = js.native
      
      /** ResponsePathElement index */
      var index: js.UndefOr[Double | Null] = js.native
    }
    object IResponsePathElement {
      
      @scala.inline
      def apply(): IResponsePathElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IResponsePathElement]
      }
      
      @scala.inline
      implicit class IResponsePathElementMutableBuilder[Self <: IResponsePathElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
        
        @scala.inline
        def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexNull: Self = StObject.set(x, "index", null)
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      }
    }
    
    /** Properties of a SequenceNode. */
    @js.native
    trait ISequenceNode extends StObject {
      
      /** SequenceNode nodes */
      var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.native
    }
    object ISequenceNode {
      
      @scala.inline
      def apply(): ISequenceNode = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISequenceNode]
      }
      
      @scala.inline
      implicit class ISequenceNodeMutableBuilder[Self <: ISequenceNode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNodes(value: js.Array[IQueryPlanNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodesNull: Self = StObject.set(x, "nodes", null)
        
        @scala.inline
        def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
        
        @scala.inline
        def setNodesVarargs(value: IQueryPlanNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      }
    }
  }
  
  /**
    * Creates a new Trace instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Trace instance
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.create")
  @js.native
  def create(): Trace = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.create")
  @js.native
  def create(properties: ITrace): Trace = js.native
  
  /**
    * Decodes a Trace message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.decode")
  @js.native
  def decode(reader: Reader): Trace = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.decode")
  @js.native
  def decode(reader: Reader, length: Double): Trace = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.decode")
  @js.native
  def decode(reader: Uint8Array): Trace = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Trace = js.native
  
  /**
    * Decodes a Trace message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Trace = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Trace = js.native
  
  /**
    * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.encode")
  @js.native
  def encode(message: ITrace): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.encode")
  @js.native
  def encode(message: ITrace, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITrace): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITrace, writer: Writer): Writer = js.native
  
  /**
    * Creates a Trace message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Trace
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Trace = js.native
  
  /**
    * Creates a plain object from a Trace message. Also converts values to other types if specified.
    * @param message Trace
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.toObject")
  @js.native
  def toObject(message: Trace): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.toObject")
  @js.native
  def toObject(message: Trace, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Trace message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a CachePolicy. */
  @js.native
  trait ICachePolicy extends StObject {
    
    /** CachePolicy maxAgeNs */
    var maxAgeNs: js.UndefOr[Double | Null] = js.native
    
    /** CachePolicy scope */
    var scope: js.UndefOr[Scope | Null] = js.native
  }
  object ICachePolicy {
    
    @scala.inline
    def apply(): ICachePolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICachePolicy]
    }
    
    @scala.inline
    implicit class ICachePolicyMutableBuilder[Self <: ICachePolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAgeNs(value: Double): Self = StObject.set(x, "maxAgeNs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeNsNull: Self = StObject.set(x, "maxAgeNs", null)
      
      @scala.inline
      def setMaxAgeNsUndefined: Self = StObject.set(x, "maxAgeNs", js.undefined)
      
      @scala.inline
      def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeNull: Self = StObject.set(x, "scope", null)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /** Properties of a Details. */
  @js.native
  trait IDetails extends StObject {
    
    /** Details deprecatedVariables */
    var deprecatedVariables: js.UndefOr[StringDictionary[Uint8Array] | Null] = js.native
    
    /** Details operationName */
    var operationName: js.UndefOr[String | Null] = js.native
    
    /** Details variablesJson */
    var variablesJson: js.UndefOr[StringDictionary[String] | Null] = js.native
  }
  object IDetails {
    
    @scala.inline
    def apply(): IDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetails]
    }
    
    @scala.inline
    implicit class IDetailsMutableBuilder[Self <: IDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecatedVariables(value: StringDictionary[Uint8Array]): Self = StObject.set(x, "deprecatedVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedVariablesNull: Self = StObject.set(x, "deprecatedVariables", null)
      
      @scala.inline
      def setDeprecatedVariablesUndefined: Self = StObject.set(x, "deprecatedVariables", js.undefined)
      
      @scala.inline
      def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationNameNull: Self = StObject.set(x, "operationName", null)
      
      @scala.inline
      def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
      
      @scala.inline
      def setVariablesJson(value: StringDictionary[String]): Self = StObject.set(x, "variablesJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesJsonNull: Self = StObject.set(x, "variablesJson", null)
      
      @scala.inline
      def setVariablesJsonUndefined: Self = StObject.set(x, "variablesJson", js.undefined)
    }
  }
  
  /** Properties of an Error. */
  @js.native
  trait IError extends StObject {
    
    /** Error json */
    var json: js.UndefOr[String | Null] = js.native
    
    /** Error location */
    var location: js.UndefOr[js.Array[ILocation] | Null] = js.native
    
    /** Error message */
    var message: js.UndefOr[String | Null] = js.native
    
    /** Error timeNs */
    var timeNs: js.UndefOr[Double | Null] = js.native
  }
  object IError {
    
    @scala.inline
    def apply(): IError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IError]
    }
    
    @scala.inline
    implicit class IErrorMutableBuilder[Self <: IError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonNull: Self = StObject.set(x, "json", null)
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setLocation(value: js.Array[ILocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setLocationVarargs(value: ILocation*): Self = StObject.set(x, "location", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageNull: Self = StObject.set(x, "message", null)
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTimeNs(value: Double): Self = StObject.set(x, "timeNs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeNsNull: Self = StObject.set(x, "timeNs", null)
      
      @scala.inline
      def setTimeNsUndefined: Self = StObject.set(x, "timeNs", js.undefined)
    }
  }
  
  /** Properties of a HTTP. */
  @js.native
  trait IHTTP extends StObject {
    
    /** HTTP host */
    var host: js.UndefOr[String | Null] = js.native
    
    /** HTTP method */
    var method: js.UndefOr[Method | Null] = js.native
    
    /** HTTP path */
    var path: js.UndefOr[String | Null] = js.native
    
    /** HTTP protocol */
    var protocol: js.UndefOr[String | Null] = js.native
    
    /** HTTP requestHeaders */
    var requestHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.native
    
    /** HTTP responseHeaders */
    var responseHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.native
    
    /** HTTP secure */
    var secure: js.UndefOr[Boolean | Null] = js.native
    
    /** HTTP statusCode */
    var statusCode: js.UndefOr[Double | Null] = js.native
  }
  object IHTTP {
    
    @scala.inline
    def apply(): IHTTP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTTP]
    }
    
    @scala.inline
    implicit class IHTTPMutableBuilder[Self <: IHTTP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodNull: Self = StObject.set(x, "method", null)
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRequestHeaders(value: StringDictionary[IValues]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeadersNull: Self = StObject.set(x, "requestHeaders", null)
      
      @scala.inline
      def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      @scala.inline
      def setResponseHeaders(value: StringDictionary[IValues]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseHeadersNull: Self = StObject.set(x, "responseHeaders", null)
      
      @scala.inline
      def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureNull: Self = StObject.set(x, "secure", null)
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeNull: Self = StObject.set(x, "statusCode", null)
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  /** Properties of a Location. */
  @js.native
  trait ILocation extends StObject {
    
    /** Location column */
    var column: js.UndefOr[Double | Null] = js.native
    
    /** Location line */
    var line: js.UndefOr[Double | Null] = js.native
  }
  object ILocation {
    
    @scala.inline
    def apply(): ILocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocation]
    }
    
    @scala.inline
    implicit class ILocationMutableBuilder[Self <: ILocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNull: Self = StObject.set(x, "column", null)
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNull: Self = StObject.set(x, "line", null)
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
  
  /** Properties of a Node. */
  @js.native
  trait INode extends StObject {
    
    /** Node cachePolicy */
    var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.native
    
    /** Node child */
    var child: js.UndefOr[js.Array[INode] | Null] = js.native
    
    /** Node endTime */
    var endTime: js.UndefOr[Double | Null] = js.native
    
    /** Node error */
    var error: js.UndefOr[js.Array[IError] | Null] = js.native
    
    /** Node index */
    var index: js.UndefOr[Double | Null] = js.native
    
    /** Node originalFieldName */
    var originalFieldName: js.UndefOr[String | Null] = js.native
    
    /** Node parentType */
    var parentType: js.UndefOr[String | Null] = js.native
    
    /** Node responseName */
    var responseName: js.UndefOr[String | Null] = js.native
    
    /** Node startTime */
    var startTime: js.UndefOr[Double | Null] = js.native
    
    /** Node type */
    var `type`: js.UndefOr[String | Null] = js.native
  }
  object INode {
    
    @scala.inline
    def apply(): INode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INode]
    }
    
    @scala.inline
    implicit class INodeMutableBuilder[Self <: INode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachePolicy(value: ICachePolicy): Self = StObject.set(x, "cachePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachePolicyNull: Self = StObject.set(x, "cachePolicy", null)
      
      @scala.inline
      def setCachePolicyUndefined: Self = StObject.set(x, "cachePolicy", js.undefined)
      
      @scala.inline
      def setChild(value: js.Array[INode]): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildNull: Self = StObject.set(x, "child", null)
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setChildVarargs(value: INode*): Self = StObject.set(x, "child", js.Array(value :_*))
      
      @scala.inline
      def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeNull: Self = StObject.set(x, "endTime", null)
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setError(value: js.Array[IError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setErrorVarargs(value: IError*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNull: Self = StObject.set(x, "index", null)
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOriginalFieldName(value: String): Self = StObject.set(x, "originalFieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalFieldNameNull: Self = StObject.set(x, "originalFieldName", null)
      
      @scala.inline
      def setOriginalFieldNameUndefined: Self = StObject.set(x, "originalFieldName", js.undefined)
      
      @scala.inline
      def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTypeNull: Self = StObject.set(x, "parentType", null)
      
      @scala.inline
      def setParentTypeUndefined: Self = StObject.set(x, "parentType", js.undefined)
      
      @scala.inline
      def setResponseName(value: String): Self = StObject.set(x, "responseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseNameNull: Self = StObject.set(x, "responseName", null)
      
      @scala.inline
      def setResponseNameUndefined: Self = StObject.set(x, "responseName", js.undefined)
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeNull: Self = StObject.set(x, "startTime", null)
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of a QueryPlanNode. */
  @js.native
  trait IQueryPlanNode extends StObject {
    
    /** QueryPlanNode fetch */
    var fetch: js.UndefOr[IFetchNode | Null] = js.native
    
    /** QueryPlanNode flatten */
    var flatten: js.UndefOr[IFlattenNode | Null] = js.native
    
    /** QueryPlanNode parallel */
    var parallel: js.UndefOr[IParallelNode | Null] = js.native
    
    /** QueryPlanNode sequence */
    var sequence: js.UndefOr[ISequenceNode | Null] = js.native
  }
  object IQueryPlanNode {
    
    @scala.inline
    def apply(): IQueryPlanNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IQueryPlanNode]
    }
    
    @scala.inline
    implicit class IQueryPlanNodeMutableBuilder[Self <: IQueryPlanNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: IFetchNode): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchNull: Self = StObject.set(x, "fetch", null)
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setFlatten(value: IFlattenNode): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenNull: Self = StObject.set(x, "flatten", null)
      
      @scala.inline
      def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      @scala.inline
      def setParallel(value: IParallelNode): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelNull: Self = StObject.set(x, "parallel", null)
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setSequence(value: ISequenceNode): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNull: Self = StObject.set(x, "sequence", null)
      
      @scala.inline
      def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    }
  }
}
