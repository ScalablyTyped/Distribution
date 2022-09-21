package typings.angularCompilerCli

import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.FileSystem
import typings.angularCompilerCli.srcUtilsMod.JsonObject
import typings.angularCompilerCli.srcUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writingPackageJsonUpdaterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/package_json_updater", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/package_json_updater", "DirectPackageJsonUpdater")
  @js.native
  open class DirectPackageJsonUpdater protected ()
    extends StObject
       with PackageJsonUpdater {
    def this(fs: FileSystem) = this()
    
    /* private */ var fs: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/package_json_updater", "PackageJsonUpdate")
  @js.native
  open class PackageJsonUpdate protected () extends StObject {
    def this(writeChangesImpl: WritePackageJsonChangesFn) = this()
    
    /**
      * Record a change to a `package.json` property.
      *
      * If the ancestor objects do not yet exist in the `package.json` file, they will be created. The
      * positioning of the property can also be specified. (If the property already exists, it will be
      * moved accordingly.)
      *
      * NOTE: Property positioning is only guaranteed to be respected in the serialized `package.json`
      *       file. Positioning will not be taken into account when updating in-memory representations.
      *
      * NOTE 2: Property positioning only affects the last property in `propertyPath`. Ancestor
      *         objects' positioning will not be affected.
      *
      * @param propertyPath The path of a (possibly nested) property to add/update.
      * @param value The new value to set the property to.
      * @param position The desired position for the added/updated property.
      */
    def addChange(propertyPath: js.Array[String], value: JsonValue): this.type = js.native
    def addChange(propertyPath: js.Array[String], value: JsonValue, positioning: PackageJsonPropertyPositioning): this.type = js.native
    
    /* private */ var applied: Any = js.native
    
    /* private */ var changes: Any = js.native
    
    /* private */ var ensureNotApplied: Any = js.native
    
    /* private */ var ensureNotSynthesized: Any = js.native
    
    /**
      * Write the recorded changes to the associated `package.json` file (and optionally a
      * pre-existing, in-memory representation of it).
      *
      * @param packageJsonPath The path to the `package.json` file that needs to be updated.
      * @param parsedJson A pre-existing, in-memory representation of the `package.json` file that
      *                   needs to be updated as well.
      */
    def writeChanges(packageJsonPath: AbsoluteFsPath): Unit = js.native
    def writeChanges(packageJsonPath: AbsoluteFsPath, parsedJson: JsonObject): Unit = js.native
    
    /* private */ var writeChangesImpl: Any = js.native
  }
  
  inline def applyChange(
    ctx: JsonObject,
    propPath: js.Array[String],
    value: JsonValue,
    positioning: PackageJsonPropertyPositioning
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChange")(ctx.asInstanceOf[js.Any], propPath.asInstanceOf[js.Any], value.asInstanceOf[js.Any], positioning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type PackageJsonChange = js.Tuple3[js.Array[String], Any, PackageJsonPropertyPositioning]
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.angularCompilerCliStrings.unimportant
    - typings.angularCompilerCli.angularCompilerCliStrings.alphabetic
    - typings.angularCompilerCli.anon.Before
  */
  trait PackageJsonPropertyPositioning extends StObject
  
  @js.native
  trait PackageJsonUpdater extends StObject {
    
    /**
      * Create a `PackageJsonUpdate` object, which provides a fluent API for batching updates to a
      * `package.json` file. (Batching the updates is useful, because it avoids unnecessary I/O
      * operations.)
      */
    def createUpdate(): PackageJsonUpdate = js.native
    
    /**
      * Write a set of changes to the specified `package.json` file (and optionally a pre-existing,
      * in-memory representation of it).
      *
      * @param changes The set of changes to apply.
      * @param packageJsonPath The path to the `package.json` file that needs to be updated.
      * @param parsedJson A pre-existing, in-memory representation of the `package.json` file that
      *                   needs to be updated as well.
      */
    def writeChanges(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath): Unit = js.native
    def writeChanges(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath, parsedJson: JsonObject): Unit = js.native
  }
  
  @js.native
  trait WritePackageJsonChangesFn extends StObject {
    
    def apply(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath): Unit = js.native
    def apply(changes: js.Array[PackageJsonChange], packageJsonPath: AbsoluteFsPath, parsedJson: JsonObject): Unit = js.native
  }
}
