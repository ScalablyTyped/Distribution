package typings.angularCore

import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsMigrationsRouterLinkWithHrefUtilMod {
  
  @JSImport("@angular/core/schematics/migrations/router-link-with-href/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def migrateFile(sourceFile: SourceFile, typeChecker: TypeChecker, rewrite: RewriteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrateFile")(sourceFile.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any], rewrite.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@angular/core/schematics/migrations/router-link-with-href/util", "routerLink")
  @js.native
  val routerLink: /* "RouterLink" */ String = js.native
  
  @JSImport("@angular/core/schematics/migrations/router-link-with-href/util", "routerLinkWithHref")
  @js.native
  val routerLinkWithHref: /* "RouterLinkWithHref" */ String = js.native
  
  @JSImport("@angular/core/schematics/migrations/router-link-with-href/util", "routerModule")
  @js.native
  val routerModule: /* "@angular/router" */ String = js.native
  
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
  
  type RewriteFn = js.Function3[/* startPos */ Double, /* width */ Double, /* text */ String, Unit]
}
