package typings.angularCore

import typings.std.Set
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsMigrationsTypedFormsUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/typed-forms/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core/schematics/migrations/typed-forms/util", "classes")
  @js.native
  val classes: Set[String] = js.native
  
  @JSImport("@angular/core/schematics/migrations/typed-forms/util", "formControl")
  @js.native
  val formControl: /* "FormControl" */ String = js.native
  
  @JSImport("@angular/core/schematics/migrations/typed-forms/util", "forms")
  @js.native
  val forms: /* "@angular/forms" */ String = js.native
  
  inline def migrateFile(sourceFile: SourceFile, typeChecker: TypeChecker, rewrite: rewriteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrateFile")(sourceFile.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any], rewrite.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@angular/core/schematics/migrations/typed-forms/util", "untypedPrefix")
  @js.native
  val untypedPrefix: /* "Untyped" */ String = js.native
  
  trait MigratableNode extends StObject {
    
    var importName: String
    
    var node: Node
  }
  object MigratableNode {
    
    inline def apply(importName: String, node: Node): MigratableNode = {
      val __obj = js.Dynamic.literal(importName = importName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigratableNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MigratableNode] (val x: Self) extends AnyVal {
      
      inline def setImportName(value: String): Self = StObject.set(x, "importName", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type rewriteFn = js.Function3[/* startPos */ Double, /* origLength */ Double, /* text */ String, Unit]
}
