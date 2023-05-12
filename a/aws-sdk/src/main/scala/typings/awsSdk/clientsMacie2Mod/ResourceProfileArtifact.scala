package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceProfileArtifact extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the object.
    */
  var arn: string
  
  /**
    * The status of the analysis. Possible values are: COMPLETE - Amazon Macie successfully completed its analysis of the object. PARTIAL - Macie analyzed only a subset of data in the object. For example, the object is an archive file that contains files in an unsupported format. SKIPPED - Macie wasn't able to analyze the object. For example, the object is a malformed file.
    */
  var classificationResultStatus: string
  
  /**
    * Specifies whether Amazon Macie found sensitive data in the object.
    */
  var sensitive: js.UndefOr[boolean] = js.undefined
}
object ResourceProfileArtifact {
  
  inline def apply(arn: string, classificationResultStatus: string): ResourceProfileArtifact = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], classificationResultStatus = classificationResultStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceProfileArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceProfileArtifact] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setClassificationResultStatus(value: string): Self = StObject.set(x, "classificationResultStatus", value.asInstanceOf[js.Any])
    
    inline def setSensitive(value: boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
  }
}
