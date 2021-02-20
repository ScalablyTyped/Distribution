package typings.asar

import org.scalablytyped.runtime.StringDictionary
import typings.asar.anon.Stat
import typings.asar.asarBooleans.`true`
import typings.glob.mod.IOptions
import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asar", "createPackage")
  @js.native
  def createPackage(src: String, dest: String): js.Promise[Unit] = js.native
  
  @JSImport("asar", "createPackageFromFiles")
  @js.native
  def createPackageFromFiles(src: String, dest: String, filenames: js.Array[String]): js.Promise[Unit] = js.native
  @JSImport("asar", "createPackageFromFiles")
  @js.native
  def createPackageFromFiles(
    src: String,
    dest: String,
    filenames: js.Array[String],
    metadata: js.UndefOr[scala.Nothing],
    options: CreateOptions
  ): js.Promise[Unit] = js.native
  @JSImport("asar", "createPackageFromFiles")
  @js.native
  def createPackageFromFiles(src: String, dest: String, filenames: js.Array[String], metadata: InputMetadata): js.Promise[Unit] = js.native
  @JSImport("asar", "createPackageFromFiles")
  @js.native
  def createPackageFromFiles(
    src: String,
    dest: String,
    filenames: js.Array[String],
    metadata: InputMetadata,
    options: CreateOptions
  ): js.Promise[Unit] = js.native
  
  @JSImport("asar", "createPackageWithOptions")
  @js.native
  def createPackageWithOptions(src: String, dest: String, options: CreateOptions): js.Promise[Unit] = js.native
  
  @JSImport("asar", "extractAll")
  @js.native
  def extractAll(archive: String, dest: String): Unit = js.native
  
  @JSImport("asar", "extractFile")
  @js.native
  def extractFile(archive: String, filename: String): Buffer = js.native
  
  @JSImport("asar", "listPackage")
  @js.native
  def listPackage(archive: String): js.Array[String] = js.native
  @JSImport("asar", "listPackage")
  @js.native
  def listPackage(archive: String, options: ListOptions): js.Array[String] = js.native
  
  @JSImport("asar", "statFile")
  @js.native
  def statFile(archive: String, filename: String): Metadata = js.native
  @JSImport("asar", "statFile")
  @js.native
  def statFile(archive: String, filename: String, followLinks: Boolean): Metadata = js.native
  
  @JSImport("asar", "uncache")
  @js.native
  def uncache(archive: String): Boolean = js.native
  
  @JSImport("asar", "uncacheAll")
  @js.native
  def uncacheAll(): Unit = js.native
  
  @js.native
  trait CreateOptions extends StObject {
    
    var dot: js.UndefOr[Boolean] = js.native
    
    var globOptions: js.UndefOr[IOptions] = js.native
    
    var ordering: js.UndefOr[String] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var transform: js.UndefOr[js.Function1[/* filePath */ String, ReadWriteStream | Unit]] = js.native
    
    var unpack: js.UndefOr[String] = js.native
    
    var unpackDir: js.UndefOr[String] = js.native
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
  
  /* Inlined asar.asar.EntryMetadata & {  files :{[property: string] : asar.asar.EntryMetadata}} */
  @js.native
  trait DirectoryMetadata extends Metadata {
    
    var files: StringDictionary[EntryMetadata] = js.native
    
    var unpacked: Boolean = js.native
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
      
      @scala.inline
      def setUnpacked(value: Boolean): Self = StObject.set(x, "unpacked", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EntryMetadata extends StObject {
    
    var unpacked: Boolean = js.native
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
  
  /* Inlined asar.asar.EntryMetadata & {  executable :true | undefined,   offset :number | undefined,   size :number | undefined} */
  @js.native
  trait FileMetadata extends Metadata {
    
    var executable: js.UndefOr[`true`] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var unpacked: Boolean = js.native
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
      
      @scala.inline
      def setUnpacked(value: Boolean): Self = StObject.set(x, "unpacked", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait LinkMetadata extends Metadata {
    
    var link: String = js.native
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
  
  @js.native
  trait ListOptions extends StObject {
    
    var isPack: Boolean = js.native
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
