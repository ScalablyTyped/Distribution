package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostDirectiveMeta extends StObject {
  
  /** Reference to the host directive class. */
  var directive: Reference[ClassDeclarationDeclarati]
  
  /** Inputs from the host directive that have been exposed. */
  var inputs: StringDictionary[String] | Null
  
  /** Whether the reference to the host directive is a forward reference. */
  var isForwardReference: Boolean
  
  /** Outputs from the host directive that have been exposed. */
  var outputs: StringDictionary[String] | Null
}
object HostDirectiveMeta {
  
  inline def apply(directive: Reference[ClassDeclarationDeclarati], isForwardReference: Boolean): HostDirectiveMeta = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], isForwardReference = isForwardReference.asInstanceOf[js.Any], inputs = null, outputs = null)
    __obj.asInstanceOf[HostDirectiveMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostDirectiveMeta] (val x: Self) extends AnyVal {
    
    inline def setDirective(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsNull: Self = StObject.set(x, "inputs", null)
    
    inline def setIsForwardReference(value: Boolean): Self = StObject.set(x, "isForwardReference", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsNull: Self = StObject.set(x, "outputs", null)
  }
}
