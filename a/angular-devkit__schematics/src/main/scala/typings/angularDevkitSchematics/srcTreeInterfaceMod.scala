package typings.angularDevkitSchematics

import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.angularDevkitSchematics.anon.ReadonlyFileEntry
import typings.angularDevkitSchematics.srcTreeActionMod.Action
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTreeInterfaceMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/interface", "FileVisitorCancelToken")
  @js.native
  val FileVisitorCancelToken: js.Symbol = js.native
  
  @js.native
  sealed trait MergeStrategy extends StObject
  @JSImport("@angular-devkit/schematics/src/tree/interface", "MergeStrategy")
  @js.native
  object MergeStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MergeStrategy & Double] = js.native
    
    @js.native
    sealed trait AllowCreationConflict
      extends StObject
         with MergeStrategy
    /* 4 */ val AllowCreationConflict: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy.AllowCreationConflict & Double = js.native
    
    @js.native
    sealed trait AllowDeleteConflict
      extends StObject
         with MergeStrategy
    /* 8 */ val AllowDeleteConflict: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy.AllowDeleteConflict & Double = js.native
    
    @js.native
    sealed trait AllowOverwriteConflict
      extends StObject
         with MergeStrategy
    /* 2 */ val AllowOverwriteConflict: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy.AllowOverwriteConflict & Double = js.native
    
    @js.native
    sealed trait ContentOnly
      extends StObject
         with MergeStrategy
    /* 2 */ val ContentOnly: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy.ContentOnly & Double = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with MergeStrategy
    /* 0 */ val Default: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy.Default & Double = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with MergeStrategy
    /* 1 */ val Error: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy.Error & Double = js.native
    
    @js.native
    sealed trait Overwrite
      extends StObject
         with MergeStrategy
    /* 14 */ val Overwrite: typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy.Overwrite & Double = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/interface", "TreeSymbol")
  @js.native
  val TreeSymbol: js.Symbol = js.native
  
  trait DirEntry extends StObject {
    
    def dir(name: PathFragment): DirEntry
    
    def file(name: PathFragment): FileEntry | Null
    
    val parent: DirEntry | Null
    
    val path: Path_
    
    val subdirs: js.Array[PathFragment]
    
    val subfiles: js.Array[PathFragment]
    
    def visit(visitor: FileVisitor): Unit
  }
  object DirEntry {
    
    inline def apply(
      dir: PathFragment => DirEntry,
      file: PathFragment => FileEntry | Null,
      path: Path_,
      subdirs: js.Array[PathFragment],
      subfiles: js.Array[PathFragment],
      visit: FileVisitor => Unit
    ): DirEntry = {
      val __obj = js.Dynamic.literal(dir = js.Any.fromFunction1(dir), file = js.Any.fromFunction1(file), path = path.asInstanceOf[js.Any], subdirs = subdirs.asInstanceOf[js.Any], subfiles = subfiles.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit), parent = null)
      __obj.asInstanceOf[DirEntry]
    }
    
    extension [Self <: DirEntry](x: Self) {
      
      inline def setDir(value: PathFragment => DirEntry): Self = StObject.set(x, "dir", js.Any.fromFunction1(value))
      
      inline def setFile(value: PathFragment => FileEntry | Null): Self = StObject.set(x, "file", js.Any.fromFunction1(value))
      
      inline def setParent(value: DirEntry): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSubdirs(value: js.Array[PathFragment]): Self = StObject.set(x, "subdirs", value.asInstanceOf[js.Any])
      
      inline def setSubdirsVarargs(value: PathFragment*): Self = StObject.set(x, "subdirs", js.Array(value*))
      
      inline def setSubfiles(value: js.Array[PathFragment]): Self = StObject.set(x, "subfiles", value.asInstanceOf[js.Any])
      
      inline def setSubfilesVarargs(value: PathFragment*): Self = StObject.set(x, "subfiles", js.Array(value*))
      
      inline def setVisit(value: FileVisitor => Unit): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
    }
  }
  
  trait FileEntry extends StObject {
    
    val content: Buffer
    
    val path: Path_
  }
  object FileEntry {
    
    inline def apply(content: Buffer, path: Path_): FileEntry = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileEntry]
    }
    
    extension [Self <: FileEntry](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type FilePredicate[T] = js.Function2[/* path */ Path_, /* entry */ js.UndefOr[ReadonlyFileEntry | Null], T]
  
  type FileVisitor = FilePredicate[Unit]
  
  @js.native
  trait Tree extends StObject {
    
    val actions: js.Array[Action] = js.native
    
    @JSName("apply")
    def apply(action: Action): Unit = js.native
    @JSName("apply")
    def apply(action: Action, strategy: MergeStrategy): Unit = js.native
    
    def beginUpdate(path: String): UpdateRecorder = js.native
    
    def branch(): Tree = js.native
    
    def commitUpdate(record: UpdateRecorder): Unit = js.native
    
    def create(path: String, content: String): Unit = js.native
    def create(path: String, content: Buffer): Unit = js.native
    
    def delete(path: String): Unit = js.native
    
    def exists(path: String): Boolean = js.native
    
    def get(path: String): FileEntry | Null = js.native
    
    def getDir(path: String): DirEntry = js.native
    
    def merge(other: Tree): Unit = js.native
    def merge(other: Tree, strategy: MergeStrategy): Unit = js.native
    
    def overwrite(path: String, content: String): Unit = js.native
    def overwrite(path: String, content: Buffer): Unit = js.native
    
    def read(path: String): Buffer | Null = js.native
    
    /**
      * Reads and parses a file from the Tree as a UTF-8 encoded JSON file.
      * Supports parsing JSON (RFC 8259) with the following extensions:
      * * Single-line and multi-line JavaScript comments
      * * Trailing commas within objects and arrays
      *
      * @param path The path of the file to read.
      * @returns A JsonValue containing the parsed contents of the file.
      * @throws {@link FileDoesNotExistException} if the file is not found.
      * @throws An error if the file contains invalid UTF-8 characters.
      * @throws An error if the file contains malformed JSON.
      */
    def readJson(path: String): JsonValue = js.native
    
    /**
      * Reads a file from the Tree as a UTF-8 encoded text file.
      *
      * @param path The path of the file to read.
      * @returns A string containing the contents of the file.
      * @throws {@link FileDoesNotExistException} if the file is not found.
      * @throws An error if the file contains invalid UTF-8 characters.
      */
    def readText(path: String): String = js.native
    
    def rename(from: String, to: String): Unit = js.native
    
    val root: DirEntry = js.native
    
    def visit(visitor: FileVisitor): Unit = js.native
  }
  
  @js.native
  trait UpdateRecorder extends StObject {
    
    def insertLeft(index: Double, content: String): UpdateRecorder = js.native
    def insertLeft(index: Double, content: Buffer): UpdateRecorder = js.native
    
    def insertRight(index: Double, content: String): UpdateRecorder = js.native
    def insertRight(index: Double, content: Buffer): UpdateRecorder = js.native
    
    def remove(index: Double, length: Double): UpdateRecorder = js.native
  }
}
