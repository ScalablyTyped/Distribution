package typings.antdMobile.anon

import typings.antdMobile.renderToContainerMod.GetContainer
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps> */
trait PartialImageViewerProps extends StObject {
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var getContainer: js.UndefOr[GetContainer] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var renderFooter: js.UndefOr[js.Function1[/* image */ String, ReactNode]] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PartialImageViewerProps {
  
  inline def apply(): PartialImageViewerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialImageViewerProps]
  }
  
  extension [Self <: PartialImageViewerProps](x: Self) {
    
    inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
    
    inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    inline def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
    
    inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setRenderFooter(value: /* image */ String => ReactNode): Self = StObject.set(x, "renderFooter", js.Any.fromFunction1(value))
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
