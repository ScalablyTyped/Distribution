package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationRevision extends StObject {
  
  /**
    * 
    The time when the configuration revision was created.
    
    */
  var CreationTime: js.Date
  
  /**
    * 
    The description of the configuration revision.
    
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The revision number.
    
    */
  var Revision: long
}
object ConfigurationRevision {
  
  inline def apply(CreationTime: js.Date, Revision: long): ConfigurationRevision = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationRevision]
  }
  
  extension [Self <: ConfigurationRevision](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRevision(value: long): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
  }
}
