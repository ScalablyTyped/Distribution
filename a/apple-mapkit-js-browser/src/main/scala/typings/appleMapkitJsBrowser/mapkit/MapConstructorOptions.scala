package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains options for initializing a map's features.
  */
trait MapConstructorOptions extends StObject {
  
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
  
  /*
    * The filter used to determine the points of interest shown on the map.
    */
  var pointOfInterestFilter: js.UndefOr[PointOfInterestFilter] = js.undefined
  
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
  def apply(): MapConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapConstructorOptions]
  }
  
  @scala.inline
  implicit class MapConstructorOptionsMutableBuilder[Self <: MapConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationForCluster(value: /* annotation */ Annotation => Unit): Self = StObject.set(x, "annotationForCluster", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnnotationForClusterUndefined: Self = StObject.set(x, "annotationForCluster", js.undefined)
    
    @scala.inline
    def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setColorScheme(value: String): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    @scala.inline
    def setIsRotationEnabled(value: Boolean): Self = StObject.set(x, "isRotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRotationEnabledUndefined: Self = StObject.set(x, "isRotationEnabled", js.undefined)
    
    @scala.inline
    def setIsScrollEnabled(value: Boolean): Self = StObject.set(x, "isScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollEnabledUndefined: Self = StObject.set(x, "isScrollEnabled", js.undefined)
    
    @scala.inline
    def setIsZoomEnabled(value: Boolean): Self = StObject.set(x, "isZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsZoomEnabledUndefined: Self = StObject.set(x, "isZoomEnabled", js.undefined)
    
    @scala.inline
    def setMapType(value: String): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
    
    @scala.inline
    def setOverlays(value: js.Array[Overlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    @scala.inline
    def setOverlaysVarargs(value: Overlay*): Self = StObject.set(x, "overlays", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPointOfInterestFilter(value: PointOfInterestFilter): Self = StObject.set(x, "pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointOfInterestFilterUndefined: Self = StObject.set(x, "pointOfInterestFilter", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSelectedAnnotation(value: Annotation): Self = StObject.set(x, "selectedAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedAnnotationUndefined: Self = StObject.set(x, "selectedAnnotation", js.undefined)
    
    @scala.inline
    def setSelectedOverlay(value: Overlay): Self = StObject.set(x, "selectedOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOverlayUndefined: Self = StObject.set(x, "selectedOverlay", js.undefined)
    
    @scala.inline
    def setShowsCompass(value: String): Self = StObject.set(x, "showsCompass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsCompassUndefined: Self = StObject.set(x, "showsCompass", js.undefined)
    
    @scala.inline
    def setShowsMapTypeControl(value: Boolean): Self = StObject.set(x, "showsMapTypeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsMapTypeControlUndefined: Self = StObject.set(x, "showsMapTypeControl", js.undefined)
    
    @scala.inline
    def setShowsPointsOfInterest(value: Boolean): Self = StObject.set(x, "showsPointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsPointsOfInterestUndefined: Self = StObject.set(x, "showsPointsOfInterest", js.undefined)
    
    @scala.inline
    def setShowsScale(value: String): Self = StObject.set(x, "showsScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsScaleUndefined: Self = StObject.set(x, "showsScale", js.undefined)
    
    @scala.inline
    def setShowsUserLocation(value: Boolean): Self = StObject.set(x, "showsUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsUserLocationControl(value: Boolean): Self = StObject.set(x, "showsUserLocationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsUserLocationControlUndefined: Self = StObject.set(x, "showsUserLocationControl", js.undefined)
    
    @scala.inline
    def setShowsUserLocationUndefined: Self = StObject.set(x, "showsUserLocation", js.undefined)
    
    @scala.inline
    def setShowsZoomControl(value: Boolean): Self = StObject.set(x, "showsZoomControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsZoomControlUndefined: Self = StObject.set(x, "showsZoomControl", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setTracksUserLocation(value: Boolean): Self = StObject.set(x, "tracksUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUserLocationUndefined: Self = StObject.set(x, "tracksUserLocation", js.undefined)
    
    @scala.inline
    def setVisibleMapRect(value: MapRect): Self = StObject.set(x, "visibleMapRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleMapRectUndefined: Self = StObject.set(x, "visibleMapRect", js.undefined)
  }
}
