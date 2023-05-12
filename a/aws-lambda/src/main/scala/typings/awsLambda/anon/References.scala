package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait References extends StObject {
  
  var references: js.Array[Commit]
}
object References {
  
  inline def apply(references: js.Array[Commit]): References = {
    val __obj = js.Dynamic.literal(references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[References]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: References] (val x: Self) extends AnyVal {
    
    inline def setReferences(value: js.Array[Commit]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: Commit*): Self = StObject.set(x, "references", js.Array(value*))
  }
}
