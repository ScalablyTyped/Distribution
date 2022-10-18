package typings.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.BindingPropertyName
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyName
import typings.angularCompilerCli.srcNgtscMetadataSrcResourceRegistryMod.Resource
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "ClassPropertyMapping")
  @js.native
  /* private */ open class ClassPropertyMapping ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping
  /* static members */
  object ClassPropertyMapping {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "ClassPropertyMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Construct a `ClassPropertyMapping` with no entries.
      */
    inline def empty(): typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping]
    
    /**
      * Construct a `ClassPropertyMapping` from a primitive JS object which maps class property names
      * to either binding property names or an array that contains both names, which is used in on-disk
      * metadata formats (e.g. in .d.ts files).
      */
    inline def fromMappedObject(obj: StringDictionary[BindingPropertyName | (js.Tuple2[ClassPropertyName, BindingPropertyName])]): typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMappedObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping]
    
    /**
      * Merge two mappings into one, with class properties from `b` taking precedence over class
      * properties from `a`.
      */
    inline def merge(
      a: typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping,
      b: typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping
    ): typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "CompoundMetadataReader")
  @js.native
  open class CompoundMetadataReader protected ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcUtilMod.CompoundMetadataReader {
    def this(readers: js.Array[MetadataReader]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "CompoundMetadataRegistry")
  @js.native
  open class CompoundMetadataRegistry protected ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcRegistryMod.CompoundMetadataRegistry {
    def this(registries: js.Array[MetadataRegistry]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "DtsMetadataReader")
  @js.native
  open class DtsMetadataReader protected ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcDtsMod.DtsMetadataReader {
    def this(checker: TypeChecker, reflector: ReflectionHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "InjectableClassRegistry")
  @js.native
  open class InjectableClassRegistry protected ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcRegistryMod.InjectableClassRegistry {
    def this(host: ReflectionHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "LocalMetadataRegistry")
  @js.native
  open class LocalMetadataRegistry ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcRegistryMod.LocalMetadataRegistry
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "MetaKind")
  @js.native
  object MetaKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind & Double] = js.native
    
    /* 0 */ val Directive: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Directive & Double = js.native
    
    /* 2 */ val NgModule: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.NgModule & Double = js.native
    
    /* 1 */ val Pipe: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Pipe & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "ResourceRegistry")
  @js.native
  open class ResourceRegistry ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcResourceRegistryMod.ResourceRegistry
  
  inline def extractDirectiveTypeCheckMeta(
    node: ClassDeclaration[DeclarationNode],
    inputs: typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping,
    reflector: ReflectionHost
  ): DirectiveTypeCheckMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveTypeCheckMeta")(node.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[DirectiveTypeCheckMeta]
  
  inline def flattenInheritedDirectiveMetadata(reader: MetadataReader, dir: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenInheritedDirectiveMetadata")(reader.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[DirectiveMeta]
  
  inline def isExternalResource(resource: Resource): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry.ExternalResource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalResource")(resource.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry.ExternalResource */ Boolean]
}
