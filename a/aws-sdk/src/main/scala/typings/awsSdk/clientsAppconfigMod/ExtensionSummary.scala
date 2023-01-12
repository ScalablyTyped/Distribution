package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionSummary extends StObject {
  
  /**
    * The system-generated Amazon Resource Name (ARN) for the extension.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Arn] = js.undefined
  
  /**
    * Information about the extension.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The system-generated ID of the extension.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Id] = js.undefined
  
  /**
    * The extension name.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Name] = js.undefined
  
  /**
    * The extension version number.
    */
  var VersionNumber: js.UndefOr[Integer] = js.undefined
}
object ExtensionSummary {
  
  inline def apply(): ExtensionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersionNumber(value: Integer): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
