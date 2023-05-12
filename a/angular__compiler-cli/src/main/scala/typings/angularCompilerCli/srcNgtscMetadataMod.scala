package typings.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.InputMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.BindingPropertyName
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyName
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.InputOrOutput
import typings.angularCompilerCli.srcNgtscMetadataSrcResourceRegistryMod.Resource
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
  /* private */ open class ClassPropertyMapping[T /* <: InputOrOutput */] ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T]
  /* static members */
  object ClassPropertyMapping {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "ClassPropertyMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Construct a `ClassPropertyMapping` with no entries.
      */
    inline def empty[T /* <: InputOrOutput */](): typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T]]
    
    /**
      * Construct a `ClassPropertyMapping` from a primitive JS object which maps class property names
      * to either binding property names or an array that contains both names, which is used in on-disk
      * metadata formats (e.g. in .d.ts files).
      */
    inline def fromMappedObject[T /* <: InputOrOutput */](
      obj: StringDictionary[BindingPropertyName | (js.Tuple2[ClassPropertyName, BindingPropertyName]) | T]
    ): typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMappedObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T]]
    
    /**
      * Merge two mappings into one, with class properties from `b` taking precedence over class
      * properties from `a`.
      */
    inline def merge[T /* <: InputOrOutput */](
      a: typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T],
      b: typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T]
    ): typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[T]]
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
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "ExportedProviderStatusResolver")
  @js.native
  open class ExportedProviderStatusResolver protected ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcProvidersMod.ExportedProviderStatusResolver {
    def this(metaReader: MetadataReader) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "HostDirectivesResolver")
  @js.native
  open class HostDirectivesResolver protected ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcHostDirectivesResolverMod.HostDirectivesResolver {
    def this(metaReader: MetadataReader) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "LocalMetadataRegistry")
  @js.native
  open class LocalMetadataRegistry ()
    extends typings.angularCompilerCli.srcNgtscMetadataSrcRegistryMod.LocalMetadataRegistry
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata", "MatchSource")
  @js.native
  object MatchSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MatchSource & Double] = js.native
    
    /* 1 */ val HostDirective: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MatchSource.HostDirective & Double = js.native
    
    /* 0 */ val Selector: typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MatchSource.Selector & Double = js.native
  }
  
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
    node: ClassDeclarationDeclarati,
    inputs: typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyMapping[InputMapping],
    reflector: ReflectionHost
  ): DirectiveTypeCheckMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDirectiveTypeCheckMeta")(node.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[DirectiveTypeCheckMeta]
  
  inline def flattenInheritedDirectiveMetadata(reader: MetadataReader, dir: Reference[ClassDeclarationDeclarati]): DirectiveMeta | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenInheritedDirectiveMetadata")(reader.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[DirectiveMeta | Null]
  
  inline def hasInjectableFields(clazz: ClassDeclarationDeclarati, host: ReflectionHost): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasInjectableFields")(clazz.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isExternalResource(resource: Resource): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry.ExternalResource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalResource")(resource.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry.ExternalResource */ Boolean]
}
