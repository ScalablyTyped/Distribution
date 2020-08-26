package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.anon.Automobile
import typings.appleMapkitJs.mapkit.DirectionsConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.appleMapkitJs.mapkit.Directions {
  def this(options: DirectionsConstructorOptions) = this()
}

/* static members */
@JSGlobal("mapkit.Directions")
@js.native
object Directions extends js.Object {
  /**
    * The modes of transportation.
    */
  val Transport: Automobile = js.native
}

