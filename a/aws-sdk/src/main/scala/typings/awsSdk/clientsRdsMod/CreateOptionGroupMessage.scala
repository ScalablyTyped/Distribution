package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOptionGroupMessage extends StObject {
  
  /**
    * Specifies the name of the engine that this option group should be associated with. Valid Values:    mariadb     mysql     oracle-ee     oracle-ee-cdb     oracle-se2     oracle-se2-cdb     postgres     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
    */
  var EngineName: String
  
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  var MajorEngineVersion: String
  
  /**
    * The description of the option group.
    */
  var OptionGroupDescription: String
  
  /**
    * Specifies the name of the option group to be created. Constraints:   Must be 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: myoptiongroup 
    */
  var OptionGroupName: String
  
  /**
    * Tags to assign to the option group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateOptionGroupMessage {
  
  inline def apply(
    EngineName: String,
    MajorEngineVersion: String,
    OptionGroupDescription: String,
    OptionGroupName: String
  ): CreateOptionGroupMessage = {
    val __obj = js.Dynamic.literal(EngineName = EngineName.asInstanceOf[js.Any], MajorEngineVersion = MajorEngineVersion.asInstanceOf[js.Any], OptionGroupDescription = OptionGroupDescription.asInstanceOf[js.Any], OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptionGroupMessage]
  }
  
  extension [Self <: CreateOptionGroupMessage](x: Self) {
    
    inline def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    inline def setMajorEngineVersion(value: String): Self = StObject.set(x, "MajorEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupDescription(value: String): Self = StObject.set(x, "OptionGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
