package typings.angularCore

import typings.angularCore.ngComponentTemplateMod.ResolvedTemplate
import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import typings.std.Map
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngQueryVisitorMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/angular/ng_query_visitor", "NgQueryResolveVisitor")
  @js.native
  class NgQueryResolveVisitor protected () extends StObject {
    def this(typeChecker: TypeChecker) = this()
    
    /* private */ var _getClassMetadata: js.Any = js.native
    
    /* private */ var _recordClassInheritances: js.Any = js.native
    
    /* private */ var _recordClassInputSetters: js.Any = js.native
    
    /* private */ var _recordQueryDeclaration: js.Any = js.native
    
    /** Maps a class declaration to its class metadata. */
    var classMetadata: ClassMetadataMap = js.native
    
    /** Resolved Angular query definitions. */
    var resolvedQueries: Map[SourceFile, js.Array[NgQueryDefinition]] = js.native
    
    var typeChecker: TypeChecker = js.native
    
    /* private */ var visitAccessorDeclaration: js.Any = js.native
    
    /* private */ var visitClassDeclaration: js.Any = js.native
    
    def visitNode(node: Node): Unit = js.native
    
    /* private */ var visitPropertyDeclaration: js.Any = js.native
  }
  
  trait ClassMetadata extends StObject {
    
    /** List of class declarations that derive from the given class. */
    var derivedClasses: js.Array[ClassDeclaration]
    
    /** List of property names that declare an Angular input within the given class. */
    var ngInputNames: js.Array[String]
    
    /** Super class of the given class. */
    var superClass: ClassDeclaration | Null
    
    /** Component template that belongs to that class if present. */
    var template: js.UndefOr[ResolvedTemplate] = js.undefined
  }
  object ClassMetadata {
    
    inline def apply(derivedClasses: js.Array[ClassDeclaration], ngInputNames: js.Array[String]): ClassMetadata = {
      val __obj = js.Dynamic.literal(derivedClasses = derivedClasses.asInstanceOf[js.Any], ngInputNames = ngInputNames.asInstanceOf[js.Any], superClass = null)
      __obj.asInstanceOf[ClassMetadata]
    }
    
    extension [Self <: ClassMetadata](x: Self) {
      
      inline def setDerivedClasses(value: js.Array[ClassDeclaration]): Self = StObject.set(x, "derivedClasses", value.asInstanceOf[js.Any])
      
      inline def setDerivedClassesVarargs(value: ClassDeclaration*): Self = StObject.set(x, "derivedClasses", js.Array(value :_*))
      
      inline def setNgInputNames(value: js.Array[String]): Self = StObject.set(x, "ngInputNames", value.asInstanceOf[js.Any])
      
      inline def setNgInputNamesVarargs(value: String*): Self = StObject.set(x, "ngInputNames", js.Array(value :_*))
      
      inline def setSuperClass(value: ClassDeclaration): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
      
      inline def setSuperClassNull: Self = StObject.set(x, "superClass", null)
      
      inline def setTemplate(value: ResolvedTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  type ClassMetadataMap = Map[ClassDeclaration, ClassMetadata]
}
