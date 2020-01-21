package typings.appleMapkitJs.mapkit

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A delegate object that controls a GeoJSON import in order to override
  * default behavior and provide custom style.
  */
trait GeoJSONDelegate extends js.Object {
  /**
    * Completes the GeoJSON import.
    *
    * @param result The mapped item collection.
    * @param geoJSON The original parsed GeoJSON object.
    */
  var geoJSONDidComplete: js.UndefOr[js.Function2[/* result */ ItemCollection, /* geoJSON */ js.Object, Unit]] = js.undefined
  /**
    * Indicates the GeoJSON import failed.
    *
    * @param error An Error instance related to the last blocking error.
    * @param geoJSON The original parsed GeoJSON object.
    */
  var geoJSONDidError: js.UndefOr[js.Function2[/* error */ Error, /* geoJSON */ js.Object, Unit]] = js.undefined
  /**
    * Overrides a feature.
    *
    * @param item An item created for the geometry of this feature or null for
    * features with null geometry.
    * @param geoJSON The original GeoJSON object for this feature.
    */
  var itemForFeature: js.UndefOr[
    js.Function2[
      /* item */ Annotation | Overlay | Null, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.undefined
  /**
    * Overrides a feature collection.
    *
    * @param itemCollection A collection containing associated annotations and
    * overlays.
    * @param geoJSON The original GeoJSON object for this FeatureCollection.
    * This will contain an array of feature types.
    */
  var itemForFeatureCollection: js.UndefOr[
    js.Function2[
      /* itemCollection */ ItemCollection, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.undefined
  /**
    * Overrides a line string.
    *
    * @param overlay A PolylineOverlay object.
    * @param geoJSON original GeoJSON object for this LineString object.
    */
  var itemForLineString: js.UndefOr[
    js.Function2[
      /* overlay */ PolylineOverlay, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.undefined
  /**
    * Overrides a multiline string.
    *
    * @param itemCollection An item collection containing associated overlays.
    * @param geoJSON The original GeoJSON object for this MultiLineString. This
    * will contain an array of geometries.
    */
  var itemForMultiLineString: js.UndefOr[
    js.Function2[
      /* itemCollection */ ItemCollection, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.undefined
  /**
    * Overrides a multipoint object.
    *
    * @param itemCollection A collection containing associated annotations.
    * @param geoJSON The original GeoJSON object for this MultiPoint. This will
    * contain an array of geometries.
    */
  var itemForMultiPoint: js.UndefOr[
    js.Function2[
      /* itemCollection */ ItemCollection, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.undefined
  /**
    * Overrides a multipolygon.
    *
    * @param itemCollection A collection containing associated overlays.
    * @param geoJSON The original GeoJSON object for this MultiPolygon. This
    * will contain an array of geometries.
    */
  var itemForMultiPolygon: js.UndefOr[
    js.Function2[
      /* itemCollection */ ItemCollection, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.undefined
  /**
    * Overrides a point.
    *
    * @param coordinate A GeoJSON Point generates the coordinate. You can use
    * the coordinate to instantiate an item to return.
    * @param geoJSON The original GeoJSON object for this Point. This object could
    * be a simple Point or a Feature with the Point geometry type.
    */
  var itemForPoint: js.UndefOr[
    js.Function2[/* coordinate */ Coordinate, /* geoJSON */ js.Object, js.Array[Annotation | Overlay]]
  ] = js.undefined
  /**
    * Overrides a polygon.
    *
    * @param overlay You can customize the provided overlay before returning it,
    * or you could completely replace the overlay.
    * @param geoJSON The original GeoJSON object for this polygon.
    */
  var itemForPolygon: js.UndefOr[
    js.Function2[
      /* overlay */ PolygonOverlay, 
      /* geoJSON */ js.Object, 
      Annotation | Overlay | (js.Array[Annotation | Overlay])
    ]
  ] = js.undefined
  /**
    * Overrides the style of overlays.
    *
    * @param overlay The overlay to style.
    * @param geoJSON The original GeoJSON for this feature or geometry object.
    */
  var styleForOverlay: js.UndefOr[js.Function2[/* overlay */ Overlay, /* geoJSON */ js.Object, Style]] = js.undefined
}

object GeoJSONDelegate {
  @scala.inline
  def apply(
    geoJSONDidComplete: (/* result */ ItemCollection, /* geoJSON */ js.Object) => Unit = null,
    geoJSONDidError: (/* error */ Error, /* geoJSON */ js.Object) => Unit = null,
    itemForFeature: (/* item */ Annotation | Overlay | Null, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay]) = null,
    itemForFeatureCollection: (/* itemCollection */ ItemCollection, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay]) = null,
    itemForLineString: (/* overlay */ PolylineOverlay, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay]) = null,
    itemForMultiLineString: (/* itemCollection */ ItemCollection, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay]) = null,
    itemForMultiPoint: (/* itemCollection */ ItemCollection, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay]) = null,
    itemForMultiPolygon: (/* itemCollection */ ItemCollection, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay]) = null,
    itemForPoint: (/* coordinate */ Coordinate, /* geoJSON */ js.Object) => js.Array[Annotation | Overlay] = null,
    itemForPolygon: (/* overlay */ PolygonOverlay, /* geoJSON */ js.Object) => Annotation | Overlay | (js.Array[Annotation | Overlay]) = null,
    styleForOverlay: (/* overlay */ Overlay, /* geoJSON */ js.Object) => Style = null
  ): GeoJSONDelegate = {
    val __obj = js.Dynamic.literal()
    if (geoJSONDidComplete != null) __obj.updateDynamic("geoJSONDidComplete")(js.Any.fromFunction2(geoJSONDidComplete))
    if (geoJSONDidError != null) __obj.updateDynamic("geoJSONDidError")(js.Any.fromFunction2(geoJSONDidError))
    if (itemForFeature != null) __obj.updateDynamic("itemForFeature")(js.Any.fromFunction2(itemForFeature))
    if (itemForFeatureCollection != null) __obj.updateDynamic("itemForFeatureCollection")(js.Any.fromFunction2(itemForFeatureCollection))
    if (itemForLineString != null) __obj.updateDynamic("itemForLineString")(js.Any.fromFunction2(itemForLineString))
    if (itemForMultiLineString != null) __obj.updateDynamic("itemForMultiLineString")(js.Any.fromFunction2(itemForMultiLineString))
    if (itemForMultiPoint != null) __obj.updateDynamic("itemForMultiPoint")(js.Any.fromFunction2(itemForMultiPoint))
    if (itemForMultiPolygon != null) __obj.updateDynamic("itemForMultiPolygon")(js.Any.fromFunction2(itemForMultiPolygon))
    if (itemForPoint != null) __obj.updateDynamic("itemForPoint")(js.Any.fromFunction2(itemForPoint))
    if (itemForPolygon != null) __obj.updateDynamic("itemForPolygon")(js.Any.fromFunction2(itemForPolygon))
    if (styleForOverlay != null) __obj.updateDynamic("styleForOverlay")(js.Any.fromFunction2(styleForOverlay))
    __obj.asInstanceOf[GeoJSONDelegate]
  }
}

