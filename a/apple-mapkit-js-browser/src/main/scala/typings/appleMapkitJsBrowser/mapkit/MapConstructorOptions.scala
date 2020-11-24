package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains options for initializing a map's features.
  */
@js.native
trait MapConstructorOptions extends js.Object {
  
  /**
    * A delegate method for modifying cluster annotations.
    */
  var annotationForCluster: js.UndefOr[js.Function1[/* annotation */ Annotation, Unit]] = js.native
  
  /**
    * An array of all the annotations on the map.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * The map coordinate at the center of the map view.
    */
  var center: js.UndefOr[Coordinate] = js.native
  
  /**
    * The map’s color scheme when displaying standard or muted standard map types.
    */
  var colorScheme: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that determines whether the user may rotate the map using
    * the compass control or a rotate gesture.
    */
  var isRotationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that determines whether the user may scroll the map with
    * a pointing device or gestures on a touchscreen.
    */
  var isScrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that determines whether the user may zoom in and out on
    * the map using pinch gestures or the zoom control.
    */
  var isZoomEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of data displayed by the map view.
    */
  var mapType: js.UndefOr[String] = js.native
  
  /**
    * An array of all of the map's overlays.
    */
  var overlays: js.UndefOr[js.Array[Overlay]] = js.native
  
  /**
    * The map's inset margins.
    */
  var padding: js.UndefOr[Padding] = js.native
  
  /*
    * The filter used to determine the points of interest shown on the map.
    */
  var pointOfInterestFilter: js.UndefOr[PointOfInterestFilter] = js.native
  
  /**
    * The area currently displayed by the map.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
  
  /**
    * The map's rotation, in degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * The annotation on the map that is selected.
    */
  var selectedAnnotation: js.UndefOr[Annotation] = js.native
  
  /**
    * The overlay on the map that is selected.
    */
  var selectedOverlay: js.UndefOr[Overlay] = js.native
  
  /**
    * A feature visibility setting that determines when the compass is visible.
    */
  var showsCompass: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that determines whether to display a control that lets
    * users choose the map type.
    */
  var showsMapTypeControl: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that determines whether the map displays points of interest.
    */
  var showsPointsOfInterest: js.UndefOr[Boolean] = js.native
  
  /**
    * A feature visibility setting that determines when the map's scale is
    * displayed.
    */
  var showsScale: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that determines whether to show the user's location on
    * the map.
    */
  var showsUserLocation: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that determines whether the user location control is visible.
    */
  var showsUserLocationControl: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that determines whether to display a control for zooming
    * in and zooming out on a map.
    */
  var showsZoomControl: js.UndefOr[Boolean] = js.native
  
  /**
    * The CSS color that is used to paint the user interface controls on the map.
    */
  var tintColor: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that determines whether to center the map on the user's
    * location.
    */
  var tracksUserLocation: js.UndefOr[Boolean] = js.native
  
  /**
    * The visible area of the map defined in map units.
    */
  var visibleMapRect: js.UndefOr[MapRect] = js.native
}
object MapConstructorOptions {
  
  @scala.inline
  def apply(): MapConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapConstructorOptions]
  }
  
  @scala.inline
  implicit class MapConstructorOptionsOps[Self <: MapConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationForCluster(value: /* annotation */ Annotation => Unit): Self = this.set("annotationForCluster", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAnnotationForCluster: Self = this.set("annotationForCluster", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: Annotation*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[Annotation]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setCenter(value: Coordinate): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setColorScheme(value: String): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    
    @scala.inline
    def setIsRotationEnabled(value: Boolean): Self = this.set("isRotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRotationEnabled: Self = this.set("isRotationEnabled", js.undefined)
    
    @scala.inline
    def setIsScrollEnabled(value: Boolean): Self = this.set("isScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsScrollEnabled: Self = this.set("isScrollEnabled", js.undefined)
    
    @scala.inline
    def setIsZoomEnabled(value: Boolean): Self = this.set("isZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsZoomEnabled: Self = this.set("isZoomEnabled", js.undefined)
    
    @scala.inline
    def setMapType(value: String): Self = this.set("mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapType: Self = this.set("mapType", js.undefined)
    
    @scala.inline
    def setOverlaysVarargs(value: Overlay*): Self = this.set("overlays", js.Array(value :_*))
    
    @scala.inline
    def setOverlays(value: js.Array[Overlay]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPointOfInterestFilter(value: PointOfInterestFilter): Self = this.set("pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointOfInterestFilter: Self = this.set("pointOfInterestFilter", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setSelectedAnnotation(value: Annotation): Self = this.set("selectedAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedAnnotation: Self = this.set("selectedAnnotation", js.undefined)
    
    @scala.inline
    def setSelectedOverlay(value: Overlay): Self = this.set("selectedOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedOverlay: Self = this.set("selectedOverlay", js.undefined)
    
    @scala.inline
    def setShowsCompass(value: String): Self = this.set("showsCompass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsCompass: Self = this.set("showsCompass", js.undefined)
    
    @scala.inline
    def setShowsMapTypeControl(value: Boolean): Self = this.set("showsMapTypeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsMapTypeControl: Self = this.set("showsMapTypeControl", js.undefined)
    
    @scala.inline
    def setShowsPointsOfInterest(value: Boolean): Self = this.set("showsPointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsPointsOfInterest: Self = this.set("showsPointsOfInterest", js.undefined)
    
    @scala.inline
    def setShowsScale(value: String): Self = this.set("showsScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsScale: Self = this.set("showsScale", js.undefined)
    
    @scala.inline
    def setShowsUserLocation(value: Boolean): Self = this.set("showsUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsUserLocation: Self = this.set("showsUserLocation", js.undefined)
    
    @scala.inline
    def setShowsUserLocationControl(value: Boolean): Self = this.set("showsUserLocationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsUserLocationControl: Self = this.set("showsUserLocationControl", js.undefined)
    
    @scala.inline
    def setShowsZoomControl(value: Boolean): Self = this.set("showsZoomControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsZoomControl: Self = this.set("showsZoomControl", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setTracksUserLocation(value: Boolean): Self = this.set("tracksUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracksUserLocation: Self = this.set("tracksUserLocation", js.undefined)
    
    @scala.inline
    def setVisibleMapRect(value: MapRect): Self = this.set("visibleMapRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleMapRect: Self = this.set("visibleMapRect", js.undefined)
  }
}
