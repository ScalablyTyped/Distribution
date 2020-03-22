package typings.angularAnimations.browserBrowserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/browser", "AnimationDriver")
@js.native
abstract class AnimationDriver () extends js.Object {
  def animate(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    duration: Double,
    delay: Double
  ): js.Any = js.native
  def animate(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    duration: Double,
    delay: Double,
    easing: String
  ): js.Any = js.native
  def animate(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    duration: Double,
    delay: Double,
    easing: String,
    previousPlayers: js.Array[_]
  ): js.Any = js.native
  def animate(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    duration: Double,
    delay: Double,
    easing: String,
    previousPlayers: js.Array[_],
    scrubberAccessRequested: Boolean
  ): js.Any = js.native
  def animate(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    duration: Double,
    delay: Double,
    easing: Null,
    previousPlayers: js.Array[_]
  ): js.Any = js.native
  def animate(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    duration: Double,
    delay: Double,
    easing: Null,
    previousPlayers: js.Array[_],
    scrubberAccessRequested: Boolean
  ): js.Any = js.native
  def computeStyle(element: js.Any, prop: String): String = js.native
  def computeStyle(element: js.Any, prop: String, defaultValue: String): String = js.native
  def containsElement(elm1: js.Any, elm2: js.Any): Boolean = js.native
  def matchesElement(element: js.Any, selector: String): Boolean = js.native
  def query(element: js.Any, selector: String, multi: Boolean): js.Array[_] = js.native
  def validateStyleProperty(prop: String): Boolean = js.native
}

/* static members */
@JSImport("@angular/animations/browser/browser", "AnimationDriver")
@js.native
object AnimationDriver extends js.Object {
  var NOOP: AnimationDriver = js.native
}

