package typings.appleMapkitJsBrowser

import typings.appleMapkitJsBrowser.mapkit.AnnotationConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.CameraZoomRangeConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.DirectionsConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.DirectionsRequest
import typings.appleMapkitJsBrowser.mapkit.DirectionsResponse
import typings.appleMapkitJsBrowser.mapkit.EtaRequestOptions
import typings.appleMapkitJsBrowser.mapkit.EtaResponse
import typings.appleMapkitJsBrowser.mapkit.GeoJSONDelegate
import typings.appleMapkitJsBrowser.mapkit.GeocoderConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.ImageAnnotationConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.ImportGeoJSONCallback
import typings.appleMapkitJsBrowser.mapkit.InitializationEvent
import typings.appleMapkitJsBrowser.mapkit.InitializationEventType
import typings.appleMapkitJsBrowser.mapkit.ItemCollection
import typings.appleMapkitJsBrowser.mapkit.MapConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.MapKitInitOptions
import typings.appleMapkitJsBrowser.mapkit.MarkerAnnotationConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.PaddingConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory
import typings.appleMapkitJsBrowser.mapkit.PointsOfInterestSearchOptions
import typings.appleMapkitJsBrowser.mapkit.SearchConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.StyleConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.StylesOverlayOptions
import typings.appleMapkitJsBrowser.mapkit.TileOverlayConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.URLTemplateCallback
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mapkit {
    
    @JSGlobal("mapkit")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base annotation object, used for creating custom annotations.
      */
    @JSGlobal("mapkit.Annotation")
    @js.native
    open class Annotation protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Annotation {
      /**
        * Creates a new annotation given its location and initialization options.
        *
        * @param coordinate The coordinate at which this annotation should appear.
        * @param factory A factory function that returns a DOM element used to
        * represent this annotation.
        * @param options A hash of properties with which to initialize the annotation.
        */
      def this(
        coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate,
        factory: js.Function2[
                /* coordinate */ typings.appleMapkitJsBrowser.mapkit.Coordinate, 
                /* options */ AnnotationConstructorOptions, 
                Element
              ]
      ) = this()
      def this(
        coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate,
        factory: js.Function2[
                /* coordinate */ typings.appleMapkitJsBrowser.mapkit.Coordinate, 
                /* options */ AnnotationConstructorOptions, 
                Element
              ],
        options: AnnotationConstructorOptions
      ) = this()
    }
    object Annotation {
      
      /**
        * Constants indicating how to interpret the collision frame rectangle of
        * an annotation view.
        */
      /* static member */
      object CollisionMode {
        
        @JSGlobal("mapkit.Annotation.CollisionMode.Circle")
        @js.native
        val Circle: String = js.native
        
        @JSGlobal("mapkit.Annotation.CollisionMode.None")
        @js.native
        val None: String = js.native
        
        @JSGlobal("mapkit.Annotation.CollisionMode.Rectangle")
        @js.native
        val Rectangle: String = js.native
      }
      
      /**
        * Constant values used to provide a hint the map uses to prioritize
        * displaying annotations.
        */
      /* static member */
      object DisplayPriority {
        
        @JSGlobal("mapkit.Annotation.DisplayPriority.High")
        @js.native
        val High: Double = js.native
        
        @JSGlobal("mapkit.Annotation.DisplayPriority.Low")
        @js.native
        val Low: Double = js.native
        
        @JSGlobal("mapkit.Annotation.DisplayPriority.Required")
        @js.native
        val Required: Double = js.native
      }
    }
    
    /**
      * A rectangular area on a map, defined by coordinates of the rectangle's
      * northeast and southwest corners.
      */
    @JSGlobal("mapkit.BoundingRegion")
    @js.native
    open class BoundingRegion protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.BoundingRegion {
      /**
        * Creates a rectangular bounding region defined by the latitude and
        * longitude coordinates of the rectangle's northeast and southwest corners.
        *
        * @param northLatitude The north latitude of the bounding region.
        * @param eastLongitude The east longitude of the bounding region.
        * @param southLatitude The south latitude of the bounding region.
        * @param westLongitude The west longitude of the bounding region.
        */
      def this(northLatitude: Double, eastLongitude: Double, southLatitude: Double, westLongitude: Double) = this()
      
      /**
        * Returns a copy of the calling bounding region.
        */
      /* CompleteClass */
      override def copy(): typings.appleMapkitJsBrowser.mapkit.BoundingRegion = js.native
      
      /**
        * The east longitude of the bounding region.
        */
      /* CompleteClass */
      var eastLongitude: Double = js.native
      
      /**
        * The north latitude of the bounding region.
        */
      /* CompleteClass */
      var northLatitude: Double = js.native
      
      /**
        * The south latitude of the bounding region.
        */
      /* CompleteClass */
      var southLatitude: Double = js.native
      
      /**
        * Returns the coordinate region that corresponds to the calling bounding region.
        */
      /* CompleteClass */
      override def toCoordinateRegion(): typings.appleMapkitJsBrowser.mapkit.CoordinateRegion = js.native
      
      /**
        * The west longitude of the bounding region.
        */
      /* CompleteClass */
      var westLongitude: Double = js.native
    }
    
    /**
      * A minimum and maximum camera distance as meters from the center of the map.
      */
    @JSGlobal("mapkit.CameraZoomRange")
    @js.native
    open class CameraZoomRange protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.CameraZoomRange {
      def this(minCameraDistance: Double) = this()
      /**
        * Describes the minimum and maximum camera distance in meters.
        */
      def this(minCameraDistance: CameraZoomRangeConstructorOptions) = this()
      def this(minCameraDistance: Double, maxCameraDistance: Double) = this()
      def this(minCameraDistance: CameraZoomRangeConstructorOptions, maxCameraDistance: Double) = this()
      
      /**
        * The maximum allowed distance of the camera from the center of the map in meters.
        */
      /* CompleteClass */
      var maxCameraDistance: Double = js.native
      
      /**
        * The minimum allowed distance of the camera from the center of the map in meters.
        */
      /* CompleteClass */
      var minCameraDistance: Double = js.native
    }
    
    /**
      * A circular overlay with a configurable radius, centered on a specific
      * geographic coordinate.
      */
    @JSGlobal("mapkit.CircleOverlay")
    @js.native
    open class CircleOverlay protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.CircleOverlay {
      /**
        * Creates a circle overlay with a center coordinate, radius, and style options.
        *
        * @param coordinate The coordinate of the circle's center.
        * @param radius The circle's radius, in meters.
        * @param options An object literal of Overlay properties used to initialize
        * the circle.
        */
      def this(coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate, radius: Double) = this()
      def this(
        coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate,
        radius: Double,
        options: StylesOverlayOptions
      ) = this()
    }
    
    /**
      * An object representing the latitude and longitude for a point on the
      * Earth's surface.
      */
    @JSGlobal("mapkit.Coordinate")
    @js.native
    open class Coordinate protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Coordinate {
      /**
        * Creates a coordinate object with the specified latitude and longitude.
        */
      def this(latitude: Double, longitude: Double) = this()
      
      /**
        * Returns a copy of the coordinate.
        */
      /* CompleteClass */
      override def copy(): typings.appleMapkitJsBrowser.mapkit.Coordinate = js.native
      
      /**
        * Returns a Boolean value indicating whether two coordinates are equal.
        */
      /* CompleteClass */
      override def equals(anotherCoordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate): Boolean = js.native
      
      /**
        * The latitude in degrees.
        */
      /* CompleteClass */
      var latitude: Double = js.native
      
      /**
        * The longitude in degrees.
        */
      /* CompleteClass */
      var longitude: Double = js.native
      
      /**
        * Returns the map point that corresponds to the coordinate.
        */
      /* CompleteClass */
      override def toMapPoint(): typings.appleMapkitJsBrowser.mapkit.MapPoint = js.native
      
      /**
        * Returns the unwrapped map point that corresponds to the coordinate.
        */
      /* CompleteClass */
      override def toUnwrappedMapPoint(): typings.appleMapkitJsBrowser.mapkit.MapPoint = js.native
    }
    
    /**
      * A rectangular area on a map defined by a center coordinate and a span,
      * expressed in degrees of latitude and longitude.
      */
    @JSGlobal("mapkit.CoordinateRegion")
    @js.native
    open class CoordinateRegion protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.CoordinateRegion {
      /**
        * Creates A rectangular geographic region centered around a latitude and
        * longitude coordinate.
        *
        * @param center Coordinate that is center point of the region.
        * @param span A CoordinateSpan that represents the amount of map to
        * display. The span also defines the current zoom level used by the map object.
        */
      def this(
        center: typings.appleMapkitJsBrowser.mapkit.Coordinate,
        span: typings.appleMapkitJsBrowser.mapkit.CoordinateSpan
      ) = this()
      
      /**
        * The center point of the region.
        */
      /* CompleteClass */
      var center: typings.appleMapkitJsBrowser.mapkit.Coordinate = js.native
      
      /**
        * Returns a copy of the calling coordinate region.
        */
      /* CompleteClass */
      override def copy(): typings.appleMapkitJsBrowser.mapkit.CoordinateRegion = js.native
      
      /**
        * Returns a Boolean value indicating whether two regions are equal.
        */
      /* CompleteClass */
      override def equals(anotherRegion: typings.appleMapkitJsBrowser.mapkit.CoordinateRegion): Boolean = js.native
      
      /**
        * The distance provided in meters or the longest distance derived from the center point to the region’s bounding box.
        */
      /* CompleteClass */
      override val radius: Double = js.native
      
      /**
        * The horizontal and vertical span representing the amount of map to display.
        */
      /* CompleteClass */
      var span: typings.appleMapkitJsBrowser.mapkit.CoordinateSpan = js.native
      
      /**
        * Returns the bounding region that corresponds to the calling coordinate region.
        */
      /* CompleteClass */
      override def toBoundingRegion(): typings.appleMapkitJsBrowser.mapkit.BoundingRegion = js.native
      
      /**
        * Returns the map rectangle that corresponds to the calling coordinate region.
        */
      /* CompleteClass */
      override def toMapRect(): typings.appleMapkitJsBrowser.mapkit.MapRect = js.native
    }
    
    /**
      * The width and height of a map region.
      */
    @JSGlobal("mapkit.CoordinateSpan")
    @js.native
    open class CoordinateSpan protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.CoordinateSpan {
      /**
        * Creates a new coordinate span object with the specified latitude and
        * longitude deltas.
        *
        * @param latitudeDelta The amount of north-to-south distance (measured in
        * degrees) to display on the map.
        * @param longitudeDelta The amount of east-to-west distance (measured in
        * degrees) to display for the map region.
        */
      def this(latitudeDelta: Double, longitudeDelta: Double) = this()
      
      /**
        * Returns a copy of the coordinate span.
        */
      /* CompleteClass */
      override def copy(): typings.appleMapkitJsBrowser.mapkit.CoordinateSpan = js.native
      
      /**
        * Returns a Boolean value that indicates whether two spans are equal.
        */
      /* CompleteClass */
      override def equals(anotherSpan: typings.appleMapkitJsBrowser.mapkit.CoordinateSpan): Boolean = js.native
      
      /**
        * The amount of north-to-south distance (measured in degrees) to display on
        * the map.
        */
      /* CompleteClass */
      var latitudeDelta: Double = js.native
      
      /**
        * The amount of east-to-west distance (measured in degrees) to display for
        * the map region.
        */
      /* CompleteClass */
      var longitudeDelta: Double = js.native
    }
    
    /**
      * Creates a directions object with options that you may provide.
      */
    @JSGlobal("mapkit.Directions")
    @js.native
    /**
      * Creates a directions object with options that you may provide.
      *
      * @param An object containing the options for creating a directions object.
      * This parameter is optional.
      */
    open class Directions ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Directions {
      def this(options: DirectionsConstructorOptions) = this()
      
      /**
        * Cancels a previous request for route directions.
        *
        * @param id The ID returned by a call to route.
        */
      /* CompleteClass */
      override def cancel(id: Double): Boolean = js.native
      
      /**
        * Retrieves estimated arrival times to up to 10 destinations from a single starting point.
        *
        * @param request An EtaRequestOptions object that specifies details for the server to provide estimated arrival times at one or more destinations.
        * @param callback A callback function that receives the estimated time response object, returned asynchronously.
        * @return A request ID, which you can pass to cancel to abort a pending request.
        */
      /* CompleteClass */
      override def eta(
        request: EtaRequestOptions,
        callback: js.Function2[/* error */ js.Error | Null, /* data */ EtaResponse, Unit]
      ): Double = js.native
      
      /**
        * Retrieves directions and estimated travel time for the specified start
        * and end points.
        *
        * @param request DirectionsRequest object that specifies details for the
        * directions you want to retrieve.
        * @param callback A callback function that receives the directions,
        * returned asynchronously.
        * @return A request ID, which you can pass to cancel to abort a pending request.
        */
      /* CompleteClass */
      override def route(
        request: DirectionsRequest,
        callback: js.Function2[/* error */ js.Error | Null, /* data */ DirectionsResponse, Unit]
      ): Double = js.native
    }
    object Directions {
      
      /**
        * The modes of transportation.
        */
      @JSGlobal("mapkit.Directions.Transport")
      @js.native
      object Transport extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.appleMapkitJsBrowser.mapkit.Directions.Transport & Double] = js.native
        
        /* 0 */ val Automobile: typings.appleMapkitJsBrowser.mapkit.Directions.Transport.Automobile & Double = js.native
        
        /* 1 */ val Walking: typings.appleMapkitJsBrowser.mapkit.Directions.Transport.Walking & Double = js.native
      }
    }
    
    /**
      * Constants indicating the visibility of different adaptive map features.
      */
    object FeatureVisibility {
      
      /**
        * A constant indicating that feature visibility adapts to the current map state.
        */
      @JSGlobal("mapkit.FeatureVisibility.Adaptive")
      @js.native
      val Adaptive: String = js.native
      
      /**
        * A constant indicating that the feature is always hidden.
        */
      @JSGlobal("mapkit.FeatureVisibility.Hidden")
      @js.native
      val Hidden: String = js.native
      
      /**
        * A constant indicating that the feature is always visible.
        */
      @JSGlobal("mapkit.FeatureVisibility.Visible")
      @js.native
      val Visible: String = js.native
    }
    
    /**
      * A geocoder that converts human-readable addresses to geographic coordinates
      * and vice versa.
      */
    @JSGlobal("mapkit.Geocoder")
    @js.native
    /**
      * Initialize a geocoder object and set optional language and user location
      * properties.
      */
    open class Geocoder ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Geocoder {
      def this(options: GeocoderConstructorOptions) = this()
    }
    
    /**
      * A customized annotation with image resources that you provide.
      */
    @JSGlobal("mapkit.ImageAnnotation")
    @js.native
    open class ImageAnnotation protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Annotation {
      /**
        * Initializes an image annotation with a URL to its image and a coordinate.
        */
      def this(
        coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate,
        options: ImageAnnotationConstructorOptions
      ) = this()
    }
    
    /**
      * A line that displays with a gradient along the length of the line.
      */
    @JSGlobal("mapkit.LineGradient")
    @js.native
    /**
      * Creates a style that renders a gradient along the length of a line.
      *
      * @param options A JavaScript object with unit distance values as keys with matched CSS colors.
      */
    open class LineGradient ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.LineGradient {
      def this(options: js.Object) = this()
      
      /**
        * Adds a color transition point to the gradient.
        *
        * @param offset The unit distance at which to add the color.
        * @param color The CSS color at the transition point.
        */
      /* CompleteClass */
      override def addColorStop(offset: Double, color: String): Unit = js.native
      
      /**
        * Adds a color transition at the index point in the list of points within a polyline.
        *
        * @param index A valid index into a polyline’s points.
        * @param color The CSS color at the index point.
        */
      /* CompleteClass */
      override def addColorStopAtIndex(index: Double, color: String): Unit = js.native
    }
    
    /**
      * An embeddable interactive map that you add to a webpage.
      */
    @JSGlobal("mapkit.Map")
    @js.native
    open class Map protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Map {
      /**
        * Creates a map that you embed on a webpage, and initializes its display
        * properties and other options.
        *
        * @parent parent A DOM element or the ID of a DOM element to use as this
        * map's container.
        * @param options An object that contains options for initializing a map's
        * features.
        */
      def this(parent: String) = this()
      def this(parent: Element) = this()
      def this(parent: String, options: MapConstructorOptions) = this()
      def this(parent: Element, options: MapConstructorOptions) = this()
    }
    object Map {
      
      // Configuring the Map's Appearance
      /**
        * Constants indicating the color scheme of the map.
        */
      /* static member */
      object ColorSchemes {
        
        /**
          * A constant indicating a dark color scheme.
          */
        @JSGlobal("mapkit.Map.ColorSchemes.Dark")
        @js.native
        val Dark: String = js.native
        
        /**
          * A constant indicating a light color scheme.
          */
        @JSGlobal("mapkit.Map.ColorSchemes.Light")
        @js.native
        val Light: String = js.native
      }
      
      /**
        * Constants indicating the system of measurement displayed on the map.
        */
      /* static member */
      object Distances {
        
        /**
          * A constant indicating the measurement system is adaptive, and determined
          * based on the map's language.
          */
        @JSGlobal("mapkit.Map.Distances.Adaptive")
        @js.native
        val Adaptive: String = js.native
        
        /**
          * A constant indicating the measurement system is imperial.
          */
        @JSGlobal("mapkit.Map.Distances.Imperial")
        @js.native
        val Imperial: String = js.native
        
        /**
          * A constant indicating the measurement system is metric.
          */
        @JSGlobal("mapkit.Map.Distances.Metric")
        @js.native
        val Metric: String = js.native
      }
      
      /**
        * Constants representing the type of map to display.
        */
      /* static member */
      object MapTypes {
        
        /**
          * A satellite image of the area with road and road name information
          * layered on top.
          */
        @JSGlobal("mapkit.Map.MapTypes.Hybrid")
        @js.native
        val Hybrid: String = js.native
        
        /**
          * A street map where your data is emphasized over the underlying map details.
          */
        @JSGlobal("mapkit.Map.MapTypes.MutedStandard")
        @js.native
        val MutedStandard: String = js.native
        
        /**
          * A satellite image of the area.
          */
        @JSGlobal("mapkit.Map.MapTypes.Satellite")
        @js.native
        val Satellite: String = js.native
        
        /**
          * A street map that shows the position of all roads and some road names.
          */
        @JSGlobal("mapkit.Map.MapTypes.Standard")
        @js.native
        val Standard: String = js.native
      }
    }
    
    /**
      * A location on a map when the Earth's surface is projected onto a
      * two-dimensional surface.
      */
    @JSGlobal("mapkit.MapPoint")
    @js.native
    open class MapPoint protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.MapPoint {
      /**
        * Initializes a MapPoint object.
        *
        * @param x The point along the east-west axis of the map projection.
        * @param  The point along the north-south axis of the map projection.
        */
      def this(x: Double, y: Double) = this()
      
      /**
        * Returns a copy of a map point.
        */
      /* CompleteClass */
      override def copy(): typings.appleMapkitJsBrowser.mapkit.MapPoint = js.native
      
      /**
        * Indicates whether two map points are equal.
        *
        * @param anotherPoint A map point to use for comparison.
        */
      /* CompleteClass */
      override def equals(anotherPoint: typings.appleMapkitJsBrowser.mapkit.MapPoint): Boolean = js.native
      
      /**
        * Returns a coordinate containing the latitude and longitude corresponding
        * to a map point.
        */
      /* CompleteClass */
      override def toCoordinate(): typings.appleMapkitJsBrowser.mapkit.Coordinate = js.native
      
      /**
        * The location of the point along the x-axis of the map.
        */
      /* CompleteClass */
      var x: Double = js.native
      
      /**
        * The location of the point along the y-axis of the map.
        */
      /* CompleteClass */
      var y: Double = js.native
    }
    
    /**
      * A rectangular area on a two-dimensional map projection.
      */
    @JSGlobal("mapkit.MapRect")
    @js.native
    open class MapRect protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.MapRect {
      /**
        * Initializes a MapRect object.
        *
        * @param x The origin point along the east-west axis of the map projection.
        * @param y The origin point along the north-south axis of the map projection.
        * @param width The distance (measured using map points) along the east-west
        * axis of the map projection.
        * @param height The distance (measured using map points) along the north-south
        * axis of the map projection.
        */
      def this(x: Double, y: Double, width: Double, height: Double) = this()
      
      /**
        * Returns a copy of a map rectangle.
        */
      /* CompleteClass */
      override def copy(): typings.appleMapkitJsBrowser.mapkit.MapRect = js.native
      
      /**
        * Indicates whether two map rectangles are equal.
        *
        * @param anotherRect The map rectangle to equate to.
        */
      /* CompleteClass */
      override def equals(anotherRect: typings.appleMapkitJsBrowser.mapkit.MapRect): Boolean = js.native
      
      /**
        * The maximum x-axis value of a rectangle.
        */
      /* CompleteClass */
      var maxX: Double = js.native
      
      /**
        * The maximum y-axis value of a rectangle.
        */
      /* CompleteClass */
      var maxY: Double = js.native
      
      /**
        * The mid-point along the x-axis of a rectangle.
        */
      /* CompleteClass */
      var midX: Double = js.native
      
      /**
        * The mid-point along the y-axis of a rectangle.
        */
      /* CompleteClass */
      var midY: Double = js.native
      
      /**
        * The minimum x-axis value of a rectangle.
        */
      /* CompleteClass */
      var minX: Double = js.native
      
      /**
        * The minimum y-axis value of a rectangle.
        */
      /* CompleteClass */
      var minY: Double = js.native
      
      /**
        * The origin point of a rectangle.
        */
      /* CompleteClass */
      var origin: typings.appleMapkitJsBrowser.mapkit.MapPoint = js.native
      
      /**
        * @param scaleFactor The scale factor.
        * @param scaleCenter The center map point for scaling.
        */
      /* CompleteClass */
      override def scale(scaleFactor: Double, scaleCenter: typings.appleMapkitJsBrowser.mapkit.MapPoint): typings.appleMapkitJsBrowser.mapkit.MapRect = js.native
      
      /**
        * The width and height of a rectangle, starting from the origin point.
        */
      /* CompleteClass */
      var size: typings.appleMapkitJsBrowser.mapkit.MapSize = js.native
      
      /**
        * Returns the region that corresponds to a map rectangle.
        */
      /* CompleteClass */
      override def toCoordinateRegion(): typings.appleMapkitJsBrowser.mapkit.CoordinateRegion = js.native
    }
    
    /**
      * A pair of values in map units that define the width and height of a
      * projected coordinate span.
      */
    @JSGlobal("mapkit.MapSize")
    @js.native
    open class MapSize protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.MapSize {
      /**
        * Initializes a MapSize object.
        *
        * @param width The distance (measured using map points) along the east-west
        * axis of the map projection.
        * @param height The distance (measured using map points) along the
        * north-south axis of the map projection.
        */
      def this(width: Double, height: Double) = this()
      
      /**
        * Returns a copy of a map size.
        */
      /* CompleteClass */
      override def copy(): typings.appleMapkitJsBrowser.mapkit.MapSize = js.native
      
      /**
        * Indicates whether two map sizes are equal.
        *
        * @param anotherSize The map size to equate to.
        */
      /* CompleteClass */
      override def equals(anotherSize: typings.appleMapkitJsBrowser.mapkit.MapSize): Boolean = js.native
      
      /**
        * The height value, in map point units.
        */
      /* CompleteClass */
      var height: Double = js.native
      
      /**
        * The width value, in map point units.
        */
      /* CompleteClass */
      var width: Double = js.native
    }
    
    /**
      * Creates a marker annotation at the coordinate location with provided options.
      */
    @JSGlobal("mapkit.MarkerAnnotation")
    @js.native
    open class MarkerAnnotation protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.MarkerAnnotation {
      /**
        * Creates a marker annotation at the coordinate location with provided options.
        *
        * @param coordinate The coordinate at which this annotation should appear.
        * @param options A hash of properties with which to initialize the annotation.
        */
      def this(coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate) = this()
      def this(
        coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate,
        options: MarkerAnnotationConstructorOptions
      ) = this()
    }
    
    /**
      * An abstract base object that defines the methods and attributes for map overlays.
      */
    @JSGlobal("mapkit.Overlay")
    @js.native
    abstract class Overlay ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Overlay
    
    /**
      * The values that define content padding within the map view frame.
      */
    @JSGlobal("mapkit.Padding")
    @js.native
    /**
      * Creates a padding object, and initializes its inset margin properties.
      *
      * @param top The amount of padding, in CSS pixels, to inset the map from
      * the top edge.
      * @param right The amount of padding, in CSS pixels, to inset the map from
      * the right edge.
      * @param bottom The amount of padding, in CSS pixels, to inset the map from
      * the left edge.
      * @param left The amount of padding, in CSS pixels, to inset the map from
      * the left edge.
      */
    open class Padding ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Padding {
      def this(options: PaddingConstructorOptions) = this()
      def this(top: Double) = this()
      def this(top: Double, right: Double) = this()
      def this(top: Unit, right: Double) = this()
      def this(top: Double, right: Double, bottom: Double) = this()
      def this(top: Double, right: Unit, bottom: Double) = this()
      def this(top: Unit, right: Double, bottom: Double) = this()
      def this(top: Unit, right: Unit, bottom: Double) = this()
      def this(top: Double, right: Double, bottom: Double, left: Double) = this()
      def this(top: Double, right: Double, bottom: Unit, left: Double) = this()
      def this(top: Double, right: Unit, bottom: Double, left: Double) = this()
      def this(top: Double, right: Unit, bottom: Unit, left: Double) = this()
      def this(top: Unit, right: Double, bottom: Double, left: Double) = this()
      def this(top: Unit, right: Double, bottom: Unit, left: Double) = this()
      def this(top: Unit, right: Unit, bottom: Double, left: Double) = this()
      def this(top: Unit, right: Unit, bottom: Unit, left: Double) = this()
      
      /**
        * The amount of padding, in CSS pixels, to inset the map from the bottom edge.
        */
      /* CompleteClass */
      var bottom: Double = js.native
      
      /**
        * The amount of padding, in CSS pixels, to inset the map from the left edge.
        */
      /* CompleteClass */
      var left: Double = js.native
      
      /**
        * The amount of padding, in CSS pixels, to inset the map from the right edge.
        */
      /* CompleteClass */
      var right: Double = js.native
      
      /**
        * The amount of padding, in CSS pixels, to inset the map from the top edge.
        */
      /* CompleteClass */
      var top: Double = js.native
    }
    
    /**
      * Point of interest categories.
      */
    @JSGlobal("mapkit.PointOfInterestCategory")
    @js.native
    object PointOfInterestCategory extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory & Double] = js.native
      
      /* 3 */ val ATM: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.ATM & Double = js.native
      
      /* 0 */ val Airport: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Airport & Double = js.native
      
      /* 1 */ val AmusementPark: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.AmusementPark & Double = js.native
      
      /* 2 */ val Aquarium: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Aquarium & Double = js.native
      
      /* 4 */ val Bakery: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Bakery & Double = js.native
      
      /* 5 */ val Bank: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Bank & Double = js.native
      
      /* 6 */ val Beach: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Beach & Double = js.native
      
      /* 7 */ val Brewery: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Brewery & Double = js.native
      
      /* 8 */ val Cafe: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Cafe & Double = js.native
      
      /* 9 */ val Campground: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Campground & Double = js.native
      
      /* 10 */ val CarRental: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.CarRental & Double = js.native
      
      /* 11 */ val EVCharger: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.EVCharger & Double = js.native
      
      /* 12 */ val FireStation: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.FireStation & Double = js.native
      
      /* 13 */ val FitnessCenter: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.FitnessCenter & Double = js.native
      
      /* 14 */ val FoodMarket: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.FoodMarket & Double = js.native
      
      /* 15 */ val GasStation: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.GasStation & Double = js.native
      
      /* 16 */ val Hospital: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Hospital & Double = js.native
      
      /* 17 */ val Hotel: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Hotel & Double = js.native
      
      /* 18 */ val Laundry: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Laundry & Double = js.native
      
      /* 19 */ val Library: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Library & Double = js.native
      
      /* 20 */ val Marina: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Marina & Double = js.native
      
      /* 21 */ val MovieTheater: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.MovieTheater & Double = js.native
      
      /* 22 */ val Museum: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Museum & Double = js.native
      
      /* 23 */ val NationalPark: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.NationalPark & Double = js.native
      
      /* 24 */ val Nightlife: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Nightlife & Double = js.native
      
      /* 25 */ val Park: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Park & Double = js.native
      
      /* 26 */ val Parking: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Parking & Double = js.native
      
      /* 27 */ val Pharmacy: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Pharmacy & Double = js.native
      
      /* 28 */ val Police: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Police & Double = js.native
      
      /* 29 */ val PostOffice: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.PostOffice & Double = js.native
      
      /* 30 */ val PublicTransport: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.PublicTransport & Double = js.native
      
      /* 31 */ val Restaurant: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Restaurant & Double = js.native
      
      /* 32 */ val Restroom: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Restroom & Double = js.native
      
      /* 33 */ val School: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.School & Double = js.native
      
      /* 34 */ val Stadium: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Stadium & Double = js.native
      
      /* 35 */ val Store: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Store & Double = js.native
      
      /* 36 */ val Theater: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Theater & Double = js.native
      
      /* 37 */ val University: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.University & Double = js.native
      
      /* 38 */ val Winery: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Winery & Double = js.native
      
      /* 39 */ val Zoo: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Zoo & Double = js.native
    }
    
    /**
      * A filter used to determine the points of interest to include or exclude on a map or local search.
      */
    @JSGlobal("mapkit.PointOfInterestFilter")
    @js.native
    open class PointOfInterestFilter ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter {
      
      /**
        * Returns a Boolean value that indicates whether the filter excludes the provided point of interest category.
        */
      /* CompleteClass */
      override def excludesCategory(category: PointOfInterestCategory): Boolean = js.native
      
      /**
        * Returns a Boolean value that indicates whether the filter includes the provided point of interest category.
        */
      /* CompleteClass */
      override def includesCategory(category: PointOfInterestCategory): Boolean = js.native
    }
    object PointOfInterestFilter {
      
      @JSGlobal("mapkit.PointOfInterestFilter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a point of interest filter that excludes categories from a list that you provide.
        */
      /* static member */
      inline def excluding(categoryList: js.Array[PointOfInterestCategory]): typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("excluding")(categoryList.asInstanceOf[js.Any]).asInstanceOf[typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter]
      
      /**
        * A filter that excludes all point of interest categories.
        */
      /* static member */
      @JSGlobal("mapkit.PointOfInterestFilter.filterExcludingAllCategories")
      @js.native
      val filterExcludingAllCategories: typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = js.native
      
      /**
        * A filter that includes all point of interest categories.
        */
      /* static member */
      @JSGlobal("mapkit.PointOfInterestFilter.filterIncludingAllCategories")
      @js.native
      val filterIncludingAllCategories: typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = js.native
      
      /**
        * Creates a point of interest filter that includes categories from a list that you provide.
        */
      /* static member */
      inline def including(categoryList: js.Array[PointOfInterestCategory]): typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("including")(categoryList.asInstanceOf[js.Any]).asInstanceOf[typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter]
    }
    
    /**
      * An object that fetches points of interest within a specified region.
      */
    @JSGlobal("mapkit.PointsOfInterestSearch")
    @js.native
    /**
      * Creates a search object for fetching points of interest.
      *
      * @param options Options that you may provide when you create a points of interest search.
      */
    open class PointsOfInterestSearch ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.PointsOfInterestSearch {
      def this(options: PointsOfInterestSearchOptions) = this()
    }
    
    /**
      * An overlay made up of one or more points, forming a closed shape.
      */
    @JSGlobal("mapkit.PolygonOverlay")
    @js.native
    open class PolygonOverlay protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.PolygonOverlay {
      /**
        * Creates a polygon overlay with an array of points and style options.
        *
        * @param points The points in the polygon as an array of arrays of
        * Coordinate, or an array of Coordinate. If it's the latter,
        * the array is auto-wrapped by an enclosing array.
        * @param options An object literal of options with which to initialize the
        * polygon.
        */
      def this(points: js.Array[typings.appleMapkitJsBrowser.mapkit.Coordinate]) = this()
      def this(points: js.Array[typings.appleMapkitJsBrowser.mapkit.Coordinate], options: StylesOverlayOptions) = this()
    }
    
    /**
      * An overlay made up of connected line segments that do not form a closed shape.
      */
    @JSGlobal("mapkit.PolylineOverlay")
    @js.native
    open class PolylineOverlay protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.PolylineOverlay {
      /**
        * Creates a polyline overlay with coordinate points and style options.
        *
        * @param points The points in the polyline as an array of Coordinate
        * @param options An object literal of style options with which to initialize
        * the polyline.
        */
      def this(points: js.Array[typings.appleMapkitJsBrowser.mapkit.Coordinate]) = this()
      def this(points: js.Array[typings.appleMapkitJsBrowser.mapkit.Coordinate], options: StylesOverlayOptions) = this()
    }
    
    /**
      * An object that retrieves map-based search results for a user-entered query.
      */
    @JSGlobal("mapkit.Search")
    @js.native
    /**
      * Creates a search object with optional initial values that you provide.
      *
      * @param options Options that you may provide when creating a search object.
      */
    open class Search ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Search {
      def this(options: SearchConstructorOptions) = this()
    }
    
    /**
      * A set of observable attributes for overlays, including color and opacity of
      * stroke and fill, and line styles.
      */
    @JSGlobal("mapkit.Style")
    @js.native
    /**
      * Creates and initializes a style object.
      */
    open class Style ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.Style {
      def this(options: StyleConstructorOptions) = this()
      
      /**
        * The fill color of a shape.
        */
      /* CompleteClass */
      var fillColor: String = js.native
      
      /**
        * The opacity of the fill color.
        */
      /* CompleteClass */
      var fillOpacity: Double = js.native
      
      /**
        * A rule for determining whether a point is inside or outside a polygon.
        */
      /* CompleteClass */
      var fillRule: String = js.native
      
      /**
        * The style to use when drawing line endings.
        */
      /* CompleteClass */
      var lineCap: String = js.native
      
      /**
        * An array of line and gap lengths, used to create a dashed line.
        */
      /* CompleteClass */
      var lineDash: js.Array[Double] = js.native
      
      /**
        * The number of CSS pixels to offset drawing of a line's dash pattern.
        */
      /* CompleteClass */
      var lineDashOffset: Double = js.native
      
      /**
        * The gradient to apply along the line.
        */
      /* CompleteClass */
      var lineGradient: typings.appleMapkitJsBrowser.mapkit.LineGradient = js.native
      
      /**
        * The style to use when drawing joins between line segments.
        */
      /* CompleteClass */
      var lineJoin: String = js.native
      
      /**
        * The width of a line's stroke, in CSS pixels.
        */
      /* CompleteClass */
      var lineWidth: Double = js.native
      
      /**
        * The stroke color of a line.
        */
      /* CompleteClass */
      var strokeColor: String = js.native
      
      /**
        * The unit distance along the line where a stroke ends.
        */
      /* CompleteClass */
      var strokeEnd: Double = js.native
      
      /**
        * The opacity of the stroke color.
        */
      /* CompleteClass */
      var strokeOpacity: Double = js.native
      
      /**
        * The unit distance along the line where a stroke begins.
        */
      /* CompleteClass */
      var strokeStart: Double = js.native
    }
    
    /**
      * An overlay that covers an area of the map with bitmap tiles.
      */
    @JSGlobal("mapkit.TileOverlay")
    @js.native
    open class TileOverlay protected ()
      extends StObject
         with typings.appleMapkitJsBrowser.mapkit.TileOverlay {
      /**
        * Creates a tile overlay with a URL template and style options.
        */
      def this(urlTemplate: String) = this()
      def this(urlTemplate: URLTemplateCallback) = this()
      def this(urlTemplate: String, options: TileOverlayConstructorOptions) = this()
      def this(urlTemplate: URLTemplateCallback, options: TileOverlayConstructorOptions) = this()
      
      /**
        * Custom data used to populate the URL template.
        */
      /* CompleteClass */
      var data: js.Object = js.native
      
      /**
        * Maximum zoom level of the overlay.
        */
      /* CompleteClass */
      var maximumZ: Double = js.native
      
      /**
        * Minimum zoom level of the overlay.
        */
      /* CompleteClass */
      var minimumZ: Double = js.native
      
      /**
        * Opacity level of the overlay.
        */
      /* CompleteClass */
      var opacity: Double = js.native
      
      /**
        * Reloads the tile overlay for the displayed map region with the latest
        * data values.
        */
      /* CompleteClass */
      override def reload(): Unit = js.native
      
      /**
        * A string, or callback function that returns a string, with a URL that
        * provides the requested tile.
        */
      /* CompleteClass */
      var urlTemplate: String | URLTemplateCallback = js.native
    }
    
    /**
      * Subscribes a listener function to an event type.
      *
      * @param type The type of event (e.g., "configuration-change").
      * @param listener The callback function to invoke. listener is passed an
      * Event as its sole argument.
      * @param thisObject An object set as the this keyword on the listener function.
      */
    inline def addEventListener[T](
      `type`: InitializationEventType,
      listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEventListener[T](
      `type`: InitializationEventType,
      listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit],
      thisObject: T
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], thisObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * The build string.
      */
    @JSGlobal("mapkit.build")
    @js.native
    val build: String = js.native
    
    /**
      *
      * @param data The original GeoJSON data, which may be a URL to a GeoJSON file,
      * or a GeoJSON object.
      * @param callback A callback function that is required if you provide a URL
      * for the data parameter, and optional otherwise.
      */
    inline def importGeoJSON(data: String): ItemCollection | js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("importGeoJSON")(data.asInstanceOf[js.Any]).asInstanceOf[ItemCollection | js.Error]
    inline def importGeoJSON(data: String, callback: GeoJSONDelegate): ItemCollection | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("importGeoJSON")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ItemCollection | js.Error]
    inline def importGeoJSON(data: String, callback: ImportGeoJSONCallback): ItemCollection | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("importGeoJSON")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ItemCollection | js.Error]
    inline def importGeoJSON(data: js.Object): ItemCollection | js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("importGeoJSON")(data.asInstanceOf[js.Any]).asInstanceOf[ItemCollection | js.Error]
    inline def importGeoJSON(data: js.Object, callback: GeoJSONDelegate): ItemCollection | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("importGeoJSON")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ItemCollection | js.Error]
    inline def importGeoJSON(data: js.Object, callback: ImportGeoJSONCallback): ItemCollection | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("importGeoJSON")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ItemCollection | js.Error]
    
    /**
      * Initialize a mapkit object by providing an authorization callback and language.
      */
    inline def init(options: MapKitInitOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * A language ID indicating the selected language.
      */
    @JSGlobal("mapkit.language")
    @js.native
    def language: String = js.native
    inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
    
    /**
      * An array to which maps are automatically added and removed as they are
      * initialized and destroyed.
      */
    @JSGlobal("mapkit.maps")
    @js.native
    val maps: js.Array[typings.appleMapkitJsBrowser.mapkit.Map] = js.native
    
    /**
      * Unsubscribes a listener function from an event type.
      *
      * @param type The type of event (e.g., "configuration-change").
      * @param listener The callback function to remove.
      * @param thisObject An object set as the this keyword on the listener function.
      */
    inline def removeEventListener[T](
      `type`: InitializationEventType,
      listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEventListener[T](
      `type`: InitializationEventType,
      listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit],
      thisObject: T
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], thisObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * The version of MapKit JS.
      */
    @JSGlobal("mapkit.version")
    @js.native
    val version: String = js.native
  }
}
