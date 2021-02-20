package typings.angularOdataResources.OData

import typings.angularOdataResources.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Currently supported options for the $resource factory options argument.
  */
@js.native
trait IResourceOptions extends StObject {
  
  var isodatav4: js.UndefOr[Boolean] = js.native
  
  var odata: js.UndefOr[Method] = js.native
  
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[Boolean] = js.native
}
object IResourceOptions {
  
  @scala.inline
  def apply(): IResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceOptions]
  }
  
  @scala.inline
  implicit class IResourceOptionsMutableBuilder[Self <: IResourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsodatav4(value: Boolean): Self = StObject.set(x, "isodatav4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsodatav4Undefined: Self = StObject.set(x, "isodatav4", js.undefined)
    
    @scala.inline
    def setOdata(value: Method): Self = StObject.set(x, "odata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOdataUndefined: Self = StObject.set(x, "odata", js.undefined)
    
    @scala.inline
    def setStripTrailingSlashes(value: Boolean): Self = StObject.set(x, "stripTrailingSlashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripTrailingSlashesUndefined: Self = StObject.set(x, "stripTrailingSlashes", js.undefined)
  }
}
