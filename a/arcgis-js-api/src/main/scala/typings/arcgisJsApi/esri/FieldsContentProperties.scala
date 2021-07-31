package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * Array of [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#fieldInfos)
    */
  var fieldInfos: js.UndefOr[js.Array[FieldInfoProperties]] = js.undefined
}
object FieldsContentProperties {
  
  @scala.inline
  def apply(): FieldsContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsContentProperties]
  }
  
  @scala.inline
  implicit class FieldsContentPropertiesMutableBuilder[Self <: FieldsContentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldInfos(value: js.Array[FieldInfoProperties]): Self = StObject.set(x, "fieldInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldInfosUndefined: Self = StObject.set(x, "fieldInfos", js.undefined)
    
    @scala.inline
    def setFieldInfosVarargs(value: FieldInfoProperties*): Self = StObject.set(x, "fieldInfos", js.Array(value :_*))
  }
}
