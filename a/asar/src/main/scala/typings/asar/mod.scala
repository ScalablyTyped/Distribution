package typings.asar

import org.scalablytyped.runtime.StringDictionary
import typings.asar.anon.Stat
import typings.asar.asarBooleans.`true`
import typings.glob.mod.IOptions
import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createPackage(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackage")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def createPackageFromFiles(src: String, dest: String, filenames: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageFromFiles")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def createPackageFromFiles(src: String, dest: String, filenames: js.Array[String], metadata: Unit, options: CreateOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageFromFiles")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def createPackageFromFiles(src: String, dest: String, filenames: js.Array[String], metadata: InputMetadata): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageFromFiles")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def createPackageFromFiles(
    src: String,
    dest: String,
    filenames: js.Array[String],
    metadata: InputMetadata,
    options: CreateOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageFromFiles")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def createPackageWithOptions(src: String, dest: String, options: CreateOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPackageWithOptions")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def extractAll(archive: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extractAll")(archive.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def extractFile(archive: String, filename: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFile")(archive.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def listPackage(archive: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listPackage")(archive.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def listPackage(archive: String, options: ListOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("listPackage")(archive.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def statFile(archive: String, filename: String): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("statFile")(archive.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  @scala.inline
  def statFile(archive: String, filename: String, followLinks: Boolean): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("statFile")(archive.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], followLinks.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  @scala.inline
  def uncache(archive: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("uncache")(archive.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def uncacheAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uncacheAll")().asInstanceOf[Unit]
  
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
    
    @scala.inline
    def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      @scala.inline
      def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setTransform(value: /* filePath */ String => ReadWriteStream | Unit): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setUnpack(value: String): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpackDir(value: String): Self = StObject.set(x, "unpackDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpackDirUndefined: Self = StObject.set(x, "unpackDir", js.undefined)
      
      @scala.inline
      def setUnpackUndefined: Self = StObject.set(x, "unpack", js.undefined)
    }
  }
  
  trait DirectoryMetadata
    extends StObject
       with EntryMetadata
       with Metadata {
    
    var files: StringDictionary[EntryMetadata]
  }
  object DirectoryMetadata {
    
    @scala.inline
    def apply(files: StringDictionary[EntryMetadata], unpacked: Boolean): DirectoryMetadata = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryMetadata]
    }
    
    @scala.inline
    implicit class DirectoryMetadataMutableBuilder[Self <: DirectoryMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: StringDictionary[EntryMetadata]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntryMetadata extends StObject {
    
    var unpacked: Boolean
  }
  object EntryMetadata {
    
    @scala.inline
    def apply(unpacked: Boolean): EntryMetadata = {
      val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryMetadata]
    }
    
    @scala.inline
    implicit class EntryMetadataMutableBuilder[Self <: EntryMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnpacked(value: Boolean): Self = StObject.set(x, "unpacked", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(unpacked: Boolean): FileMetadata = {
      val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileMetadata]
    }
    
    @scala.inline
    implicit class FileMetadataMutableBuilder[Self <: FileMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutable(value: `true`): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
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
    
    @scala.inline
    def directory: typings.asar.asarStrings.directory = "directory".asInstanceOf[typings.asar.asarStrings.directory]
    
    @scala.inline
    def file: typings.asar.asarStrings.file = "file".asInstanceOf[typings.asar.asarStrings.file]
    
    @scala.inline
    def link: typings.asar.asarStrings.link = "link".asInstanceOf[typings.asar.asarStrings.link]
  }
  
  trait LinkMetadata
    extends StObject
       with Metadata {
    
    var link: String
  }
  object LinkMetadata {
    
    @scala.inline
    def apply(link: String): LinkMetadata = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkMetadata]
    }
    
    @scala.inline
    implicit class LinkMetadataMutableBuilder[Self <: LinkMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListOptions extends StObject {
    
    var isPack: Boolean
  }
  object ListOptions {
    
    @scala.inline
    def apply(isPack: Boolean): ListOptions = {
      val __obj = js.Dynamic.literal(isPack = isPack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListOptions]
    }
    
    @scala.inline
    implicit class ListOptionsMutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPack(value: Boolean): Self = StObject.set(x, "isPack", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.asar.mod.DirectoryMetadata
    - typings.asar.mod.FileMetadata
    - typings.asar.mod.LinkMetadata
  */
  trait Metadata extends StObject
  object Metadata {
    
    @scala.inline
    def DirectoryMetadata(files: StringDictionary[EntryMetadata], unpacked: Boolean): typings.asar.mod.DirectoryMetadata = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.asar.mod.DirectoryMetadata]
    }
    
    @scala.inline
    def FileMetadata(unpacked: Boolean): typings.asar.mod.FileMetadata = {
      val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.asar.mod.FileMetadata]
    }
    
    @scala.inline
    def LinkMetadata(link: String): typings.asar.mod.LinkMetadata = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.asar.mod.LinkMetadata]
    }
  }
}
