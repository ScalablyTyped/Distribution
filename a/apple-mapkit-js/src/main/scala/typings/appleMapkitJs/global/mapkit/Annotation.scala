package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.anon.Circle
import typings.appleMapkitJs.anon.High
import typings.appleMapkitJs.mapkit.AnnotationConstructorOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base annotation object, used for creating custom annotations.
  */
@JSGlobal("mapkit.Annotation")
@js.native
class Annotation protected ()
  extends typings.appleMapkitJs.mapkit.Annotation {
  /**
    * Creates a new annotation given its location and initialization options.
    *
    * @param coordinate The coordinate at which this annotation should appear.
    * @param factory A factory function that returns a DOM element used to
    * represent this annotation.
    * @param options A hash of properties with which to initialize the annotation.
    */
  def this(
    coordinate: typings.appleMapkitJs.mapkit.Coordinate,
    factory: js.Function2[
        /* coordinate */ typings.appleMapkitJs.mapkit.Coordinate, 
        /* options */ AnnotationConstructorOptions, 
        Element
      ]
  ) = this()
  def this(
    coordinate: typings.appleMapkitJs.mapkit.Coordinate,
    factory: js.Function2[
        /* coordinate */ typings.appleMapkitJs.mapkit.Coordinate, 
        /* options */ AnnotationConstructorOptions, 
        Element
      ],
    options: AnnotationConstructorOptions
  ) = this()
}

/* static members */
@JSGlobal("mapkit.Annotation")
@js.native
object Annotation extends js.Object {
  /**
    * Constants indicating how to interpret the collision frame rectangle of
    * an annotation view.
    */
  val CollisionMode: Circle = js.native
  /**
    * Constant values used to provide a hint the map uses to prioritize
    * displaying annotations.
    */
  val DisplayPriority: High = js.native
}

