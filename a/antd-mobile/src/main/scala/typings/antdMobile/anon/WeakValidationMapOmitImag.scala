package typings.antdMobile.anon

import typings.antdMobile.renderToContainerMod.GetContainer
import typings.antdMobile.slidesMod.SlidesRef
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps, 'image' | 'renderFooter'> & {  images :std.Array<string> | undefined,   defaultIndex :number | undefined,   onIndexChange :(index : number): void | undefined,   renderFooter :(image : string, index : number): react.react.ReactNode | undefined} & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/image-viewer/slides.SlidesRef>> */
trait WeakValidationMapOmitImag extends StObject {
  
  var afterClose: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var defaultIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var getContainer: js.UndefOr[Validator[js.UndefOr[GetContainer | Null]]] = js.undefined
  
  var images: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.undefined
  
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.undefined
  
  var maxZoom: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var onClose: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onIndexChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* index */ Double, Unit]) | Null]]] = js.undefined
  
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[SlidesRef]]]] = js.undefined
  
  var renderFooter: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function2[/* image */ String, /* index */ Double, ReactNode]) | Null]
    ]
  ] = js.undefined
  
  var visible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapOmitImag {
  
  inline def apply(): WeakValidationMapOmitImag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapOmitImag]
  }
  
  extension [Self <: WeakValidationMapOmitImag](x: Self) {
    
    inline def setAfterClose(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "afterClose", value.asInstanceOf[js.Any])
    
    inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    inline def setDefaultIndex(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultIndexUndefined: Self = StObject.set(x, "defaultIndex", js.undefined)
    
    inline def setGetContainer(value: Validator[js.UndefOr[GetContainer | Null]]): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    inline def setImages(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMaxZoom(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setOnClose(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnIndexChange(value: Validator[js.UndefOr[(js.Function1[/* index */ Double, Unit]) | Null]]): Self = StObject.set(x, "onIndexChange", value.asInstanceOf[js.Any])
    
    inline def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
    
    inline def setRef(value: Validator[js.UndefOr[Null | Ref[SlidesRef]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRenderFooter(
      value: Validator[
          js.UndefOr[(js.Function2[/* image */ String, /* index */ Double, ReactNode]) | Null]
        ]
    ): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    inline def setVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
