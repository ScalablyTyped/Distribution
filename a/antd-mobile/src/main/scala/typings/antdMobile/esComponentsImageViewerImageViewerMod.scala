package typings.antdMobile

import typings.antdMobile.anon.OmitImageViewerPropsimage
import typings.antdMobile.antdMobileStrings.auto
import typings.antdMobile.esComponentsImageViewerSlidesMod.SlidesRef
import typings.antdMobile.esUtilsRenderToContainerMod.GetContainer
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsImageViewerImageViewerMod {
  
  @JSImport("antd-mobile/es/components/image-viewer/image-viewer", "ImageViewer")
  @js.native
  val ImageViewer: FC[ImageViewerProps] = js.native
  
  @JSImport("antd-mobile/es/components/image-viewer/image-viewer", "MultiImageViewer")
  @js.native
  val MultiImageViewer: ForwardRefExoticComponent[OmitImageViewerPropsimage] = js.native
  
  trait ImageViewerProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var getContainer: js.UndefOr[GetContainer] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var maxZoom: js.UndefOr[Double | auto] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderFooter: js.UndefOr[js.Function1[/* image */ String, ReactNode]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ImageViewerProps {
    
    inline def apply(): ImageViewerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageViewerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageViewerProps] (val x: Self) extends AnyVal {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setMaxZoom(value: Double | auto): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setRenderFooter(value: /* image */ String => ReactNode): Self = StObject.set(x, "renderFooter", js.Any.fromFunction1(value))
      
      inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Inlined std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps, 'image' | 'renderFooter'> & {  images :std.Array<string> | undefined,   defaultIndex :number | undefined,   onIndexChange :(index : number): void | undefined,   renderFooter :(image : string, index : number): react.react.ReactNode | undefined} */
  trait MultiImageViewerProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var defaultIndex: js.UndefOr[Double] = js.undefined
    
    var getContainer: js.UndefOr[GetContainer] = js.undefined
    
    var images: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxZoom: js.UndefOr[Double | auto] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var renderFooter: js.UndefOr[js.Function2[/* image */ String, /* index */ Double, ReactNode]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object MultiImageViewerProps {
    
    inline def apply(): MultiImageViewerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiImageViewerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiImageViewerProps] (val x: Self) extends AnyVal {
      
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
      
      inline def setMaxZoom(value: Double | auto): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnIndexChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
      
      inline def setRenderFooter(value: (/* image */ String, /* index */ Double) => ReactNode): Self = StObject.set(x, "renderFooter", js.Any.fromFunction2(value))
      
      inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type MultiImageViewerRef = SlidesRef
}
