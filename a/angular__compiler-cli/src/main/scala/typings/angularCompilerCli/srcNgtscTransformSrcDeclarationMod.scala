package typings.angularCompilerCli

import typings.angularCompiler.mod.Type
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscTransformSrcApiMod.DtsTransform
import typings.angularCompilerCli.srcNgtscTranslatorMod.ImportManager
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.ClassElement
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTransformSrcDeclarationMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/declaration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/declaration", "DtsTransformRegistry")
  @js.native
  open class DtsTransformRegistry () extends StObject {
    
    /**
      * Gets the dts transforms to be applied for the given source file, or `null` if no transform is
      * necessary.
      */
    def getAllTransforms(sf: SourceFile): js.Array[DtsTransform] | Null = js.native
    
    def getIvyDeclarationTransform(sf: SourceFile): IvyDeclarationDtsTransform = js.native
    
    /* private */ var ivyDeclarationTransforms: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/declaration", "IvyDeclarationDtsTransform")
  @js.native
  open class IvyDeclarationDtsTransform ()
    extends StObject
       with DtsTransform {
    
    def addFields(decl: ClassDeclarationDeclarati, fields: js.Array[IvyDeclarationField]): Unit = js.native
    
    /* private */ var declarationFields: Any = js.native
    
    @JSName("transformClass")
    def transformClass_MIvyDeclarationDtsTransform(
      clazz: ClassDeclaration,
      members: js.Array[ClassElement],
      reflector: ReflectionHost,
      refEmitter: ReferenceEmitter,
      imports: ImportManager
    ): ClassDeclaration = js.native
  }
  
  inline def declarationTransformFactory(
    transformRegistry: DtsTransformRegistry,
    reflector: ReflectionHost,
    refEmitter: ReferenceEmitter,
    importRewriter: ImportRewriter
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("declarationTransformFactory")(transformRegistry.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], refEmitter.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
  inline def declarationTransformFactory(
    transformRegistry: DtsTransformRegistry,
    reflector: ReflectionHost,
    refEmitter: ReferenceEmitter,
    importRewriter: ImportRewriter,
    importPrefix: String
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("declarationTransformFactory")(transformRegistry.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], refEmitter.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any], importPrefix.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
  
  trait IvyDeclarationField extends StObject {
    
    var name: String
    
    var `type`: Type
  }
  object IvyDeclarationField {
    
    inline def apply(name: String, `type`: Type): IvyDeclarationField = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IvyDeclarationField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IvyDeclarationField] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
