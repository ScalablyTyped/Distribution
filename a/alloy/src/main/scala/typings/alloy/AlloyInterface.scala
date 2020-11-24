package typings.alloy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Top-level module for Alloy functions.
  */
@js.native
trait AlloyInterface
  extends AlloyFactories
     with BackboneSingletons {
  
  /**
    * An object that stores Alloy configuration values as defined in your app's
    * `app/config.json`.
    */
  var CFG: js.Any = js.native
  
  /**
    * An object for storing globally accessible variables and functions.
    */
  var Globals: js.Any = js.native
  
  /**
    * `true` if the current device is a handheld device (not a tablet).
    */
  var isHandheld: Boolean = js.native
  
  /**
    * `true` if the current device is a tablet.
    */
  var isTablet: Boolean = js.native
}
