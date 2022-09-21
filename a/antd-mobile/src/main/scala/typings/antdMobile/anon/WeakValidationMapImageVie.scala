package typings.antdMobile.anon

import typings.antdMobile.renderToContainerMod.GetContainer
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps> */
trait WeakValidationMapImageVie extends StObject {
  
  var afterClose: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var getContainer: js.UndefOr[Validator[js.UndefOr[GetContainer | Null]]] = js.undefined
  
  var image: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var maxZoom: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var onClose: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var renderFooter: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* image */ String, ReactNode]) | Null]]] = js.undefined
  
  var visible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapImageVie {
  
  inline def apply(): WeakValidationMapImageVie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapImageVie]
  }
  
  extension [Self <: WeakValidationMapImageVie](x: Self) {
    
    inline def setAfterClose(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "afterClose", value.asInstanceOf[js.Any])
    
    inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    inline def setGetContainer(value: Validator[js.UndefOr[GetContainer | Null]]): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    inline def setImage(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setMaxZoom(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setOnClose(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setRenderFooter(value: Validator[js.UndefOr[(js.Function1[/* image */ String, ReactNode]) | Null]]): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    inline def setVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
