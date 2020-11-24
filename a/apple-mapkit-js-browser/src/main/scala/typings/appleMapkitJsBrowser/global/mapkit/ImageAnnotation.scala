package typings.appleMapkitJsBrowser.global.mapkit

import typings.appleMapkitJsBrowser.mapkit.ImageAnnotationConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
