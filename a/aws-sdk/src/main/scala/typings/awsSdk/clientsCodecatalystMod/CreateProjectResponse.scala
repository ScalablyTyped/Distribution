package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResponse extends StObject {
  
  /**
    * The description of the project.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The friendly name of the project.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project in the space.
    */
  var name: NameString
  
  /**
    * The name of the space.
    */
  var spaceName: js.UndefOr[NameString] = js.undefined
}
object CreateProjectResponse {
  
  inline def apply(name: NameString): CreateProjectResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProjectResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
    
    inline def setSpaceNameUndefined: Self = StObject.set(x, "spaceName", js.undefined)
  }
}
