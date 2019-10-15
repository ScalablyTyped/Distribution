package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.landscape
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.large
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.medium
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.portrait
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.small
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xlarge
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.BreakpointsOwner")
@js.native
class BreakpointsOwnerCls () extends BreakpointsOwner {
  /**
    * A convenience property used for defining the breakpoints on the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) and [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view. The sizes specified here determine the values of the [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) and [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) properties depending on the view's size.  Setting up breakpoints can aid in responsive app design. It does this by watching width and height breakpoints. This is helpful as it removes the need for multiple [`@media` calls](https://developer.mozilla.org/en-US/docs/Web/CSS/Media_Queries). Instead of listening for the view's size and/or resizes property, you can set up a watch handler for either the [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) or [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) properties of the view.
    * > Please refer to the [styling guide](https://developers.arcgis.com/javascript/latest/guide/styling/index.html#view-size-css-classes) for additional information on working with this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    */
  /* CompleteClass */
  override var breakpoints: BreakpointsOwnerBreakpoints = js.native
  /**
    * A convenience property indicating the general size of the view's height. This value is determined based on where the view's [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) falls in the ranges defined in the [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints) property. See the table below for a list of possible values. Use the [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints) property to override the default thresholds.
    * > Please refer to the [styling guide](https://developers.arcgis.com/javascript/latest/guide/styling/index.html#view-size-css-classes) for additional information on working with this.
    *
    * Possible Value | Description | Default thresholds (pixels)
    * ---------------|-------------|----------------------------
    * xsmall | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is smaller than the value set in the `xsmall` [breakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | < 545
    * small | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is between the values set in the `xsmall` and `small` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 545 - 768
    * medium | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is between the values set in the `small` and `medium` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 769 - 992
    * large | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is between the values set in the `medium` and `large` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 993 - 1200
    * xlarge | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is larger than the value set in the `large` [breakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | > 1200
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint)
    */
  /* CompleteClass */
  override var heightBreakpoint: xsmall | small | medium | large | xlarge = js.native
  /**
    * A convenience property indicating the view's orientation. See the table below for a list of possible values.
    * > Please refer to the [styling guide](https://developers.arcgis.com/javascript/latest/guide/styling/index.html#view-size-css-classes) for additional information on working with this.
    *
    * Possible Value | Description
    * ---------------|------------
    * landscape | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is greater than its [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height).
    * portrait | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is equal to or smaller than its [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#orientation)
    */
  /* CompleteClass */
  override val orientation: landscape | portrait = js.native
  /**
    * A convenience property indicating the general size of the view's width. This value is determined based on where the view's [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) falls in the ranges defined in the [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints) property. See the table below for a list of possible values. Use the [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints) property to override the default thresholds.
    * > Please refer to the [styling guide](https://developers.arcgis.com/javascript/latest/guide/styling/index.html#view-size-css-classes) for additional information on working with this.
    *
    * Possible Value | Description | Default thresholds (pixels)
    * ---------------|-------------|-------------------
    * xsmall | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is smaller than the value set in the `xsmall` [breakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | < 545
    * small | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is between the values set in the `xsmall` and `small` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 545 - 768
    * medium | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is between the values set in the `small` and `medium` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 769 - 992
    * large | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is between the values set in the `medium` and `large` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 993 - 1200
    * xlarge | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is larger than the value set in the `large` [breakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | > 1200
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint)
    */
  /* CompleteClass */
  override var widthBreakpoint: xsmall | small | medium | large | xlarge = js.native
}

