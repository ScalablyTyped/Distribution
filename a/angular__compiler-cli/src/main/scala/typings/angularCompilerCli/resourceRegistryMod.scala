package typings.angularCompilerCli

import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.std.ReadonlySet
import typings.std.Set
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceRegistryMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry", "ResourceRegistry")
  @js.native
  open class ResourceRegistry () extends StObject {
    
    /* private */ var componentToStylesMap: Any = js.native
    
    /* private */ var componentToTemplateMap: Any = js.native
    
    /* private */ var externalStyleToComponentsMap: Any = js.native
    
    /* private */ var externalTemplateToComponentsMap: Any = js.native
    
    def getComponentsWithStyle(styleUrl: AbsoluteFsPath): ReadonlySet[ClassDeclaration[DeclarationNode]] = js.native
    
    def getComponentsWithTemplate(template: AbsoluteFsPath): ReadonlySet[ClassDeclaration[DeclarationNode]] = js.native
    
    def getStyles(component: ClassDeclaration[DeclarationNode]): Set[Resource] = js.native
    
    def getTemplate(component: ClassDeclaration[DeclarationNode]): Resource | Null = js.native
    
    def registerResources(resources: ComponentResources, component: ClassDeclaration[DeclarationNode]): Unit = js.native
    
    def registerStyle(styleResource: Resource, component: ClassDeclaration[DeclarationNode]): Unit = js.native
    
    def registerTemplate(templateResource: Resource, component: ClassDeclaration[DeclarationNode]): Unit = js.native
  }
  
  inline def isExternalResource(resource: Resource): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry.ExternalResource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalResource")(resource.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/metadata/src/resource_registry.ExternalResource */ Boolean]
  
  trait ComponentResources extends StObject {
    
    var styles: ReadonlySet[Resource]
    
    var template: Resource
  }
  object ComponentResources {
    
    inline def apply(styles: ReadonlySet[Resource], template: Resource): ComponentResources = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentResources]
    }
    
    extension [Self <: ComponentResources](x: Self) {
      
      inline def setStyles(value: ReadonlySet[Resource]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: Resource): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalResource
    extends StObject
       with Resource {
    
    @JSName("path")
    var path_ExternalResource: AbsoluteFsPath
  }
  object ExternalResource {
    
    inline def apply(expression: Expression, path: AbsoluteFsPath): ExternalResource = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalResource]
    }
    
    extension [Self <: ExternalResource](x: Self) {
      
      inline def setPath(value: AbsoluteFsPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resource extends StObject {
    
    var expression: Expression
    
    var path: AbsoluteFsPath | Null
  }
  object Resource {
    
    inline def apply(expression: Expression): Resource = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], path = null)
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setPath(value: AbsoluteFsPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
    }
  }
}
