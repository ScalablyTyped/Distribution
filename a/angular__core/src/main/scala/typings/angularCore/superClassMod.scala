package typings.angularCore

import typings.angularCore.ngQueryVisitorMod.ClassMetadataMap
import typings.typescript.mod.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object superClassMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/angular/super_class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSuperClassDeclarations(classDecl: ClassDeclaration, classMetadataMap: ClassMetadataMap): js.Array[ClassDeclaration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuperClassDeclarations")(classDecl.asInstanceOf[js.Any], classMetadataMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[ClassDeclaration]]
}
