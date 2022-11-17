package typings.angularCore

import typings.typescript.mod.ObjectLiteralElementLike
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsMigrationsRelativeLinkResolutionUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/relative-link-resolution/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def migrateFile(sourceFile: SourceFile, rewriteFn: RewriteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrateFile")(sourceFile.asInstanceOf[js.Any], rewriteFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MigratableNode extends StObject {
    
    var objectLiteral: ObjectLiteralExpression
    
    var property: ObjectLiteralElementLike
  }
  object MigratableNode {
    
    inline def apply(objectLiteral: ObjectLiteralExpression, property: ObjectLiteralElementLike): MigratableNode = {
      val __obj = js.Dynamic.literal(objectLiteral = objectLiteral.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigratableNode]
    }
    
    extension [Self <: MigratableNode](x: Self) {
      
      inline def setObjectLiteral(value: ObjectLiteralExpression): Self = StObject.set(x, "objectLiteral", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: ObjectLiteralElementLike): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait RewriteEntity extends StObject {
    
    var replacement: String
    
    var startPos: Double
    
    var width: Double
  }
  object RewriteEntity {
    
    inline def apply(replacement: String, startPos: Double, width: Double): RewriteEntity = {
      val __obj = js.Dynamic.literal(replacement = replacement.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RewriteEntity]
    }
    
    extension [Self <: RewriteEntity](x: Self) {
      
      inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type RewriteFn = js.Function3[/* startPos */ Double, /* origLength */ Double, /* text */ String, Unit]
}
