package typings.archiver

import org.scalablytyped.runtime.Instantiable1
import typings.archiver.anon.PartialEntryData
import typings.archiver.anon.Processed
import typings.archiver.anon.ProcessedBytes
import typings.archiver.archiverBooleans.`false`
import typings.archiver.archiverStrings.close
import typings.archiver.archiverStrings.data
import typings.archiver.archiverStrings.drain
import typings.archiver.archiverStrings.entry
import typings.archiver.archiverStrings.error
import typings.archiver.archiverStrings.finish
import typings.archiver.archiverStrings.pipe
import typings.archiver.archiverStrings.progress
import typings.archiver.archiverStrings.unpipe
import typings.archiver.archiverStrings.warning
import typings.glob.mod.IOptions
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.zlibMod.ZlibOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(format: Format): Archiver = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Archiver]
  inline def apply(format: Format, options: ArchiverOptions): Archiver = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Archiver]
  
  @JSImport("archiver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("archiver", "ArchiverError")
  @js.native
  open class ArchiverError protected ()
    extends StObject
       with Error {
    def this(code: String, data: Any) = this()
    
    var code: String = js.native
    
    // Since archiver format support is modular, we cannot enumerate all possible error codes, as the modules can throw arbitrary ones.
    var data: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var path: js.UndefOr[Any] = js.native
  }
  
  inline def create(format: String): Archiver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(format.asInstanceOf[js.Any]).asInstanceOf[Archiver]
  inline def create(format: String, options: ArchiverOptions): Archiver = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Archiver]
  
  /** Check if the format is already registered. */
  inline def isRegisteredFormat(format: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegisteredFormat")(format.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // tslint:disable-next-line:ban-types Function
  inline def registerFormat(format: String, module: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(format.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Archiver extends Transform {
    
    def abort(): this.type = js.native
    
    def append(source: String): this.type = js.native
    def append(source: String, data: EntryData | TarEntryData): this.type = js.native
    def append(source: String, data: ZipEntryData): this.type = js.native
    def append(source: Buffer): this.type = js.native
    def append(source: Buffer, data: EntryData | TarEntryData): this.type = js.native
    def append(source: Buffer, data: ZipEntryData): this.type = js.native
    def append(source: Readable): this.type = js.native
    def append(source: Readable, data: EntryData | TarEntryData): this.type = js.native
    def append(source: Readable, data: ZipEntryData): this.type = js.native
    
    /** if false is passed for destpath, the path of a chunk of data in the archive is set to the root */
    def directory(dirpath: String, destpath: String): this.type = js.native
    def directory(dirpath: String, destpath: String, data: PartialEntryData): this.type = js.native
    def directory(dirpath: String, destpath: String, data: EntryDataFunction): this.type = js.native
    @JSName("directory")
    def directory_false(dirpath: String, destpath: `false`): this.type = js.native
    @JSName("directory")
    def directory_false(dirpath: String, destpath: `false`, data: PartialEntryData): this.type = js.native
    @JSName("directory")
    def directory_false(dirpath: String, destpath: `false`, data: EntryDataFunction): this.type = js.native
    
    def file(filename: String, data: EntryData): this.type = js.native
    
    def glob(pattern: String): this.type = js.native
    def glob(pattern: String, options: Unit, data: PartialEntryData): this.type = js.native
    def glob(pattern: String, options: IOptions): this.type = js.native
    def glob(pattern: String, options: IOptions, data: PartialEntryData): this.type = js.native
    
    def on(event: close | drain | finish, listener: js.Function0[Unit]): this.type = js.native
    def on(
      event: error | pipe | unpipe | warning,
      listener: js.Function1[(/* error */ ArchiverError) | (/* src */ Readable), Unit]
    ): this.type = js.native
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_entry(event: entry, listener: js.Function1[/* entry */ EntryData, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* progress */ ProgressData, Unit]): this.type = js.native
    
    def pointer(): Double = js.native
    
    def setFormat(format: String): this.type = js.native
    
    // tslint:disable-next-line:ban-types Function
    def setModule(module: js.Function): this.type = js.native
    
    def symlink(filepath: String, target: String): this.type = js.native
    def symlink(filepath: String, target: String, mode: Double): this.type = js.native
    
    // tslint:disable-next-line:ban-types Function
    def use(plugin: js.Function): this.type = js.native
  }
  
  trait ArchiverOptions
    extends StObject
       with CoreOptions
       with TransformOptions
       with ZipOptions
       with TarOptions
  object ArchiverOptions {
    
    inline def apply(): ArchiverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiverOptions]
    }
  }
  
  // tslint:disable-next-line:ban-types support for ConstructorFn function and classes
  type ConstructorFn[T] = js.Function | (Instantiable1[/* params (repeated) */ Any, T])
  
  trait CoreOptions extends StObject {
    
    var statConcurrency: js.UndefOr[Double] = js.undefined
  }
  object CoreOptions {
    
    inline def apply(): CoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoreOptions] (val x: Self) extends AnyVal {
      
      inline def setStatConcurrency(value: Double): Self = StObject.set(x, "statConcurrency", value.asInstanceOf[js.Any])
      
      inline def setStatConcurrencyUndefined: Self = StObject.set(x, "statConcurrency", js.undefined)
    }
  }
  
  trait EntryData extends StObject {
    
    /** Sets the entry date */
    var date: js.UndefOr[js.Date | String] = js.undefined
    
    /** Sets the entry permissions */
    var mode: js.UndefOr[Double] = js.undefined
    
    /** Sets the entry name including internal path */
    var name: String
    
    /**
      * Sets a path prefix for the entry name.
      * Useful when working with methods like `directory` or `glob`
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the fs stat data for this entry allowing
      * for reduction of fs stat calls when stat data is already known
      */
    var stats: js.UndefOr[Stats] = js.undefined
  }
  object EntryData {
    
    inline def apply(name: String): EntryData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntryData] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  /** A function that lets you either opt out of including an entry (by returning false), or modify the contents of an entry as it is added (by returning an EntryData) */
  type EntryDataFunction = js.Function1[/* entry */ EntryData, `false` | EntryData]
  
  /* Rewritten from type alias, can be one of: 
    - typings.archiver.archiverStrings.zip
    - typings.archiver.archiverStrings.tar
  */
  trait Format extends StObject
  object Format {
    
    inline def tar: typings.archiver.archiverStrings.tar = "tar".asInstanceOf[typings.archiver.archiverStrings.tar]
    
    inline def zip: typings.archiver.archiverStrings.zip = "zip".asInstanceOf[typings.archiver.archiverStrings.zip]
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ P in keyof T ]:? T[P]}
    }}}
    */
  type Partial[T] = T
  
  trait ProgressData extends StObject {
    
    var entries: Processed
    
    var fs: ProcessedBytes
  }
  object ProgressData {
    
    inline def apply(entries: Processed, fs: ProcessedBytes): ProgressData = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressData] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: Processed): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setFs(value: ProcessedBytes): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    }
  }
  
  type TarEntryData = EntryData
  
  trait TarOptions extends StObject {
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var gzipOptions: js.UndefOr[ZlibOptions] = js.undefined
  }
  object TarOptions {
    
    inline def apply(): TarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TarOptions] (val x: Self) extends AnyVal {
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipOptions(value: ZlibOptions): Self = StObject.set(x, "gzipOptions", value.asInstanceOf[js.Any])
      
      inline def setGzipOptionsUndefined: Self = StObject.set(x, "gzipOptions", js.undefined)
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    }
  }
  
  trait TransformOptions extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var objectmode: js.UndefOr[Boolean] = js.undefined
    
    var readableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    var writeableObjectMode: js.UndefOr[Boolean] = js.undefined
  }
  object TransformOptions {
    
    inline def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setObjectmode(value: Boolean): Self = StObject.set(x, "objectmode", value.asInstanceOf[js.Any])
      
      inline def setObjectmodeUndefined: Self = StObject.set(x, "objectmode", js.undefined)
      
      inline def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      inline def setWriteableObjectMode(value: Boolean): Self = StObject.set(x, "writeableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setWriteableObjectModeUndefined: Self = StObject.set(x, "writeableObjectMode", js.undefined)
    }
  }
  
  trait ZipEntryData
    extends StObject
       with EntryData {
    
    /** Sets the compression method to STORE */
    var store: js.UndefOr[Boolean] = js.undefined
  }
  object ZipEntryData {
    
    inline def apply(name: String): ZipEntryData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipEntryData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZipEntryData] (val x: Self) extends AnyVal {
      
      inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait ZipOptions extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var forceLocalTime: js.UndefOr[Boolean] = js.undefined
    
    var forceZip64: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var namePrependSlash: js.UndefOr[Boolean] = js.undefined
    
    var store: js.UndefOr[Boolean] = js.undefined
    
    var zlib: js.UndefOr[ZlibOptions] = js.undefined
  }
  object ZipOptions {
    
    inline def apply(): ZipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZipOptions] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setForceLocalTime(value: Boolean): Self = StObject.set(x, "forceLocalTime", value.asInstanceOf[js.Any])
      
      inline def setForceLocalTimeUndefined: Self = StObject.set(x, "forceLocalTime", js.undefined)
      
      inline def setForceZip64(value: Boolean): Self = StObject.set(x, "forceZip64", value.asInstanceOf[js.Any])
      
      inline def setForceZip64Undefined: Self = StObject.set(x, "forceZip64", js.undefined)
      
      inline def setNamePrependSlash(value: Boolean): Self = StObject.set(x, "namePrependSlash", value.asInstanceOf[js.Any])
      
      inline def setNamePrependSlashUndefined: Self = StObject.set(x, "namePrependSlash", js.undefined)
      
      inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setZlib(value: ZlibOptions): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
      
      inline def setZlibUndefined: Self = StObject.set(x, "zlib", js.undefined)
    }
  }
}
