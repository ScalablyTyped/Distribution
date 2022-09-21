package typings.antdMobile.anon

import typings.antdMobile.renderToContainerMod.GetContainer
import typings.antdMobile.slidesMod.SlidesRef
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps, 'image' | 'renderFooter'> & {  images :std.Array<string> | undefined,   defaultIndex :number | undefined,   onIndexChange :(index : number): void | undefined,   renderFooter :(image : string, index : number): react.react.ReactNode | undefined} & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/image-viewer/slides.SlidesRef> */
trait OmitImageViewerPropsimage extends StObject {
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var defaultIndex: js.UndefOr[Double] = js.undefined
  
  var getContainer: js.UndefOr[GetContainer] = js.undefined
  
  var images: js.UndefOr[js.Array[String]] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var ref: js.UndefOr[Ref[SlidesRef]] = js.undefined
  
  var renderFooter: js.UndefOr[js.Function2[/* image */ String, /* index */ Double, ReactNode]] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OmitImageViewerPropsimage {
  
  inline def apply(): OmitImageViewerPropsimage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitImageViewerPropsimage]
  }
  
  extension [Self <: OmitImageViewerPropsimage](x: Self) {
    
    inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
    
    inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultIndexUndefined: Self = StObject.set(x, "defaultIndex", js.undefined)
    
    inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    inline def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
    
    inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnIndexChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
    
    inline def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
    
    inline def setRef(value: Ref[SlidesRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ SlidesRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRenderFooter(value: (/* image */ String, /* index */ Double) => ReactNode): Self = StObject.set(x, "renderFooter", js.Any.fromFunction2(value))
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
