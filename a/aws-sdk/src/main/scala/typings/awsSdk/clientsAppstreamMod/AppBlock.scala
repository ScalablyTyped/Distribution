package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppBlock extends StObject {
  
  /**
    * The ARN of the app block.
    */
  var Arn: typings.awsSdk.clientsAppstreamMod.Arn
  
  /**
    * The created time of the app block.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the app block.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of the app block.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the app block.
    */
  var Name: String
  
  /**
    * The setup script details of the app block.
    */
  var SetupScriptDetails: ScriptDetails
  
  /**
    * The source S3 location of the app block.
    */
  var SourceS3Location: js.UndefOr[S3Location] = js.undefined
}
object AppBlock {
  
  inline def apply(Arn: Arn, Name: String, SetupScriptDetails: ScriptDetails): AppBlock = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SetupScriptDetails = SetupScriptDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppBlock] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSetupScriptDetails(value: ScriptDetails): Self = StObject.set(x, "SetupScriptDetails", value.asInstanceOf[js.Any])
    
    inline def setSourceS3Location(value: S3Location): Self = StObject.set(x, "SourceS3Location", value.asInstanceOf[js.Any])
    
    inline def setSourceS3LocationUndefined: Self = StObject.set(x, "SourceS3Location", js.undefined)
  }
}
