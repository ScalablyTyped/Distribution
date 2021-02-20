package typings.angularCore

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.PropertyDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryDefinitionMod {
  
  @js.native
  sealed trait QueryTiming extends StObject
  @JSImport("@angular/core/schematics/migrations/static-queries/angular/query-definition", "QueryTiming")
  @js.native
  object QueryTiming extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[QueryTiming with Double] = js.native
    
    @js.native
    sealed trait DYNAMIC extends QueryTiming
    /* 1 */ val DYNAMIC: typings.angularCore.queryDefinitionMod.QueryTiming.DYNAMIC with Double = js.native
    
    @js.native
    sealed trait STATIC extends QueryTiming
    /* 0 */ val STATIC: typings.angularCore.queryDefinitionMod.QueryTiming.STATIC with Double = js.native
  }
  
  @js.native
  sealed trait QueryType extends StObject
  @JSImport("@angular/core/schematics/migrations/static-queries/angular/query-definition", "QueryType")
  @js.native
  object QueryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[QueryType with Double] = js.native
    
    @js.native
    sealed trait ContentChild extends QueryType
    /* 1 */ val ContentChild: typings.angularCore.queryDefinitionMod.QueryType.ContentChild with Double = js.native
    
    @js.native
    sealed trait ViewChild extends QueryType
    /* 0 */ val ViewChild: typings.angularCore.queryDefinitionMod.QueryType.ViewChild with Double = js.native
  }
  
  @js.native
  trait NgQueryDefinition extends StObject {
    
    /** Class declaration that holds this query. */
    var container: ClassDeclaration = js.native
    
    /** Decorator that declares this as a query. */
    var decorator: NgDecorator = js.native
    
    /** Name of the query. Set to "null" in case the query name is not statically analyzable. */
    var name: String | Null = js.native
    
    /** Node that declares this query. */
    var node: Node = js.native
    
    /**
      * Property declaration that refers to the query value. For accessors there
      * is no property that is guaranteed to access the query value.
      */
    var property: PropertyDeclaration | Null = js.native
    
    /** Type of the query definition. */
    var `type`: QueryType = js.native
  }
  object NgQueryDefinition {
    
    @scala.inline
    def apply(container: ClassDeclaration, decorator: NgDecorator, node: Node, `type`: QueryType): NgQueryDefinition = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], decorator = decorator.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgQueryDefinition]
    }
    
    @scala.inline
    implicit class NgQueryDefinitionMutableBuilder[Self <: NgQueryDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ClassDeclaration): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorator(value: NgDecorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: PropertyDeclaration): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNull: Self = StObject.set(x, "property", null)
      
      @scala.inline
      def setType(value: QueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
