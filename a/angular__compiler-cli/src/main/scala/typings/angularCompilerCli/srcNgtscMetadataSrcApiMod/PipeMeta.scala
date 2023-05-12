package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetaKind.Pipe
import typings.typescript.mod.Decorator
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeMeta extends StObject {
  
  var decorator: Decorator | Null
  
  var isStandalone: Boolean
  
  var kind: Pipe
  
  var name: String
  
  var nameExpr: Expression | Null
  
  var ref: Reference[ClassDeclarationDeclarati]
}
object PipeMeta {
  
  inline def apply(isStandalone: Boolean, kind: Pipe, name: String, ref: Reference[ClassDeclarationDeclarati]): PipeMeta = {
    val __obj = js.Dynamic.literal(isStandalone = isStandalone.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], decorator = null, nameExpr = null)
    __obj.asInstanceOf[PipeMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeMeta] (val x: Self) extends AnyVal {
    
    inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setDecoratorNull: Self = StObject.set(x, "decorator", null)
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Pipe): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameExpr(value: Expression): Self = StObject.set(x, "nameExpr", value.asInstanceOf[js.Any])
    
    inline def setNameExprNull: Self = StObject.set(x, "nameExpr", null)
    
    inline def setRef(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
