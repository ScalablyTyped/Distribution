package typings.appleMapkitJsBrowser

import typings.appleMapkitJsBrowser.mapkit.CoordinateRegion
import typings.appleMapkitJsBrowser.mapkit.Overlay
import typings.appleMapkitJsBrowser.mapkit.Place
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `1` extends StObject {
    
    var `1`: String
    
    var `2`: js.UndefOr[String] = js.undefined
    
    var `3`: js.UndefOr[String] = js.undefined
  }
  object `1` {
    
    @scala.inline
    def apply(`1`: String): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2Undefined: Self = StObject.set(x, "2", js.undefined)
      
      @scala.inline
      def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3Undefined: Self = StObject.set(x, "3", js.undefined)
    }
  }
  
  trait Annotation extends StObject {
    
    var annotation: js.UndefOr[typings.appleMapkitJsBrowser.mapkit.Annotation] = js.undefined
    
    var overlay: js.UndefOr[Overlay] = js.undefined
  }
  object Annotation {
    
    @scala.inline
    def apply(): Annotation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Annotation]
    }
    
    @scala.inline
    implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotation(value: typings.appleMapkitJsBrowser.mapkit.Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      @scala.inline
      def setOverlay(value: Overlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
  
  trait AnnotationAnnotation extends StObject {
    
    var annotation: typings.appleMapkitJsBrowser.mapkit.Annotation
  }
  object AnnotationAnnotation {
    
    @scala.inline
    def apply(annotation: typings.appleMapkitJsBrowser.mapkit.Annotation): AnnotationAnnotation = {
      val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationAnnotation]
    }
    
    @scala.inline
    implicit class AnnotationAnnotationMutableBuilder[Self <: AnnotationAnnotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotation(value: typings.appleMapkitJsBrowser.mapkit.Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: Double
    
    var message: String
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, message: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coordinate extends StObject {
    
    var annotation: typings.appleMapkitJsBrowser.mapkit.Annotation
    
    var coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate
  }
  object Coordinate {
    
    @scala.inline
    def apply(
      annotation: typings.appleMapkitJsBrowser.mapkit.Annotation,
      coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate
    ): Coordinate = {
      val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinate]
    }
    
    @scala.inline
    implicit class CoordinateMutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotation(value: typings.appleMapkitJsBrowser.mapkit.Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinate(value: typings.appleMapkitJsBrowser.mapkit.Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayRegion[Q] extends StObject {
    
    /**
      * A region that encloses the search results. This property is not present
      * if there are no results.
      */
    var displayRegion: js.UndefOr[CoordinateRegion] = js.undefined
    
    /**
      * An array of Place objects. The places array is empty if there is no match.
      */
    var places: js.Array[Place]
    
    /**
      * The query corresponding to the results  The query corresponding to the
      * results, if a SearchAutocompleteResult was not used to perform the search.
      */
    var query: js.UndefOr[String] = js.undefined
  }
  object DisplayRegion {
    
    @scala.inline
    def apply[Q](places: js.Array[Place]): DisplayRegion[Q] = {
      val __obj = js.Dynamic.literal(places = places.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayRegion[Q]]
    }
    
    @scala.inline
    implicit class DisplayRegionMutableBuilder[Self <: DisplayRegion[?], Q] (val x: Self & DisplayRegion[Q]) extends AnyVal {
      
      @scala.inline
      def setDisplayRegion(value: CoordinateRegion): Self = StObject.set(x, "displayRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayRegionUndefined: Self = StObject.set(x, "displayRegion", js.undefined)
      
      @scala.inline
      def setPlaces(value: js.Array[Place]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacesVarargs(value: Place*): Self = StObject.set(x, "places", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<apple-mapkit-js-browser.mapkit.GeocoderConstructorOptions, 'language'> */
  trait PickGeocoderConstructorOp extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
  }
  object PickGeocoderConstructorOp {
    
    @scala.inline
    def apply(): PickGeocoderConstructorOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickGeocoderConstructorOp]
    }
    
    @scala.inline
    implicit class PickGeocoderConstructorOpMutableBuilder[Self <: PickGeocoderConstructorOp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  trait Timestamp extends StObject {
    
    var coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate
    
    var timestamp: Date
  }
  object Timestamp {
    
    @scala.inline
    def apply(coordinate: typings.appleMapkitJsBrowser.mapkit.Coordinate, timestamp: Date): Timestamp = {
      val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp]
    }
    
    @scala.inline
    implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinate(value: typings.appleMapkitJsBrowser.mapkit.Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
