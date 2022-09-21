package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.DisplayRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AutocompleteSearchCallback = js.Function2[/* error */ js.Error | Null, /* data */ SearchAutocompleteResponse, Unit]

/**
  * A customized annotation with image resources that you provide.
  */
type ImageAnnotation = Annotation

type ImportGeoJSONCallback = js.Function2[/* error */ js.Error, /* result */ ItemCollection, Unit]

type PointsOfInterestSearchCallback = js.Function2[/* error */ js.Error | Null, /* data */ PointsOfInterestSearchResponse, Unit]

type SearchCallback[Q] = js.Function2[/* error */ js.Error | Null, /* data */ DisplayRegion[Q], Unit]

type URLTemplateCallback = js.Function5[
/* x */ Double, 
/* y */ Double, 
/* z */ Double, 
/* scale */ Double, 
/* data */ js.Object, 
String]
