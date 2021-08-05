package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import typings.akamaiEdgeworkers.streamsMod.WritableStream
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textEncodeTransformMod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("text-encode-transform", "TextDecoderStream")
  @js.native
  class TextDecoderStreamCls ()
    extends StObject
       with TextDecoderStream {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
    
    /**
      * Returns encoding's name, lowercased.
      */
    /* CompleteClass */
    override val encoding: String = js.native
    
    /**
      * Returns true if error mode is "fatal", and false otherwise.
      */
    /* CompleteClass */
    override val fatal: Boolean = js.native
    
    /**
      * Returns true if ignore BOM flag is set, and false otherwise.
      */
    /* CompleteClass */
    override val ignoreBOM: Boolean = js.native
    
    /**
      * Returns a readable stream whose chunks are strings resulting from running encoding's decoder on the chunks written to writable.
      */
    /* CompleteClass */
    override val readable: ReadableStream[js.Any] = js.native
    /* CompleteClass */
    @JSName("readable")
    override val readable_TextDecoderStream: ReadableStream[String] = js.native
    
    /**
      * Returns a writable stream which accepts [AllowShared] BufferSource chunks and runs them through encoding's decoder before making them available to readable.
      *
      * Typically this will be used via the pipeThrough() method on a ReadableStream source.
      *
      * ```
      * var decoder = new TextDecoderStream(encoding);
      * byteReadable
      *   .pipeThrough(decoder)
      *   .pipeTo(textWritable);
      * ```
      *
      * If the error mode is "fatal" and encoding's decoder returns error, both readable and writable will be errored with a TypeError.
      */
    /* CompleteClass */
    override val writable: WritableStream[js.Any] = js.native
    /* CompleteClass */
    @JSName("writable")
    override val writable_TextDecoderStream: WritableStream[BufferSource] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("text-encode-transform", "TextEncoderStream")
  @js.native
  class TextEncoderStreamCls ()
    extends StObject
       with TextEncoderStream {
    
    /**
      * Returns "utf-8".
      */
    /* CompleteClass */
    override val encoding: String = js.native
    
    /**
      * Returns a readable stream whose chunks are strings resulting from running encoding's decoder on the chunks written to writable.
      */
    /* CompleteClass */
    override val readable: ReadableStream[js.Any] = js.native
    /* CompleteClass */
    @JSName("readable")
    override val readable_TextEncoderStream: ReadableStream[Uint8Array] = js.native
    
    /**
      * Returns a writable stream which accepts [AllowShared] BufferSource chunks and runs them through encoding's decoder before making them available to readable.
      *
      * Typically this will be used via the pipeThrough() method on a ReadableStream source.
      *
      * ```
      * var decoder = new TextDecoderStream(encoding);
      * byteReadable
      *   .pipeThrough(decoder)
      *   .pipeTo(textWritable);
      * ```
      *
      * If the error mode is "fatal" and encoding's decoder returns error, both readable and writable will be errored with a TypeError.
      */
    /* CompleteClass */
    override val writable: WritableStream[js.Any] = js.native
    /* CompleteClass */
    @JSName("writable")
    override val writable_TextEncoderStream: WritableStream[String] = js.native
  }
  
  type BufferSource = ArrayBufferView | ArrayBuffer
  
  trait GenericTransformStream extends StObject {
    
    /**
      * Returns a readable stream whose chunks are strings resulting from running encoding's decoder on the chunks written to writable.
      */
    val readable: ReadableStream[js.Any]
    
    /**
      * Returns a writable stream which accepts [AllowShared] BufferSource chunks and runs them through encoding's decoder before making them available to readable.
      *
      * Typically this will be used via the pipeThrough() method on a ReadableStream source.
      *
      * ```
      * var decoder = new TextDecoderStream(encoding);
      * byteReadable
      *   .pipeThrough(decoder)
      *   .pipeTo(textWritable);
      * ```
      *
      * If the error mode is "fatal" and encoding's decoder returns error, both readable and writable will be errored with a TypeError.
      */
    val writable: WritableStream[js.Any]
  }
  object GenericTransformStream {
    
    inline def apply(readable: ReadableStream[js.Any], writable: WritableStream[js.Any]): GenericTransformStream = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericTransformStream]
    }
    
    extension [Self <: GenericTransformStream](x: Self) {
      
      inline def setReadable(value: ReadableStream[js.Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: WritableStream[js.Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextDecoderCommon extends StObject {
    
    /**
      * Returns encoding's name, lowercased.
      */
    val encoding: String
    
    /**
      * Returns true if error mode is "fatal", and false otherwise.
      */
    val fatal: Boolean
    
    /**
      * Returns true if ignore BOM flag is set, and false otherwise.
      */
    val ignoreBOM: Boolean
  }
  object TextDecoderCommon {
    
    inline def apply(encoding: String, fatal: Boolean, ignoreBOM: Boolean): TextDecoderCommon = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDecoderCommon]
    }
    
    extension [Self <: TextDecoderCommon](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextDecoderOptions extends StObject {
    
    var fatal: js.UndefOr[Boolean] = js.undefined
    
    var ignoreBOM: js.UndefOr[Boolean] = js.undefined
  }
  object TextDecoderOptions {
    
    inline def apply(): TextDecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDecoderOptions]
    }
    
    extension [Self <: TextDecoderOptions](x: Self) {
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
    }
  }
  
  trait TextDecoderStream
    extends StObject
       with GenericTransformStream
       with TextDecoderCommon {
    
    @JSName("readable")
    val readable_TextDecoderStream: ReadableStream[String]
    
    @JSName("writable")
    val writable_TextDecoderStream: WritableStream[BufferSource]
  }
  object TextDecoderStream {
    
    inline def apply(
      encoding: String,
      fatal: Boolean,
      ignoreBOM: Boolean,
      readable: ReadableStream[String],
      writable: WritableStream[BufferSource]
    ): TextDecoderStream = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDecoderStream]
    }
    
    extension [Self <: TextDecoderStream](x: Self) {
      
      inline def setReadable(value: ReadableStream[String]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: WritableStream[BufferSource]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextEncoderCommon extends StObject {
    
    /**
      * Returns "utf-8".
      */
    val encoding: String
  }
  object TextEncoderCommon {
    
    inline def apply(encoding: String): TextEncoderCommon = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextEncoderCommon]
    }
    
    extension [Self <: TextEncoderCommon](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextEncoderStream
    extends StObject
       with GenericTransformStream
       with TextEncoderCommon {
    
    @JSName("readable")
    val readable_TextEncoderStream: ReadableStream[Uint8Array]
    
    @JSName("writable")
    val writable_TextEncoderStream: WritableStream[String]
  }
  object TextEncoderStream {
    
    inline def apply(encoding: String, readable: ReadableStream[Uint8Array], writable: WritableStream[String]): TextEncoderStream = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextEncoderStream]
    }
    
    extension [Self <: TextEncoderStream](x: Self) {
      
      inline def setReadable(value: ReadableStream[Uint8Array]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: WritableStream[String]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
}
