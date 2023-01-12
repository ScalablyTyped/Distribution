package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareAttributes extends StObject {
  
  /**
    * A fair share identifier or fair share identifier prefix. If the string ends with an asterisk (*), this entry specifies the weight factor to use for fair share identifiers that start with that prefix. The list of fair share identifiers in a fair share policy can't overlap. For example, you can't have one that specifies a shareIdentifier of UserA* and another that specifies a shareIdentifier of UserA-1. There can be no more than 500 fair share identifiers active in a job queue. The string is limited to 255 alphanumeric characters, and can be followed by an asterisk (*).
    */
  var shareIdentifier: String
  
  /**
    * The weight factor for the fair share identifier. The default value is 1.0. A lower value has a higher priority for compute resources. For example, jobs that use a share identifier with a weight factor of 0.125 (1/8) get 8 times the compute resources of jobs that use a share identifier with a weight factor of 1. The smallest supported value is 0.0001, and the largest supported value is 999.9999.
    */
  var weightFactor: js.UndefOr[Float] = js.undefined
}
object ShareAttributes {
  
  inline def apply(shareIdentifier: String): ShareAttributes = {
    val __obj = js.Dynamic.literal(shareIdentifier = shareIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareAttributes] (val x: Self) extends AnyVal {
    
    inline def setShareIdentifier(value: String): Self = StObject.set(x, "shareIdentifier", value.asInstanceOf[js.Any])
    
    inline def setWeightFactor(value: Float): Self = StObject.set(x, "weightFactor", value.asInstanceOf[js.Any])
    
    inline def setWeightFactorUndefined: Self = StObject.set(x, "weightFactor", js.undefined)
  }
}
