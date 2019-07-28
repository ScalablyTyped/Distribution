package typings.athenajs

import org.scalablytyped.runtime.StringDictionary
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object athenajsMod {
  type Animations = StringDictionary[AnimationObject]
  type Callback = js.Function1[/* repeated */ js.Any, Unit]
  type JSObject = StringDictionary[js.Any]
  type RenderingContext = CanvasRenderingContext2D
}
