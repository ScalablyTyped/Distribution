package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapConstructorOptions extends js.Object {
  var annotationForCluster: js.UndefOr[js.Function1[/* clusterAnnotation */ Annotation, Annotation]] = js.undefined
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  var center: js.UndefOr[Coordinate] = js.undefined
  var colorScheme: js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.MapNs.ColorSchemes] = js.undefined
  var isRotationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var isScrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var isZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var mapType: js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.MapNs.MapTypes] = js.undefined
  var overlays: js.UndefOr[js.Array[Overlay]] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var region: js.UndefOr[CoordinateRegion] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var selectedAnnotation: js.UndefOr[Annotation] = js.undefined
  var selectedOverlay: js.UndefOr[Overlay] = js.undefined
  var showsCompass: js.UndefOr[scala.Boolean] = js.undefined
  var showsMapTypeControl: js.UndefOr[scala.Boolean] = js.undefined
  var showsPointsOfInterest: js.UndefOr[scala.Boolean] = js.undefined
  var showsScale: js.UndefOr[scala.Boolean] = js.undefined
  var showsUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  var showsUserLocationControl: js.UndefOr[scala.Boolean] = js.undefined
  var showsZoomControl: js.UndefOr[scala.Boolean] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var tracksUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  var visibleMapRect: js.UndefOr[MapRect] = js.undefined
}

object MapConstructorOptions {
  @scala.inline
  def apply(
    annotationForCluster: /* clusterAnnotation */ Annotation => Annotation = null,
    annotations: js.Array[Annotation] = null,
    center: Coordinate = null,
    colorScheme: appleDashMapkitDashJsLib.mapkitNs.MapNs.ColorSchemes = null,
    isRotationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isScrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    mapType: appleDashMapkitDashJsLib.mapkitNs.MapNs.MapTypes = null,
    overlays: js.Array[Overlay] = null,
    padding: Padding = null,
    region: CoordinateRegion = null,
    rotation: scala.Int | scala.Double = null,
    selectedAnnotation: Annotation = null,
    selectedOverlay: Overlay = null,
    showsCompass: js.UndefOr[scala.Boolean] = js.undefined,
    showsMapTypeControl: js.UndefOr[scala.Boolean] = js.undefined,
    showsPointsOfInterest: js.UndefOr[scala.Boolean] = js.undefined,
    showsScale: js.UndefOr[scala.Boolean] = js.undefined,
    showsUserLocation: js.UndefOr[scala.Boolean] = js.undefined,
    showsUserLocationControl: js.UndefOr[scala.Boolean] = js.undefined,
    showsZoomControl: js.UndefOr[scala.Boolean] = js.undefined,
    tintColor: java.lang.String = null,
    tracksUserLocation: js.UndefOr[scala.Boolean] = js.undefined,
    visibleMapRect: MapRect = null
  ): MapConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (annotationForCluster != null) __obj.updateDynamic("annotationForCluster")(js.Any.fromFunction1(annotationForCluster))
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (center != null) __obj.updateDynamic("center")(center)
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme)
    if (!js.isUndefined(isRotationEnabled)) __obj.updateDynamic("isRotationEnabled")(isRotationEnabled)
    if (!js.isUndefined(isScrollEnabled)) __obj.updateDynamic("isScrollEnabled")(isScrollEnabled)
    if (!js.isUndefined(isZoomEnabled)) __obj.updateDynamic("isZoomEnabled")(isZoomEnabled)
    if (mapType != null) __obj.updateDynamic("mapType")(mapType)
    if (overlays != null) __obj.updateDynamic("overlays")(overlays)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (region != null) __obj.updateDynamic("region")(region)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (selectedAnnotation != null) __obj.updateDynamic("selectedAnnotation")(selectedAnnotation)
    if (selectedOverlay != null) __obj.updateDynamic("selectedOverlay")(selectedOverlay)
    if (!js.isUndefined(showsCompass)) __obj.updateDynamic("showsCompass")(showsCompass)
    if (!js.isUndefined(showsMapTypeControl)) __obj.updateDynamic("showsMapTypeControl")(showsMapTypeControl)
    if (!js.isUndefined(showsPointsOfInterest)) __obj.updateDynamic("showsPointsOfInterest")(showsPointsOfInterest)
    if (!js.isUndefined(showsScale)) __obj.updateDynamic("showsScale")(showsScale)
    if (!js.isUndefined(showsUserLocation)) __obj.updateDynamic("showsUserLocation")(showsUserLocation)
    if (!js.isUndefined(showsUserLocationControl)) __obj.updateDynamic("showsUserLocationControl")(showsUserLocationControl)
    if (!js.isUndefined(showsZoomControl)) __obj.updateDynamic("showsZoomControl")(showsZoomControl)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (!js.isUndefined(tracksUserLocation)) __obj.updateDynamic("tracksUserLocation")(tracksUserLocation)
    if (visibleMapRect != null) __obj.updateDynamic("visibleMapRect")(visibleMapRect)
    __obj.asInstanceOf[MapConstructorOptions]
  }
}

