package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchPath extends StObject {
  
  /**
    * The identifier of the launch path.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Id] = js.undefined
  
  /**
    * The name of the launch path.
    */
  var Name: js.UndefOr[PortfolioName] = js.undefined
}
object LaunchPath {
  
  inline def apply(): LaunchPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchPath] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: PortfolioName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
