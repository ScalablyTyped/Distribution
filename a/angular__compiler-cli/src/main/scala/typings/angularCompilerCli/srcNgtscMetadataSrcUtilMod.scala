package typings.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscImportsSrcReferencesMod.OwningModule
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.InputMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.PipeMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeQueryNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/util", "CompoundMetadataReader")
  @js.native
  open class CompoundMetadataReader protected ()
    extends StObject
       with MetadataReader {
    def this(readers: js.Array[MetadataReader]) = this()
    
    /* CompleteClass */
    override def getDirectiveMetadata(node: Reference[ClassDeclarationDeclarati]): DirectiveMeta | Null = js.native
    
    /* CompleteClass */
    override def getNgModuleMetadata(node: Reference[ClassDeclarationDeclarati]): NgModuleMeta | Null = js.native
    
    /* CompleteClass */
    override def getPipeMetadata(node: Reference[ClassDeclarationDeclarati]): PipeMeta | Null = js.native
    
    /* private */ var readers: Any = js.native
  }
  
  inline def extraReferenceFromTypeQuery(checker: TypeChecker, typeNode: TypeQueryNode, origin: TypeNode): Reference[ClassDeclarationClassDecl] = (^.asInstanceOf[js.Dynamic].applyDynamic("extraReferenceFromTypeQuery")(checker.asInstanceOf[js.Any], typeNode.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Reference[ClassDeclarationClassDecl]]
  inline def extraReferenceFromTypeQuery(
    checker: TypeChecker,
    typeNode: TypeQueryNode,
    origin: TypeNode,
    bestGuessOwningModule: OwningModule
  ): Reference[ClassDeclarationClassDecl] = (^.asInstanceOf[js.Dynamic].applyDynamic("extraReferenceFromTypeQuery")(checker.asInstanceOf[js.Any], typeNode.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], bestGuessOwningModule.asInstanceOf[js.Any])).asInstanceOf[Reference[ClassDeclarationClassDecl]]
  
  inline def extractDirectiveTypeCheckMeta(
    node: ClassDeclarationDeclarati,
    inputs: ClassPropertyMapping[InputMapping],
    reflector: ReflectionHost
  ): DirectiveTypeCheckMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveTypeCheckMeta")(node.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[DirectiveTypeCheckMeta]
  
  inline def extractReferencesFromType(checker: TypeChecker, `def`: TypeNode): js.Array[Reference[ClassDeclarationDeclarati]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractReferencesFromType")(checker.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Reference[ClassDeclarationDeclarati]]]
  inline def extractReferencesFromType(checker: TypeChecker, `def`: TypeNode, bestGuessOwningModule: OwningModule): js.Array[Reference[ClassDeclarationDeclarati]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractReferencesFromType")(checker.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], bestGuessOwningModule.asInstanceOf[js.Any])).asInstanceOf[js.Array[Reference[ClassDeclarationDeclarati]]]
  
  inline def hasInjectableFields(clazz: ClassDeclarationDeclarati, host: ReflectionHost): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasInjectableFields")(clazz.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def readBooleanType(`type`: TypeNode): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readBooleanType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  inline def readMapType[T](`type`: TypeNode, valueTransform: js.Function1[/* type */ TypeNode, T | Null]): StringDictionary[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("readMapType")(`type`.asInstanceOf[js.Any], valueTransform.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[T]]
  
  inline def readStringArrayType(`type`: TypeNode): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStringArrayType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def readStringType(`type`: TypeNode): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readStringType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
