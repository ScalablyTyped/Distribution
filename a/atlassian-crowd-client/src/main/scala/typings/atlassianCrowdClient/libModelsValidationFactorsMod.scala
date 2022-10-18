package typings.atlassianCrowdClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsValidationFactorsMod {
  
  @JSImport("atlassian-crowd-client/lib/models/validation-factors", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ValidationFactors {
    def this(validationFactorPairs: Any) = this()
    
    /* CompleteClass */
    override def toCrowd(): ValidationFactorsObj = js.native
    
    /* CompleteClass */
    override val validationFactors: Any = js.native
  }
  @JSImport("atlassian-crowd-client/lib/models/validation-factors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromCrowd(validationFactorsObj: ValidationFactorsObj): ValidationFactors = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(validationFactorsObj.asInstanceOf[js.Any]).asInstanceOf[ValidationFactors]
  
  trait ValidationFactors extends StObject {
    
    def toCrowd(): ValidationFactorsObj
    
    val validationFactors: Any
  }
  object ValidationFactors {
    
    inline def apply(toCrowd: () => ValidationFactorsObj, validationFactors: Any): ValidationFactors = {
      val __obj = js.Dynamic.literal(toCrowd = js.Any.fromFunction0(toCrowd), validationFactors = validationFactors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationFactors]
    }
    
    extension [Self <: ValidationFactors](x: Self) {
      
      inline def setToCrowd(value: () => ValidationFactorsObj): Self = StObject.set(x, "toCrowd", js.Any.fromFunction0(value))
      
      inline def setValidationFactors(value: Any): Self = StObject.set(x, "validationFactors", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationFactorsObj extends StObject {
    
    var validationFactors: js.Array[Any]
  }
  object ValidationFactorsObj {
    
    inline def apply(validationFactors: js.Array[Any]): ValidationFactorsObj = {
      val __obj = js.Dynamic.literal(validationFactors = validationFactors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationFactorsObj]
    }
    
    extension [Self <: ValidationFactorsObj](x: Self) {
      
      inline def setValidationFactors(value: js.Array[Any]): Self = StObject.set(x, "validationFactors", value.asInstanceOf[js.Any])
      
      inline def setValidationFactorsVarargs(value: Any*): Self = StObject.set(x, "validationFactors", js.Array(value*))
    }
  }
}
