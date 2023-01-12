package typings.antdMobile.anon

import typings.antdMobile.antdMobileStrings.auto
import typings.antdMobile.esUtilsRenderToContainerMod.GetContainer
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.MultiImageViewerProps, 'visible'> */
trait OmitMultiImageViewerProps extends StObject {
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var defaultIndex: js.UndefOr[Double] = js.undefined
  
  var getContainer: js.UndefOr[GetContainer] = js.undefined
  
  var images: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxZoom: js.UndefOr[Double | auto] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var renderFooter: js.UndefOr[js.Function2[/* image */ String, /* index */ Double, ReactNode]] = js.undefined
}
object OmitMultiImageViewerProps {
  
  inline def apply(): OmitMultiImageViewerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitMultiImageViewerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitMultiImageViewerProps] (val x: Self) extends AnyVal {
    
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
  }
}
