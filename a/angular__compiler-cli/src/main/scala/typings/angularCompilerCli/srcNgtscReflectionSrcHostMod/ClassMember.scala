package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.StringLiteral
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassMember extends StObject {
  
  /**
    * Any `Decorator`s which are present on the member, or `null` if none are present.
    */
  var decorators: js.Array[Decorator] | Null
  
  /**
    * TypeScript `ts.Declaration` which represents the implementation of the member.
    *
    * In TypeScript code this is identical to the node, but in downleveled code this should always be
    * the Declaration which actually represents the member's runtime value.
    *
    * For example, the TS code:
    *
    * ```
    * class Clazz {
    *   static get property(): string {
    *     return 'value';
    *   }
    * }
    * ```
    *
    * Downlevels to:
    *
    * ```
    * var Clazz = (function () {
    *   function Clazz() {
    *   }
    *   Object.defineProperty(Clazz, "property", {
    *       get: function () {
    *           return 'value';
    *       },
    *       enumerable: true,
    *       configurable: true
    *   });
    *   return Clazz;
    * }());
    * ```
    *
    * In this example, for the property "property", the node would be the entire
    * Object.defineProperty ExpressionStatement, but the implementation would be this
    * FunctionDeclaration:
    *
    * ```
    * function () {
    *   return 'value';
    * },
    * ```
    */
  var implementation: typings.typescript.mod.Declaration | Null
  
  /**
    * Whether the member is static or not.
    */
  var isStatic: Boolean
  
  /**
    * Indication of which type of member this is (property, method, etc).
    */
  var kind: ClassMemberKind
  
  /**
    * Name of the class member.
    */
  var name: String
  
  /**
    * TypeScript `ts.Identifier` or `ts.StringLiteral` representing the name of the member, or `null`
    * if no such node is present.
    *
    * The `nameNode` is useful in writing references to this member that will be correctly source-
    * mapped back to the original file.
    */
  var nameNode: Identifier | StringLiteral | Null
  
  /**
    * TypeScript reference to the class member itself, or null if it is not applicable.
    */
  var node: Node | Null
  
  /**
    * TypeScript `ts.TypeNode` representing the type of the member, or `null` if not present or
    * applicable.
    */
  var `type`: TypeNode | Null
  
  /**
    * TypeScript `ts.Expression` which represents the value of the member.
    *
    * If the member is a property, this will be the property initializer if there is one, or null
    * otherwise.
    */
  var value: Expression | Null
}
object ClassMember {
  
  inline def apply(isStatic: Boolean, kind: ClassMemberKind, name: String): ClassMember = {
    val __obj = js.Dynamic.literal(isStatic = isStatic.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], decorators = null, implementation = null, nameNode = null, node = null, value = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[ClassMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassMember] (val x: Self) extends AnyVal {
    
    inline def setDecorators(value: js.Array[Decorator]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator*): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setImplementation(value: typings.typescript.mod.Declaration): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementationNull: Self = StObject.set(x, "implementation", null)
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ClassMemberKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNode(value: Identifier | StringLiteral): Self = StObject.set(x, "nameNode", value.asInstanceOf[js.Any])
    
    inline def setNameNodeNull: Self = StObject.set(x, "nameNode", null)
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeNull: Self = StObject.set(x, "node", null)
    
    inline def setType(value: TypeNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
