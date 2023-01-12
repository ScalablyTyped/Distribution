package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.TopLevelIdentifier
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifiers extends StObject {
  
  var errors: js.Array[js.Error]
  
  var identifiers: Set[TopLevelIdentifier]
}
object Identifiers {
  
  inline def apply(errors: js.Array[js.Error], identifiers: Set[TopLevelIdentifier]): Identifiers = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifiers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identifiers] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setIdentifiers(value: Set[TopLevelIdentifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
  }
}
