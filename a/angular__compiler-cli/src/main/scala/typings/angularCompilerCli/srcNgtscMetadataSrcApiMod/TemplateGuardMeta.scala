package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompilerCli.angularCompilerCliStrings.binding
import typings.angularCompilerCli.angularCompilerCliStrings.invocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateGuardMeta extends StObject {
  
  /**
    * The input name that this guard should be applied to.
    */
  var inputName: String
  
  /**
    * Represents the type of the template guard.
    *
    * - 'invocation' means that a call to the template guard function is emitted so that its return
    *   type can result in narrowing of the input type.
    * - 'binding' means that the input binding expression itself is used as template guard.
    */
  var `type`: invocation | binding
}
object TemplateGuardMeta {
  
  inline def apply(inputName: String, `type`: invocation | binding): TemplateGuardMeta = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateGuardMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateGuardMeta] (val x: Self) extends AnyVal {
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setType(value: invocation | binding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
