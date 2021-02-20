package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.ITrace
import typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.IValues
import typings.apolloReportingProtobuf.protobufMod.Trace.ICachePolicy
import typings.apolloReportingProtobuf.protobufMod.Trace.IDetails
import typings.apolloReportingProtobuf.protobufMod.Trace.IError
import typings.apolloReportingProtobuf.protobufMod.Trace.IHTTP
import typings.apolloReportingProtobuf.protobufMod.Trace.ILocation
import typings.apolloReportingProtobuf.protobufMod.Trace.INode
import typings.apolloReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFetchNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFlattenNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IParallelNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IResponsePathElement
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ISequenceNode
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "Trace")
@js.native
/**
  * Constructs a new Trace.
  * @param [properties] Properties to set
  */
class Trace ()
  extends typings.apolloReportingProtobuf.protobufMod.Trace {
  def this(properties: ITrace) = this()
}
/* static members */
object Trace {
  
  /** Represents a CachePolicy. */
  @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy")
  @js.native
  /**
    * Constructs a new CachePolicy.
    * @param [properties] Properties to set
    */
  class CachePolicy ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy {
    def this(properties: ICachePolicy) = this()
  }
  object CachePolicy {
    
    /** Scope enum. */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.Scope")
    @js.native
    object Scope extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope with Double] = js.native
      
      /* 2 */ val PRIVATE: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PRIVATE with Double = js.native
      
      /* 1 */ val PUBLIC: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PUBLIC with Double = js.native
      
      /* 0 */ val UNKNOWN: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.UNKNOWN with Double = js.native
    }
    
    /**
      * Creates a new CachePolicy instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CachePolicy instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.create")
    @js.native
    def create(): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.create")
    @js.native
    def create(properties: ICachePolicy): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    
    /**
      * Decodes a CachePolicy message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.decode")
    @js.native
    def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.decode")
    @js.native
    def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    
    /**
      * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    
    /**
      * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.encode")
    @js.native
    def encode(message: ICachePolicy): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.encode")
    @js.native
    def encode(message: ICachePolicy, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICachePolicy): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICachePolicy, writer: Writer): Writer = js.native
    
    /**
      * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CachePolicy
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
    
    /**
      * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
      * @param message CachePolicy
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.toObject")
    @js.native
    def toObject(
      message: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a CachePolicy message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Details. */
  @JSImport("apollo-reporting-protobuf", "Trace.Details")
  @js.native
  /**
    * Constructs a new Details.
    * @param [properties] Properties to set
    */
  class Details ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.Details {
    def this(properties: IDetails) = this()
  }
  object Details {
    
    /**
      * Creates a new Details instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Details instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Details.create")
    @js.native
    def create(): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Details.create")
    @js.native
    def create(properties: IDetails): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    
    /**
      * Decodes a Details message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Details.decode")
    @js.native
    def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Details.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Details.decode")
    @js.native
    def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Details.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    
    /**
      * Decodes a Details message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Details.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Details.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    
    /**
      * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Details.encode")
    @js.native
    def encode(message: IDetails): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Details.encode")
    @js.native
    def encode(message: IDetails, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Details.encodeDelimited")
    @js.native
    def encodeDelimited(message: IDetails): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Details.encodeDelimited")
    @js.native
    def encodeDelimited(message: IDetails, writer: Writer): Writer = js.native
    
    /**
      * Creates a Details message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Details
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Details.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.Details = js.native
    
    /**
      * Creates a plain object from a Details message. Also converts values to other types if specified.
      * @param message Details
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Details.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Details): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Details.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Details, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Details message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Details.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents an Error. */
  @JSImport("apollo-reporting-protobuf", "Trace.Error")
  @js.native
  /**
    * Constructs a new Error.
    * @param [properties] Properties to set
    */
  class Error ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.Error {
    def this(properties: IError) = this()
  }
  object Error {
    
    /**
      * Creates a new Error instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Error instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Error.create")
    @js.native
    def create(): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Error.create")
    @js.native
    def create(properties: IError): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    
    /**
      * Decodes an Error message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Error.decode")
    @js.native
    def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Error.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Error.decode")
    @js.native
    def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Error.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    
    /**
      * Decodes an Error message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Error.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Error.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    
    /**
      * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Error.encode")
    @js.native
    def encode(message: IError): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Error.encode")
    @js.native
    def encode(message: IError, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Error.encodeDelimited")
    @js.native
    def encodeDelimited(message: IError): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Error.encodeDelimited")
    @js.native
    def encodeDelimited(message: IError, writer: Writer): Writer = js.native
    
    /**
      * Creates an Error message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Error
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Error.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.Error = js.native
    
    /**
      * Creates a plain object from an Error message. Also converts values to other types if specified.
      * @param message Error
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Error.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Error): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Error.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Error, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Error message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Error.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a HTTP. */
  @JSImport("apollo-reporting-protobuf", "Trace.HTTP")
  @js.native
  /**
    * Constructs a new HTTP.
    * @param [properties] Properties to set
    */
  class HTTP ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.HTTP {
    def this(properties: IHTTP) = this()
  }
  object HTTP {
    
    /** Method enum. */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Method")
    @js.native
    object Method extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method with Double] = js.native
      
      /* 8 */ val CONNECT: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.CONNECT with Double = js.native
      
      /* 6 */ val DELETE: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.DELETE with Double = js.native
      
      /* 2 */ val GET: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.GET with Double = js.native
      
      /* 3 */ val HEAD: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.HEAD with Double = js.native
      
      /* 1 */ val OPTIONS: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.OPTIONS with Double = js.native
      
      /* 9 */ val PATCH: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.PATCH with Double = js.native
      
      /* 4 */ val POST: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.POST with Double = js.native
      
      /* 5 */ val PUT: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.PUT with Double = js.native
      
      /* 7 */ val TRACE: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.TRACE with Double = js.native
      
      /* 0 */ val UNKNOWN: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.UNKNOWN with Double = js.native
    }
    
    /** Represents a Values. */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values")
    @js.native
    /**
      * Constructs a new Values.
      * @param [properties] Properties to set
      */
    class Values ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values {
      def this(properties: IValues) = this()
    }
    object Values {
      
      /**
        * Creates a new Values instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Values instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.create")
      @js.native
      def create(): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.create")
      @js.native
      def create(properties: IValues): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      
      /**
        * Decodes a Values message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.decode")
      @js.native
      def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.decode")
      @js.native
      def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      
      /**
        * Decodes a Values message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      
      /**
        * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.encode")
      @js.native
      def encode(message: IValues): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.encode")
      @js.native
      def encode(message: IValues, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.encodeDelimited")
      @js.native
      def encodeDelimited(message: IValues): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.encodeDelimited")
      @js.native
      def encodeDelimited(message: IValues, writer: Writer): Writer = js.native
      
      /**
        * Creates a Values message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Values
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = js.native
      
      /**
        * Creates a plain object from a Values message. Also converts values to other types if specified.
        * @param message Values
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.toObject")
      @js.native
      def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.toObject")
      @js.native
      def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Values message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /**
      * Creates a new HTTP instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HTTP instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.create")
    @js.native
    def create(): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.create")
    @js.native
    def create(properties: IHTTP): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    
    /**
      * Decodes a HTTP message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.decode")
    @js.native
    def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.decode")
    @js.native
    def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    
    /**
      * Decodes a HTTP message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    
    /**
      * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.encode")
    @js.native
    def encode(message: IHTTP): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.encode")
    @js.native
    def encode(message: IHTTP, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHTTP): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHTTP, writer: Writer): Writer = js.native
    
    /**
      * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HTTP
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = js.native
    
    /**
      * Creates a plain object from a HTTP message. Also converts values to other types if specified.
      * @param message HTTP
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a HTTP message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Location. */
  @JSImport("apollo-reporting-protobuf", "Trace.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.Location {
    def this(properties: ILocation) = this()
  }
  object Location {
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Location.create")
    @js.native
    def create(): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Location.create")
    @js.native
    def create(properties: ILocation): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Location.decode")
    @js.native
    def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Location.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Location.decode")
    @js.native
    def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Location.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Location.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Location.encode")
    @js.native
    def encode(message: ILocation): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Location.encode")
    @js.native
    def encode(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Location.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Location.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.Location = js.native
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Location.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Location): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Location.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Location, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Location.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Node. */
  @JSImport("apollo-reporting-protobuf", "Trace.Node")
  @js.native
  /**
    * Constructs a new Node.
    * @param [properties] Properties to set
    */
  class Node ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.Node {
    def this(properties: INode) = this()
  }
  object Node {
    
    /**
      * Creates a new Node instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Node instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Node.create")
    @js.native
    def create(): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Node.create")
    @js.native
    def create(properties: INode): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    
    /**
      * Decodes a Node message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Node.decode")
    @js.native
    def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Node.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Node.decode")
    @js.native
    def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Node.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    
    /**
      * Decodes a Node message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Node.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Node.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    
    /**
      * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Node.encode")
    @js.native
    def encode(message: INode): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Node.encode")
    @js.native
    def encode(message: INode, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Node.encodeDelimited")
    @js.native
    def encodeDelimited(message: INode): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Node.encodeDelimited")
    @js.native
    def encodeDelimited(message: INode, writer: Writer): Writer = js.native
    
    /**
      * Creates a Node message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Node
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Node.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.Node = js.native
    
    /**
      * Creates a plain object from a Node message. Also converts values to other types if specified.
      * @param message Node
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Node.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Node): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.Node.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Node, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Node message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.Node.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a QueryPlanNode. */
  @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode")
  @js.native
  /**
    * Constructs a new QueryPlanNode.
    * @param [properties] Properties to set
    */
  class QueryPlanNode ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode {
    def this(properties: IQueryPlanNode) = this()
  }
  object QueryPlanNode {
    
    /** Represents a FetchNode. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode")
    @js.native
    /**
      * Constructs a new FetchNode.
      * @param [properties] Properties to set
      */
    class FetchNode ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode {
      def this(properties: IFetchNode) = this()
    }
    object FetchNode {
      
      /**
        * Creates a new FetchNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FetchNode instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.create")
      @js.native
      def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.create")
      @js.native
      def create(properties: IFetchNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      
      /**
        * Decodes a FetchNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.decode")
      @js.native
      def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.decode")
      @js.native
      def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      
      /**
        * Decodes a FetchNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      
      /**
        * Encodes the specified FetchNode message. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.encode")
      @js.native
      def encode(message: IFetchNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.encode")
      @js.native
      def encode(message: IFetchNode, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified FetchNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFetchNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFetchNode, writer: Writer): Writer = js.native
      
      /**
        * Creates a FetchNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FetchNode
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = js.native
      
      /**
        * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
        * @param message FetchNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.toObject")
      @js.native
      def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.toObject")
      @js.native
      def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a FetchNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a FlattenNode. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode")
    @js.native
    /**
      * Constructs a new FlattenNode.
      * @param [properties] Properties to set
      */
    class FlattenNode ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode {
      def this(properties: IFlattenNode) = this()
    }
    object FlattenNode {
      
      /**
        * Creates a new FlattenNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FlattenNode instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.create")
      @js.native
      def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.create")
      @js.native
      def create(properties: IFlattenNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      
      /**
        * Decodes a FlattenNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.decode")
      @js.native
      def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.decode")
      @js.native
      def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      
      /**
        * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      
      /**
        * Encodes the specified FlattenNode message. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.encode")
      @js.native
      def encode(message: IFlattenNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.encode")
      @js.native
      def encode(message: IFlattenNode, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified FlattenNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFlattenNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IFlattenNode, writer: Writer): Writer = js.native
      
      /**
        * Creates a FlattenNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FlattenNode
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = js.native
      
      /**
        * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
        * @param message FlattenNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.toObject")
      @js.native
      def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.toObject")
      @js.native
      def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a FlattenNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a ParallelNode. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode")
    @js.native
    /**
      * Constructs a new ParallelNode.
      * @param [properties] Properties to set
      */
    class ParallelNode ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode {
      def this(properties: IParallelNode) = this()
    }
    object ParallelNode {
      
      /**
        * Creates a new ParallelNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ParallelNode instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.create")
      @js.native
      def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.create")
      @js.native
      def create(properties: IParallelNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      
      /**
        * Decodes a ParallelNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.decode")
      @js.native
      def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.decode")
      @js.native
      def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      
      /**
        * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      
      /**
        * Encodes the specified ParallelNode message. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.encode")
      @js.native
      def encode(message: IParallelNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.encode")
      @js.native
      def encode(message: IParallelNode, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified ParallelNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IParallelNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: IParallelNode, writer: Writer): Writer = js.native
      
      /**
        * Creates a ParallelNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ParallelNode
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = js.native
      
      /**
        * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
        * @param message ParallelNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.toObject")
      @js.native
      def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.toObject")
      @js.native
      def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a ParallelNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a ResponsePathElement. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement")
    @js.native
    /**
      * Constructs a new ResponsePathElement.
      * @param [properties] Properties to set
      */
    class ResponsePathElement ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement {
      def this(properties: IResponsePathElement) = this()
    }
    object ResponsePathElement {
      
      /**
        * Creates a new ResponsePathElement instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ResponsePathElement instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.create")
      @js.native
      def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.create")
      @js.native
      def create(properties: IResponsePathElement): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.decode")
      @js.native
      def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.decode")
      @js.native
      def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      
      /**
        * Encodes the specified ResponsePathElement message. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.encode")
      @js.native
      def encode(message: IResponsePathElement): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.encode")
      @js.native
      def encode(message: IResponsePathElement, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified ResponsePathElement message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.encodeDelimited")
      @js.native
      def encodeDelimited(message: IResponsePathElement): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.encodeDelimited")
      @js.native
      def encodeDelimited(message: IResponsePathElement, writer: Writer): Writer = js.native
      
      /**
        * Creates a ResponsePathElement message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ResponsePathElement
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = js.native
      
      /**
        * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
        * @param message ResponsePathElement
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.toObject")
      @js.native
      def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.toObject")
      @js.native
      def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a ResponsePathElement message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a SequenceNode. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode")
    @js.native
    /**
      * Constructs a new SequenceNode.
      * @param [properties] Properties to set
      */
    class SequenceNode ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode {
      def this(properties: ISequenceNode) = this()
    }
    object SequenceNode {
      
      /**
        * Creates a new SequenceNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SequenceNode instance
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.create")
      @js.native
      def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.create")
      @js.native
      def create(properties: ISequenceNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      
      /**
        * Decodes a SequenceNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.decode")
      @js.native
      def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.decode")
      @js.native
      def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      
      /**
        * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      
      /**
        * Encodes the specified SequenceNode message. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.encode")
      @js.native
      def encode(message: ISequenceNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.encode")
      @js.native
      def encode(message: ISequenceNode, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified SequenceNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISequenceNode): Writer = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISequenceNode, writer: Writer): Writer = js.native
      
      /**
        * Creates a SequenceNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SequenceNode
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = js.native
      
      /**
        * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
        * @param message SequenceNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.toObject")
      @js.native
      def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode): StringDictionary[js.Any] = js.native
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.toObject")
      @js.native
      def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a SequenceNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /**
      * Creates a new QueryPlanNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns QueryPlanNode instance
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.create")
    @js.native
    def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.create")
    @js.native
    def create(properties: IQueryPlanNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.decode")
    @js.native
    def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.decode")
    @js.native
    def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    
    /**
      * Encodes the specified QueryPlanNode message. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.encode")
    @js.native
    def encode(message: IQueryPlanNode): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.encode")
    @js.native
    def encode(message: IQueryPlanNode, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified QueryPlanNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.encodeDelimited")
    @js.native
    def encodeDelimited(message: IQueryPlanNode): Writer = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.encodeDelimited")
    @js.native
    def encodeDelimited(message: IQueryPlanNode, writer: Writer): Writer = js.native
    
    /**
      * Creates a QueryPlanNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns QueryPlanNode
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = js.native
    
    /**
      * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
      * @param message QueryPlanNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.toObject")
    @js.native
    def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode): StringDictionary[js.Any] = js.native
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.toObject")
    @js.native
    def toObject(
      message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a QueryPlanNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new Trace instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Trace instance
    */
  @JSImport("apollo-reporting-protobuf", "Trace.create")
  @js.native
  def create(): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  @JSImport("apollo-reporting-protobuf", "Trace.create")
  @js.native
  def create(properties: ITrace): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  
  /**
    * Decodes a Trace message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "Trace.decode")
  @js.native
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  @JSImport("apollo-reporting-protobuf", "Trace.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  @JSImport("apollo-reporting-protobuf", "Trace.decode")
  @js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  @JSImport("apollo-reporting-protobuf", "Trace.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  
  /**
    * Decodes a Trace message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "Trace.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  @JSImport("apollo-reporting-protobuf", "Trace.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  
  /**
    * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "Trace.encode")
  @js.native
  def encode(message: ITrace): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "Trace.encode")
  @js.native
  def encode(message: ITrace, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "Trace.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITrace): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "Trace.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITrace, writer: Writer): Writer = js.native
  
  /**
    * Creates a Trace message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Trace
    */
  @JSImport("apollo-reporting-protobuf", "Trace.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace = js.native
  
  /**
    * Creates a plain object from a Trace message. Also converts values to other types if specified.
    * @param message Trace
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "Trace.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "Trace.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Trace message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "Trace.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
