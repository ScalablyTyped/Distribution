package typings.appleDashMapkitDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapkit {
  import typings.appleDashMapkitDashJs.Anon_DisplayRegion
  import typings.std.Error

  type AutocompleteSearchCallback = js.Function2[/* error */ Error | Null, /* data */ SearchAutocompleteResponse, Unit]
  type ImportGeoJSONCallback = js.Function2[/* error */ Error, /* result */ ItemCollection, Unit]
  type SearchCallback[Q] = js.Function2[/* error */ Error | Null, /* data */ Anon_DisplayRegion[Q], Unit]
  type URLTemplateCallback = js.Function5[
    /* x */ Double, 
    /* y */ Double, 
    /* z */ Double, 
    /* scale */ Double, 
    /* data */ js.Object, 
    String
  ]
}
