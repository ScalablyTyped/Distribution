package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceAlgorithmSpecification extends StObject {
  
  /**
    * A list of the algorithms that were used to create a model package.
    */
  var SourceAlgorithms: SourceAlgorithmList
}
object SourceAlgorithmSpecification {
  
  inline def apply(SourceAlgorithms: SourceAlgorithmList): SourceAlgorithmSpecification = {
    val __obj = js.Dynamic.literal(SourceAlgorithms = SourceAlgorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAlgorithmSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceAlgorithmSpecification] (val x: Self) extends AnyVal {
    
    inline def setSourceAlgorithms(value: SourceAlgorithmList): Self = StObject.set(x, "SourceAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setSourceAlgorithmsVarargs(value: SourceAlgorithm*): Self = StObject.set(x, "SourceAlgorithms", js.Array(value*))
  }
}
