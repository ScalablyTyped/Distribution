package typings.angularCompilerCli.srcHostMod

import typings.typescript.mod.Expression
import typings.typescript.mod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumMember extends StObject {
  
  /**
    * The initializer expression of the enum member. Unlike in TypeScript, this is always available
    * in emitted JavaScript.
    */
  var initializer: Expression
  
  /**
    * The name of the enum member.
    */
  var name: PropertyName
}
object EnumMember {
  
  inline def apply(initializer: Expression, name: PropertyName): EnumMember = {
    val __obj = js.Dynamic.literal(initializer = initializer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumMember]
  }
  
  extension [Self <: EnumMember](x: Self) {
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setName(value: PropertyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
