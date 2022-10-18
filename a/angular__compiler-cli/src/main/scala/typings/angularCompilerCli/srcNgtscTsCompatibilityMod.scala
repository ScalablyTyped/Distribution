package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.ModifierLike
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts47UpdateTypeParameterDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48CreateClassDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48CreateGetAccessorDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48CreateMethodDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48CreatePropertyDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48CreateSetAccessorDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48UpdateClassDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48UpdateConstructorDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48UpdateGetAccessorDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48UpdateImportDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48UpdateMethodDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48UpdateParameterDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48UpdatePropertyDeclarationFn
import typings.angularCompilerCli.srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod.Ts48UpdateSetAccessorDeclarationFn
import typings.typescript.mod.Decorator
import typings.typescript.mod.Modifier
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTsCompatibilityMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineModifiers(): js.UndefOr[js.Array[ModifierLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")().asInstanceOf[js.UndefOr[js.Array[ModifierLike]]]
  inline def combineModifiers(decorators: js.Array[Decorator]): js.UndefOr[js.Array[ModifierLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")(decorators.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[ModifierLike]]]
  inline def combineModifiers(decorators: js.Array[Decorator], modifiers: js.Array[ModifierLike]): js.UndefOr[js.Array[ModifierLike]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")(decorators.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[ModifierLike]]]
  inline def combineModifiers(decorators: Unit, modifiers: js.Array[ModifierLike]): js.UndefOr[js.Array[ModifierLike]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")(decorators.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[ModifierLike]]]
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "createClassDeclaration")
  @js.native
  val createClassDeclaration: Ts48CreateClassDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "createGetAccessorDeclaration")
  @js.native
  val createGetAccessorDeclaration: Ts48CreateGetAccessorDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "createMethodDeclaration")
  @js.native
  val createMethodDeclaration: Ts48CreateMethodDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "createPropertyDeclaration")
  @js.native
  val createPropertyDeclaration: Ts48CreatePropertyDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "createSetAccessorDeclaration")
  @js.native
  val createSetAccessorDeclaration: Ts48CreateSetAccessorDeclarationFn = js.native
  
  inline def getDecorators(node: Node): js.UndefOr[js.Array[Decorator]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecorators")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Decorator]]]
  
  inline def getModifiers(node: Node): js.UndefOr[js.Array[Modifier]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModifiers")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Modifier]]]
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updateClassDeclaration")
  @js.native
  val updateClassDeclaration: Ts48UpdateClassDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updateConstructorDeclaration")
  @js.native
  val updateConstructorDeclaration: Ts48UpdateConstructorDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updateGetAccessorDeclaration")
  @js.native
  val updateGetAccessorDeclaration: Ts48UpdateGetAccessorDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updateImportDeclaration")
  @js.native
  val updateImportDeclaration: Ts48UpdateImportDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updateMethodDeclaration")
  @js.native
  val updateMethodDeclaration: Ts48UpdateMethodDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updateParameterDeclaration")
  @js.native
  val updateParameterDeclaration: Ts48UpdateParameterDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updatePropertyDeclaration")
  @js.native
  val updatePropertyDeclaration: Ts48UpdatePropertyDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updateSetAccessorDeclaration")
  @js.native
  val updateSetAccessorDeclaration: Ts48UpdateSetAccessorDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility", "updateTypeParameterDeclaration")
  @js.native
  val updateTypeParameterDeclaration: Ts47UpdateTypeParameterDeclarationFn = js.native
}
