package typings.archiver

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
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
import typings.node.Buffer
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.zlibMod.ZlibOptions
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("archiver", JSImport.Namespace)
  @js.native
  def apply(format: Format): Archiver = js.native
  @JSImport("archiver", JSImport.Namespace)
  @js.native
  def apply(format: Format, options: ArchiverOptions): Archiver = js.native
  
  @JSImport("archiver", "ArchiverError")
  @js.native
  class ArchiverError protected () extends Error {
    def this(code: String, data: js.Any) = this()
    
    var code: String = js.native
    
    // Since archiver format support is modular, we cannot enumerate all possible error codes, as the modules can throw arbitrary ones.
    var data: js.Any = js.native
    
    var path: js.UndefOr[js.Any] = js.native
  }
  
  @JSImport("archiver", "create")
  @js.native
  def create(format: String): Archiver = js.native
  @JSImport("archiver", "create")
  @js.native
  def create(format: String, options: ArchiverOptions): Archiver = js.native
  
  /** Check if the format is already registered. */
  @JSImport("archiver", "isRegisteredFormat")
  @js.native
  def isRegisteredFormat(format: String): Boolean = js.native
  
  @JSImport("archiver", "registerFormat")
  @js.native
  def registerFormat(format: String, module: js.Function): Unit = js.native
  
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
    
    def directory(dirpath: String, destpath: String): this.type = js.native
    def directory(dirpath: String, destpath: String, data: PartialEntryData): this.type = js.native
    def directory(dirpath: String, destpath: String, data: EntryDataFunction): this.type = js.native
    /** if false is passed for destpath, the path of a chunk of data in the archive is set to the root */
    @JSName("directory")
    def directory_false(dirpath: String, destpath: `false`): this.type = js.native
    @JSName("directory")
    def directory_false(dirpath: String, destpath: `false`, data: PartialEntryData): this.type = js.native
    @JSName("directory")
    def directory_false(dirpath: String, destpath: `false`, data: EntryDataFunction): this.type = js.native
    
    def file(filename: String, data: EntryData): this.type = js.native
    
    def glob(pattern: String): this.type = js.native
    def glob(pattern: String, options: js.UndefOr[scala.Nothing], data: PartialEntryData): this.type = js.native
    def glob(pattern: String, options: IOptions): this.type = js.native
    def glob(pattern: String, options: IOptions, data: PartialEntryData): this.type = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_entry(event: entry, listener: js.Function1[/* entry */ EntryData, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ ArchiverError, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* progress */ ProgressData, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_warning(event: warning, listener: js.Function1[/* error */ ArchiverError, Unit]): this.type = js.native
    
    def pointer(): Double = js.native
    
    def setFormat(format: String): this.type = js.native
    
    def setModule(module: js.Function): this.type = js.native
    
    def symlink(filepath: String, target: String): this.type = js.native
    def symlink(filepath: String, target: String, mode: Double): this.type = js.native
    
    def use(plugin: js.Function): this.type = js.native
  }
  
  type ArchiverOptions = CoreOptions with TransformOptions with ZipOptions with TarOptions
  
  // tslint:disable-next-line:ban-types support for ConstructorFn function and classes
  type ConstructorFn[T] = js.Function | (Instantiable1[/* params (repeated) */ js.Any, T])
  
  @js.native
  trait CoreOptions extends StObject {
    
    var statConcurrency: js.UndefOr[Double] = js.native
  }
  object CoreOptions {
    
    @scala.inline
    def apply(): CoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreOptions]
    }
    
    @scala.inline
    implicit class CoreOptionsMutableBuilder[Self <: CoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatConcurrency(value: Double): Self = StObject.set(x, "statConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatConcurrencyUndefined: Self = StObject.set(x, "statConcurrency", js.undefined)
    }
  }
  
  @js.native
  trait EntryData extends StObject {
    
    /** Sets the entry date */
    var date: js.UndefOr[Date | String] = js.native
    
    /** Sets the entry permissions */
    var mode: js.UndefOr[Double] = js.native
    
    /** Sets the entry name including internal path */
    var name: String = js.native
    
    /**
      * Sets a path prefix for the entry name.
      * Useful when working with methods like `directory` or `glob`
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Sets the fs stat data for this entry allowing
      * for reduction of fs stat calls when stat data is already known
      */
    var stats: js.UndefOr[Stats] = js.native
  }
  object EntryData {
    
    @scala.inline
    def apply(name: String): EntryData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryData]
    }
    
    @scala.inline
    implicit class EntryDataMutableBuilder[Self <: EntryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
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
    
    @scala.inline
    def tar: typings.archiver.archiverStrings.tar = "tar".asInstanceOf[typings.archiver.archiverStrings.tar]
    
    @scala.inline
    def zip: typings.archiver.archiverStrings.zip = "zip".asInstanceOf[typings.archiver.archiverStrings.zip]
  }
  
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.archiver.archiverStrings.Partial with TopLevel[T]
  
  @js.native
  trait ProgressData extends StObject {
    
    var entries: Processed = js.native
    
    var fs: ProcessedBytes = js.native
  }
  object ProgressData {
    
    @scala.inline
    def apply(entries: Processed, fs: ProcessedBytes): ProgressData = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressData]
    }
    
    @scala.inline
    implicit class ProgressDataMutableBuilder[Self <: ProgressData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: Processed): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFs(value: ProcessedBytes): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    }
  }
  
  type TarEntryData = EntryData
  
  @js.native
  trait TarOptions extends StObject {
    
    var gzip: js.UndefOr[Boolean] = js.native
    
    var gzipOptions: js.UndefOr[ZlibOptions] = js.native
  }
  object TarOptions {
    
    @scala.inline
    def apply(): TarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TarOptions]
    }
    
    @scala.inline
    implicit class TarOptionsMutableBuilder[Self <: TarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipOptions(value: ZlibOptions): Self = StObject.set(x, "gzipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipOptionsUndefined: Self = StObject.set(x, "gzipOptions", js.undefined)
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    }
  }
  
  @js.native
  trait TransformOptions extends StObject {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.native
    
    var decodeStrings: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var objectmode: js.UndefOr[Boolean] = js.native
    
    var readableObjectMode: js.UndefOr[Boolean] = js.native
    
    var writeableObjectMode: js.UndefOr[Boolean] = js.native
  }
  object TransformOptions {
    
    @scala.inline
    def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      @scala.inline
      def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setObjectmode(value: Boolean): Self = StObject.set(x, "objectmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectmodeUndefined: Self = StObject.set(x, "objectmode", js.undefined)
      
      @scala.inline
      def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      @scala.inline
      def setWriteableObjectMode(value: Boolean): Self = StObject.set(x, "writeableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteableObjectModeUndefined: Self = StObject.set(x, "writeableObjectMode", js.undefined)
    }
  }
  
  @js.native
  trait ZipEntryData extends EntryData {
    
    /** Sets the compression method to STORE */
    var store: js.UndefOr[Boolean] = js.native
  }
  object ZipEntryData {
    
    @scala.inline
    def apply(name: String): ZipEntryData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipEntryData]
    }
    
    @scala.inline
    implicit class ZipEntryDataMutableBuilder[Self <: ZipEntryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  @js.native
  trait ZipOptions extends StObject {
    
    var comment: js.UndefOr[String] = js.native
    
    var forceLocalTime: js.UndefOr[Boolean] = js.native
    
    var forceZip64: js.UndefOr[Boolean] = js.native
    
    var store: js.UndefOr[Boolean] = js.native
    
    var zlib: js.UndefOr[ZlibOptions] = js.native
  }
  object ZipOptions {
    
    @scala.inline
    def apply(): ZipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZipOptions]
    }
    
    @scala.inline
    implicit class ZipOptionsMutableBuilder[Self <: ZipOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setForceLocalTime(value: Boolean): Self = StObject.set(x, "forceLocalTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceLocalTimeUndefined: Self = StObject.set(x, "forceLocalTime", js.undefined)
      
      @scala.inline
      def setForceZip64(value: Boolean): Self = StObject.set(x, "forceZip64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceZip64Undefined: Self = StObject.set(x, "forceZip64", js.undefined)
      
      @scala.inline
      def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setZlib(value: ZlibOptions): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZlibUndefined: Self = StObject.set(x, "zlib", js.undefined)
    }
  }
}
