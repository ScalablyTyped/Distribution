package typings.angularCore

import typings.angularCore.declarationUsageVisitorMod.FunctionContext
import typings.angularCore.ngQueryVisitorMod.ClassMetadataMap
import typings.typescript.mod.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object superClassContextMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/super_class_context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateSuperClassAbstractMembersContext(baseClass: ClassDeclaration, context: FunctionContext, classMetadataMap: ClassMetadataMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSuperClassAbstractMembersContext")(baseClass.asInstanceOf[js.Any], context.asInstanceOf[js.Any], classMetadataMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
