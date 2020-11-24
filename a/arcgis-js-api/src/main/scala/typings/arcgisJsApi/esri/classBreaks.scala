package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating class breaks for an input field in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) based on a given classification method and normalization type.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html)
  */
@js.native
trait classBreaks extends js.Object {
  
  /**
    * Generates class breaks for an input field (or expression) of a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) based on a given classification method and normalization type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks)
    */
  def classBreaks(params: classBreaksClassBreaksParams): js.Promise[ClassBreaksResult] = js.native
}
object classBreaks {
  
  @scala.inline
  def apply(classBreaks: classBreaksClassBreaksParams => js.Promise[ClassBreaksResult]): classBreaks = {
    val __obj = js.Dynamic.literal(classBreaks = js.Any.fromFunction1(classBreaks))
    __obj.asInstanceOf[classBreaks]
  }
  
  @scala.inline
  implicit class classBreaksOps[Self <: classBreaks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassBreaks(value: classBreaksClassBreaksParams => js.Promise[ClassBreaksResult]): Self = this.set("classBreaks", js.Any.fromFunction1(value))
  }
}
