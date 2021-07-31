package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`private`
import typings.arcgisJsApi.arcgisJsApiStrings.inherit
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemResourceUpdateOptions
  extends StObject
     with Object {
  
  /**
    * Indicates the level of access to the resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#update)
    */
  var access: js.UndefOr[inherit | `private`] = js.undefined
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#update)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object PortalItemResourceUpdateOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PortalItemResourceUpdateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PortalItemResourceUpdateOptions]
  }
  
  @scala.inline
  implicit class PortalItemResourceUpdateOptionsMutableBuilder[Self <: PortalItemResourceUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: inherit | `private`): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
