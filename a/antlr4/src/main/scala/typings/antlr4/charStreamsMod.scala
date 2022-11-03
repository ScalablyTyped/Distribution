package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object charStreamsMod {
  
  object default {
    
    @JSImport("antlr4/CharStreams", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously creates an InputStream from a blob given the
      * encoding of the bytes in that blob (defaults to 'utf8' if
      * encoding is null).
      *
      * Invokes onLoad(result) on success, onError(error) on
      * failure.
      */
    inline def fromBlob(
      blob: Any,
      encoding: String,
      onLoad: js.Function1[/* is */ typings.antlr4.inputStreamMod.default, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlob")(blob.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromBlob(
      blob: Any,
      encoding: String,
      onLoad: js.Function1[/* is */ typings.antlr4.inputStreamMod.default, Unit],
      onError: js.Function1[/* event */ Any, Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBlob")(blob.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates an InputStream from a Buffer given the
      * encoding of the bytes in that buffer (defaults to 'utf8' if
      * encoding is null).
      */
    inline def fromBuffer(buffer: Any, encoding: String): typings.antlr4.inputStreamMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typings.antlr4.inputStreamMod.default]
    
    /**
      * Asynchronously creates an InputStream from a file on disk given
      * the encoding of the bytes in that file (defaults to 'utf8' if
      * encoding is null).
      *
      * Invokes callback(error, result) on completion.
      */
    inline def fromPath(
      path: Any,
      encoding: String,
      callback: js.Function2[/* err */ Any, /* is */ typings.antlr4.inputStreamMod.default, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Synchronously creates an InputStream given a path to a file
      * on disk and the encoding of the bytes in that file (defaults to
      * 'utf8' if encoding is null).
      */
    inline def fromPathSync(path: Any, encoding: String): typings.antlr4.inputStreamMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPathSync")(path.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typings.antlr4.inputStreamMod.default]
    
    /**
      * Creates an InputStream from a string.
      */
    inline def fromString(str: String): typings.antlr4.inputStreamMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.antlr4.inputStreamMod.default]
  }
}
