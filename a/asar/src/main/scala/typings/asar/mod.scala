package typings.asar

import org.scalablytyped.runtime.StringDictionary
import typings.asar.anon.Algorithm
import typings.asar.anon.Stat
import typings.asar.asarBooleans.`true`
import typings.glob.mod.IOptions
import typings.node.NodeJS.ReadWriteStream
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPackage(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackage")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def createPackageFromFiles(src: String, dest: String, filenames: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageFromFiles")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def createPackageFromFiles(src: String, dest: String, filenames: js.Array[String], metadata: Unit, options: CreateOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageFromFiles")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def createPackageFromFiles(src: String, dest: String, filenames: js.Array[String], metadata: InputMetadata): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageFromFiles")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def createPackageFromFiles(
    src: String,
    dest: String,
    filenames: js.Array[String],
    metadata: InputMetadata,
    options: CreateOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageFromFiles")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def createPackageWithOptions(src: String, dest: String, options: CreateOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageWithOptions")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def extractAll(archive: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extractAll")(archive.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extractFile(archive: String, filename: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFile")(archive.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def getRawHeader(archive: String): ArchiveHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawHeader")(archive.asInstanceOf[js.Any]).asInstanceOf[ArchiveHeader]
  
  inline def listPackage(archive: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listPackage")(archive.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def listPackage(archive: String, options: ListOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("listPackage")(archive.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def statFile(archive: String, filename: String): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("statFile")(archive.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  inline def statFile(archive: String, filename: String, followLinks: Boolean): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("statFile")(archive.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], followLinks.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  inline def uncache(archive: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("uncache")(archive.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def uncacheAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uncacheAll")().asInstanceOf[Unit]
  
  trait ArchiveHeader extends StObject {
    
    // The JSON parsed header string
    var header: DirectoryRecord
    
    var headerSize: Double
    
    var headerString: String
  }
  object ArchiveHeader {
    
    inline def apply(header: DirectoryRecord, headerSize: Double, headerString: String): ArchiveHeader = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], headerString = headerString.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArchiveHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArchiveHeader] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: DirectoryRecord): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderString(value: String): Self = StObject.set(x, "headerString", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateOptions extends StObject {
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var globOptions: js.UndefOr[IOptions] = js.undefined
    
    var ordering: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* filePath */ String, ReadWriteStream | Unit]] = js.undefined
    
    var unpack: js.UndefOr[String] = js.undefined
    
    var unpackDir: js.UndefOr[String] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      inline def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      inline def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setTransform(value: /* filePath */ String => ReadWriteStream | Unit): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUnpack(value: String): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
      
      inline def setUnpackDir(value: String): Self = StObject.set(x, "unpackDir", value.asInstanceOf[js.Any])
      
      inline def setUnpackDirUndefined: Self = StObject.set(x, "unpackDir", js.undefined)
      
      inline def setUnpackUndefined: Self = StObject.set(x, "unpack", js.undefined)
    }
  }
  
  trait DirectoryMetadata
    extends StObject
       with EntryMetadata
       with Metadata {
    
    var files: StringDictionary[EntryMetadata]
  }
  object DirectoryMetadata {
    
    inline def apply(files: StringDictionary[EntryMetadata], unpacked: Boolean): DirectoryMetadata = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryMetadata] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: StringDictionary[EntryMetadata]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryRecord extends StObject {
    
    var files: Record[String, DirectoryRecord | FileRecord]
  }
  object DirectoryRecord {
    
    inline def apply(files: Record[String, DirectoryRecord | FileRecord]): DirectoryRecord = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryRecord] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: Record[String, DirectoryRecord | FileRecord]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntryMetadata extends StObject {
    
    var unpacked: Boolean
  }
  object EntryMetadata {
    
    inline def apply(unpacked: Boolean): EntryMetadata = {
      val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntryMetadata] (val x: Self) extends AnyVal {
      
      inline def setUnpacked(value: Boolean): Self = StObject.set(x, "unpacked", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileMetadata
    extends StObject
       with EntryMetadata
       with Metadata {
    
    var executable: js.UndefOr[`true`] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object FileMetadata {
    
    inline def apply(unpacked: Boolean): FileMetadata = {
      val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileMetadata] (val x: Self) extends AnyVal {
      
      inline def setExecutable(value: `true`): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
      
      inline def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait FileRecord extends StObject {
    
    var executable: js.UndefOr[Boolean] = js.undefined
    
    var integrity: Algorithm
    
    var offset: String
    
    var size: Double
  }
  object FileRecord {
    
    inline def apply(integrity: Algorithm, offset: String, size: Double): FileRecord = {
      val __obj = js.Dynamic.literal(integrity = integrity.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileRecord] (val x: Self) extends AnyVal {
      
      inline def setExecutable(value: Boolean): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
      
      inline def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
      
      inline def setIntegrity(value: Algorithm): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type InputMetadata = StringDictionary[Stat]
  
  /* Rewritten from type alias, can be one of: 
    - typings.asar.asarStrings.directory
    - typings.asar.asarStrings.file
    - typings.asar.asarStrings.link
  */
  trait InputMetadataType extends StObject
  object InputMetadataType {
    
    inline def directory: typings.asar.asarStrings.directory = "directory".asInstanceOf[typings.asar.asarStrings.directory]
    
    inline def file: typings.asar.asarStrings.file = "file".asInstanceOf[typings.asar.asarStrings.file]
    
    inline def link: typings.asar.asarStrings.link = "link".asInstanceOf[typings.asar.asarStrings.link]
  }
  
  trait LinkMetadata
    extends StObject
       with Metadata {
    
    var link: String
  }
  object LinkMetadata {
    
    inline def apply(link: String): LinkMetadata = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkMetadata] (val x: Self) extends AnyVal {
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListOptions extends StObject {
    
    var isPack: Boolean
  }
  object ListOptions {
    
    inline def apply(isPack: Boolean): ListOptions = {
      val __obj = js.Dynamic.literal(isPack = isPack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
      
      inline def setIsPack(value: Boolean): Self = StObject.set(x, "isPack", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.asar.mod.DirectoryMetadata
    - typings.asar.mod.FileMetadata
    - typings.asar.mod.LinkMetadata
  */
  trait Metadata extends StObject
  object Metadata {
    
    inline def DirectoryMetadata(files: StringDictionary[EntryMetadata], unpacked: Boolean): typings.asar.mod.DirectoryMetadata = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.asar.mod.DirectoryMetadata]
    }
    
    inline def FileMetadata(unpacked: Boolean): typings.asar.mod.FileMetadata = {
      val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.asar.mod.FileMetadata]
    }
    
    inline def LinkMetadata(link: String): typings.asar.mod.LinkMetadata = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.asar.mod.LinkMetadata]
    }
  }
}
