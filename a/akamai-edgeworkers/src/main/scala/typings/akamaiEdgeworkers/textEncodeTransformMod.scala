package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import typings.akamaiEdgeworkers.streamsMod.WritableStream
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textEncodeTransformMod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("text-encode-transform", "TextDecoderStream")
  @js.native
  class TextDecoderStreamCls () extends TextDecoderStream {
    def this(label: String) = this()
    def this(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
    def this(label: String, options: TextDecoderOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("text-encode-transform", "TextEncoderStream")
  @js.native
  class TextEncoderStreamCls () extends TextEncoderStream
  
  type BufferSource = ArrayBufferView | ArrayBuffer
  
  @js.native
  trait GenericTransformStream extends StObject {
    
    /**
      * Returns a readable stream whose chunks are strings resulting from running encoding's decoder on the chunks written to writable.
      */
    val readable: ReadableStream[_] = js.native
    
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
    val writable: WritableStream[_] = js.native
  }
  object GenericTransformStream {
    
    @scala.inline
    def apply(readable: ReadableStream[_], writable: WritableStream[_]): GenericTransformStream = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericTransformStream]
    }
    
    @scala.inline
    implicit class GenericTransformStreamMutableBuilder[Self <: GenericTransformStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadable(value: ReadableStream[_]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: WritableStream[_]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextDecoderCommon extends StObject {
    
    /**
      * Returns encoding's name, lowercased.
      */
    val encoding: String = js.native
    
    /**
      * Returns true if error mode is "fatal", and false otherwise.
      */
    val fatal: Boolean = js.native
    
    /**
      * Returns true if ignore BOM flag is set, and false otherwise.
      */
    val ignoreBOM: Boolean = js.native
  }
  object TextDecoderCommon {
    
    @scala.inline
    def apply(encoding: String, fatal: Boolean, ignoreBOM: Boolean): TextDecoderCommon = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDecoderCommon]
    }
    
    @scala.inline
    implicit class TextDecoderCommonMutableBuilder[Self <: TextDecoderCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextDecoderOptions extends StObject {
    
    var fatal: js.UndefOr[Boolean] = js.native
    
    var ignoreBOM: js.UndefOr[Boolean] = js.native
  }
  object TextDecoderOptions {
    
    @scala.inline
    def apply(): TextDecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDecoderOptions]
    }
    
    @scala.inline
    implicit class TextDecoderOptionsMutableBuilder[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      @scala.inline
      def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
    }
  }
  
  @js.native
  trait TextDecoderStream
    extends GenericTransformStream
       with TextDecoderCommon {
    
    @JSName("readable")
    val readable_TextDecoderStream: ReadableStream[String] = js.native
    
    @JSName("writable")
    val writable_TextDecoderStream: WritableStream[BufferSource] = js.native
  }
  object TextDecoderStream {
    
    @scala.inline
    def apply(
      encoding: String,
      fatal: Boolean,
      ignoreBOM: Boolean,
      readable: ReadableStream[String],
      writable: WritableStream[BufferSource]
    ): TextDecoderStream = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDecoderStream]
    }
    
    @scala.inline
    implicit class TextDecoderStreamMutableBuilder[Self <: TextDecoderStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadable(value: ReadableStream[String]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: WritableStream[BufferSource]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextEncoderCommon extends StObject {
    
    /**
      * Returns "utf-8".
      */
    val encoding: String = js.native
  }
  object TextEncoderCommon {
    
    @scala.inline
    def apply(encoding: String): TextEncoderCommon = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextEncoderCommon]
    }
    
    @scala.inline
    implicit class TextEncoderCommonMutableBuilder[Self <: TextEncoderCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextEncoderStream
    extends GenericTransformStream
       with TextEncoderCommon {
    
    @JSName("readable")
    val readable_TextEncoderStream: ReadableStream[Uint8Array] = js.native
    
    @JSName("writable")
    val writable_TextEncoderStream: WritableStream[String] = js.native
  }
  object TextEncoderStream {
    
    @scala.inline
    def apply(encoding: String, readable: ReadableStream[Uint8Array], writable: WritableStream[String]): TextEncoderStream = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextEncoderStream]
    }
    
    @scala.inline
    implicit class TextEncoderStreamMutableBuilder[Self <: TextEncoderStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadable(value: ReadableStream[Uint8Array]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: WritableStream[String]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
}
