package typings.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapkit {
  type AutocompleteSearchCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* data */ typings.appleMapkitJs.mapkit.SearchAutocompleteResponse, 
    scala.Unit
  ]
  /**
    * A customized annotation with image resources that you provide.
    */
  type ImageAnnotation = typings.appleMapkitJs.mapkit.Annotation
  type ImportGeoJSONCallback = js.Function2[
    /* error */ typings.std.Error, 
    /* result */ typings.appleMapkitJs.mapkit.ItemCollection, 
    scala.Unit
  ]
  type SearchCallback[Q] = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* data */ typings.appleMapkitJs.anon.DisplayRegion[Q], 
    scala.Unit
  ]
  type URLTemplateCallback = js.Function5[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* z */ scala.Double, 
    /* scale */ scala.Double, 
    /* data */ js.Object, 
    java.lang.String
  ]
}
