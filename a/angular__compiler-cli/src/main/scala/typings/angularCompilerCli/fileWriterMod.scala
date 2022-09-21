package typings.angularCompilerCli

import typings.angularCompilerCli.entryPointBundleMod.EntryPointBundle
import typings.angularCompilerCli.entryPointMod.EntryPoint
import typings.angularCompilerCli.entryPointMod.EntryPointJsonProperty
import typings.angularCompilerCli.renderingUtilsMod.FileToWrite
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileWriterMod {
  
  trait FileWriter extends StObject {
    
    /**
      * Revert the changes to an entry-point processed for the specified format-properties by the same
      * `FileWriter` implementation.
      *
      * @param entryPoint The entry-point to revert.
      * @param transformedFilePaths The original paths of the transformed files. (The transformed files
      *     may be written at the same or a different location, depending on the `FileWriter`
      *     implementation.)
      * @param formatProperties The format-properties pointing to the entry-point.
      */
    def revertBundle(
      entryPoint: EntryPoint,
      transformedFilePaths: js.Array[AbsoluteFsPath],
      formatProperties: js.Array[EntryPointJsonProperty]
    ): Unit
    
    def writeBundle(
      bundle: EntryPointBundle,
      transformedFiles: js.Array[FileToWrite],
      formatProperties: js.Array[EntryPointJsonProperty]
    ): Unit
  }
  object FileWriter {
    
    inline def apply(
      revertBundle: (EntryPoint, js.Array[AbsoluteFsPath], js.Array[EntryPointJsonProperty]) => Unit,
      writeBundle: (EntryPointBundle, js.Array[FileToWrite], js.Array[EntryPointJsonProperty]) => Unit
    ): FileWriter = {
      val __obj = js.Dynamic.literal(revertBundle = js.Any.fromFunction3(revertBundle), writeBundle = js.Any.fromFunction3(writeBundle))
      __obj.asInstanceOf[FileWriter]
    }
    
    extension [Self <: FileWriter](x: Self) {
      
      inline def setRevertBundle(value: (EntryPoint, js.Array[AbsoluteFsPath], js.Array[EntryPointJsonProperty]) => Unit): Self = StObject.set(x, "revertBundle", js.Any.fromFunction3(value))
      
      inline def setWriteBundle(value: (EntryPointBundle, js.Array[FileToWrite], js.Array[EntryPointJsonProperty]) => Unit): Self = StObject.set(x, "writeBundle", js.Any.fromFunction3(value))
    }
  }
}
