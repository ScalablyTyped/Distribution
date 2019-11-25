package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that contains options for initializing a map's features.
  */
trait MapConstructorOptions extends js.Object {
  /**
    * A delegate method for modifying cluster annotations.
    */
  var annotationForCluster: js.UndefOr[js.Function1[/* annotation */ Annotation, Unit]] = js.undefined
  /**
    * An array of all the annotations on the map.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * The map coordinate at the center of the map view.
    */
  var center: js.UndefOr[Coordinate] = js.undefined
  /**
    * The map’s color scheme when displaying standard or muted standard map types.
    */
  var colorScheme: js.UndefOr[String] = js.undefined
  /**
    * A Boolean value that determines whether the user may rotate the map using
    * the compass control or a rotate gesture.
    */
  var isRotationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that determines whether the user may scroll the map with
    * a pointing device or gestures on a touchscreen.
    */
  var isScrollEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that determines whether the user may zoom in and out on
    * the map using pinch gestures or the zoom control.
    */
  var isZoomEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of data displayed by the map view.
    */
  var mapType: js.UndefOr[String] = js.undefined
  /**
    * An array of all of the map's overlays.
    */
  var overlays: js.UndefOr[js.Array[Overlay]] = js.undefined
  /**
    * The map's inset margins.
    */
  var padding: js.UndefOr[Padding] = js.undefined
  /**
    * The area currently displayed by the map.
    */
  var region: js.UndefOr[CoordinateRegion] = js.undefined
  /**
    * The map's rotation, in degrees.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * The annotation on the map that is selected.
    */
  var selectedAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
    * The overlay on the map that is selected.
    */
  var selectedOverlay: js.UndefOr[Overlay] = js.undefined
  /**
    * A feature visibility setting that determines when the compass is visible.
    */
  var showsCompass: js.UndefOr[String] = js.undefined
  /**
    * A Boolean value that determines whether to display a control that lets
    * users choose the map type.
    */
  var showsMapTypeControl: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that determines whether the map displays points of interest.
    */
  var showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined
  /**
    * A feature visibility setting that determines when the map's scale is
    * displayed.
    */
  var showsScale: js.UndefOr[String] = js.undefined
  /**
    * A Boolean value that determines whether to show the user's location on
    * the map.
    */
  var showsUserLocation: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that determines whether the user location control is visible.
    */
  var showsUserLocationControl: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that determines whether to display a control for zooming
    * in and zooming out on a map.
    */
  var showsZoomControl: js.UndefOr[Boolean] = js.undefined
  /**
    * The CSS color that is used to paint the user interface controls on the map.
    */
  var tintColor: js.UndefOr[String] = js.undefined
  /**
    * A Boolean value that determines whether to center the map on the user's
    * location.
    */
  var tracksUserLocation: js.UndefOr[Boolean] = js.undefined
  /**
    * The visible area of the map defined in map units.
    */
  var visibleMapRect: js.UndefOr[MapRect] = js.undefined
}

object MapConstructorOptions {
  @scala.inline
  def apply(
    annotationForCluster: /* annotation */ Annotation => Unit = null,
    annotations: js.Array[Annotation] = null,
    center: Coordinate = null,
    colorScheme: String = null,
    isRotationEnabled: js.UndefOr[Boolean] = js.undefined,
    isScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    isZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    mapType: String = null,
    overlays: js.Array[Overlay] = null,
    padding: Padding = null,
    region: CoordinateRegion = null,
    rotation: Int | Double = null,
    selectedAnnotation: Annotation = null,
    selectedOverlay: Overlay = null,
    showsCompass: String = null,
    showsMapTypeControl: js.UndefOr[Boolean] = js.undefined,
    showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined,
    showsScale: String = null,
    showsUserLocation: js.UndefOr[Boolean] = js.undefined,
    showsUserLocationControl: js.UndefOr[Boolean] = js.undefined,
    showsZoomControl: js.UndefOr[Boolean] = js.undefined,
    tintColor: String = null,
    tracksUserLocation: js.UndefOr[Boolean] = js.undefined,
    visibleMapRect: MapRect = null
  ): MapConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (annotationForCluster != null) __obj.updateDynamic("annotationForCluster")(js.Any.fromFunction1(annotationForCluster))
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (!js.isUndefined(isRotationEnabled)) __obj.updateDynamic("isRotationEnabled")(isRotationEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrollEnabled)) __obj.updateDynamic("isScrollEnabled")(isScrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isZoomEnabled)) __obj.updateDynamic("isZoomEnabled")(isZoomEnabled.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (selectedAnnotation != null) __obj.updateDynamic("selectedAnnotation")(selectedAnnotation.asInstanceOf[js.Any])
    if (selectedOverlay != null) __obj.updateDynamic("selectedOverlay")(selectedOverlay.asInstanceOf[js.Any])
    if (showsCompass != null) __obj.updateDynamic("showsCompass")(showsCompass.asInstanceOf[js.Any])
    if (!js.isUndefined(showsMapTypeControl)) __obj.updateDynamic("showsMapTypeControl")(showsMapTypeControl.asInstanceOf[js.Any])
    if (!js.isUndefined(showsPointsOfInterest)) __obj.updateDynamic("showsPointsOfInterest")(showsPointsOfInterest.asInstanceOf[js.Any])
    if (showsScale != null) __obj.updateDynamic("showsScale")(showsScale.asInstanceOf[js.Any])
    if (!js.isUndefined(showsUserLocation)) __obj.updateDynamic("showsUserLocation")(showsUserLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(showsUserLocationControl)) __obj.updateDynamic("showsUserLocationControl")(showsUserLocationControl.asInstanceOf[js.Any])
    if (!js.isUndefined(showsZoomControl)) __obj.updateDynamic("showsZoomControl")(showsZoomControl.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tracksUserLocation)) __obj.updateDynamic("tracksUserLocation")(tracksUserLocation.asInstanceOf[js.Any])
    if (visibleMapRect != null) __obj.updateDynamic("visibleMapRect")(visibleMapRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapConstructorOptions]
  }
}

