package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAgeRule extends StObject {
  
  /**
    * Set to true to delete a version's source bundle from Amazon S3 when Elastic Beanstalk deletes the application version.
    */
  var DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Specify true to apply the rule, or false to disable it.
    */
  var Enabled: BoxedBoolean
  
  /**
    * Specify the number of days to retain an application versions.
    */
  var MaxAgeInDays: js.UndefOr[BoxedInt] = js.undefined
}
object MaxAgeRule {
  
  inline def apply(Enabled: BoxedBoolean): MaxAgeRule = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeRule]
  }
  
  extension [Self <: MaxAgeRule](x: Self) {
    
    inline def setDeleteSourceFromS3(value: BoxedBoolean): Self = StObject.set(x, "DeleteSourceFromS3", value.asInstanceOf[js.Any])
    
    inline def setDeleteSourceFromS3Undefined: Self = StObject.set(x, "DeleteSourceFromS3", js.undefined)
    
    inline def setEnabled(value: BoxedBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeInDays(value: BoxedInt): Self = StObject.set(x, "MaxAgeInDays", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeInDaysUndefined: Self = StObject.set(x, "MaxAgeInDays", js.undefined)
  }
}
