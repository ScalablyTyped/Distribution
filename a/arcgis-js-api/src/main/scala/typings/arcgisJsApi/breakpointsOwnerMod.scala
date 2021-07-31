package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.arcgisJsApiStrings.landscape
import typings.arcgisJsApi.arcgisJsApiStrings.large
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.arcgisJsApi.arcgisJsApiStrings.portrait
import typings.arcgisJsApi.arcgisJsApiStrings.small
import typings.arcgisJsApi.arcgisJsApiStrings.xlarge
import typings.arcgisJsApi.arcgisJsApiStrings.xsmall
import typings.arcgisJsApi.esri.BreakpointsOwner
import typings.arcgisJsApi.esri.BreakpointsOwnerBreakpoints
import typings.arcgisJsApi.esri.BreakpointsOwnerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breakpointsOwnerMod extends Shortcut {
  
  @JSImport("esri/views/BreakpointsOwner", JSImport.Namespace)
  @js.native
  val ^ : BreakpointsOwnerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/BreakpointsOwner", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with BreakpointsOwner {
    
    /**
      * A convenience property used for defining the breakpoints on the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) and [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
      */
    /* CompleteClass */
    var breakpoints: BreakpointsOwnerBreakpoints = js.native
    
    /**
      * A convenience property indicating the general size of the view's height.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint)
      */
    /* CompleteClass */
    var heightBreakpoint: xsmall | small | medium | large | xlarge = js.native
    
    /**
      * A convenience property indicating the view's orientation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#orientation)
      */
    /* CompleteClass */
    override val orientation: landscape | portrait = js.native
    
    /**
      * A convenience property indicating the general size of the view's width.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint)
      */
    /* CompleteClass */
    var widthBreakpoint: xsmall | small | medium | large | xlarge = js.native
  }
  
  type _To = BreakpointsOwnerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `breakpointsOwnerMod.foo` */
  override def _to: BreakpointsOwnerConstructor = ^
}
