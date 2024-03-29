package typings.astTypes

import org.scalablytyped.runtime.StringDictionary
import typings.astTypes.anon.Builders
import typings.astTypes.astTypesMod.Fork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("ast-types/lib/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(_fork: Fork): Builders = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_fork.asInstanceOf[js.Any]).asInstanceOf[Builders]
  
  @JSImport("ast-types/lib/types", "Def")
  @js.native
  abstract class Def[T] protected () extends StObject {
    def this(`type`: Type[T], typeName: String) = this()
    
    var allFields: StringDictionary[FieldType[js.Any]] = js.native
    
    var allSupertypes: StringDictionary[Def[js.Any]] = js.native
    
    var baseNames: js.Array[String] = js.native
    
    def bases(supertypeNames: String*): this.type = js.native
    
    def build(buildParams: String*): this.type = js.native
    
    var buildParams: js.Array[String] = js.native
    
    var buildable: Boolean = js.native
    
    def check(value: js.Any): Boolean = js.native
    def check(value: js.Any, deep: js.Any): Boolean = js.native
    
    def checkAllFields(value: js.Any): Boolean = js.native
    def checkAllFields(value: js.Any, deep: js.Any): Boolean = js.native
    
    def field(name: String, `type`: js.Any): this.type = js.native
    def field(name: String, `type`: js.Any, defaultFn: js.Function): this.type = js.native
    def field(name: String, `type`: js.Any, defaultFn: js.Function, hidden: Boolean): this.type = js.native
    def field(name: String, `type`: js.Any, defaultFn: Unit, hidden: Boolean): this.type = js.native
    
    var fieldNames: js.Array[String] = js.native
    
    var finalized: Boolean = js.native
    
    def isSupertypeOf(that: Def[js.Any]): Boolean = js.native
    
    var ownFields: StringDictionary[FieldType[js.Any]] = js.native
    
    var supertypeList: js.Array[String] = js.native
    
    val `type`: Type[T] = js.native
    
    val typeName: String = js.native
  }
  
  trait ASTNode extends StObject {
    
    var `type`: String
  }
  object ASTNode {
    
    inline def apply(`type`: String): ASTNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTNode]
    }
    
    extension [Self <: ASTNode](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnyType extends StObject {
    
    def arrayOf(): AnyType = js.native
    
    def assert(value: js.Any): Boolean = js.native
    def assert(value: js.Any, deep: Deep): Boolean = js.native
    
    def check(value: js.Any): Boolean = js.native
    def check(value: js.Any, deep: Deep): Boolean = js.native
  }
  
  @js.native
  trait ArrayType[T]
    extends StObject
       with BaseType[T]
       with Type[T] {
    
    val elemType: Type[js.Any] = js.native
    
    val kind: typings.astTypes.astTypesStrings.ArrayType = js.native
  }
  
  @js.native
  trait BaseType[T] extends StObject {
    
    def arrayOf(): Type[js.Array[T]] = js.native
    
    def assert(value: js.Any): /* is T */ Boolean = js.native
    def assert(value: js.Any, deep: Deep): /* is T */ Boolean = js.native
    
    def check(value: js.Any): /* is T */ Boolean = js.native
    def check(value: js.Any, deep: Deep): /* is T */ Boolean = js.native
  }
  
  @js.native
  trait Builder extends StObject {
    
    def apply(args: js.Any*): ASTNode = js.native
    
    def from(obj: StringDictionary[js.Any]): ASTNode = js.native
  }
  
  type Deep = Boolean | (js.Function2[/* type */ Type[js.Any], /* value */ js.Any, Unit])
  
  trait Field[T] extends StObject {
    
    val defaultFn: js.UndefOr[js.Function] = js.undefined
    
    def getValue(obj: StringDictionary[js.Any]): js.Any
    
    val hidden: Boolean
    
    val name: String
    
    val `type`: Type[T]
  }
  object Field {
    
    inline def apply[T](getValue: StringDictionary[js.Any] => js.Any, hidden: Boolean, name: String, `type`: Type[T]): Field[T] = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), hidden = hidden.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field[T]]
    }
    
    extension [Self <: Field[?], T](x: Self & Field[T]) {
      
      inline def setDefaultFn(value: js.Function): Self = StObject.set(x, "defaultFn", value.asInstanceOf[js.Any])
      
      inline def setDefaultFnUndefined: Self = StObject.set(x, "defaultFn", js.undefined)
      
      inline def setGetValue(value: StringDictionary[js.Any] => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FieldType[T] = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ast-types.ast-types/lib/types.FieldType<T> */ js.Object
  
  @js.native
  trait IdentityType[T]
    extends StObject
       with BaseType[T]
       with Type[T] {
    
    val kind: typings.astTypes.astTypesStrings.IdentityType = js.native
    
    val value: T = js.native
  }
  
  @js.native
  trait ObjectType[T]
    extends StObject
       with BaseType[T]
       with Type[T] {
    
    val fields: js.Array[FieldType[js.Any]] = js.native
    
    val kind: typings.astTypes.astTypesStrings.ObjectType = js.native
  }
  
  @js.native
  trait OrType[T]
    extends StObject
       with BaseType[T]
       with Type[T] {
    
    val kind: typings.astTypes.astTypesStrings.OrType = js.native
    
    val types: js.Array[Type[js.Any]] = js.native
  }
  
  @js.native
  trait PredicateType[T]
    extends StObject
       with BaseType[T]
       with Type[T] {
    
    val kind: typings.astTypes.astTypesStrings.PredicateType = js.native
    
    val name: String = js.native
    
    def predicate(value: js.Any): Boolean = js.native
    def predicate(value: js.Any, deep: Deep): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.typesMod.ArrayType[T]
    - typings.astTypes.typesMod.IdentityType[T]
    - typings.astTypes.typesMod.ObjectType[T]
    - typings.astTypes.typesMod.OrType[T]
    - typings.astTypes.typesMod.PredicateType[T]
  */
  trait Type[T] extends StObject
}
