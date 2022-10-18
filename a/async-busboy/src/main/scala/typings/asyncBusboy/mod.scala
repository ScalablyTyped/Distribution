package typings.asyncBusboy

import org.scalablytyped.runtime.StringDictionary
import typings.busboy.mod.FileInfo
import typings.busboy.mod.Limits
import typings.node.fsMod.ReadStream
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import typings.std.NonNullable
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(req: IncomingMessage): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def apply(req: IncomingMessage, options: OnFileOptions): js.Promise[OnFileResult] = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OnFileResult]]
  inline def apply(req: IncomingMessage, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("async-busboy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait FileReadStream extends ReadStream {
    
    var encoding: String = js.native
    
    var fieldname: String = js.native
    
    var filename: String = js.native
    
    var mime: String = js.native
    
    var mimeType: String = js.native
    
    var transferEncoding: String = js.native
  }
  
  /* Inlined async-busboy.async-busboy.WithRequiredProps<async-busboy.async-busboy.Options, 'onFile'> */
  trait OnFileOptions extends StObject {
    
    var defCharset: js.UndefOr[String] = js.undefined
    
    var defParamCharset: js.UndefOr[String] = js.undefined
    
    var fileHwm: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var limits: js.UndefOr[Limits] = js.undefined
    
    var onFile: NonNullable[
        js.UndefOr[
          js.Function3[/* name */ String, /* stream */ Readable, /* info */ FileInfo, Unit]
        ]
      ]
    
    var preservePath: js.UndefOr[Boolean] = js.undefined
  }
  object OnFileOptions {
    
    inline def apply(
      onFile: NonNullable[
          js.UndefOr[
            js.Function3[/* name */ String, /* stream */ Readable, /* info */ FileInfo, Unit]
          ]
        ]
    ): OnFileOptions = {
      val __obj = js.Dynamic.literal(onFile = onFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnFileOptions]
    }
    
    extension [Self <: OnFileOptions](x: Self) {
      
      inline def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
      
      inline def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
      
      inline def setDefParamCharset(value: String): Self = StObject.set(x, "defParamCharset", value.asInstanceOf[js.Any])
      
      inline def setDefParamCharsetUndefined: Self = StObject.set(x, "defParamCharset", js.undefined)
      
      inline def setFileHwm(value: Double): Self = StObject.set(x, "fileHwm", value.asInstanceOf[js.Any])
      
      inline def setFileHwmUndefined: Self = StObject.set(x, "fileHwm", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLimits(value: Limits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setOnFile(
        value: NonNullable[
              js.UndefOr[
                js.Function3[/* name */ String, /* stream */ Readable, /* info */ FileInfo, Unit]
              ]
            ]
      ): Self = StObject.set(x, "onFile", value.asInstanceOf[js.Any])
      
      inline def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      inline def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
    }
  }
  
  /* Inlined std.Omit<async-busboy.async-busboy.Result, 'files'> */
  trait OnFileResult extends StObject {
    
    var fields: StringDictionary[Any]
  }
  object OnFileResult {
    
    inline def apply(fields: StringDictionary[Any]): OnFileResult = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnFileResult]
    }
    
    extension [Self <: OnFileResult](x: Self) {
      
      inline def setFields(value: StringDictionary[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<busboy.busboy.BusboyConfig, 'headers'> */
  trait Options extends StObject {
    
    var defCharset: js.UndefOr[String] = js.undefined
    
    var defParamCharset: js.UndefOr[String] = js.undefined
    
    var fileHwm: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var limits: js.UndefOr[Limits] = js.undefined
    
    var onFile: js.UndefOr[
        js.Function3[/* name */ String, /* stream */ Readable, /* info */ FileInfo, Unit]
      ] = js.undefined
    
    var preservePath: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
      
      inline def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
      
      inline def setDefParamCharset(value: String): Self = StObject.set(x, "defParamCharset", value.asInstanceOf[js.Any])
      
      inline def setDefParamCharsetUndefined: Self = StObject.set(x, "defParamCharset", js.undefined)
      
      inline def setFileHwm(value: Double): Self = StObject.set(x, "fileHwm", value.asInstanceOf[js.Any])
      
      inline def setFileHwmUndefined: Self = StObject.set(x, "fileHwm", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLimits(value: Limits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setOnFile(value: (/* name */ String, /* stream */ Readable, /* info */ FileInfo) => Unit): Self = StObject.set(x, "onFile", js.Any.fromFunction3(value))
      
      inline def setOnFileUndefined: Self = StObject.set(x, "onFile", js.undefined)
      
      inline def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      inline def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var fields: StringDictionary[Any]
    
    var files: js.Array[FileReadStream]
  }
  object Result {
    
    inline def apply(fields: StringDictionary[Any], files: js.Array[FileReadStream]): Result = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setFields(value: StringDictionary[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[FileReadStream]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: FileReadStream*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  type WithRequiredProps[T /* <: js.Object */, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ MK in K ]: -? std.NonNullable<T[MK]>} */ js.Any)
}
