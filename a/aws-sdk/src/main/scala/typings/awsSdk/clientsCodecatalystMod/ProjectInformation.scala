package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectInformation extends StObject {
  
  /**
    * The name of the project in the space.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The system-generated unique ID of the project.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ProjectInformation {
  
  inline def apply(): ProjectInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectInformation] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
