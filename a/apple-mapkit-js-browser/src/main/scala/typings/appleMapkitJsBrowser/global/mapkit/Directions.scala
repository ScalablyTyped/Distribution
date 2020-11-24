package typings.appleMapkitJsBrowser.global.mapkit

import typings.appleMapkitJsBrowser.mapkit.DirectionsConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSGlobal("mapkit.Directions")
@js.native
object Directions extends js.Object {
  
  /**
    * The modes of transportation.
    */
  @js.native
  object Transport extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.appleMapkitJsBrowser.mapkit.Directions.Transport with Double] = js.native
    
    /* 0 */ val Automobile: typings.appleMapkitJsBrowser.mapkit.Directions.Transport.Automobile with Double = js.native
    
    /* 1 */ val Walking: typings.appleMapkitJsBrowser.mapkit.Directions.Transport.Walking with Double = js.native
  }
}
