package typings.atlassianCrowdClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationFactorsMod {
  
  @JSImport("atlassian-crowd-client/lib/models/validation-factors", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ValidationFactors {
    def this(validationFactorPairs: js.Any) = this()
    
    /* CompleteClass */
    override def toCrowd(): ValidationFactorsObj = js.native
    
    /* CompleteClass */
    override val validationFactors: js.Any = js.native
  }
  @JSImport("atlassian-crowd-client/lib/models/validation-factors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromCrowd(validationFactorsObj: ValidationFactorsObj): ValidationFactors = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(validationFactorsObj.asInstanceOf[js.Any]).asInstanceOf[ValidationFactors]
  
  trait ValidationFactors extends StObject {
    
    def toCrowd(): ValidationFactorsObj
    
    val validationFactors: js.Any
  }
  object ValidationFactors {
    
    @scala.inline
    def apply(toCrowd: () => ValidationFactorsObj, validationFactors: js.Any): ValidationFactors = {
      val __obj = js.Dynamic.literal(toCrowd = js.Any.fromFunction0(toCrowd), validationFactors = validationFactors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationFactors]
    }
    
    @scala.inline
    implicit class ValidationFactorsMutableBuilder[Self <: ValidationFactors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToCrowd(value: () => ValidationFactorsObj): Self = StObject.set(x, "toCrowd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValidationFactors(value: js.Any): Self = StObject.set(x, "validationFactors", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationFactorsObj extends StObject {
    
    var validationFactors: js.Array[js.Any]
  }
  object ValidationFactorsObj {
    
    @scala.inline
    def apply(validationFactors: js.Array[js.Any]): ValidationFactorsObj = {
      val __obj = js.Dynamic.literal(validationFactors = validationFactors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationFactorsObj]
    }
    
    @scala.inline
    implicit class ValidationFactorsObjMutableBuilder[Self <: ValidationFactorsObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidationFactors(value: js.Array[js.Any]): Self = StObject.set(x, "validationFactors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationFactorsVarargs(value: js.Any*): Self = StObject.set(x, "validationFactors", js.Array(value :_*))
    }
  }
}
