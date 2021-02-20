package typings.appleMapkitJsBrowser

import typings.appleMapkitJsBrowser.mapkit.AnnotationConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.CameraZoomRangeConstructorOptions
import typings.appleMapkitJsBrowser.mapkit.DirectionsConstructorOptions
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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    class Annotation protected ()
      extends typings.appleMapkitJsBrowser.mapkit.Annotation {
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
    class BoundingRegion protected ()
      extends typings.appleMapkitJsBrowser.mapkit.BoundingRegion {
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
    }
    
    /**
      * A minimum and maximum camera distance as meters from the center of the map.
      */
    @JSGlobal("mapkit.CameraZoomRange")
    @js.native
    class CameraZoomRange protected ()
      extends typings.appleMapkitJsBrowser.mapkit.CameraZoomRange {
      def this(minCameraDistance: Double) = this()
      /**
        * Describes the minimum and maximum camera distance in meters.
        */
      def this(minCameraDistance: CameraZoomRangeConstructorOptions) = this()
      def this(minCameraDistance: Double, maxCameraDistance: Double) = this()
      def this(minCameraDistance: CameraZoomRangeConstructorOptions, maxCameraDistance: Double) = this()
    }
    
    /**
      * A circular overlay with a configurable radius, centered on a specific
      * geographic coordinate.
      */
    @JSGlobal("mapkit.CircleOverlay")
    @js.native
    class CircleOverlay protected ()
      extends typings.appleMapkitJsBrowser.mapkit.CircleOverlay {
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
    class Coordinate protected ()
      extends typings.appleMapkitJsBrowser.mapkit.Coordinate {
      /**
        * Creates a coordinate object with the specified latitude and longitude.
        */
      def this(latitude: Double, longitude: Double) = this()
    }
    
    /**
      * A rectangular area on a map defined by a center coordinate and a span,
      * expressed in degrees of latitude and longitude.
      */
    @JSGlobal("mapkit.CoordinateRegion")
    @js.native
    class CoordinateRegion protected ()
      extends typings.appleMapkitJsBrowser.mapkit.CoordinateRegion {
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
    }
    
    /**
      * The width and height of a map region.
      */
    @JSGlobal("mapkit.CoordinateSpan")
    @js.native
    class CoordinateSpan protected ()
      extends typings.appleMapkitJsBrowser.mapkit.CoordinateSpan {
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
    class Directions ()
      extends typings.appleMapkitJsBrowser.mapkit.Directions {
      def this(options: DirectionsConstructorOptions) = this()
    }
    object Directions {
      
      /**
        * The modes of transportation.
        */
      @JSGlobal("mapkit.Directions.Transport")
      @js.native
      object Transport extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.appleMapkitJsBrowser.mapkit.Directions.Transport with Double] = js.native
        
        /* 0 */ val Automobile: typings.appleMapkitJsBrowser.mapkit.Directions.Transport.Automobile with Double = js.native
        
        /* 1 */ val Walking: typings.appleMapkitJsBrowser.mapkit.Directions.Transport.Walking with Double = js.native
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
    class Geocoder ()
      extends typings.appleMapkitJsBrowser.mapkit.Geocoder {
      def this(options: GeocoderConstructorOptions) = this()
    }
    
    /**
      * A customized annotation with image resources that you provide.
      */
    @JSGlobal("mapkit.ImageAnnotation")
    @js.native
    class ImageAnnotation protected ()
      extends typings.appleMapkitJsBrowser.mapkit.Annotation {
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
    class LineGradient ()
      extends typings.appleMapkitJsBrowser.mapkit.LineGradient {
      def this(options: js.Object) = this()
    }
    
    /**
      * An embeddable interactive map that you add to a webpage.
      */
    @JSGlobal("mapkit.Map")
    @js.native
    class Map protected ()
      extends typings.appleMapkitJsBrowser.mapkit.Map {
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
    class MapPoint protected ()
      extends typings.appleMapkitJsBrowser.mapkit.MapPoint {
      /**
        * Initializes a MapPoint object.
        *
        * @param x The point along the east-west axis of the map projection.
        * @param  The point along the north-south axis of the map projection.
        */
      def this(x: Double, y: Double) = this()
    }
    
    /**
      * A rectangular area on a two-dimensional map projection.
      */
    @JSGlobal("mapkit.MapRect")
    @js.native
    class MapRect protected ()
      extends typings.appleMapkitJsBrowser.mapkit.MapRect {
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
    }
    
    /**
      * A pair of values in map units that define the width and height of a
      * projected coordinate span.
      */
    @JSGlobal("mapkit.MapSize")
    @js.native
    class MapSize protected ()
      extends typings.appleMapkitJsBrowser.mapkit.MapSize {
      /**
        * Initializes a MapSize object.
        *
        * @param width The distance (measured using map points) along the east-west
        * axis of the map projection.
        * @param height The distance (measured using map points) along the
        * north-south axis of the map projection.
        */
      def this(width: Double, height: Double) = this()
    }
    
    /**
      * Creates a marker annotation at the coordinate location with provided options.
      */
    @JSGlobal("mapkit.MarkerAnnotation")
    @js.native
    class MarkerAnnotation protected ()
      extends typings.appleMapkitJsBrowser.mapkit.MarkerAnnotation {
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
      extends typings.appleMapkitJsBrowser.mapkit.Overlay
    
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
    class Padding ()
      extends typings.appleMapkitJsBrowser.mapkit.Padding {
      def this(options: PaddingConstructorOptions) = this()
      def this(top: Double) = this()
      def this(top: js.UndefOr[scala.Nothing], right: Double) = this()
      def this(top: Double, right: Double) = this()
      def this(top: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], bottom: Double) = this()
      def this(top: js.UndefOr[scala.Nothing], right: Double, bottom: Double) = this()
      def this(top: Double, right: js.UndefOr[scala.Nothing], bottom: Double) = this()
      def this(top: Double, right: Double, bottom: Double) = this()
      def this(
        top: js.UndefOr[scala.Nothing],
        right: js.UndefOr[scala.Nothing],
        bottom: js.UndefOr[scala.Nothing],
        left: Double
      ) = this()
      def this(top: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], bottom: Double, left: Double) = this()
      def this(top: js.UndefOr[scala.Nothing], right: Double, bottom: js.UndefOr[scala.Nothing], left: Double) = this()
      def this(top: js.UndefOr[scala.Nothing], right: Double, bottom: Double, left: Double) = this()
      def this(top: Double, right: js.UndefOr[scala.Nothing], bottom: js.UndefOr[scala.Nothing], left: Double) = this()
      def this(top: Double, right: js.UndefOr[scala.Nothing], bottom: Double, left: Double) = this()
      def this(top: Double, right: Double, bottom: js.UndefOr[scala.Nothing], left: Double) = this()
      def this(top: Double, right: Double, bottom: Double, left: Double) = this()
    }
    
    /**
      * Point of interest categories.
      */
    @JSGlobal("mapkit.PointOfInterestCategory")
    @js.native
    object PointOfInterestCategory extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory with Double] = js.native
      
      /* 3 */ val ATM: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.ATM with Double = js.native
      
      /* 0 */ val Airport: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Airport with Double = js.native
      
      /* 1 */ val AmusementPark: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.AmusementPark with Double = js.native
      
      /* 2 */ val Aquarium: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Aquarium with Double = js.native
      
      /* 4 */ val Bakery: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Bakery with Double = js.native
      
      /* 5 */ val Bank: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Bank with Double = js.native
      
      /* 6 */ val Beach: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Beach with Double = js.native
      
      /* 7 */ val Brewery: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Brewery with Double = js.native
      
      /* 8 */ val Cafe: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Cafe with Double = js.native
      
      /* 9 */ val Campground: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Campground with Double = js.native
      
      /* 10 */ val CarRental: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.CarRental with Double = js.native
      
      /* 11 */ val EVCharger: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.EVCharger with Double = js.native
      
      /* 12 */ val FireStation: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.FireStation with Double = js.native
      
      /* 13 */ val FitnessCenter: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.FitnessCenter with Double = js.native
      
      /* 14 */ val FoodMarket: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.FoodMarket with Double = js.native
      
      /* 15 */ val GasStation: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.GasStation with Double = js.native
      
      /* 16 */ val Hospital: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Hospital with Double = js.native
      
      /* 17 */ val Hotel: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Hotel with Double = js.native
      
      /* 18 */ val Laundry: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Laundry with Double = js.native
      
      /* 19 */ val Library: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Library with Double = js.native
      
      /* 20 */ val Marina: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Marina with Double = js.native
      
      /* 21 */ val MovieTheater: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.MovieTheater with Double = js.native
      
      /* 22 */ val Museum: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Museum with Double = js.native
      
      /* 23 */ val NationalPark: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.NationalPark with Double = js.native
      
      /* 24 */ val Nightlife: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Nightlife with Double = js.native
      
      /* 25 */ val Park: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Park with Double = js.native
      
      /* 26 */ val Parking: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Parking with Double = js.native
      
      /* 27 */ val Pharmacy: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Pharmacy with Double = js.native
      
      /* 28 */ val Police: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Police with Double = js.native
      
      /* 29 */ val PostOffice: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.PostOffice with Double = js.native
      
      /* 30 */ val PublicTransport: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.PublicTransport with Double = js.native
      
      /* 31 */ val Restaurant: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Restaurant with Double = js.native
      
      /* 32 */ val Restroom: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Restroom with Double = js.native
      
      /* 33 */ val School: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.School with Double = js.native
      
      /* 34 */ val Stadium: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Stadium with Double = js.native
      
      /* 35 */ val Store: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Store with Double = js.native
      
      /* 36 */ val Theater: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Theater with Double = js.native
      
      /* 37 */ val University: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.University with Double = js.native
      
      /* 38 */ val Winery: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Winery with Double = js.native
      
      /* 39 */ val Zoo: typings.appleMapkitJsBrowser.mapkit.PointOfInterestCategory.Zoo with Double = js.native
    }
    
    /**
      * A filter used to determine the points of interest to include or exclude on a map or local search.
      */
    @JSGlobal("mapkit.PointOfInterestFilter")
    @js.native
    class PointOfInterestFilter ()
      extends typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter
    object PointOfInterestFilter {
      
      /**
        * Creates a point of interest filter that excludes categories from a list that you provide.
        */
      /* static member */
      @JSGlobal("mapkit.PointOfInterestFilter.excluding")
      @js.native
      def excluding(categoryList: js.Array[PointOfInterestCategory]): typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = js.native
      
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
      @JSGlobal("mapkit.PointOfInterestFilter.including")
      @js.native
      def including(categoryList: js.Array[PointOfInterestCategory]): typings.appleMapkitJsBrowser.mapkit.PointOfInterestFilter = js.native
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
    class PointsOfInterestSearch ()
      extends typings.appleMapkitJsBrowser.mapkit.PointsOfInterestSearch {
      def this(options: PointsOfInterestSearchOptions) = this()
    }
    
    /**
      * An overlay made up of one or more points, forming a closed shape.
      */
    @JSGlobal("mapkit.PolygonOverlay")
    @js.native
    class PolygonOverlay protected ()
      extends typings.appleMapkitJsBrowser.mapkit.PolygonOverlay {
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
    class PolylineOverlay protected ()
      extends typings.appleMapkitJsBrowser.mapkit.PolylineOverlay {
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
    class Search ()
      extends typings.appleMapkitJsBrowser.mapkit.Search {
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
    class Style ()
      extends typings.appleMapkitJsBrowser.mapkit.Style {
      def this(options: StyleConstructorOptions) = this()
    }
    
    /**
      * An overlay that covers an area of the map with bitmap tiles.
      */
    @JSGlobal("mapkit.TileOverlay")
    @js.native
    class TileOverlay protected ()
      extends typings.appleMapkitJsBrowser.mapkit.TileOverlay {
      /**
        * Creates a tile overlay with a URL template and style options.
        */
      def this(urlTemplate: String) = this()
      def this(urlTemplate: URLTemplateCallback) = this()
      def this(urlTemplate: String, options: TileOverlayConstructorOptions) = this()
      def this(urlTemplate: URLTemplateCallback, options: TileOverlayConstructorOptions) = this()
    }
    
    /**
      * Subscribes a listener function to an event type.
      *
      * @param type The type of event (e.g., "configuration-change").
      * @param listener The callback function to invoke. listener is passed an
      * Event as its sole argument.
      * @param thisObject An object set as the this keyword on the listener function.
      */
    @JSGlobal("mapkit.addEventListener")
    @js.native
    def addEventListener[T](
      `type`: InitializationEventType,
      listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit]
    ): Unit = js.native
    @JSGlobal("mapkit.addEventListener")
    @js.native
    def addEventListener[T](
      `type`: InitializationEventType,
      listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit],
      thisObject: T
    ): Unit = js.native
    
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
    @JSGlobal("mapkit.importGeoJSON")
    @js.native
    def importGeoJSON(data: String): ItemCollection | Error = js.native
    @JSGlobal("mapkit.importGeoJSON")
    @js.native
    def importGeoJSON(data: String, callback: GeoJSONDelegate): ItemCollection | Error = js.native
    @JSGlobal("mapkit.importGeoJSON")
    @js.native
    def importGeoJSON(data: String, callback: ImportGeoJSONCallback): ItemCollection | Error = js.native
    @JSGlobal("mapkit.importGeoJSON")
    @js.native
    def importGeoJSON(data: js.Object): ItemCollection | Error = js.native
    @JSGlobal("mapkit.importGeoJSON")
    @js.native
    def importGeoJSON(data: js.Object, callback: GeoJSONDelegate): ItemCollection | Error = js.native
    @JSGlobal("mapkit.importGeoJSON")
    @js.native
    def importGeoJSON(data: js.Object, callback: ImportGeoJSONCallback): ItemCollection | Error = js.native
    
    /**
      * Initialize a mapkit object by providing an authorization callback and language.
      */
    @JSGlobal("mapkit.init")
    @js.native
    def init(options: MapKitInitOptions): Unit = js.native
    
    /**
      * A language ID indicating the selected language.
      */
    @JSGlobal("mapkit.language")
    @js.native
    def language: String = js.native
    @scala.inline
    def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
    
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
    @JSGlobal("mapkit.removeEventListener")
    @js.native
    def removeEventListener[T](
      `type`: InitializationEventType,
      listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit]
    ): Unit = js.native
    @JSGlobal("mapkit.removeEventListener")
    @js.native
    def removeEventListener[T](
      `type`: InitializationEventType,
      listener: js.ThisFunction1[/* this */ T, /* event */ InitializationEvent, Unit],
      thisObject: T
    ): Unit = js.native
    
    /**
      * The version of MapKit JS.
      */
    @JSGlobal("mapkit.version")
    @js.native
    val version: String = js.native
  }
}
