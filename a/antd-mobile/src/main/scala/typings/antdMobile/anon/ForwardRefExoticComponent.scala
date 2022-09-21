package typings.antdMobile.anon

import typings.antdMobile.methodsMod.ImageViewerShowHandler
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ForwardRefExoticComponent<std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.ImageViewerProps, 'image' | 'renderFooter'> & {  images :std.Array<string> | undefined,   defaultIndex :number | undefined,   onIndexChange :(index : number): void | undefined,   renderFooter :(image : string, index : number): react.react.ReactNode | undefined} & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/image-viewer/slides.SlidesRef>> & {  show :(props : std.Omit<antd-mobile.antd-mobile/es/components/image-viewer/image-viewer.MultiImageViewerProps, 'visible'>): antd-mobile.antd-mobile/es/components/image-viewer/methods.ImageViewerShowHandler} */
@js.native
trait ForwardRefExoticComponent extends StObject {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: OmitImageViewerPropsimage): ReactElement | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var defaultProps: js.UndefOr[PartialOmitImageViewerPro] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapOmitImag] = js.native
  
  var show: js.Function1[/* props */ OmitMultiImageViewerProps, ImageViewerShowHandler] = js.native
}
