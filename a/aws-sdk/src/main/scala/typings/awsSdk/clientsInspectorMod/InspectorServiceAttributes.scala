package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorServiceAttributes extends StObject {
  
  /**
    * The ARN of the assessment run during which the finding is generated.
    */
  var assessmentRunArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the rules package that is used to generate the finding.
    */
  var rulesPackageArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion
}
object InspectorServiceAttributes {
  
  inline def apply(schemaVersion: NumericVersion): InspectorServiceAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorServiceAttributes]
  }
  
  extension [Self <: InspectorServiceAttributes](x: Self) {
    
    inline def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentRunArnUndefined: Self = StObject.set(x, "assessmentRunArn", js.undefined)
    
    inline def setRulesPackageArn(value: Arn): Self = StObject.set(x, "rulesPackageArn", value.asInstanceOf[js.Any])
    
    inline def setRulesPackageArnUndefined: Self = StObject.set(x, "rulesPackageArn", js.undefined)
    
    inline def setSchemaVersion(value: NumericVersion): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
  }
}
