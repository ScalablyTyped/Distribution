package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the newly created configuration set.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the new configuration set.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The time when the configuration set was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An array of key and value pair tags that's associated with the configuration set.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateConfigurationSetResult {
  
  inline def apply(): CreateConfigurationSetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigurationSetResult]
  }
  
  extension [Self <: CreateConfigurationSetResult](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
