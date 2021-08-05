package typings.angularCore

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.PropertyDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryDefinitionMod {
  
  @js.native
  sealed trait QueryTiming extends StObject
  @JSImport("@angular/core/schematics/migrations/static-queries/angular/query-definition", "QueryTiming")
  @js.native
  object QueryTiming extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[QueryTiming & Double] = js.native
    
    @js.native
    sealed trait DYNAMIC
      extends StObject
         with QueryTiming
    /* 1 */ val DYNAMIC: typings.angularCore.queryDefinitionMod.QueryTiming.DYNAMIC & Double = js.native
    
    @js.native
    sealed trait STATIC
      extends StObject
         with QueryTiming
    /* 0 */ val STATIC: typings.angularCore.queryDefinitionMod.QueryTiming.STATIC & Double = js.native
  }
  
  @js.native
  sealed trait QueryType extends StObject
  @JSImport("@angular/core/schematics/migrations/static-queries/angular/query-definition", "QueryType")
  @js.native
  object QueryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[QueryType & Double] = js.native
    
    @js.native
    sealed trait ContentChild
      extends StObject
         with QueryType
    /* 1 */ val ContentChild: typings.angularCore.queryDefinitionMod.QueryType.ContentChild & Double = js.native
    
    @js.native
    sealed trait ViewChild
      extends StObject
         with QueryType
    /* 0 */ val ViewChild: typings.angularCore.queryDefinitionMod.QueryType.ViewChild & Double = js.native
  }
  
  trait NgQueryDefinition extends StObject {
    
    /** Class declaration that holds this query. */
    var container: ClassDeclaration
    
    /** Decorator that declares this as a query. */
    var decorator: NgDecorator
    
    /** Name of the query. Set to "null" in case the query name is not statically analyzable. */
    var name: String | Null
    
    /** Node that declares this query. */
    var node: Node
    
    /**
      * Property declaration that refers to the query value. For accessors there
      * is no property that is guaranteed to access the query value.
      */
    var property: PropertyDeclaration | Null
    
    /** Type of the query definition. */
    var `type`: QueryType
  }
  object NgQueryDefinition {
    
    inline def apply(container: ClassDeclaration, decorator: NgDecorator, node: Node, `type`: QueryType): NgQueryDefinition = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], decorator = decorator.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], name = null, property = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgQueryDefinition]
    }
    
    extension [Self <: NgQueryDefinition](x: Self) {
      
      inline def setContainer(value: ClassDeclaration): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDecorator(value: NgDecorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: PropertyDeclaration): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyNull: Self = StObject.set(x, "property", null)
      
      inline def setType(value: QueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
